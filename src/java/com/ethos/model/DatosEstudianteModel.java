/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ethos.model;

/**
 *
 * @author user
 */
public class DatosEstudianteModel {

    public String periodoAcademico;
    public String eps;
    public String fondoPensiones;
    public String paisSecundaria;
    public String categoriaSisben;
    public String departaSecundaria;
    public String ciudadSecundaria;
    public String nomEscSecundaria;
    public String fechaGraduacion;
    
    public DatosEstudianteModel() {
    
    }

    public DatosEstudianteModel(String periodoAcademico, String eps, String fondoPensiones, String paisSecundaria, String categoriaSisben, String departaSecundaria, String ciudadSecundaria, String nomEscSecundaria, String fechaGraduacion) {
        this.periodoAcademico = periodoAcademico;
        this.eps = eps;
        this.fondoPensiones = fondoPensiones;
        this.paisSecundaria = paisSecundaria;
        this.categoriaSisben = categoriaSisben;
        this.departaSecundaria = departaSecundaria;
        this.ciudadSecundaria = ciudadSecundaria;
        this.nomEscSecundaria = nomEscSecundaria;
        this.fechaGraduacion = fechaGraduacion;
    }

    public String getPeriodoAcademico() {
        return periodoAcademico;
    }

    public void setPeriodoAcademico(String periodoAcademico) {
        this.periodoAcademico = periodoAcademico;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getFondoPensiones() {
        return fondoPensiones;
    }

    public void setFondoPensiones(String fondoPensiones) {
        this.fondoPensiones = fondoPensiones;
    }

    public String getPaisSecundaria() {
        return paisSecundaria;
    }

    public void setPaisSecundaria(String paisSecundaria) {
        this.paisSecundaria = paisSecundaria;
    }

    public String getCategoriaSisben() {
        return categoriaSisben;
    }

    public void setCategoriaSisben(String categoriaSisben) {
        this.categoriaSisben = categoriaSisben;
    }

    public String getDepartaSecundaria() {
        return departaSecundaria;
    }

    public void setDepartaSecundaria(String departaSecundaria) {
        this.departaSecundaria = departaSecundaria;
    }

    public String getCiudadSecundaria() {
        return ciudadSecundaria;
    }

    public void setCiudadSecundaria(String ciudadSecundaria) {
        this.ciudadSecundaria = ciudadSecundaria;
    }

    public String getNomEscSecundaria() {
        return nomEscSecundaria;
    }

    public void setNomEscSecundaria(String nomEscSecundaria) {
        this.nomEscSecundaria = nomEscSecundaria;
    }

    public String getFechaGraduacion() {
        return fechaGraduacion;
    }

    public void setFechaGraduacion(String fechaGraduacion) {
        this.fechaGraduacion = fechaGraduacion;
    }
    
    
    
}
