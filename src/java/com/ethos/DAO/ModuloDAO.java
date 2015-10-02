    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.ModuloModel;
import com.ethos.query.FunctionsDB;
import com.ethos.query.ModuloQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author operaciones
 */
public class ModuloDAO extends AbstractDAO<ModuloModel> {

    public ModuloDAO() {
        super(ModuloModel.class);
    }

    @Override
    public ModuloModel select(Object id) {
        return null;
    }

    @Override
    public String insert(ModuloModel entityClass) {
        return "";
    }

    @Override
    public boolean update(ModuloModel entityClass) {
        return false;
    }

    @Override
    public String delete(Object id) {
        return "";
    }

    @Override
    public List<ModuloModel> findAll() {
        return null;
    }

    @Override
    public List<ModuloModel> findWhere(HashMap<String, Object> parameters) {
       
        String query;
        ModuloModel moduloModel;
        FunctionsDB functionDB = new FunctionsDB();
        
        List<ModuloModel> listModuloModel = new ArrayList<>();
        List<String> listParametros = (List<String>) parameters.get("listaModulos");
   
        try {
            conn = getConnectionDB().getConnection();
            query=functionDB.createQuery(ModuloQuery.queryGetModulos, listParametros);
            psQuery = conn.prepareStatement(query);
            
            rsT = psQuery.executeQuery();
            
            while (rsT.next()) {
                moduloModel =new ModuloModel();
                moduloModel.setsCodigo(rsT.getString(1));
                moduloModel.setsNombre(rsT.getString(2));
                moduloModel.setsImagen(rsT.getString(3));
                moduloModel.setiOpcRedirect(rsT.getInt(4));
                
                listModuloModel.add(moduloModel);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error " + ex);
        } finally {
            closeConnection();
        }
        return listModuloModel;
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ModuloModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
