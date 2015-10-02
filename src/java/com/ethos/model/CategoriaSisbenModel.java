



package com.ethos.model;

/**
 *
 * @author Mary
 */


public class CategoriaSisbenModel {
    
    private int iIdCategoriaSisben;
    private String sDescripcionCategoriaSisben;
    
    
    public CategoriaSisbenModel(){
    }
    
    public CategoriaSisbenModel(int iIdCategoriaSisben,String sDescripcion){
        this.iIdCategoriaSisben=iIdCategoriaSisben;
        this.sDescripcionCategoriaSisben=sDescripcion;        
    }
    
    public int getiIdCategoriaSisben(){
       return iIdCategoriaSisben;
    }
    
    public void setiIdCategoriaSisben(int iIdCategoriaSisben){
        this.iIdCategoriaSisben=iIdCategoriaSisben;
    }

    public String getsDescripcionCategoriaSisben() {
        return sDescripcionCategoriaSisben;
    }

    public void setsDescripcionCategoriaSisben(String sDescripcion) {
        this.sDescripcionCategoriaSisben = sDescripcion;
    }
    
    
}
