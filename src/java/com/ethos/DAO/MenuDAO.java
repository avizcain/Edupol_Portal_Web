/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.MenuModel;
import com.ethos.query.CiudadesQuery;
import com.ethos.query.MenuQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author operaciones
 */
public class MenuDAO extends AbstractDAO<MenuModel>{

    MenuModel menuModel;
    public MenuDAO() {
        super(MenuModel.class);
    }

    @Override
    public MenuModel select(Object id) {
        String query;
        menuModel = new MenuModel();
        List<String> listPaginas = new ArrayList<>();

        try {
            conn = getConnectionDB().getConnection();
            query = CiudadesQuery.queryGetCiudades;
            psQuery = conn.prepareStatement(query);
            rsT = psQuery.executeQuery();

            while (rsT.next()) {
                if(rsT.getInt(3)!= 0) {
                    listPaginas.add(rsT.getString(2));
                }
            }
            menuModel.setListPaginas(listPaginas);
        
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        } finally {
            closeConnection();
        }
        return menuModel;
    }

    @Override
    public String insert(MenuModel entityClass) {
        return "";
    }

    @Override
    public boolean update(MenuModel entityClass) {
        return false;
    }

    @Override
    public String delete(Object id) {
        return "";
    }

    /**----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
    * @description Metodo para obtener todas las ciudades existentes en la base de datos
    * @return Lista de Ciudades
    *----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    @Override
    public List<MenuModel> findAll() {
        return null;
    }
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    @Override
    public List<MenuModel> findWhere(HashMap<String, Object> parameters) {
        
        return null;
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        
        String query;
        List<Object> listPaginas = new ArrayList<>();

        try {
            conn = getConnectionDB().getConnection();
            query = MenuQuery.queryGetMenu;
            psQuery = conn.prepareStatement(query);
            
            for (int i=0; i<parameters.size();i++){
                psQuery.setString(i+1, parameters.get(i).toString());
            }
            
            rsT = psQuery.executeQuery();

            while (rsT.next()) {
                if(rsT.getInt(3)!= 0) {
                    listPaginas.add(rsT.getString(2));
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        } finally {
            closeConnection();
        }
        return listPaginas;
    }

    @Override
    public List<MenuModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
