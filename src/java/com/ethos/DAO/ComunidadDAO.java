/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.ComunidadModel;
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
public class ComunidadDAO extends AbstractDAO<ComunidadModel>{
    ComunidadModel comunidadModel;

    public ComunidadDAO() {
        super(ComunidadModel.class);
    }

    @Override
    public ComunidadModel select(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert(ComunidadModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ComunidadModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ComunidadModel> findAll() {
        String query;
        List<ComunidadModel>listcomunidadModels= new ArrayList<>();
        try {
            conn=getConnectionDB().getConnection();
            query=GeneralQuery.QUERY_GET_COMUNIDAD;
            psQuery=conn.prepareStatement(query);
            rsT=psQuery.executeQuery();
            while(rsT.next()){
                comunidadModel = new ComunidadModel();
                comunidadModel.setiCodComunidad(rsT.getInt(1));
                comunidadModel.setsNombreComunidad(rsT.getString(2));
                listcomunidadModels.add(comunidadModel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ComunidadDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeConnection();
        }
        return listcomunidadModels;
        
    }

    @Override
    public List<ComunidadModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ComunidadModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
