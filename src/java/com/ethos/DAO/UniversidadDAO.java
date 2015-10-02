/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.UniversidadesModel;
import com.ethos.query.GeneralQuery;
import com.ethos.query.UniversidadesQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Operaciones-GerenteC
 */
public class UniversidadDAO extends AbstractDAO<UniversidadesModel>{
    
 UniversidadesModel universidadModel;
 
 public  UniversidadDAO (){
     super(UniversidadesModel.class);
 }

    @Override
    public UniversidadesModel select(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert(UniversidadesModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(UniversidadesModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UniversidadesModel> findAll() {
       String query;
       List<UniversidadesModel>lisUniversidadesModel=new ArrayList<>();
         
        try {
            conn=getConnectionDB().getConnection();
            query=UniversidadesQuery.QUERY_GET_UNIVERSIDAS;
            psQuery=conn.prepareStatement(query);
            rsT=psQuery.executeQuery();
               while(rsT.next()){
                   
                   universidadModel = new UniversidadesModel();
                   universidadModel.setiCodUniversidad(rsT.getInt(1));
                   universidadModel.setsDescripcion(rsT.getString(2));
                   lisUniversidadesModel.add(universidadModel);
                   }
        } catch (SQLException ex) {
            System.out.println("SQLException"+ ex);
        }finally{
            closeConnection();
        }                       
       return lisUniversidadesModel;
    }

    @Override
    public List<UniversidadesModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<UniversidadesModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
         
         
 
}
