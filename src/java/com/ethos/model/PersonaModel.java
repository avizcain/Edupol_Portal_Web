/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.model;

import java.util.Date;

/**
 *
 * @author dmendez
 */
public class PersonaModel {

    private String firstName;
    private String lastName;
    //----------------------------------------------//

    private String sCodPersona;
    private String sIden;
    private int iTipoIden;
    private String stipoPersona; 
    private Date dFechaExpedicion;
    private Date dFechaNacimiento;
    private int idPerfil;
    private PerfilModel mPerfil;
    private String sCodCiudadRes;
    private String sGenero;
    private CiudadModel mCiudadRes;
    private int iSalario;
    private String sCodCiudadNac;
    private String sNomCiudadNac;
    private String sFecNac;
    private String sCodCiudadExp;
    private String sNomCiudadExp;
    private String sFecExp;
    private int iTipoActEcon;
    private int iNivelEst;
    private NivelEstudiosModel mNivelEstudios;
    private int iNumPeraCargo;
    private String sCodEstadoCivil;
    private EstadoCivilModel mEstadoCivil;
    private String sEstrato;
    private String sCabezaFamilia;
    private String sNombre;
    private String sApellido;
    private String sDirRes;
    private String sTelRes;
    private String sCelular;
    private String sDirOfi;
    private String sTelOfi;
    private String sTelArr;
    private String sBarrioOfi;
    private String sCorreoPer;
    private String sCorreoCor;
    private String sClavePersona;

    public PersonaModel() {
    }

    public PersonaModel(Date dFechaNacimiento,String sGenero,int iTipoIden,String stipoPersona, String firstName, String lastName, String sCodPersona, String sIden, int idPerfil, PerfilModel mPerfil, String sCodCiudadRes, CiudadModel mCiudadRes, int iSalario, String sCodCiudadNac, String sNomCiudadNac, String sFecNac, String sCodCiudadExp, String sNomCiudadExp, String sFecExp, int iTipoActEcon, int iNivelEst, NivelEstudiosModel mNivelEstudios, int iNumPeraCargo, String sCodEstadoCivil, EstadoCivilModel mEstadoCivil, String sEstrato, String sCabezaFamilia, String sNombre, String sApellido, String sDirRes, String sTelRes, String sCelular, String sDirOfi, String sTelOfi, String sTelArr, String sBarrioOfi, String sCorreoPer, String sCorreoCor, String sClavePersona) {
        this.sGenero=sGenero;
        this.iTipoIden=iTipoIden;
        this.stipoPersona=stipoPersona;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sCodPersona = sCodPersona;
        this.sIden = sIden;
        this.idPerfil = idPerfil;
        this.mPerfil = mPerfil;
        this.sCodCiudadRes = sCodCiudadRes;
        this.mCiudadRes = mCiudadRes;
        this.iSalario = iSalario;
        this.sCodCiudadNac = sCodCiudadNac;
        this.sNomCiudadNac = sNomCiudadNac;
        this.sFecNac = sFecNac;
        this.sCodCiudadExp = sCodCiudadExp;
        this.sNomCiudadExp = sNomCiudadExp;
        this.sFecExp = sFecExp;
        this.iTipoActEcon = iTipoActEcon;
        this.iNivelEst = iNivelEst;
        this.mNivelEstudios = mNivelEstudios;
        this.iNumPeraCargo = iNumPeraCargo;
        this.sCodEstadoCivil = sCodEstadoCivil;
        this.mEstadoCivil = mEstadoCivil;
        this.sEstrato = sEstrato;
        this.sCabezaFamilia = sCabezaFamilia;
        this.sNombre = sNombre;
        this.sApellido = sApellido;
        this.sDirRes = sDirRes;
        this.sTelRes = sTelRes;
        this.sCelular = sCelular;
        this.sDirOfi = sDirOfi;
        this.sTelOfi = sTelOfi;
        this.sTelArr = sTelArr;
        this.sBarrioOfi = sBarrioOfi;
        this.sCorreoPer = sCorreoPer;
        this.sCorreoCor = sCorreoCor;
        this.sClavePersona = sClavePersona;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getsCodPersona() {
        return  sCodPersona;
    }

    public void setsCodPersona(String sCodPersona) {
        this.sCodPersona = sCodPersona;
    }

    public String getsIden() {
        return sIden;
    }

    public void setsIden(String sIden) {
        this.sIden = sIden;
    }

    public int getIdPerfil() {
        return idPerfil;
    }

    public void setIdPerfil(int idPerfil) {
        this.idPerfil = idPerfil;
    }

    public PerfilModel getmPerfil() {
        return mPerfil;
    }

    public void setmPerfil(PerfilModel mPerfil) {
        this.mPerfil = mPerfil;
    }

    public String getsCodCiudadRes() {
        return sCodCiudadRes;
    }

    public void setsCodCiudadRes(String sCodCiudadRes) {
        this.sCodCiudadRes = sCodCiudadRes;
    }

    public CiudadModel getmCiudadRes() {
        return mCiudadRes;
    }

    public void setmCiudadRes(CiudadModel mCiudadRes) {
        this.mCiudadRes = mCiudadRes;
    }

    public int getiSalario() {
        return iSalario;
    }

    public void setiSalario(int iSalario) {
        this.iSalario = iSalario;
    }

    public String getsCodCiudadNac() {
        return sCodCiudadNac;
    }

    public void setsCodCiudadNac(String sCodCiudadNac) {
        this.sCodCiudadNac = sCodCiudadNac;
    }

    public String getsNomCiudadNac() {
        return sNomCiudadNac;
    }

    public void setsNomCiudadNac(String sNomCiudadNac) {
        this.sNomCiudadNac = sNomCiudadNac;
    }

    public String getsFecNac() {
        return sFecNac;
    }

    public void setsFecNac(String sFecNac) {
        this.sFecNac = sFecNac;
    }

    public String getsCodCiudadExp() {
        return sCodCiudadExp;
    }

    public void setsCodCiudadExp(String sCodCiudadExp) {
        this.sCodCiudadExp = sCodCiudadExp;
    }

    public String getsNomCiudadExp() {
        return sNomCiudadExp;
    }

    public void setsNomCiudadExp(String sNomCiudadExp) {
        this.sNomCiudadExp = sNomCiudadExp;
    }

    public String getsFecExp() {
        return sFecExp;
    }

    public void setsFecExp(String sFecExp) {
        this.sFecExp = sFecExp;
    }

    public int getiTipoActEcon() {
        return iTipoActEcon;
    }

    public void setiTipoActEcon(int iTipoActEcon) {
        this.iTipoActEcon = iTipoActEcon;
    }

    public int getiNivelEst() {
        return iNivelEst;
    }

    public void setiNivelEst(int iNivelEst) {
        this.iNivelEst = iNivelEst;
    }

    public NivelEstudiosModel getmNivelEstudios() {
        return mNivelEstudios;
    }

    public void setmNivelEstudios(NivelEstudiosModel mNivelEstudios) {
        this.mNivelEstudios = mNivelEstudios;
    }

    public int getiNumPeraCargo() {
        return iNumPeraCargo;
    }

    public void setiNumPeraCargo(int iNumPeraCargo) {
        this.iNumPeraCargo = iNumPeraCargo;
    }

    public String getsCodEstadoCivil() {
        return sCodEstadoCivil;
    }

    public void setsCodEstadoCivil(String sCodEstadoCivil) {
        this.sCodEstadoCivil = sCodEstadoCivil;
    }

    public EstadoCivilModel getmEstadoCivil() {
        return mEstadoCivil;
    }

    public void setmEstadoCivil(EstadoCivilModel mEstadoCivil) {
        this.mEstadoCivil = mEstadoCivil;
    }

    public String getsEstrato() {
        return sEstrato;
    }

    public void setsEstrato(String sEstrato) {
        this.sEstrato = sEstrato;
    }

    public String getsCabezaFamilia() {
        return sCabezaFamilia;
    }

    public void setsCabezaFamilia(String sCabezaFamilia) {
        this.sCabezaFamilia = sCabezaFamilia;
    }

    public String getsNombre() {
        return sNombre;
    }

    public void setsNombre(String sNombre) {
        this.sNombre = sNombre;
    }

    public String getsApellido() {
        return sApellido;
    }

    public void setsApellido(String sApellido) {
        this.sApellido = sApellido;
    }

    public String getsDirRes() {
        return sDirRes;
    }

    public void setsDirRes(String sDirRes) {
        this.sDirRes = sDirRes;
    }

    public String getsTelRes() {
        return sTelRes;
    }

    public void setsTelRes(String sTelRes) {
        this.sTelRes = sTelRes;
    }

    public String getsCelular() {
        return sCelular;
    }

    public void setsCelular(String sCelular) {
        this.sCelular = sCelular;
    }

    public String getsDirOfi() {
        return sDirOfi;
    }

    public void setsDirOfi(String sDirOfi) {
        this.sDirOfi = sDirOfi;
    }

    public String getsTelOfi() {
        return sTelOfi;
    }

    public void setsTelOfi(String sTelOfi) {
        this.sTelOfi = sTelOfi;
    }

    public String getsTelArr() {
        return sTelArr;
    }

    public void setsTelArr(String sTelArr) {
        this.sTelArr = sTelArr;
    }

    public String getsBarrioOfi() {
        return sBarrioOfi;
    }

    public void setsBarrioOfi(String sBarrioOfi) {
        this.sBarrioOfi = sBarrioOfi;
    }

    public String getsCorreoPer() {
        return sCorreoPer;
    }

    public void setsCorreoPer(String sCorreoPer) {
        this.sCorreoPer = sCorreoPer;
    }

    public String getsCorreoCor() {
        return sCorreoCor;
    }

    public void setsCorreoCor(String sCorreoCor) {
        this.sCorreoCor = sCorreoCor;
    }

    public String getsClavePersona() {
        return sClavePersona;
    }

    public void setsClavePersona(String sClavePersona) {
        this.sClavePersona = sClavePersona;
    }
    
    public String getStipoPersona() {
        return stipoPersona;
    }

    public void setStipoPersona(String stipoPersona) {
        this.stipoPersona = stipoPersona;
    }
    
    
    public int getiTipoIden() {
        return iTipoIden;
    }

    public void setiTipoIden(int iTipoIden) {
        this.iTipoIden = iTipoIden;
    }

    public Date getdFechaExpedicion() {
        return dFechaExpedicion;
    }

    public void setdFechaExpedicion(Date dFechaExpedicion) {
        this.dFechaExpedicion = dFechaExpedicion;
    }

    public String getsGenero() {
        return sGenero;
    }

    public void setsGenero(String sGenero) {
        this.sGenero = sGenero;
    }

    public Date getdFechaNacimiento() {
        return dFechaNacimiento;
    }

    public void setdFechaNacimiento(Date dFechaNacimiento) {
        this.dFechaNacimiento = dFechaNacimiento;
    }
    
    
}
