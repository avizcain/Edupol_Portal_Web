package com.ethos.DAO;

import com.ethos.model.ProfesionesModel;
import com.ethos.query.GeneralQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mary
 */
public class ProfesionesDAO extends AbstractDAO<ProfesionesModel> {

    ProfesionesModel profesionesModel;

    public ProfesionesDAO() {
        super(ProfesionesModel.class);
    }

    @Override
    public ProfesionesModel select(Object id) {
        return null;
    }

    @Override
    public String insert(ProfesionesModel entityClass) {
        return "";
    }

    @Override
    public boolean update(ProfesionesModel entityClass) {
        return false;
    }

    @Override
    public String delete(Object id) {
        return "";
    }

    @Override
    public List<ProfesionesModel> findAll() {
        String query;
        List<ProfesionesModel> profesionesModelLis = new ArrayList<>();
        try {
            conn = getConnectionDB().getConnection();
            query = GeneralQuery.QUERY_PROFESIONES;
            psQuery = conn.prepareStatement(query);
            rsT = psQuery.executeQuery();
            while (rsT.next()) {
                profesionesModel = new ProfesionesModel();
                profesionesModel.setiIdProfesiones(rsT.getInt(1));
                profesionesModel.setsNombreProfesiones(rsT.getString(2));
                profesionesModelLis.add(profesionesModel);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProfesionesDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            closeConnection();
        }

        return profesionesModelLis;
    }

    @Override
    public List<ProfesionesModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<ProfesionesModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
