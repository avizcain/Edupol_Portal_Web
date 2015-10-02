/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.PaginaModel;
import com.ethos.query.FunctionsDB;
import com.ethos.query.PaginaQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author operaciones
 */
public class PaginaDAO extends AbstractDAO<PaginaModel>{

    public PaginaDAO() {
        super(PaginaModel.class);
    }

    @Override
    public PaginaModel select(Object id) {
        return null;
    }

    @Override
    public String insert(PaginaModel entityClass) {
        return "";
    }

    @Override
    public boolean update(PaginaModel entityClass) {
        return false;
    }

    @Override
    public String delete(Object id) {
        return "";
    }

    @Override
    public List<PaginaModel> findAll() {
        return null;
    }

    @Override
    public List<PaginaModel> findWhere(HashMap<String, Object> parameters) {
       
        String query = "";
        PaginaModel paginaModel;
        
        FunctionsDB functionDB = new FunctionsDB();
        List<PaginaModel> listModuloModel = new ArrayList<>();
        List<String> listParametros = (List<String>) parameters.get("listaPaginas");
        try {
            conn = getConnectionDB().getConnection();
            query = functionDB.createQuery(PaginaQuery.queryGetPaginas, listParametros);
            psQuery = conn.prepareStatement(query);
            
            rsT = psQuery.executeQuery();
            
            while (rsT.next()) {
                paginaModel =new PaginaModel();
                paginaModel.setsCodigo(rsT.getString(1));
                paginaModel.setsNombre(rsT.getString(2));
                paginaModel.setsModulo(rsT.getString(3));
                paginaModel.setsRuta(rsT.getString(4));
                paginaModel.setiNivel(rsT.getInt(5));
                paginaModel.setiDependencia(rsT.getInt(6));
                paginaModel.setiOrden(rsT.getInt(7));
                paginaModel.setiTipo(rsT.getInt(8));
                
                listModuloModel.add(paginaModel);
            }
            
        } catch (ArrayStoreException | SQLException ex) {
            System.out.println("Error" + ex);
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
    public List<PaginaModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
