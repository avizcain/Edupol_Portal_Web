/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.model;

import java.util.Date;

/**
 *
 * @author EquipoNo9
 */
public class IcfesModel {

    private int idIcfes;
    private int idRegistro;
    private String fechaPresentacion;
    private Date dFechaPresentacion;
    private double promedioAreas;
    private double lenguaje;
    private double matematicas;
    private double cienciasSociales;
    private double filosofia;
    private double biologia;
    private double quimica;
    private double fisica;

    public IcfesModel() {
    }

    public IcfesModel(int idIcfes, int idRegistro, String fechaPresentacion, Date dFechaPresentacion, double promedioAreas, double lenguaje, double matematicas, double cienciasSociales, double filosofia, double biologia, double quimica, double fisica) {
        this.idIcfes = idIcfes;
        this.idRegistro = idRegistro;
        this.fechaPresentacion = fechaPresentacion;
        this.dFechaPresentacion = dFechaPresentacion;
        this.promedioAreas = promedioAreas;
        this.lenguaje = lenguaje;
        this.matematicas = matematicas;
        this.cienciasSociales = cienciasSociales;
        this.filosofia = filosofia;
        this.biologia = biologia;
        this.quimica = quimica;
        this.fisica = fisica;
    }

    public int getIdIcfes() {
        return idIcfes;
    }

    public void setIdIcfes(int idIcfes) {
        this.idIcfes = idIcfes;
    }

    public int getIdRegistro() {
        return idRegistro;
    }

    public void setIdRegistro(int idRegistro) {
        this.idRegistro = idRegistro;
    }

    public String getFechaPresentacion() {
        return fechaPresentacion;
    }

    public void setFechaPresentacion(String fechaPresentacion) {
        this.fechaPresentacion = fechaPresentacion;
    }

    public Date getdFechaPresentacion() {
        return dFechaPresentacion;
    }

    public void setdFechaPresentacion(Date dFechaPresentacion) {
        this.dFechaPresentacion = dFechaPresentacion;
    }

    public double getPromedioAreas() {
        return promedioAreas;
    }

    public void setPromedioAreas(double promedioAreas) {
        this.promedioAreas = promedioAreas;
    }

    public double getLenguaje() {
        return lenguaje;
    }

    public void setLenguaje(double lenguaje) {
        this.lenguaje = lenguaje;
    }

    public double getMatematicas() {
        return matematicas;
    }

    public void setMatematicas(double matematicas) {
        this.matematicas = matematicas;
    }

    public double getCienciasSociales() {
        return cienciasSociales;
    }

    public void setCienciasSociales(double cienciasSociales) {
        this.cienciasSociales = cienciasSociales;
    }

    public double getFilosofia() {
        return filosofia;
    }

    public void setFilosofia(double filosofia) {
        this.filosofia = filosofia;
    }

    public double getBiologia() {
        return biologia;
    }

    public void setBiologia(double biologia) {
        this.biologia = biologia;
    }

    public double getQuimica() {
        return quimica;
    }

    public void setQuimica(double quimica) {
        this.quimica = quimica;
    }

    public double getFisica() {
        return fisica;
    }

    public void setFisica(double fisica) {
        this.fisica = fisica;
    }
}
