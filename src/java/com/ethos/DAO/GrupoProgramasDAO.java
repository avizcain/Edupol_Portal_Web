/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.GrupoProgramasModel;
import com.ethos.query.UniversidadesQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Operaciones-GerenteC
 */
public class GrupoProgramasDAO extends AbstractDAO<GrupoProgramasModel>{
    
    GrupoProgramasModel grupoProgramasModel;
    
    public GrupoProgramasDAO(){
        super(GrupoProgramasModel.class);
     }

    @Override
    public GrupoProgramasModel select(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert(GrupoProgramasModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(GrupoProgramasModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<GrupoProgramasModel> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<GrupoProgramasModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
       String query;
        List<Object>listObjects= new ArrayList<>();
        
        try {
            conn=getConnectionDB().getConnection();
            query=UniversidadesQuery.QUERY_GET_GRUPOPROGRAMAS;
            psQuery=conn.prepareStatement(query);
            psQuery.setInt(1, (int) parameters.get(0));
            psQuery.setInt(2, (int) parameters.get(1));
            psQuery.setInt(3, (int) parameters.get(2));
            rsT=psQuery.executeQuery();
            while(rsT.next()){
                grupoProgramasModel= new GrupoProgramasModel();
                grupoProgramasModel.setiIdGrupo(rsT.getInt(1));
                grupoProgramasModel.setsDescripcion(rsT.getString(2));
                listObjects.add(grupoProgramasModel);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(NivelEstudiosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeConnection();
        }
       
        return listObjects;
    }

    @Override
    public List<GrupoProgramasModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
