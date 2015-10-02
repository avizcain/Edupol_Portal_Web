/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.model;

import java.util.List;

/**
 *
 * @author operaciones
 */
public class ModuloModel {

    private String sCodigo;
    private String sNombre;
    private String sImagen;
    private int iOpcRedirect;
    private List<PaginaModel> listPaginaModel;

    public ModuloModel() {
    }

    public ModuloModel(String sCodigo, String sNombre, String sImagen, int iOpcRedirect, List<PaginaModel> listPaginaModel) {
        this.sCodigo = sCodigo;
        this.sNombre = sNombre;
        this.sImagen = sImagen;
        this.iOpcRedirect = iOpcRedirect;
        this.listPaginaModel = listPaginaModel;
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

    public String getsImagen() {
        return sImagen;
    }

    public void setsImagen(String sImagen) {
        this.sImagen = sImagen;
    }

    public int getiOpcRedirect() {
        return iOpcRedirect;
    }

    public void setiOpcRedirect(int iOpcRedirect) {
        this.iOpcRedirect = iOpcRedirect;
    }

    public List<PaginaModel> getListPaginaModel() {
        return listPaginaModel;
    }

    public void setListPaginaModel(List<PaginaModel> listPaginaModel) {
        this.listPaginaModel = listPaginaModel;
    }
}
