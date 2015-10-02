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
public class ActualizaModel {
    
    private PersonaModel personaModel;
    private List<CiudadModel> listCiudadModel;
    private List<EstadoCivilModel> listEstadoCivilModel;
    private List<NivelEstudiosModel> listNivelEstudiosModel;

    public ActualizaModel() {
    }

    public ActualizaModel(PersonaModel personaModel, List<CiudadModel> listCiudadModel, List<EstadoCivilModel> listEstadoCivilModel, List<NivelEstudiosModel> listNivelEstudiosModel) {
        this.personaModel = personaModel;
        this.listCiudadModel = listCiudadModel;
        this.listEstadoCivilModel = listEstadoCivilModel;
        this.listNivelEstudiosModel = listNivelEstudiosModel;
    }

    public PersonaModel getPersonaModel() {
        return personaModel;
    }

    public void setPersonaModel(PersonaModel personaModel) {
        this.personaModel = personaModel;
    }

    public List<CiudadModel> getListCiudadModel() {
        return listCiudadModel;
    }

    public void setListCiudadModel(List<CiudadModel> listCiudadModel) {
        this.listCiudadModel = listCiudadModel;
    }

    public List<EstadoCivilModel> getListEstadoCivilModel() {
        return listEstadoCivilModel;
    }

    public void setListEstadoCivilModel(List<EstadoCivilModel> listEstadoCivilModel) {
        this.listEstadoCivilModel = listEstadoCivilModel;
    }

    public List<NivelEstudiosModel> getListNivelEstudiosModel() {
        return listNivelEstudiosModel;
    }

    public void setListNivelEstudiosModel(List<NivelEstudiosModel> listNivelEstudiosModel) {
        this.listNivelEstudiosModel = listNivelEstudiosModel;
    }
}
