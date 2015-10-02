package com.ethos.DAO;

import com.ethos.model.MediosMasivosModel;
import com.ethos.query.GeneralQuery;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Mary
 */
public class MedioMAsivoDAO extends AbstractDAO<MediosMasivosModel> {

    MediosMasivosModel medioMasivoModel;

    public MedioMAsivoDAO() {
        super(MediosMasivosModel.class);
    }

    @Override
    public MediosMasivosModel select(Object id) {
        return null;
    }

    @Override
    public String insert(MediosMasivosModel entityClass) {
        return "";
    }

    @Override
    public boolean update(MediosMasivosModel entityClass) {
        return false;
    }

    @Override
    public String delete(Object id) {
        return "";
    }

    @Override
    public List<MediosMasivosModel> findAll() {
        String query;
        List<MediosMasivosModel> mediosMasivosLis = new ArrayList<>();
        try {
            conn = getConnectionDB().getConnection();
            query = GeneralQuery.QUERY_MEDIOS_MASIVOS;
            psQuery = conn.prepareStatement(query);
            rsT = psQuery.executeQuery();
            while (rsT.next()) {
                medioMasivoModel = new MediosMasivosModel();
                medioMasivoModel.setiIdMediosMasivos(rsT.getInt(1));
                medioMasivoModel.setsNombreMedioMasivo(rsT.getString(2));
                mediosMasivosLis.add(medioMasivoModel);
            }

        } catch (Exception e) {
            System.out.println("Exception " + e);
        } finally {
            closeConnection();
        }
        return mediosMasivosLis;
    }

    @Override
    public List<MediosMasivosModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<MediosMasivosModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
