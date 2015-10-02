/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ethos.model;

/**
 *
 * @author DavidFernando
 */
public class EstadoCivilModel {
    
    private String sCodigoEstadoCivil;
    private String sDescripcionEstCivil;

    public EstadoCivilModel() {
    }

    public EstadoCivilModel(String sCodigoEstadoCivil, String sDescripcionEstCivil) {
        this.sCodigoEstadoCivil = sCodigoEstadoCivil;
        this.sDescripcionEstCivil = sDescripcionEstCivil;
    }

    public String getsCodigoEstadoCivil() {
        return sCodigoEstadoCivil;
    }

    public void setsCodigoEstadoCivil(String sCodigoEstadoCivil) {
        this.sCodigoEstadoCivil = sCodigoEstadoCivil;
    }

    public String getsDescripcionEstCivil() {
        return sDescripcionEstCivil;
    }

    public void setsDescripcionEstCivil(String sDescripcionEstCivil) {
        this.sDescripcionEstCivil = sDescripcionEstCivil;
    }
}
