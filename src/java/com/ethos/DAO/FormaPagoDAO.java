/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.EstadoCivilModel;
import com.ethos.model.FormaPagoModel;
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
public class FormaPagoDAO extends AbstractDAO<FormaPagoModel> {

    FormaPagoModel formaPagoModel;
    public FormaPagoDAO() {
        super(FormaPagoModel.class);
    }

    @Override
    public FormaPagoModel select(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert(FormaPagoModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(FormaPagoModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FormaPagoModel> findAll() {
           String query;
       List<FormaPagoModel> lisFormaPago= new ArrayList<>();
        try {
          conn=getConnectionDB().getConnection();
          query=GeneralQuery.QUERY_GET_TIPO_FORMA_PAGO;
          psQuery=conn.prepareStatement(query);
          rsT=psQuery.executeQuery();
          while(rsT.next()){
           formaPagoModel = new FormaPagoModel();
           formaPagoModel.setCodigo(rsT.getInt(1));
           formaPagoModel.setDescripcion(rsT.getString(2));
           lisFormaPago.add(formaPagoModel);
           }
        } catch (SQLException e) {
            System.out.println("eception:"+e);
        }finally{
            closeConnection();
        }   
         return lisFormaPago;
    }

    @Override
    public List<FormaPagoModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<FormaPagoModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
