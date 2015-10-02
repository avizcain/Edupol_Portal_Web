/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.model;

/**
 *
 * @author Operaciones-GerenteC
 */
public class ProgramasModel {
    
        private int iCodPrograma;
        private String sDescripcion;

    public ProgramasModel() {
    }

    public ProgramasModel(int iCodPrograma, String sDescripcion) {
        this.iCodPrograma = iCodPrograma;
        this.sDescripcion = sDescripcion;
    }

    public int getiCodPrograma() {
        return iCodPrograma;
    }

    public void setiCodPrograma(int iCodPrograma) {
        this.iCodPrograma = iCodPrograma;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }
        
    
}
