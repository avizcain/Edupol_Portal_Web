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
public class CentroAsociadoModel {
    private int iCodCentroAsociado;
    private String sDescipcion;

    public CentroAsociadoModel() {
    }

    public CentroAsociadoModel(int iCodCentroAsociado, String sDescipcion) {
        this.iCodCentroAsociado = iCodCentroAsociado;
        this.sDescipcion = sDescipcion;
    }

    public int getiCodCentroAsociado() {
        return iCodCentroAsociado;
    }

    public void setiCodCentroAsociado(int iCodCentroAsociado) {
        this.iCodCentroAsociado = iCodCentroAsociado;
    }

    public String getsDescipcion() {
        return sDescipcion;
    }

    public void setsDescipcion(String sDescipcion) {
        this.sDescipcion = sDescipcion;
    }
    
    
    
}
