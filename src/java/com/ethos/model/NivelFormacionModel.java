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
public class NivelFormacionModel {
    
    private int iCod_NivelFormacion;
    private String descripcion;

    public NivelFormacionModel() {
    }

    public NivelFormacionModel(int iCod_NivelFormacion, String descripcion) {
        this.iCod_NivelFormacion = iCod_NivelFormacion;
        this.descripcion = descripcion;
    }

    public int getiCod_NivelFormacion() {
        return iCod_NivelFormacion;
    }

    public void setiCod_NivelFormacion(int iCod_NivelFormacion) {
        this.iCod_NivelFormacion = iCod_NivelFormacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
