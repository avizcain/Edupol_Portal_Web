/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.AcudienteModel;
import com.ethos.query.AcudienteQuery;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author Operaciones-GerenteC
 */
public class AcudienteDAO extends AbstractDAO<AcudienteModel>{
    AcudienteModel acudienteModel;
    
    public AcudienteDAO(){
        super(AcudienteModel.class);
    }

    @Override
    public AcudienteModel select(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String insert(AcudienteModel entityClass) {
       String query;
       String resultado="NOK";
       int rs=0;
        try {
            conn=getConnectionDB().getConnection();
            query=AcudienteQuery.QUERY_GUARDAR_ACUDIENTE;
            psQuery=conn.prepareStatement(query);
            psQuery.setInt(1,entityClass.getiCodAcudiente());
            psQuery.setString(2,entityClass.getsNombreEmpresa());
            psQuery.setString(3,entityClass.getsTipoContrato());
            psQuery.setInt(4,Integer.parseInt(entityClass.getsTiempoTrabajando()));
            psQuery.setString(5,entityClass.getsTrabajaActual());
            psQuery.setDouble(6,entityClass.getdIngArrendamiento());
            psQuery.setDouble(7,entityClass.getdIngPension());
            psQuery.setString(8,entityClass.getsNombreOtrosIngresos());
            psQuery.setDouble(9,entityClass.getdOtrosIngresos1());
            psQuery.setString(10,entityClass.getsTipoVivienda());
            psQuery.setString(11,entityClass.getsVehiculo());
            psQuery.setString(12,entityClass.getsOcupacion());
            psQuery.setDouble(13,entityClass.getdSalario());
            psQuery.setString(14,entityClass.getsTarjetaCredito());
            psQuery.setString(15,entityClass.getsCreditoActual());
            psQuery.setDouble(16,entityClass.getdValorObligaciones());
            psQuery.setString(17,entityClass.getsMedioEdupol());
            psQuery.setInt(18,Integer.parseInt(entityClass.getsPaisResidencia()));
            psQuery.setInt(19,Integer.parseInt(entityClass.getsDepartamento()));
            psQuery.setInt(20,Integer.parseInt(entityClass.getsCiudadResidencia()));
            rs=psQuery.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Sql exeption " +e);
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
    public boolean update(AcudienteModel entityClass) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String delete(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AcudienteModel> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AcudienteModel> findWhere(HashMap<String, Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<AcudienteModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
