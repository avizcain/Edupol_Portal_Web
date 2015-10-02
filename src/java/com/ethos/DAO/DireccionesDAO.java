/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.DireccionesModel;
import com.ethos.query.DireccionesQuery;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author operaciones
 */
public class DireccionesDAO extends AbstractDAO<DireccionesModel>{
    

    public DireccionesDAO() {
        super(DireccionesModel.class);
    }

    @Override
    public DireccionesModel select(Object id) {
        return null;
    }

    @Override
    public String insert(DireccionesModel entityClass) {
        int IdDirreciones=1;
        String resultado ="NOK";
        String query;
        int rs=0;
       try {
        conn=getConnectionDB().getConnection();
        psQuery=conn.prepareStatement(DireccionesQuery.QUERY_ULTIMO_CODIGO);
        rsT=psQuery.executeQuery();
        while(rsT.next()){
        IdDirreciones+=rsT.getInt(1);
        }
        psQuery=null;
        query=DireccionesQuery.QUERY_GUARDAR_DIRRECCIONES;
        psQuery=conn.prepareStatement(query);
        psQuery.setInt(1,IdDirreciones);
        psQuery.setString(2,entityClass.getsCliente());
        psQuery.setString(3,entityClass.getsTipoDir());
        psQuery.setString(4,entityClass.getsDireccion());
        rs=psQuery.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("SQLException " +ex);
        }finally {
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
    public boolean update(DireccionesModel entityClass) {
        String query;
        boolean resultado=false;
        int update=0;
        try {
            conn = getConnectionDB().getConnection();
            query=DireccionesQuery.queryDatosUpdate;
            
            psQuery = conn.prepareStatement(query);
            psQuery.setString(1, entityClass.getsDireccion());
            psQuery.setString(2, entityClass.getsCiudad());
            psQuery.setString(3, entityClass.getsBarrio());
            psQuery.setString(4, entityClass.getsCliente());
            psQuery.setString(5, entityClass.getsTipoDir());
            update = psQuery.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        } finally {
            closeConnection();
        }
        if(update > 0){
            resultado = true;
        }else{
            System.out.println("¡La tabla Direcciones no fue actualizada!");
        }
        return resultado;
    }

    @Override
    public String delete(Object id) {
        return "";
    }

    @Override
    public List<DireccionesModel> findAll() {
        return null;
    }

    @Override
    public List<DireccionesModel> findWhere(HashMap<String, Object> parameters) {
        return null;
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DireccionesModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
