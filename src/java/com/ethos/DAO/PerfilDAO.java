/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.PerfilModel;
import com.ethos.query.PerfilQuery;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author operaciones
 */
public class PerfilDAO extends AbstractDAO<PerfilModel>{

    public PerfilDAO() {
        super(PerfilModel.class);
    }

    @Override
    public PerfilModel select(Object id) {
        
        String query;
        PerfilModel perfilModel = null;
        try {
            conn = getConnectionDB().getConnection();
            query=PerfilQuery.queryGetPerfil;
            
            psQuery = conn.prepareStatement(query);
            psQuery.setString(1, id.toString());
            rsT = psQuery.executeQuery();
            
            if (rsT.next()) {
                perfilModel = new PerfilModel();
                perfilModel.setsCodigo(rsT.getString(1));
                perfilModel.setsNombre(rsT.getString(2));
                perfilModel.setiAdmin(rsT.getInt(3));
                perfilModel.setiEstadoPerfil(rsT.getInt(5));
            }
            
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        } finally {
            closeConnection();
        }
        return perfilModel;
    }

    @Override
    public String insert(PerfilModel entityClass) {
        return "";
    }

    @Override
    public boolean update(PerfilModel entityClass) {
        return false;
    }

    @Override
    public String delete(Object id) {
        return "";
    }

    @Override
    public List<PerfilModel> findAll() {
        return null;
    }

    @Override
    public List<PerfilModel> findWhere(HashMap<String, Object> parameters) {
        return null;
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PerfilModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
