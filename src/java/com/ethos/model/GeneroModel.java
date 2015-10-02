 
package com.ethos.model;

/**
 *
 * @author Mary
 */


public class GeneroModel {
    
    private int iIdGenero;
    private String sDescripcion;
    private String sInicial;
    
    
    public GeneroModel(){
    }
    
    public GeneroModel(int iIdGenero,String sDescripcion,String sInicial){
        this.iIdGenero=iIdGenero;
        this.sDescripcion=sDescripcion;
        this.sInicial=sInicial;        
    }

    public int getiIdGenero() {
        return iIdGenero;
    }

    public void setiIdGenero(int iIdGenero) {
        this.iIdGenero = iIdGenero;
    }

    public String getsDescripcion() {
        return sDescripcion;
    }

    public void setsDescripcion(String sDescripcion) {
        this.sDescripcion = sDescripcion;
    }

    public String getsInicial() {
        return sInicial;
    }

    public void setsInicial(String sInicial) {
        this.sInicial = sInicial;
    }
    
    
    
    
}
