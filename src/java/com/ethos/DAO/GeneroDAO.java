package com.ethos.DAO;

import com.ethos.model.GeneroModel;
import com.ethos.model.IcfesModel;
import com.ethos.query.GeneralQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Mary
 */
public class GeneroDAO extends AbstractDAO<GeneroModel> {
    
    GeneroModel generoModel;
    
    public GeneroDAO() {
        super(GeneroModel.class);
    }
    
    @Override
    public GeneroModel select(Object id) {
        return null;
    }
    
    @Override
    public String insert(GeneroModel entityClass) {
        return "";
    }
    
    @Override
    public boolean update(GeneroModel entityClass) {
        return false;
    }
    
    @Override
    public String delete(Object id) {
        return "";
    }
    
    @Override
    public List<GeneroModel> findAll() {
        String query;
        List<GeneroModel> generoModelLis = new ArrayList<>();
        try {
            conn = getConnectionDB().getConnection();
            query = GeneralQuery.QUERY_GET_GENERO;
            psQuery = conn.prepareStatement(query);
            rsT = psQuery.executeQuery();
            while (rsT.next()) {
                generoModel = new GeneroModel();
                generoModel.setiIdGenero(rsT.getInt(1));
                generoModel.setsDescripcion(rsT.getString(2));
                generoModel.setsInicial(rsT.getString(3));
                generoModelLis.add(generoModel);
                
            }
            
        } catch (SQLException ex) {
            System.out.println("Exception " + ex);
        } finally {
            closeConnection();
        }
        return generoModelLis;
    }
    
    @Override
    public List<GeneroModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public List<GeneroModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
