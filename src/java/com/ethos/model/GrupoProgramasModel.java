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
public class GrupoProgramasModel {
    
    private int iIdGrupo;
    private String sDescripcion;

    public GrupoProgramasModel() {
    }

    public GrupoProgramasModel(int iIdGrupo, String sDescripcion) {
        this.iIdGrupo = iIdGrupo;
        this.sDescripcion = sDescripcion;
    }

    public int getiIdGrupo() {
        return iIdGrupo;
    }

    public void setiIdGrupo(int iIdGrupo) {
        this.iIdGrupo = iIdGrupo;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }
    
    
    
}
