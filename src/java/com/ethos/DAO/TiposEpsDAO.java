/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.TipoSanguineoModel;
import com.ethos.model.TiposEpsModel;
import com.ethos.query.GeneralQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author EquipoNo9
 */
public class TiposEpsDAO extends AbstractDAO<TiposEpsModel> {
    
    TiposEpsModel tiposEpsModel;
   
    public TiposEpsDAO() {
        super(TiposEpsModel.class);
    }


    @Override
    public TiposEpsModel select(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert(TiposEpsModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(TiposEpsModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TiposEpsModel> findAll() {
        String query;
       List<TiposEpsModel> lisTipoEpsModel= new ArrayList<>();
        try {
          conn=getConnectionDB().getConnection();
          query=GeneralQuery.QUERY_GET_TIPO_EPS;
          psQuery=conn.prepareStatement(query);
          rsT=psQuery.executeQuery();
          while(rsT.next()){
           tiposEpsModel = new TiposEpsModel();
           tiposEpsModel.setID_EPS(rsT.getInt(1));
           tiposEpsModel.setNOMBRE_EPS(rsT.getString(2));
           lisTipoEpsModel.add(tiposEpsModel);
           }
        } catch (SQLException e) {
            System.out.println("eception:"+e);
        }finally{
            closeConnection();
        }   
         return lisTipoEpsModel;
    }

    @Override
    public List<TiposEpsModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TiposEpsModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
