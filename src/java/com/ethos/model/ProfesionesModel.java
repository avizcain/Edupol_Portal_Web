
package com.ethos.model;

/**
 *
 * @author Mary
 */


public class ProfesionesModel {
    
    private int iIdProfesiones;
    private String sNombreProfesiones;

    public ProfesionesModel() {
    }

    public ProfesionesModel(int iIdProfesiones, String sNombreProfesiones) {
        this.iIdProfesiones = iIdProfesiones;
        this.sNombreProfesiones = sNombreProfesiones;
    }

    public int getiIdProfesiones() {
        return iIdProfesiones;
    }

    public void setiIdProfesiones(int iIdProfesiones) {
        this.iIdProfesiones = iIdProfesiones;
    }

    public String getsNombreProfesiones() {
        return sNombreProfesiones;
    }

    public void setsNombreProfesiones(String sNombreProfesiones) {
        this.sNombreProfesiones = sNombreProfesiones;
    }
    
    
    
}
