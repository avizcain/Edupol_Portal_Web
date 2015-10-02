
package com.ethos.DAO;

import com.ethos.model.TipoSanguineoModel;
import com.ethos.query.GeneralQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Mary
 */


public class TipoSanguineoDAO extends AbstractDAO<TipoSanguineoModel> {
    
    TipoSanguineoModel tiposSanguienoModel;
    
    public TipoSanguineoDAO(){
        super(TipoSanguineoModel.class);
    }

    @Override
    public TipoSanguineoModel select(Object id) {
       return null;
    }

    @Override
    public String insert(TipoSanguineoModel entityClass) {
        return "";
    }

    @Override
    public boolean update(TipoSanguineoModel entityClass) {
        return false;
    }

    @Override
    public String delete(Object id) {
        return null;
    }

    @Override
    public List<TipoSanguineoModel> findAll() {
        String query;
       List<TipoSanguineoModel> lisTipoSanguineo= new ArrayList<>();
        try {
          conn=getConnectionDB().getConnection();
          query=GeneralQuery.QUERY_GET_TIPO_SANGUINEO;
          psQuery=conn.prepareStatement(query);
          rsT=psQuery.executeQuery();
          while(rsT.next()){
           tiposSanguienoModel = new TipoSanguineoModel();
           tiposSanguienoModel.setiCodigoTipoSangre(rsT.getInt(1));
           tiposSanguienoModel.setsNombreSangre(rsT.getString(2));
           lisTipoSanguineo.add(tiposSanguienoModel);
           }
        } catch (SQLException e) {
            System.out.println("eception:"+e);
        }finally{
            closeConnection();
        }   
         return lisTipoSanguineo;
    }

    @Override
    public List<TipoSanguineoModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoSanguineoModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
