/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.IcfesModel;
import com.ethos.query.GeneralQuery;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author EquipoNo9
 */
public class IcfesDAO extends AbstractDAO<IcfesModel> {

    public IcfesDAO() {
        super(IcfesModel.class);
    }

    @Override
    public IcfesModel select(Object id) {
        String idIcfes = "";
        String queryIcfes;
        String query;
        IcfesModel icfesModel  = new IcfesModel();

        try {
            conn = getConnectionDB().getConnection();
            queryIcfes = GeneralQuery.QUERY_GET_REGISTRO_IDICFES;
            psQuery = conn.prepareStatement(queryIcfes);
            psQuery.setString(1, (String) id);
            rsT = psQuery.executeQuery();
            while (rsT.next()) {
                idIcfes = rsT.getString(1);
            }
            
            query = GeneralQuery.QUERY_GET_ICFES;
            psQuery = conn.prepareStatement(query);
            psQuery.setString(1, String.valueOf(idIcfes));
            rsT = psQuery.executeQuery();
            while (rsT.next()) {
                icfesModel.setIdIcfes(rsT.getInt(1));
                icfesModel.setFechaPresentacion(rsT.getString(2));
                icfesModel.setPromedioAreas(rsT.getDouble(3));
                icfesModel.setLenguaje(rsT.getDouble(4));
                icfesModel.setMatematicas(rsT.getDouble(5));
                icfesModel.setCienciasSociales(rsT.getDouble(6));
                icfesModel.setFilosofia(rsT.getDouble(7));
                icfesModel.setBiologia(rsT.getDouble(8));
                icfesModel.setQuimica(rsT.getDouble(9));
                icfesModel.setFisica(rsT.getDouble(10));
                icfesModel.setIdRegistro(rsT.getInt(11));
            }
            
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        } finally {
            closeConnection();
        }
        return icfesModel;
    }

    @Override
    public String insert(IcfesModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(IcfesModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IcfesModel> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IcfesModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<IcfesModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
