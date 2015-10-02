/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.model;

/**
 *
 * @author Operaciones-GerenteC
 */
public class RegistroEstudianteModel {
    private int iCodRegistro;
    private int iCodEstudiente;
    private int iCodUniversidadPrograma;
    private int iCodCentroAsociado;
    private int iEstadoRegistro;
    private String FechaIncripcion;
    
    private int iCodUni;
    private int iNivelFormacion;
    private int iTipoEstudio;
    private int iGrupoPrograma;
    private int iPrograma;
    private String modulo;
    

    public RegistroEstudianteModel() {
    }

    public RegistroEstudianteModel(int iCodRegistro, int iCodEstudiente, int iCodUniversidadPrograma, int iCodCentroAsociado, int iEstadoRegistro, String FechaIncripcion, int iCodUni, int iNivelFormacion, int iTipoEstudio, int iGrupoPrograma, int iPrograma, String modulo) {
        this.iCodRegistro = iCodRegistro;
        this.iCodEstudiente = iCodEstudiente;
        this.iCodUniversidadPrograma = iCodUniversidadPrograma;
        this.iCodCentroAsociado = iCodCentroAsociado;
        this.iEstadoRegistro = iEstadoRegistro;
        this.FechaIncripcion = FechaIncripcion;
        this.iCodUni = iCodUni;
        this.iNivelFormacion = iNivelFormacion;
        this.iTipoEstudio = iTipoEstudio;
        this.iGrupoPrograma = iGrupoPrograma;
        this.iPrograma = iPrograma;
        this.modulo = modulo;
    }

    

    public int getiCodRegistro() {
        return iCodRegistro;
    }

    public void setiCodRegistro(int iCodRegistro) {
        this.iCodRegistro = iCodRegistro;
    }

    public int getiCodEstudiente() {
        return iCodEstudiente;
    }

    public void setiCodEstudiente(int iCodEstudiente) {
        this.iCodEstudiente = iCodEstudiente;
    }

    public int getiCodUniversidadPrograma() {
        return iCodUniversidadPrograma;
    }

    public void setiCodUniversidadPrograma(int iCodUniversidadPrograma) {
        this.iCodUniversidadPrograma = iCodUniversidadPrograma;
    }

    public int getiCodCentroAsociado() {
        return iCodCentroAsociado;
    }

    public void setiCodCentroAsociado(int iCodCentroAsociado) {
        this.iCodCentroAsociado = iCodCentroAsociado;
    }

    public int getiEstadoRegistro() {
        return iEstadoRegistro;
    }

    public void setiEstadoRegistro(int iEstadoRegistro) {
        this.iEstadoRegistro = iEstadoRegistro;
    }

    public String getFechaIncripcion() {
        return FechaIncripcion;
    }

    public void setFechaIncripcion(String FechaIncripcion) {
        this.FechaIncripcion = FechaIncripcion;
    }

    public int getiCodUni() {
        return iCodUni;
    }

    public void setiCodUni(int iCodUni) {
        this.iCodUni = iCodUni;
    }

    public int getiNivelFormacion() {
        return iNivelFormacion;
    }

    public void setiNivelFormacion(int iNivelFormacion) {
        this.iNivelFormacion = iNivelFormacion;
    }

    public int getiTipoEstudio() {
        return iTipoEstudio;
    }

    public void setiTipoEstudio(int iTipoEstudio) {
        this.iTipoEstudio = iTipoEstudio;
    }

    public int getiGrupoPrograma() {
        return iGrupoPrograma;
    }

    public void setiGrupoPrograma(int iGrupoPrograma) {
        this.iGrupoPrograma = iGrupoPrograma;
    }

    public int getiPrograma() {
        return iPrograma;
    }

    public void setiPrograma(int iPrograma) {
        this.iPrograma = iPrograma;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }
    
    
}
