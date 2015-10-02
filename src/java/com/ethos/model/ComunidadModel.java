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
public class ComunidadModel {
    private int iCodComunidad;
    private String sNombreComunidad;
    
    public ComunidadModel() {
    }    
    public ComunidadModel(int iCodComunidad, String sNombreComunidad) {
        this.iCodComunidad = iCodComunidad;
        this.sNombreComunidad = sNombreComunidad;
    }
    public int getiCodComunidad() {
        return iCodComunidad;
    }
    public void setiCodComunidad(int iCodComunidad) {
        this.iCodComunidad = iCodComunidad;
    }
    public String getsNombreComunidad() {
        return sNombreComunidad;
    }
    public void setsNombreComunidad(String sNombreComunidad) {
        this.sNombreComunidad = sNombreComunidad;
    }    
}
