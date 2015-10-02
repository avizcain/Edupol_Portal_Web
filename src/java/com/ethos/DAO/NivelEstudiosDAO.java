/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.NivelEstudiosModel;
import com.ethos.query.NivelEstudiosQuery;
import com.ethos.query.UniversidadesQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author operaciones
 */
public class NivelEstudiosDAO extends AbstractDAO<NivelEstudiosModel>{

    NivelEstudiosModel nivelEstudiosModel;
    
    public NivelEstudiosDAO() {
        super(NivelEstudiosModel.class);
    }

    @Override
    public NivelEstudiosModel select(Object id) {
        return null;
    }

    @Override
    public String insert(NivelEstudiosModel entityClass) {
        return "";
    }

    @Override
    public boolean update(NivelEstudiosModel entityClass) {
        return false;
    }

    @Override
    public String delete(Object id) {
        return "";
    }

    @Override
    public List<NivelEstudiosModel> findAll() {
        String query;
        List<NivelEstudiosModel> nivelEstudiosList = new ArrayList<>();

        try {
            conn = getConnectionDB().getConnection();
            query=NivelEstudiosQuery.queryGetNivelEstudio;
            psQuery = conn.prepareStatement(query);
            rsT = psQuery.executeQuery();

            while (rsT.next()) {

                nivelEstudiosModel = new NivelEstudiosModel();
                nivelEstudiosModel.setsCodigo(rsT.getString(1));
                nivelEstudiosModel.setsDescripcion(rsT.getString(2));
                nivelEstudiosList.add(nivelEstudiosModel);
            }

        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        } finally {
            closeConnection();
        }
        return nivelEstudiosList;
    }

    @Override
    public List<NivelEstudiosModel> findWhere(HashMap<String, Object> parameters) {
        return null;
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        String query;
        List<Object>listObjects= new ArrayList<>();
        
        try {
            conn=getConnectionDB().getConnection();
            query=UniversidadesQuery.QUERY_GET_NIVELESTUDIOS;
            psQuery=conn.prepareStatement(query);
            psQuery.setInt(1, (int) parameters.get(0));
            psQuery.setInt(2, (int) parameters.get(1));
            rsT=psQuery.executeQuery();
            while(rsT.next()){
                nivelEstudiosModel = new NivelEstudiosModel();
                nivelEstudiosModel.setsCodigo(rsT.getString(1));
                nivelEstudiosModel.setsDescripcion(rsT.getString(2));
                listObjects.add(nivelEstudiosModel);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(NivelEstudiosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeConnection();
        }
       
        return listObjects;
    }

    @Override
    public List<NivelEstudiosModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
