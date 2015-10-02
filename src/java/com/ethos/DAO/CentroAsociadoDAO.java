/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.CentroAsociadoModel;
import com.ethos.query.GeneralQuery;
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
public class CentroAsociadoDAO extends AbstractDAO<CentroAsociadoModel>{
    CentroAsociadoModel centroAsociadoModel;
    
    public CentroAsociadoDAO(){
        super(CentroAsociadoModel.class);
    }

    @Override
    public CentroAsociadoModel select(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert(CentroAsociadoModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(CentroAsociadoModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CentroAsociadoModel> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CentroAsociadoModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        String query;
        List<Object> listObjects = new ArrayList<>();
        try {
            conn = getConnectionDB().getConnection();
            query=GeneralQuery.QUERY_GET_CENTRO_ASOCIADOS;
            psQuery=conn.prepareStatement(query);
            psQuery.setInt(1,(int)parameters.get(0));
            rsT=psQuery.executeQuery();
            while(rsT.next()){
                 centroAsociadoModel=new CentroAsociadoModel();
                 centroAsociadoModel.setiCodCentroAsociado(rsT.getInt(1));
                 centroAsociadoModel.setsDescipcion(rsT.getString(2));
                 listObjects.add(centroAsociadoModel); 
            
        }
        } catch (SQLException ex) {
            Logger.getLogger(CentroAsociadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeConnection();
        }
        
      return listObjects;
    }

    @Override
    public List<CentroAsociadoModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
