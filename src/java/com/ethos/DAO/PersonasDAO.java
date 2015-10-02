/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.model.PersonaModel;
import com.ethos.query.FunctionsDB;
import com.ethos.query.PersonasQuery;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 *
 * @author DavidFernando
 */
public class PersonasDAO extends AbstractDAO<PersonaModel> {

    private String tipoConn;
    private PersonaModel personaModel;
    private PersonasQuery personaQuery;

    public PersonasDAO() {
        super(PersonaModel.class);

    }

    /**----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     * @describe Metodo quu ejecuta query para obtener los datos de una persona
     * @param idPersona
     * @return Modelo Persona
     *----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    @Override
    public PersonaModel select(Object idPersona) {
         String query;
         personaModel = new PersonaModel();
         try {
         conn=getConnectionDB().getConnection();
         query=PersonasQuery.QUERY_PERSONA_EXISTE;
         psQuery=conn.prepareStatement(query);
         psQuery.setString(1, String.valueOf(idPersona));
         rsT=psQuery.executeQuery();
         while(rsT.next()){
            personaModel.setsIden(rsT.getString(1));
         }
        
        /* personaModel = new PersonaModel();
        personaQuery = new PersonasQuery();
        String query;
        
        try {
            conn = getConnectionDB().getConnection();
            tipoConn = conn.getMetaData().getDriverName();
            query=personaQuery.queryDatosPersona(tipoConn);
            
            psQuery = conn.prepareStatement(query);
            psQuery.setString(1, idPersona.toString());
            rsT = psQuery.executeQuery();

            if (rsT.next()) {

                personaModel.setsIden(rsT.getString(1));
                personaModel.setsCodCiudadRes(rsT.getString(2));
                personaModel.setiSalario(rsT.getInt(3));
                personaModel.setsCodCiudadNac(rsT.getString(4));
                personaModel.setsNomCiudadNac(rsT.getString(5));
                personaModel.setsFecNac(rsT.getString(6));
                personaModel.setsCodCiudadExp(rsT.getString(7));
                personaModel.setsNomCiudadExp(rsT.getString(8));
                personaModel.setsFecExp(rsT.getString(9));
                personaModel.setiTipoActEcon(rsT.getInt(10));
                personaModel.setiNivelEst(rsT.getInt(11));
                personaModel.setiNumPeraCargo(rsT.getInt(12));
                personaModel.setsCodEstadoCivil(rsT.getString(13));
                personaModel.setsEstrato(rsT.getString(14));
                personaModel.setsCabezaFamilia(rsT.getString(15));
                personaModel.setsNombre(rsT.getString(16));
                personaModel.setsApellido(rsT.getString(17));
                personaModel.setsCorreoPer(rsT.getString(18));
                personaModel.setsCorreoCor(rsT.getString(19));
                personaModel.setsDirRes(rsT.getString(20));
                personaModel.setsDirOfi(rsT.getString(21));
                personaModel.setsBarrioOfi(rsT.getString(22));
                personaModel.setsTelArr(rsT.getString(23));
                personaModel.setsTelOfi(rsT.getString(24));
                personaModel.setsTelRes(rsT.getString(25));
                personaModel.setsCelular(rsT.getString(26));
            }*/

        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        } finally {
            closeConnection();
        }
      
        return personaModel;
    }
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    @Override
    public String insert(PersonaModel entityClass) {
        SimpleDateFormat fecha=new SimpleDateFormat("dd/MM/yyyy");
        int IdPersonas=1;
        String resultado ="NOK";
        String query;
        int rs=0;
       try {
        conn=getConnectionDB().getConnection();
        psQuery=conn.prepareStatement(PersonasQuery.QUERY_ULTIMO_CODIGO);
        rsT=psQuery.executeQuery();
        while(rsT.next()){
        IdPersonas+=rsT.getInt(1);
        }
        psQuery=null;
        query=PersonasQuery.QUERY_GUARDAR_DATOS;
        psQuery=conn.prepareStatement(query);
        psQuery.setInt(1,IdPersonas);
        psQuery.setString(2,entityClass.getStipoPersona());
        psQuery.setString(3,entityClass.getsIden());
        psQuery.setInt(4,entityClass.getiTipoIden());
        psQuery.setInt(5,entityClass.getIdPerfil());
        psQuery.setString(6,fecha.format(entityClass.getdFechaExpedicion()));
        psQuery.setString(7,entityClass.getsApellido());
        psQuery.setString(8,entityClass.getsNombre());
        psQuery.setString(9,entityClass.getsGenero());
        if (entityClass.getdFechaNacimiento()!=null){
        psQuery.setString(10,fecha.format(entityClass.getdFechaNacimiento()));
        }else{
        psQuery.setString(10,"");
        }
        psQuery.setString(11,entityClass.getsCodEstadoCivil());
        psQuery.setInt(12,entityClass.getiNivelEst());
        psQuery.setString(13,entityClass.getsClavePersona());
        rs=psQuery.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("SQLException " +ex);
        }finally {
            closeConnection();
        }
        if(rs > 0){
            resultado = String.valueOf(IdPersonas);
        }else{
            System.out.println("¡No se realizo la insercion en la tabla 'PERSONAS'!");
        }
        return resultado;
        
        
    }

    @Override
    public boolean update(PersonaModel entityClass) {
        String query;
        boolean resultado=false;
        int update=0;
        try {
            conn = getConnectionDB().getConnection();
            tipoConn = conn.getMetaData().getDriverName();
            query=PersonasQuery.queryDatosUpdate;
            
            psQuery = conn.prepareStatement(query);
            psQuery.setInt(1, entityClass.getiSalario());
            psQuery.setString(2, entityClass.getsDirRes());
            psQuery.setString(3, entityClass.getsTelRes());
            psQuery.setInt(4, entityClass.getiNivelEst());
            psQuery.setString(5, entityClass.getsCorreoPer());
            psQuery.setInt(6, entityClass.getiNumPeraCargo());
            psQuery.setString(7, entityClass.getsCodCiudadRes());
            psQuery.setString(8, entityClass.getsCodEstadoCivil());
            psQuery.setString(9, entityClass.getsCodPersona());
            update = psQuery.executeUpdate();
            
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        } finally {
            closeConnection();
        }
        if(update > 0){
            resultado = true;
        }else{
            System.out.println("¡La tabla Personas no fue actualizada!");
        }
        return resultado;
    }

    @Override
    public String delete(Object id) {
        return "";
    }

    @Override
    public List<PersonaModel> findAll() {
        return null;
    }

    @Override
    public List<PersonaModel> findWhere(HashMap<String, Object> parameters) {
        
        String query;
        PersonaModel personModel;
        FunctionsDB functionDB = new FunctionsDB();
        
        List<PersonaModel> listPersonaModel = new ArrayList<>();
        List<String> listParametros = (List<String>) parameters.get("listaPersonas");
   
        try {
            conn = getConnectionDB().getConnection();
            query=functionDB.createQuery(PersonasQuery.queryObtenerDatosPersonaLogin, listParametros);
            psQuery = conn.prepareStatement(query);
            
            rsT = psQuery.executeQuery();
            
            while (rsT.next()) {
                personModel =new PersonaModel();
                personModel.setsCodPersona(rsT.getString(1));
                personModel.setIdPerfil(rsT.getInt(2));
                personModel.setsClavePersona(rsT.getString(3));
                
                listPersonaModel.add(personModel);
            }
            
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        } finally {
            closeConnection();
        }
        return listPersonaModel;
    }

    @Override
    public List<Object> queryAll(List<Object> parameters) {
        
        return null;
    }
    
    public String getTipoConn() {
        return tipoConn;
    }

    @Override
    public List<PersonaModel> findAll(Object id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
