 
package com.ethos.model;

/**
 *
 * @author Mary
 */


public class TipoSanguineoModel {
    
    private int iCodigoTipoSangre;
    private String sNombreSangre;

    public TipoSanguineoModel() {
    }

    public TipoSanguineoModel(int iCodigoTipoSangre, String sNombreSangre) {
        this.iCodigoTipoSangre = iCodigoTipoSangre;
        this.sNombreSangre = sNombreSangre;
    }

    public int getiCodigoTipoSangre() {
        return iCodigoTipoSangre;
    }

    public void setiCodigoTipoSangre(int iCodigoTipoSangre) {
        this.iCodigoTipoSangre = iCodigoTipoSangre;
    }

    public String getsNombreSangre() {
        return sNombreSangre;
    }

    public void setsNombreSangre(String sNombreSangre) {
        this.sNombreSangre = sNombreSangre;
    }
    
    
    
    
}
