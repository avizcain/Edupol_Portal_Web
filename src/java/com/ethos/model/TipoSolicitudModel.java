




package com.ethos.model;

/**
 *
 * @author Mary
 */


public class TipoSolicitudModel {
    
   private int iId_tipoSolicitud;
   private String sNombreSolicitud; 
   
   public TipoSolicitudModel(){
   }

    public TipoSolicitudModel(int iId_tipoSolicitud, String sNombreSolicitud) {
        this.iId_tipoSolicitud = iId_tipoSolicitud;
        this.sNombreSolicitud = sNombreSolicitud;
    }

    public int getiId_tipoSolicitud() {
        return iId_tipoSolicitud;
    }

    public void setiId_tipoSolicitud(int iId_tipoSolicitud) {
        this.iId_tipoSolicitud = iId_tipoSolicitud;
    }

    public String getsNombreSolicitud() {
        return sNombreSolicitud;
    }

    public void setsNombreSolicitud(String sNombreSolicitud) {
        this.sNombreSolicitud = sNombreSolicitud;
    }

      
}
