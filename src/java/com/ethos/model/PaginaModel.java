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
public class PaginaModel {
    
    private String sCodigo;
    private String sNombre;
    private String sModulo;
    private String sRuta;
    private int iNivel;
    private int iDependencia;
    private int iOrden;
    private int iTipo;

    public PaginaModel() {
    }

    public PaginaModel(String sCodigo, String sNombre, String sModulo, String sRuta, int iNivel, int iDependencia, int iOrden, int iTipo) {
        this.sCodigo = sCodigo;
        this.sNombre = sNombre;
        this.sModulo = sModulo;
        this.sRuta = sRuta;
        this.iNivel = iNivel;
        this.iDependencia = iDependencia;
        this.iOrden = iOrden;
        this.iTipo = iTipo;
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

    public String getsModulo() {
        return sModulo;
    }

    public void setsModulo(String sModulo) {
        this.sModulo = sModulo;
    }

    public String getsRuta() {
        return sRuta;
    }

    public void setsRuta(String sRuta) {
        this.sRuta = sRuta;
    }

    public int getiNivel() {
        return iNivel;
    }

    public void setiNivel(int iNivel) {
        this.iNivel = iNivel;
    }

    public int getiDependencia() {
        return iDependencia;
    }

    public void setiDependencia(int iDependencia) {
        this.iDependencia = iDependencia;
    }

    public int getiOrden() {
        return iOrden;
    }

    public void setiOrden(int iOrden) {
        this.iOrden = iOrden;
    }

    public int getiTipo() {
        return iTipo;
    }

    public void setiTipo(int iTipo) {
        this.iTipo = iTipo;
    }
}



