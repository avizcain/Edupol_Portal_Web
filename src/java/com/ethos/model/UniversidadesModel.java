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
public class UniversidadesModel {
    
    private int iCodUniversidad;
    private String sDescripcion;

    public UniversidadesModel() {
    }

    public UniversidadesModel(int iCodUniversidad, String sDescripcion) {
        this.iCodUniversidad = iCodUniversidad;
        this.sDescripcion = sDescripcion;
    }
    
    

    public int getiCodUniversidad() {
        return iCodUniversidad;
    }

    public void setiCodUniversidad(int iCodUniversidad) {
        this.iCodUniversidad = iCodUniversidad;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }
    
    
    
}
