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
public class CiudadModel {

    private int sCodigo;
    private String sNombre;
    private String sNivel;
    private String sIndNal;
    private String sIndInternal;
    private String sUbicacion;
    private String sCodSugef;

    public CiudadModel() {
    }

    public CiudadModel(int sCodigo, String sNombre, String sNivel, String sIndNal, String sIndInternal, String sUbicacion, String sCodSugef) {
        this.sCodigo = sCodigo;
        this.sNombre = sNombre;
        this.sNivel = sNivel;
        this.sIndNal = sIndNal;
        this.sIndInternal = sIndInternal;
        this.sUbicacion = sUbicacion;
        this.sCodSugef = sCodSugef;
    }

    public int getsCodigo() {
        return sCodigo;
    }

    public void setsCodigo(int sCodigo) {
        this.sCodigo = sCodigo;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsNivel() {
        return sNivel;
    }

    public void setsNivel(String sNivel) {
        this.sNivel = sNivel;
    }

    public String getsIndNal() {
        return sIndNal;
    }

    public void setsIndNal(String sIndNal) {
        this.sIndNal = sIndNal;
    }

    public String getsIndInternal() {
        return sIndInternal;
    }

    public void setsIndInternal(String sIndInternal) {
        this.sIndInternal = sIndInternal;
    }

    public String getsUbicacion() {
        return sUbicacion;
    }

    public void setsUbicacion(String sUbicacion) {
        this.sUbicacion = sUbicacion;
    }

    public String getsCodSugef() {
        return sCodSugef;
    }

    public void setsCodSugef(String sCodSugef) {
        this.sCodSugef = sCodSugef;
    }
}
