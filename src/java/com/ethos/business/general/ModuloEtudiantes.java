/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.business.general;

import com.ethos.DAO.AbstractDAO;
import com.ethos.model.PeriodoAcademicoModel;
import com.google.gson.JsonObject;
import java.text.ParseException;
/**
 *
 * @author EquipoNo9
 */
public class ModuloEtudiantes {
        AbstractDAO comunidadDAO;
        AbstractDAO ciudadesDAO;
        AbstractDAO tipoEpsDAO;
        
        
        public String guardarRegistroModuloEstudiantes(JsonObject registro) throws ParseException {
            String respuesta ="NOK";
            JsonObject perioAcaJsonObject;
            perioAcaJsonObject= registro.get("periodoAca").getAsJsonObject();
            PeriodoAcademicoModel periodo = new PeriodoAcademicoModel();
            periodo.setDescripcion(perioAcaJsonObject.toString());
            System.out.println("imprime....." + periodo.getDescripcion());
            return respuesta; 
        }
           
}
