/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.NivelFormacionModel;
import com.ethos.model.UniversidadesModel;
import com.ethos.query.UniversidadesQuery;
import java.sql.SQLException;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Operaciones-GerenteC
 */
public class NivelFormacionDAO extends AbstractDAO<NivelFormacionModel>{
    NivelFormacionModel nivelFormacionModel;

    public NivelFormacionDAO() {
        super(NivelFormacionModel.class);
         }

    @Override
    public NivelFormacionModel select(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert(NivelFormacionModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(NivelFormacionModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NivelFormacionModel> findAll(Object idUniversidad) {
        String query;
        List<NivelFormacionModel> lisNivelFormacionModels=new ArrayList<>();
        
       
        try {
             conn=getConnectionDB().getConnection();
             query=UniversidadesQuery.QUERY_GET_NIVELFORMACION;
             psQuery=conn.prepareStatement(query);
             psQuery.setInt(1, Integer.parseInt(idUniversidad.toString()));
             rsT=psQuery.executeQuery();
             while(rsT.next()){
                 nivelFormacionModel=new NivelFormacionModel();
                 nivelFormacionModel.setiCod_NivelFormacion(rsT.getInt(1));
                 nivelFormacionModel.setDescripcion(rsT.getString(2));
                 lisNivelFormacionModels.add(nivelFormacionModel);
                 
             }
             } catch (SQLException ex) {
              System.out.println("SQLException "+ex);
        }finally{
            closeConnection();
        }
        return lisNivelFormacionModels;
    }

    @Override
    public List<NivelFormacionModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<NivelFormacionModel> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

        
    
    
}
