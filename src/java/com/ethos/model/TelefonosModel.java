/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.model;

/**
 *
 * @author operaciones
 */
public class TelefonosModel {
    
    private String sCodigo;
    private String sIdPersona;
    private String sTipoTel;
    private String sCiudad;
    private String sNumero;
    private String sExtension;

    public TelefonosModel() {
    }

    public TelefonosModel(String sCodigo, String sIdPersona, String sTipoTel, String sCiudad, String sNumero, String sExtension) {
        this.sCodigo = sCodigo;
        this.sIdPersona = sIdPersona;
        this.sTipoTel = sTipoTel;
        this.sCiudad = sCiudad;
        this.sNumero = sNumero;
        this.sExtension = sExtension;
    }

    public String getsCodigo() {
        return sCodigo;
    }

    public void setsCodigo(String sCodigo) {
        this.sCodigo = sCodigo;
    }

    public String getsIdPersona() {
        return sIdPersona;
    }

    public void setsIdPersona(String sIdPersona) {
        this.sIdPersona = sIdPersona;
    }

    public String getsTipoTel() {
        return sTipoTel;
    }

    public void setsTipoTel(String sTipoTel) {
        this.sTipoTel = sTipoTel;
    }

    public String getsCiudad() {
        return sCiudad;
    }

    public void setsCiudad(String sCiudad) {
        this.sCiudad = sCiudad;
    }

    public String getsNumero() {
        return sNumero;
    }

    public void setsNumero(String sNumero) {
        this.sNumero = sNumero;
    }

    public String getsExtension() {
        return sExtension;
    }

    public void setsExtension(String sExtension) {
        this.sExtension = sExtension;
    }
}
