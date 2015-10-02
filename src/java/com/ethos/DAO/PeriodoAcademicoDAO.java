/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.PeriodoAcademicoModel;
import com.ethos.model.TipoSanguineoModel;
import com.ethos.query.GeneralQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author EquipoNo9
 */
public class PeriodoAcademicoDAO extends AbstractDAO<PeriodoAcademicoModel>{
    PeriodoAcademicoModel periodoAcademicoModel;
        
    public PeriodoAcademicoDAO() {
        super(PeriodoAcademicoModel.class);
    }

    @Override
    public PeriodoAcademicoModel select(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert(PeriodoAcademicoModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(PeriodoAcademicoModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PeriodoAcademicoModel> findAll() {
           String query;
       List<PeriodoAcademicoModel> lisPeriodoAcademico= new ArrayList<>();
        try {
          conn=getConnectionDB().getConnection();
          query=GeneralQuery.QUERY_GET_TIPO_PERIODO_ACADEMICO;
          psQuery=conn.prepareStatement(query);
          rsT=psQuery.executeQuery();
          while(rsT.next()){
           periodoAcademicoModel = new PeriodoAcademicoModel();
           periodoAcademicoModel.setIdCodigo(rsT.getInt(1));
           periodoAcademicoModel.setDescripcion(rsT.getString(2));
           lisPeriodoAcademico.add(periodoAcademicoModel);
           }
        } catch (SQLException e) {
            System.out.println("eception:"+e);
        }finally{
            closeConnection();
        }   
         return lisPeriodoAcademico;
    }

    @Override
    public List<PeriodoAcademicoModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<PeriodoAcademicoModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
