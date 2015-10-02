/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.business.general;

import com.ethos.DAO.AbstractDAO;
import com.ethos.DAO.CiudadesDAO;
import com.ethos.DAO.DireccionesDAO;
import com.ethos.DAO.EstadoCivilDAO;
import com.ethos.DAO.EstudiantesDAO;
import com.ethos.DAO.NivelEstudiosDAO;
import com.ethos.DAO.PersonasDAO;
import com.ethos.DAO.TelefonosDAO;
import com.ethos.model.ActualizaModel;
import com.ethos.model.CiudadModel;
import com.ethos.model.DireccionesModel;
import com.ethos.model.EstadoCivilModel;
import com.ethos.model.EstudianteModel;
import com.ethos.model.NivelEstudiosModel;
import com.ethos.model.PersonaModel;
import com.ethos.model.TelefonosModel;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dmendez
 */
public class ActualizarDatos {

    AbstractDAO personaDao;
    AbstractDAO ciudadesDao;
    AbstractDAO direccionesDAO;
    AbstractDAO telefonosDAO;
    AbstractDAO estadoCivilDao;
    AbstractDAO nivelEstudiosDao;
    AbstractDAO estudianteDAO;

    PersonaModel personaModel;
    TelefonosModel telefonoModel;
    ActualizaModel actualizaModel;
    DireccionesModel direccionesModel;
    EstudianteModel estudianteModel;
    /**
     *
     * @param idPersona
     * @return
     */
    public ActualizaModel obtenerDatosActualizar(String idPersona) {

        List<CiudadModel> listCiudades;
        List<EstadoCivilModel> listEstadoCivil;
        List<NivelEstudiosModel> listNivelEstudio;

        personaDao = new PersonasDAO();
        ciudadesDao = new CiudadesDAO();
        estadoCivilDao = new EstadoCivilDAO();
        nivelEstudiosDao = new NivelEstudiosDAO();

        actualizaModel = new ActualizaModel();
        personaModel = (PersonaModel) personaDao.select(idPersona);

        listCiudades = ciudadesDao.findAll();
        listEstadoCivil = estadoCivilDao.findAll();
        listNivelEstudio = nivelEstudiosDao.findAll();

     /*   for (int i = 0; i < listCiudades.size(); i++) {
            if (listCiudades.get(i).getsCodigo().equals(personaModel.getsCodCiudadRes())) {
                personaModel.setmCiudadRes(listCiudades.get(i));
                i = listCiudades.size();
            }
        }*/

        for (int i = 0; i < listEstadoCivil.size(); i++) {
            if (listEstadoCivil.get(i).getsCodigoEstadoCivil().equals(personaModel.getsCodEstadoCivil())) {
                personaModel.setmEstadoCivil(listEstadoCivil.get(i));
                i = listEstadoCivil.size();
            }
        }

        for (int i = 0; i < listNivelEstudio.size(); i++) {
            if (listNivelEstudio.get(i).getsCodigo().equals(String.valueOf(personaModel.getiNivelEst()))) {
                personaModel.setmNivelEstudios(listNivelEstudio.get(i));
                i = listNivelEstudio.size();
            }
        }

         actualizaModel.setPersonaModel(personaModel);
        actualizaModel.setListCiudadModel(listCiudades);
        actualizaModel.setListEstadoCivilModel(listEstadoCivil);
        actualizaModel.setListNivelEstudiosModel(listNivelEstudio);
        return actualizaModel;
    }

    public String updatePerson(JsonObject persona, String id) {

        String resultado = "NOK";
        JsonObject ciudadJObject;
        JsonObject estadoCivilJObject;
        JsonObject nivelEstudioJObject;

        personaDao = new PersonasDAO();
        telefonosDAO = new TelefonosDAO();
        direccionesDAO = new DireccionesDAO();

        personaModel = new PersonaModel();
        telefonoModel = new TelefonosModel();
        direccionesModel = new DireccionesModel();
        
        personaModel.setsCodPersona(id);
        personaModel.setsIden(persona.get("sIden").getAsString());
        personaModel.setiSalario(persona.get("iSalario").getAsInt());
        personaModel.setsFecNac(persona.get("sFecNac").getAsString());
        personaModel.setsFecExp(persona.get("sFecExp").getAsString());
        personaModel.setsNombre(persona.get("sNombre").getAsString());
        personaModel.setsDirRes(persona.get("sDirRes").getAsString());
        personaModel.setsTelRes(persona.get("sTelRes").getAsString());
//        personaModel.setSDirOfi(persona.get("sDirOfi").getAsString());
//        personaModel.setSTelOfi(persona.get("sTelOfi").getAsString());
        personaModel.setsTelArr(persona.get("sTelArr").getAsString());
        personaModel.setiNivelEst(persona.get("iNivelEst").getAsInt());
        personaModel.setsCelular(persona.get("sCelular").getAsString());
        personaModel.setsApellido(persona.get("sApellido").getAsString());
//        personaModel.setSBarrioOfi(persona.get("sBarrioOfi").getAsString());
        personaModel.setsCorreoPer(persona.get("sCorreoPer").getAsString());
//        personaModel.setSCorreoCor(persona.get("sCorreoCor").getAsString());
        personaModel.setiTipoActEcon(persona.get("iTipoActEcon").getAsInt());
        personaModel.setiNumPeraCargo(persona.get("iNumPeraCargo").getAsInt());
//        personaModel.setSCodCiudadRes(persona.get("sCodCiudadRes").getAsString());
        personaModel.setsCodCiudadNac(persona.get("sCodCiudadNac").getAsString());
        personaModel.setsNomCiudadNac(persona.get("sNomCiudadNac").getAsString());
        personaModel.setsCodCiudadExp(persona.get("sCodCiudadExp").getAsString());
        personaModel.setsNomCiudadExp(persona.get("sNomCiudadExp").getAsString());
        personaModel.setsCodEstadoCivil(persona.get("sCodEstadoCivil").getAsString());

        ciudadJObject = persona.get("mCiudadRes").getAsJsonObject();
        estadoCivilJObject = persona.get("mEstadoCivil").getAsJsonObject();
        nivelEstudioJObject = persona.get("mNivelEstudios").getAsJsonObject();

        personaModel.setiNivelEst(nivelEstudioJObject.get("sCodigo").getAsInt());
        personaModel.setsCodCiudadRes(ciudadJObject.get("sCodigo").getAsString());
        personaModel.setsCodEstadoCivil(estadoCivilJObject.get("sCodigoEstadoCivil").getAsString());

        telefonoModel.setsTipoTel("2");
        telefonoModel.setsIdPersona(id);
        telefonoModel.setsNumero(persona.get("sTelOfi").getAsString());
        telefonoModel.setsCiudad(ciudadJObject.get("sCodigo").getAsString());

        direccionesModel.setsCliente(id);
        direccionesModel.setsTipoDir("6");
        direccionesModel.setsBarrio("");
        direccionesModel.setsDireccion(persona.get("sCorreoCor").getAsString());
        direccionesModel.setsCiudad(ciudadJObject.get("sCodigo").getAsString());
        
//        direccionesModel.setsCliente(id);
//        direccionesModel.setsTipoDir("1");
//        direccionesModel.setsBarrio(persona.get("sBarrioOfi").getAsString());
//        direccionesModel.setsDireccion(persona.get("sDirOfi").getAsString());
//        direccionesModel.setsCiudad(ciudadJObject.get("sCodigo").getAsString());

        try {
            boolean updatePerson = personaDao.update(personaModel);
            boolean updateTelefono = telefonosDAO.update(telefonoModel);
            boolean updateDireccion = direccionesDAO.update(direccionesModel);

            if (updatePerson && updateTelefono && updateDireccion) {
                resultado = "OK";
            }
        } catch (Exception e) {
            System.out.println("Error durante actualizacion de datos: " + e);
        }
        return resultado;
    }
    
    public List<Object> filtroEstudiantes(JsonObject json){
        
        List<Object>listObjects=new ArrayList<>();
        List<Object>resultado=new ArrayList<>();
        estudianteDAO=new EstudiantesDAO();
        switch(json.get("tipFiltro").getAsInt()){
            case 1:
                listObjects.add(json.get("cedula").getAsInt());
                resultado=(estudianteDAO.queryAll(listObjects));
                break;
            case 2:
                resultado=(estudianteDAO.queryAll(null));
                break;
        }
        
        return resultado;
    }
}
