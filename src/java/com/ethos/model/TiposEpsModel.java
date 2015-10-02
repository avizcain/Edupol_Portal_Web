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
    private int ID_EPS;
    private String NOMBRE_EPS;

    public TiposEpsModel() {
    }

    public TiposEpsModel(int ID_EPS, String NOMBRE_EPS) {
        this.ID_EPS = ID_EPS;
        this.NOMBRE_EPS = NOMBRE_EPS;
    }

    public int getID_EPS() {
        return ID_EPS;
    }

    public void setID_EPS(int ID_EPS) {
        this.ID_EPS = ID_EPS;
    }

    public String getNOMBRE_EPS() {
        return NOMBRE_EPS;
    }

    public void setNOMBRE_EPS(String NOMBRE_EPS) {
        this.NOMBRE_EPS = NOMBRE_EPS;
    }
    
}
