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
public class PerfilModel {

    private String sCodigo;
    private String sNombre;
    private int iAdmin;
    private int iEstadoPerfil;

    public PerfilModel() {
    }

    public PerfilModel(String sCodigo, String sNombre, int iAdmin, int iEstadoPerfil) {
        this.sCodigo = sCodigo;
        this.sNombre = sNombre;
        this.iAdmin = iAdmin;
        this.iEstadoPerfil = iEstadoPerfil;
    }

    public String getsCodigo() {
        return sCodigo;
    }

    public void setsCodigo(String sCodigo) {
        this.sCodigo = sCodigo;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public int getiAdmin() {
        return iAdmin;
    }

    public void setiAdmin(int iAdmin) {
        this.iAdmin = iAdmin;
    }

    public int getiEstadoPerfil() {
        return iEstadoPerfil;
    }

    public void setiEstadoPerfil(int iEstadoPerfil) {
        this.iEstadoPerfil = iEstadoPerfil;
    }
}
