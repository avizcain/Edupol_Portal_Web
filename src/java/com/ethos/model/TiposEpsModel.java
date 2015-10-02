/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.model;

/**
 *
 * @author EquipoNo9
 */
public class TiposEpsModel {
    private int id_Eps;
    private String nombre_Eps;

    public TiposEpsModel() {
    }

    public TiposEpsModel(int id_Eps, String nombre_Eps) {
        this.id_Eps = id_Eps;
        this.nombre_Eps = nombre_Eps;
    }

    public int getId_Eps() {
        return id_Eps;
    }

    public void setId_Eps(int id_Eps) {
        this.id_Eps = id_Eps;
    }

    public String getNombre_Eps() {
        return nombre_Eps;
    }

    public void setNombre_Eps(String nombre_Eps) {
        this.nombre_Eps = nombre_Eps;
    }

   
}
