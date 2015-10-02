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
public class MenuModel {

    private PerfilModel perfilModel;
    private List<String> listPaginas;
    private List<ModuloModel> listModuloModel;

    public MenuModel() {
    }

    public MenuModel(PerfilModel perfilModel, List<String> listPaginas, List<ModuloModel> listModuloModel) {
        this.perfilModel = perfilModel;
        this.listPaginas = listPaginas;
        this.listModuloModel = listModuloModel;
    }

    public PerfilModel getPerfilModel() {
        return perfilModel;
    }

    public void setPerfilModel(PerfilModel perfilModel) {
        this.perfilModel = perfilModel;
    }

    public List<String> getListPaginas() {
        return listPaginas;
    }

    public void setListPaginas(List<String> listPaginas) {
        this.listPaginas = listPaginas;
    }

    public List<ModuloModel> getListModuloModel() {
        return listModuloModel;
    }

    public void setListModuloModel(List<ModuloModel> listModuloModel) {
        this.listModuloModel = listModuloModel;
    }
}
