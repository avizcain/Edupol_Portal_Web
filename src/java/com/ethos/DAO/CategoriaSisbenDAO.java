
package com.ethos.DAO;

import com.ethos.model.CategoriaSisbenModel;
import com.ethos.query.GeneralQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Mary
 */


public class CategoriaSisbenDAO extends AbstractDAO<CategoriaSisbenModel> {
    
 CategoriaSisbenModel  categoriaSisbenModel;

 
 public CategoriaSisbenDAO(){
     super(CategoriaSisbenModel.class);
 }

    @Override
    public CategoriaSisbenModel select(Object id) {
        return null;
    }

    @Override
    public String insert(CategoriaSisbenModel entityClass) {
        return "";
    }

    @Override
    public boolean update(CategoriaSisbenModel entityClass) {
        return false;
    }

    @Override
    public String delete(Object id) {
        return "";
    }

    @Override
    public List<CategoriaSisbenModel> findAll() {
        String query;
        List<CategoriaSisbenModel> categoriaSisbenLis=new ArrayList<>();
        try {
            conn=getConnectionDB().getConnection();
            query=GeneralQuery.QUERY_GET_CATEGORIA_GENERO;
            psQuery=conn.prepareStatement(query);
            rsT=psQuery.executeQuery();
            while(rsT.next()){
                categoriaSisbenModel =new CategoriaSisbenModel();
                categoriaSisbenModel.setiIdCategoriaSisben(rsT.getInt(1));
                categoriaSisbenModel.setsDescripcionCategoriaSisben(rsT.getString(2));
                categoriaSisbenLis.add(categoriaSisbenModel);
            }
            
        } catch (SQLException ex) {
            System.out.println("exception  "+ex);
        }finally{
            closeConnection();
        }
        return categoriaSisbenLis;
    }

    @Override
    public List<CategoriaSisbenModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<CategoriaSisbenModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
 
 
 
 
    
    
}
