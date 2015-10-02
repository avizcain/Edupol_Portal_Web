/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.EstadoCivilModel;
import com.ethos.query.EstadoCivilQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author DavidFernando
 */
public class EstadoCivilDAO extends AbstractDAO<EstadoCivilModel> {

    EstadoCivilModel estadoCivilModel;

    public EstadoCivilDAO() {
        super(EstadoCivilModel.class);
    }

    @Override
    public EstadoCivilModel select(Object id) {
        return null;
    }

    @Override
    public String insert(EstadoCivilModel entityClass) {
        return "";
    }

    @Override
    public boolean update(EstadoCivilModel entityClass) {
        return false;
    }

    @Override
    public String delete(Object id) {
        return "";
    }

    /**----------------------------------------------------------------------------------------------------------------------------------------------------------------------------/
     * @description Metodo para obtener todos los estados civiles existentes en la base de datos
     * @return Lista de Estados Civiles
     *----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    @Override
    public List<EstadoCivilModel> findAll() {

        String query;
        List<EstadoCivilModel> estadoCivilList = new ArrayList<>();

        try {
            conn = getConnectionDB().getConnection();
            query=EstadoCivilQuery.queryGetCiudades;
            psQuery = conn.prepareStatement(query);
            rsT = psQuery.executeQuery();

            while (rsT.next()) {

                estadoCivilModel = new EstadoCivilModel();
                estadoCivilModel.setsCodigoEstadoCivil(rsT.getString(1));
                estadoCivilModel.setsDescripcionEstCivil(rsT.getString(2));
                estadoCivilList.add(estadoCivilModel);
            }

        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        } finally {
            closeConnection();
        }
        return estadoCivilList;
    }
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    @Override
    public List<EstadoCivilModel> findWhere(HashMap<String, Object> parameters) {
        return null;
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EstadoCivilModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
