/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.EstudianteModel;
import com.ethos.query.EstudiantesQuery;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author EquipoNo9
 */
public class DatosCompleEstudianteDAO extends AbstractDAO<EstudianteModel> {

    public DatosCompleEstudianteDAO(Class<EstudianteModel> entityClass) {
        super(entityClass);
    }

    @Override
    public EstudianteModel select(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert(EstudianteModel entityClass) {
        SimpleDateFormat fecha=new SimpleDateFormat("dd/MM/yyyy");
        String query;
       String resultado="NOK";
       int rs=0;
        try {
            conn= getConnectionDB().getConnection();
            query=EstudiantesQuery.QUERY_GUARDAR_DATOS_COMPLEMENTARIOS_ESTUDIANTE;
            psQuery=conn.prepareStatement(query);
            psQuery.setInt(1, entityClass.getIdPeriodoAcademico());
            psQuery.setString(2, entityClass.getNomEscuelaSecun());
            psQuery.setInt(3,entityClass.getIdPaisSecundaria());
            psQuery.setInt(4,entityClass.getIdDptoSecundaria());
            psQuery.setInt(5,entityClass.getIdCiudadEscuela());
            psQuery.setString(6,fecha.format(entityClass.getFechaGradoSecunda()));
            psQuery.setInt(7,entityClass.getiCategoriaSisben());
            psQuery.setString(8,entityClass.getFondoPensiones());
            psQuery.setInt(9,entityClass.getIdEps());
            rs=psQuery.executeUpdate();
             
        } catch (SQLException ex) {
            System.out.println("Sql Execptione"+ex);
        }finally{
            closeConnection();
        }
        if(rs > 0){
            resultado = "OK";
        }else{
            System.out.println("¡No se realizo la insercion en la tabla 'PERSONAS'!");
        }
        return resultado;
       
    }

    @Override
    public boolean update(EstudianteModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EstudianteModel> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EstudianteModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<EstudianteModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
