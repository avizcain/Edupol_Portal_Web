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
public class NivelEstudiosModel {
    
    private String sCodigo;
    private String sDescripcion;

    public NivelEstudiosModel() {
    }

    public NivelEstudiosModel(String sCodigo, String sDescripcion) {
        this.sCodigo = sCodigo;
        this.sDescripcion = sDescripcion;
    }

    public String getsCodigo() {
        return sCodigo;
    }

    public void setsCodigo(String sCodigo) {
        this.sCodigo = sCodigo;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }
}
