/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.ProgramasModel;
import com.ethos.query.UniversidadesQuery;
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
public class ProgramasDAO  extends AbstractDAO<ProgramasModel>{
    
    ProgramasModel programasModel;
    
    public ProgramasDAO(){
        super(ProgramasModel.class);
    }

    @Override
    public ProgramasModel select(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert(ProgramasModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(ProgramasModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProgramasModel> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProgramasModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
         String query;
        List<Object>listObjects= new ArrayList<>();
        
        try {
            conn=getConnectionDB().getConnection();
            query=UniversidadesQuery.QUERY_GET_PROGRAMAS;
            psQuery=conn.prepareStatement(query);
            psQuery.setInt(1, (int) parameters.get(0));
            psQuery.setInt(2, (int) parameters.get(1));
            psQuery.setInt(3, (int) parameters.get(2));
            psQuery.setInt(4, (int) parameters.get(3));
            rsT=psQuery.executeQuery();
            while(rsT.next()){
                programasModel= new ProgramasModel();
                programasModel.setiCodPrograma(rsT.getInt(1));
                programasModel.setsDescripcion(rsT.getString(2));
                listObjects.add(programasModel);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(NivelEstudiosDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            closeConnection();
        }
       
        return listObjects;
    }

    @Override
    public List<ProgramasModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    
}
