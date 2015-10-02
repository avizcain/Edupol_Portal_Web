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
public class DireccionesModel {
    
    private String sCodigo;
    private String sCliente;
    private String sTipoDir;
    private String sDireccion;
    private String sCiudad;
    private String sBarrio;

    public DireccionesModel() {
    }

    public DireccionesModel(String sCodigo, String sCliente, String sTipoDir, String sDireccion, String sCiudad, String sBarrio) {
        this.sCodigo = sCodigo;
        this.sCliente = sCliente;
        this.sTipoDir = sTipoDir;
        this.sDireccion = sDireccion;
        this.sCiudad = sCiudad;
        this.sBarrio = sBarrio;
    }

    public String getsCodigo() {
        return sCodigo;
    }

    public void setsCodigo(String sCodigo) {
        this.sCodigo = sCodigo;
    }

    public String getsCliente() {
        return sCliente;
    }

    public void setsCliente(String sCliente) {
        this.sCliente = sCliente;
    }

    public String getsTipoDir() {
        return sTipoDir;
    }

    public void setsTipoDir(String sTipoDir) {
        this.sTipoDir = sTipoDir;
    }

    public String getsDireccion() {
        return sDireccion;
    }

    public void setsDireccion(String sDireccion) {
        this.sDireccion = sDireccion;
    }

    public String getsCiudad() {
        return sCiudad;
    }

    public void setsCiudad(String sCiudad) {
        this.sCiudad = sCiudad;
    }

    public String getsBarrio() {
        return sBarrio;
    }

    public void setsBarrio(String sBarrio) {
        this.sBarrio = sBarrio;
    }
}
