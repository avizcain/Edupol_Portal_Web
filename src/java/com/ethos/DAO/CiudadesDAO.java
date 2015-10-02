/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.CiudadModel;
import com.ethos.query.CiudadesQuery;
import com.ethos.query.GeneralQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author DavidFernando
 */
public class CiudadesDAO extends AbstractDAO<CiudadModel> {

    CiudadModel ciudadModel;
    

    public CiudadesDAO() {
        super(CiudadModel.class);
    }

    @Override
    public CiudadModel select(Object id) {
        return null;
    }

    @Override
    public String insert(CiudadModel entityClass) {
        return "";
    }

    @Override
    public boolean update(CiudadModel entityClass) {
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
    public List<CiudadModel> findAll() {
        
        String query;
        List<CiudadModel> ciudadesList = new ArrayList<>();
        
        try {
            conn = getConnectionDB().getConnection();
            query =GeneralQuery.QUERY_GET_CIUDADES;
            psQuery = conn.prepareStatement(query);
            rsT = psQuery.executeQuery();

            while (rsT.next()) {

                ciudadModel = new CiudadModel();
                ciudadModel.setsCodigo(rsT.getInt(1));
                ciudadModel.setsNombre(rsT.getString(2));
                ciudadesList.add(ciudadModel);
            }

        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        } finally {
            closeConnection();
        }
        return ciudadesList;
    }
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    @Override
    public List<CiudadModel> findWhere(HashMap<String, Object> parameters) {
        return null;
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        System.out.println("entra query");
         String query;
        List<Object>listCiudadesModels=new ArrayList<>();
        
       
        try {
             conn=getConnectionDB().getConnection();
             query=GeneralQuery.QUERY_GET_DEPENDENCIAS_CIUDADES;
             psQuery=conn.prepareStatement(query);
             psQuery.setInt(1,(int)parameters.get(0));
             rsT=psQuery.executeQuery();
             while(rsT.next()){
                 ciudadModel=new CiudadModel();
                 ciudadModel.setsCodigo(rsT.getInt(1));
                 ciudadModel.setsNombre(rsT.getString(2));
                 listCiudadesModels.add(ciudadModel);
                 
             }
             } catch (SQLException ex) {
              System.out.println("SQLException "+ex);
        }
        finally{
            closeConnection();
        }
        return listCiudadesModels;
    }

    @Override
    public List<CiudadModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
