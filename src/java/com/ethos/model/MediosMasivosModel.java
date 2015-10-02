 




package com.ethos.model;

/**
 *
 * @author Mary
 */


public class MediosMasivosModel {
    
  private int iIdMediosMasivos;
  private String sNombreMedioMasivo;

    public MediosMasivosModel() {
    }

    public MediosMasivosModel(int iIdMediosMasivos, String sNombreMedioMasivo) {
        this.iIdMediosMasivos = iIdMediosMasivos;
        this.sNombreMedioMasivo = sNombreMedioMasivo;
    }

    public int getiIdMediosMasivos() {
        return iIdMediosMasivos;
    }

    public void setiIdMediosMasivos(int iIdMediosMasivos) {
        this.iIdMediosMasivos = iIdMediosMasivos;
    }

    public String getsNombreMedioMasivo() {
        return sNombreMedioMasivo;
    }

    public void setsNombreMedioMasivo(String sNombreMedioMasivo) {
        this.sNombreMedioMasivo = sNombreMedioMasivo;
    }
  
  
    
}
