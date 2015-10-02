


package com.ethos.model;

/**
 *
 * @author Mary
 */


public class TipoIdentificacionModel {
      private int iId_Identificacion;
      private String sDescripcion;
   

    public TipoIdentificacionModel() {
    }

    public TipoIdentificacionModel(int iId_Identificacion, String sDescripcion) {
        this.iId_Identificacion = iId_Identificacion;
        this.sDescripcion = sDescripcion;
    }

    public int getiId_Identificacion() {
        return iId_Identificacion;
    }

    public void setiId_Identificacion(int iId_Identificacion) {
        this.iId_Identificacion = iId_Identificacion;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }

   
    
}
