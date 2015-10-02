

package com.ethos.DAO;

import com.ethos.model.TipoSolicitudModel;
import com.ethos.query.GeneralQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author Mary
 */


public class TipoSolicitudDAO extends AbstractDAO<TipoSolicitudModel>{

    TipoSolicitudModel tipoSolicitudModel;
    
    public TipoSolicitudDAO(){
        super(TipoSolicitudModel.class);
    }
    
    @Override
    public TipoSolicitudModel select(Object id){
        return null;
    }
    
    @Override
    public String insert(TipoSolicitudModel entityClass) {
        return "";
    }

    @Override
    public boolean update(TipoSolicitudModel entityClass) {
        return false;
    }

    @Override
    public String delete(Object id) {
        return "";
    }
    
    @Override
    public List<TipoSolicitudModel> findAll(){
        String query;
            List<TipoSolicitudModel> tipoSolicitudList = new ArrayList<>();
        
        try {
            conn=getConnectionDB().getConnection();
            query=GeneralQuery.QUERY_GETTIPOSOLICITUD;
            psQuery=conn.prepareStatement(query);
            rsT=psQuery.executeQuery();
            
            while(rsT.next()){
                
                tipoSolicitudModel = new TipoSolicitudModel();
                tipoSolicitudModel.setiId_tipoSolicitud(rsT.getInt(1));
                tipoSolicitudModel.setsNombreSolicitud(rsT.getString(2));
                tipoSolicitudList.add(tipoSolicitudModel);
                }
        } catch (SQLException ex) {
            System.out.println("Erro "+ ex);
        }finally{
            closeConnection();
        }
       return tipoSolicitudList;
}

    @Override
    public List<TipoSolicitudModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoSolicitudModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
}
