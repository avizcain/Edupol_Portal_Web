/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.business.general;

import com.ethos.DAO.AbstractDAO;
import com.ethos.DAO.CategoriaSisbenDAO;
import com.ethos.DAO.CiudadesDAO;
import com.ethos.DAO.ComunidadDAO;
import com.ethos.DAO.EstadoCivilDAO;
import com.ethos.DAO.FormaPagoDAO;
import com.ethos.DAO.GeneroDAO;
import com.ethos.DAO.MedioMAsivoDAO;
import com.ethos.DAO.NivelEstudiosDAO;
import com.ethos.DAO.PeriodoAcademicoDAO;
import com.ethos.DAO.ProfesionesDAO;
import com.ethos.DAO.TipoIdentificacionDAO;
import com.ethos.DAO.TipoSanguineoDAO;
import com.ethos.DAO.TipoSolicitudDAO;
import com.ethos.DAO.TiposEpsDAO;
import com.ethos.DAO.UniversidadDAO;
import com.ethos.model.CategoriaSisbenModel;
import com.ethos.model.CiudadModel;
import com.ethos.model.ComunidadModel;
import com.ethos.model.EstadoCivilModel;
import com.ethos.model.FormaPagoModel;
import com.ethos.model.GeneroModel;
import com.ethos.model.ListasGeneralesModel;
import com.ethos.model.MediosMasivosModel;
import com.ethos.model.NivelEstudiosModel;
import com.ethos.model.PeriodoAcademicoModel;
import com.ethos.model.ProfesionesModel;
import com.ethos.model.TipoIdentificacionModel;
import com.ethos.model.TipoSanguineoModel;
import com.ethos.model.TipoSolicitudModel;
import com.ethos.model.TiposEpsModel;
import com.ethos.model.UniversidadesModel;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import javax.swing.ListSelectionModel;

/**
 *
 * @author operaciones
 */
public class FuncionesGenerales {

    AbstractDAO ciudadesDao;
    AbstractDAO estadoCivilDao;
    AbstractDAO nivelEstudiosDao;
    AbstractDAO tipoSolicitudDao;
    AbstractDAO tipoIdentificacion;
    AbstractDAO categoriaSisbenDao;
    AbstractDAO generoDAO;
    AbstractDAO mediosMasivosDao;
    AbstractDAO profesionesDAO;
    AbstractDAO tipoSanguineoDAO;
    AbstractDAO universidadDAO;
    AbstractDAO comunidadDAO;
    AbstractDAO tipoEpsDAO;
    AbstractDAO formaPagoDAO;
    AbstractDAO periodoAcademicoDAO;
   
    
    ListasGeneralesModel listasGeneralModel;

    public FuncionesGenerales() {
    }

    /**
     * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     *
     * @description Metodo utilizado para leer los datos desde un objeto tipo
     * JSON
     * @param jsonRq
     * @return JsonObject
     * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     */
    public JsonObject recibirDatos(BufferedReader jsonRq) {

        StringBuilder sb = new StringBuilder();
        JsonObject jObjData = new JsonObject();
        String line;
        JsonElement jelement;
        try {

            while ((line = jsonRq.readLine()) != null) {
                sb.append(line);
                jelement = new JsonParser().parse(sb.toString());
                jObjData = (JsonObject) jelement.getAsJsonObject();
            }
        } catch (IOException | JsonSyntaxException e) {
            e.printStackTrace();
        }
        return jObjData;
    }

    public String encripta(String sPalabra, boolean bTipo) {
        String sAlfabeto = "abcdefghijklmnÃopqrstuvwxyz 1234567890()";
        String sPalClave = "ethos simco plus 7";
        sPalClave = "ethos imcplus7";
        sPalClave = "ethos imcplu(7abdfgjknÃqrvwxyz)123456890";
        String sPalEncrip = "";
        if (!bTipo) //desencriptar
        {
            sPalEncrip = sAlfabeto;
            sAlfabeto = sPalClave;
            sPalClave = sPalEncrip;
        }
        int iLargo = sPalabra.length();
        sPalEncrip = "";
        int iPos = 0;
        int iPosEnc = 0;
        String sLetra = "";
        while (iPos < iLargo) {
            sLetra = sPalabra.substring(iPos, iPos + 1);
            iPosEnc = sPalClave.indexOf(sLetra);
            if (iPosEnc < 0 || sLetra.compareToIgnoreCase("%") == 0 || sLetra.compareToIgnoreCase("_") == 0) {
                sPalEncrip += sLetra;
            } else {
                sPalEncrip += sAlfabeto.substring(iPosEnc, iPosEnc + 1);
            }
            iPos++;
        }
        return sPalEncrip;
    }
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
   
    public ListasGeneralesModel obtenerDatosActualizar() {

        List<TipoIdentificacionModel> lisTipoIdentificacionModels;
        List<GeneroModel> lisGeneroModels;
        List<ProfesionesModel> lisProfesionesModels;
        List<EstadoCivilModel> lisEstadoCivilModels;
        List<TipoSolicitudModel> lisTipoSolicitudModels;
        List<CategoriaSisbenModel> lisCategoriaSisbenModels;
        List<CiudadModel> lisCiudadModels;
        List<MediosMasivosModel> lisMediosMasivosModels;
        List<NivelEstudiosModel> lisNivelEstudiosModels;
        List<TipoSanguineoModel> listTipoSanguineoModels;
        List<UniversidadesModel> listUniversidadesModel;
        List<ComunidadModel> listComunidadModels;
        List<TiposEpsModel> listTiposEpsModel;
        List<FormaPagoModel> listFormaPagoModel;
        List<PeriodoAcademicoModel> listPeriodoAcademico;
      

        listasGeneralModel = new ListasGeneralesModel();
        tipoIdentificacion = new TipoIdentificacionDAO();
        generoDAO = new GeneroDAO();
        profesionesDAO = new ProfesionesDAO();
        estadoCivilDao = new EstadoCivilDAO();
        tipoSolicitudDao = new TipoSolicitudDAO();
        categoriaSisbenDao = new CategoriaSisbenDAO();
        ciudadesDao = new CiudadesDAO();
        mediosMasivosDao = new MedioMAsivoDAO();
        nivelEstudiosDao = new NivelEstudiosDAO();
        tipoSanguineoDAO =new TipoSanguineoDAO();
        universidadDAO=new UniversidadDAO();
        comunidadDAO=new ComunidadDAO();
        tipoEpsDAO = new TiposEpsDAO();
        formaPagoDAO = new FormaPagoDAO();
        periodoAcademicoDAO = new PeriodoAcademicoDAO();
      
        
        

        lisTipoIdentificacionModels = tipoIdentificacion.findAll();
        lisGeneroModels = generoDAO.findAll();
        lisProfesionesModels = profesionesDAO.findAll();
        lisEstadoCivilModels = estadoCivilDao.findAll();
        lisTipoSolicitudModels = tipoSolicitudDao.findAll();
        lisCategoriaSisbenModels = categoriaSisbenDao.findAll();
        lisCiudadModels = ciudadesDao.findAll();
        lisMediosMasivosModels = mediosMasivosDao.findAll();
        lisNivelEstudiosModels = nivelEstudiosDao.findAll();
        listTipoSanguineoModels=tipoSanguineoDAO.findAll();
        listUniversidadesModel=universidadDAO.findAll();
        listComunidadModels=comunidadDAO.findAll();
        listTiposEpsModel = tipoEpsDAO.findAll();
        listFormaPagoModel = formaPagoDAO.findAll();
        listPeriodoAcademico = periodoAcademicoDAO.findAll();
      
        
        listasGeneralModel.setLisTipoIdentificacionModels(lisTipoIdentificacionModels);
        listasGeneralModel.setLisGeneroModels(lisGeneroModels);
        listasGeneralModel.setLisProfesionesModels(lisProfesionesModels);
        listasGeneralModel.setLisEstadoCivilModels(lisEstadoCivilModels);
        listasGeneralModel.setLisTipoSolicitudModels(lisTipoSolicitudModels);
        listasGeneralModel.setLisCategoriaSisbenModels(lisCategoriaSisbenModels);
        listasGeneralModel.setLisCiudadModels(lisCiudadModels);
        listasGeneralModel.setLisMediosMasivosModels(lisMediosMasivosModels);
        listasGeneralModel.setLisNivelEstudiosModels(lisNivelEstudiosModels);
        listasGeneralModel.setListipoSanguineoModels(listTipoSanguineoModels);
        listasGeneralModel.setLisUniversidadesModels(listUniversidadesModel);
        listasGeneralModel.setListComunidadModels(listComunidadModels);
        listasGeneralModel.setListTiposEpsModel(listTiposEpsModel);
        listasGeneralModel.setListFormaPagoModel(listFormaPagoModel);
        listasGeneralModel.setListPeriodoAcademico(listPeriodoAcademico);
      
        return listasGeneralModel;
    }
    
    public ListasGeneralesModel moduloEstudianteActualizar() {

        List<CiudadModel> lisCiudadModels;
        List<TiposEpsModel> listTiposEpsModel;
        List<PeriodoAcademicoModel> listPeriodoAcademico;
        List<CategoriaSisbenModel> lisCategoriaSisbenModels;

        
        ciudadesDao = new CiudadesDAO();
        tipoEpsDAO = new TiposEpsDAO();
        periodoAcademicoDAO = new PeriodoAcademicoDAO();
        categoriaSisbenDao = new CategoriaSisbenDAO();
        
        

        lisCiudadModels = ciudadesDao.findAll();
        listTiposEpsModel = tipoEpsDAO.findAll();
        listPeriodoAcademico = periodoAcademicoDAO.findAll();
        lisCategoriaSisbenModels= categoriaSisbenDao.findAll();
        
        listasGeneralModel.setLisCiudadModels(lisCiudadModels);
        listasGeneralModel.setListTiposEpsModel(listTiposEpsModel);
        listasGeneralModel.setListPeriodoAcademico(listPeriodoAcademico);
        listasGeneralModel.setLisCategoriaSisbenModels(lisCategoriaSisbenModels);
      
        return listasGeneralModel;
    }
    
    
}
