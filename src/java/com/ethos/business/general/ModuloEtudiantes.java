/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.business.general;

import com.ethos.DAO.AbstractDAO;
import com.ethos.model.CiudadModel;
import com.ethos.model.EstudianteModel;
import com.ethos.model.PeriodoAcademicoModel;
import com.google.gson.JsonObject;
import com.sun.management.MissionControlMXBean;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.http.HttpSession;
/**
 *
 * @author EquipoNo9
 */
public class ModuloEtudiantes {
    
        AbstractDAO moduloCompleEstudiante;
        HttpSession miSession;
        
        
        public String guardarRegistroModuloEstudiantes(JsonObject registro) throws ParseException {
            System.out.println("kkkkkkkkkk");
            String respuesta ="NOK";
           
            JsonObject perioAcaJsonObject;
            JsonObject datosJsonObject;
            JsonObject paisEsculaJsonObject;
            JsonObject departamentoEstudioJsonObject;
            JsonObject ciudadEscuelaJsonObject;
            JsonObject fechaGraduacionJsonObject;
            JsonObject categoriSisbenperioAcaJsonObject;
            JsonObject fondoPensionesJsonObject;
            JsonObject epsJsonObject;
            SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/yyyy");
            
            EstudianteModel estudiantemodel = new EstudianteModel();
         
            
           
            perioAcaJsonObject= registro.get("periodoAca").getAsJsonObject();
            datosJsonObject=registro.getAsJsonObject();
            System.out.println(datosJsonObject.toString());
            paisEsculaJsonObject = registro.get("paisEscuela").getAsJsonObject();
            departamentoEstudioJsonObject = registro.get("depEscuela").getAsJsonObject();
            ciudadEscuelaJsonObject= registro.get("ciudad").getAsJsonObject();
            categoriSisbenperioAcaJsonObject=registro.get("sisben").getAsJsonObject();
            epsJsonObject=registro.get("eps").getAsJsonObject();
            
            estudiantemodel.setIdPeriodoAcademico(perioAcaJsonObject.get("idCodigo").getAsInt());
            estudiantemodel.setNomEscuelaSecun(datosJsonObject.get("nomEscu").getAsString());
            estudiantemodel.setIdPaisSecundaria(paisEsculaJsonObject.get("sCodigo").getAsInt());
            estudiantemodel.setIdDptoSecundaria(departamentoEstudioJsonObject.get("sCodigo").getAsInt());
            estudiantemodel.setIdCiudadEscuela(ciudadEscuelaJsonObject.get("sCodigo").getAsInt());
            estudiantemodel.setFechaGradoSecunda(formatoFecha.parse(datosJsonObject.get("fecGraSec").getAsString()));
            estudiantemodel.setiCategoriaSisben(categoriSisbenperioAcaJsonObject.get("iIdCategoriaSisben").getAsInt());
            estudiantemodel.setFondoPensiones(datosJsonObject.get("pensCesantias").getAsString());
            estudiantemodel.setIdEps(epsJsonObject.get("id_Eps").getAsInt());
            
            
            
            int peri = estudiantemodel.getIdPeriodoAcademico();
            String n = estudiantemodel.getNomEscuelaSecun();
            int p = estudiantemodel.getIdPaisSecundaria();
            int d = estudiantemodel.getIdDptoSecundaria();
            int c = estudiantemodel.getIdCiudadEscuela();
            Date f= estudiantemodel.getFechaGradoSecunda();
            int ca = estudiantemodel.getiCategoriaSisben();
            String pen = estudiantemodel.getFondoPensiones();
            int e = estudiantemodel.getIdEps();
            
            String resultadoGuardarDatos = moduloCompleEstudiante.insert(estudiantemodel);
            String r =estudiantemodel.getNomEscuelaSecun();
            System.out.println("Imprimir......"+ r +","+ peri + ","+ p +","+ d +","+ c +","+ f.toString() +",z "+ ca + "," + pen + "," + e);
            System.out.println("resultado......" + resultadoGuardarDatos);
            return respuesta; 
        }
           
}
