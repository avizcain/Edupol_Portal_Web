package com.ethos.DAO;

import com.ethos.model.TipoIdentificacionModel;
import com.ethos.query.GeneralQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Mary
 */
public class TipoIdentificacionDAO extends AbstractDAO<TipoIdentificacionModel> {

    TipoIdentificacionModel tipoIdentificacionModel;

    public TipoIdentificacionDAO() {
        super(TipoIdentificacionModel.class);
    }

    @Override
    public TipoIdentificacionModel select(Object id) {
        return null;
    }

    @Override
    public String insert(TipoIdentificacionModel entityClass) {
        return "";
    }

    @Override
    public boolean update(TipoIdentificacionModel entityClass) {
        return false;
    }

    @Override
    public String delete(Object id) {
        return "";
    }

    @Override
    public List<TipoIdentificacionModel> findAll() {
        String query;
        List<TipoIdentificacionModel> tipoIdentificacionList = new ArrayList<>();
        try {
            conn = getConnectionDB().getConnection();
            query = GeneralQuery.QUERY_GETTIPO_IDENTIFICACON;
            psQuery = conn.prepareStatement(query);
            
            rsT = psQuery.executeQuery();
            
            while (rsT.next()) {
                tipoIdentificacionModel = new TipoIdentificacionModel();
                tipoIdentificacionModel.setiId_Identificacion(rsT.getInt(1));
                tipoIdentificacionModel.setsDescripcion(rsT.getString(2));
                tipoIdentificacionList.add(tipoIdentificacionModel);
            }
        } catch (SQLException ex) {
            System.out.println("exception " + ex);
        } finally {
            closeConnection();
        }
        return tipoIdentificacionList;
    }

    @Override
    public List<TipoIdentificacionModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<TipoIdentificacionModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
