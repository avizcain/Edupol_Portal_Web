/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.model;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.util.Date;

/**
 *
 * @author operaciones
 */
public class EstudianteModel {

   
    private int iCodigoEst;
    private int iTipoSolicitud;

    String sTipoRol;
    String sTipoPersona; 
    private int iTipoIdentificacion;
    private int iNumeroIdentificacion;
    String sPaisExpedicion;
    String sLugarExpedicion;
    private Date dFechaExpedicion;
    String sFechaExpedicion;
    String sPrimerNombre;
    String sSegundoNombre;
    String sPrimerApellido;
    String sSegundoApellido;
    private int iGenero;
    private int iCategoriaSisben;
    private int iNacionalidad;
    private int iPaisResidencia;
    private int iDepartamentoResidencia;
    private int  iCiudadResidencia;
    String sLocalidadResidencia;
    String sDireccionResidencia;
    String sBarrioResidencia;
    private Date dFechaNacimiento;
    String sFechaNacimiento;
    private String sLugarNacimiento;
    private String sCiudadNacimiento;
    private int iGrupoSaniguineo;
    Date dFechaInscripcion;
    String sFechaInscripcion; //Fecha de inscripcion o de actualizacion de datos
    String sEstadoCivil;
    private int iLibretaMilitar;
    String sNumeroLibretaMilitar;
    private int iNivelEducativo;
    private String sFotografia;
    private int iCodAcudiente;
    private int iPaisEstudio;
    private int iDepartamentoEstudio;
    private int iCiudadEstudio;
    private int iEstrato;
    private int idPeriodoAcademico;
    private String fondoPensiones;
    private int idPaisSecundaria;
    private int idCategoriaSisben;
    private int idDptoSecundaria;
    private String nomEscuelaSecun;
    private int idCiudadEscuela;
    private String fechaGrado;
    private Date fechaGradoSecunda;
    private int idEps;

    public EstudianteModel() {
    }

    public EstudianteModel(int iCodigoEst, int iTipoSolicitud, String sTipoRol, String sTipoPersona, int iTipoIdentificacion, int iNumeroIdentificacion, String sPaisExpedicion, String sLugarExpedicion, Date dFechaExpedicion, String sFechaExpedicion, String sPrimerNombre, String sSegundoNombre, String sPrimerApellido, String sSegundoApellido, int iGenero, int iCategoriaSisben, int iNacionalidad, int iPaisResidencia, int iDepartamentoResidencia, int iCiudadResidencia, String sLocalidadResidencia, String sDireccionResidencia, String sBarrioResidencia, Date dFechaNacimiento, String sFechaNacimiento, String sLugarNacimiento, String sCiudadNacimiento, int iGrupoSaniguineo, Date dFechaInscripcion, String sFechaInscripcion, String sEstadoCivil, int iLibretaMilitar, String sNumeroLibretaMilitar, int iNivelEducativo, String sFotografia, int iCodAcudiente, int iPaisEstudio, int iDepartamentoEstudio, int iCiudadEstudio, int iEstrato, int idPeriodoAcademico, String fondoPensiones, int idPaisSecundaria, int idCategoriaSisben, int idDptoSecundaria, String nomEscuelaSecun, int idCiudadEscuela, String fechaGrado, Date fechaGradoSecunda, int idEps) {
        this.iCodigoEst = iCodigoEst;
        this.iTipoSolicitud = iTipoSolicitud;
        this.sTipoRol = sTipoRol;
        this.sTipoPersona = sTipoPersona;
        this.iTipoIdentificacion = iTipoIdentificacion;
        this.iNumeroIdentificacion = iNumeroIdentificacion;
        this.sPaisExpedicion = sPaisExpedicion;
        this.sLugarExpedicion = sLugarExpedicion;
        this.dFechaExpedicion = dFechaExpedicion;
        this.sFechaExpedicion = sFechaExpedicion;
        this.sPrimerNombre = sPrimerNombre;
        this.sSegundoNombre = sSegundoNombre;
        this.sPrimerApellido = sPrimerApellido;
        this.sSegundoApellido = sSegundoApellido;
        this.iGenero = iGenero;
        this.iCategoriaSisben = iCategoriaSisben;
        this.iNacionalidad = iNacionalidad;
        this.iPaisResidencia = iPaisResidencia;
        this.iDepartamentoResidencia = iDepartamentoResidencia;
        this.iCiudadResidencia = iCiudadResidencia;
        this.sLocalidadResidencia = sLocalidadResidencia;
        this.sDireccionResidencia = sDireccionResidencia;
        this.sBarrioResidencia = sBarrioResidencia;
        this.dFechaNacimiento = dFechaNacimiento;
        this.sFechaNacimiento = sFechaNacimiento;
        this.sLugarNacimiento = sLugarNacimiento;
        this.sCiudadNacimiento = sCiudadNacimiento;
        this.iGrupoSaniguineo = iGrupoSaniguineo;
        this.dFechaInscripcion = dFechaInscripcion;
        this.sFechaInscripcion = sFechaInscripcion;
        this.sEstadoCivil = sEstadoCivil;
        this.iLibretaMilitar = iLibretaMilitar;
        this.sNumeroLibretaMilitar = sNumeroLibretaMilitar;
        this.iNivelEducativo = iNivelEducativo;
        this.sFotografia = sFotografia;
        this.iCodAcudiente = iCodAcudiente;
        this.iPaisEstudio = iPaisEstudio;
        this.iDepartamentoEstudio = iDepartamentoEstudio;
        this.iCiudadEstudio = iCiudadEstudio;
        this.iEstrato = iEstrato;
        this.idPeriodoAcademico = idPeriodoAcademico;
        this.fondoPensiones = fondoPensiones;
        this.idPaisSecundaria = idPaisSecundaria;
        this.idCategoriaSisben = idCategoriaSisben;
        this.idDptoSecundaria = idDptoSecundaria;
        this.nomEscuelaSecun = nomEscuelaSecun;
        this.idCiudadEscuela = idCiudadEscuela;
        this.fechaGrado = fechaGrado;
        this.fechaGradoSecunda = fechaGradoSecunda;
        this.idEps = idEps;
    }

    public EstudianteModel(int iEstrato,int iCiudadEstudio,int iDepartamentoEstudio,int iPaisEstudio,int iCodAcudiente,String sFotografia,int iTipoSolicitud, String sTipoRol, String sTipoPersona, int iTipoIdentificacion, int iNumeroIdentificacion, String sPaisExpedicion, String sLugarExpedicion, Date dFechaExpedicion, String sFechaExpedicion, String sPrimerNombre, String sSegundoNombre, String sPrimerApellido, String sSegundoApellido, int iGenero, int iCategoriaSisben, int iNacionalidad, int iPaisResidencia, int iDepartamentoResidencia, int iCiudadResidencia, String sLocalidadResidencia, String sDireccionResidencia, String sBarrioResidencia, Date dFechaNacimiento, String sFechaNacimiento, String sLugarNacimiento, String sCiudadNacimiento, int iGrupoSaniguineo, Date dFechaInscripcion, String sFechaInscripcion, String sEstadoCivil, int iLibretaMilitar, String sNumeroLibretaMilitar, int iNivelEducativo) {
        this.iEstrato=iEstrato;
        this.iPaisEstudio=iPaisEstudio;
        this.iDepartamentoEstudio=iDepartamentoEstudio;
        this.iCiudadEstudio=iCiudadEstudio;
        this.iCodAcudiente=iCodAcudiente;
        this.sFotografia=sFotografia;
        this.iTipoSolicitud = iTipoSolicitud;
        this.sTipoRol = sTipoRol;
        this.sTipoPersona = sTipoPersona;
        this.iTipoIdentificacion = iTipoIdentificacion;
        this.iNumeroIdentificacion = iNumeroIdentificacion;
        this.sPaisExpedicion = sPaisExpedicion;
        this.sLugarExpedicion = sLugarExpedicion;
        this.dFechaExpedicion = dFechaExpedicion;
        this.sFechaExpedicion = sFechaExpedicion;
        this.sPrimerNombre = sPrimerNombre;
        this.sSegundoNombre = sSegundoNombre;
        this.sPrimerApellido = sPrimerApellido;
        this.sSegundoApellido = sSegundoApellido;
        this.iGenero = iGenero;
        this.iCategoriaSisben = iCategoriaSisben;
        this.iNacionalidad = iNacionalidad;
        this.iPaisResidencia = iPaisResidencia;
        this.iDepartamentoResidencia = iDepartamentoResidencia;
        this.iCiudadResidencia = iCiudadResidencia;
        this.sLocalidadResidencia = sLocalidadResidencia;
        this.sDireccionResidencia = sDireccionResidencia;
        this.sBarrioResidencia = sBarrioResidencia;
        this.dFechaNacimiento = dFechaNacimiento;
        this.sFechaNacimiento = sFechaNacimiento;
        this.sLugarNacimiento = sLugarNacimiento;
        this.sCiudadNacimiento = sCiudadNacimiento;
        this.iGrupoSaniguineo = iGrupoSaniguineo;
        this.dFechaInscripcion = dFechaInscripcion;
        this.sFechaInscripcion = sFechaInscripcion;
        this.sEstadoCivil = sEstadoCivil;
        this.iLibretaMilitar = iLibretaMilitar;
        this.sNumeroLibretaMilitar = sNumeroLibretaMilitar;
        this.iNivelEducativo = iNivelEducativo;
    }

    public int getiEstrato() {
        return iEstrato;
    }

    public void setiEstrato(int iEstrato) {
        this.iEstrato = iEstrato;
    }

    public int getiPaisEstudio() {
        return iPaisEstudio;
    }

    public void setiPaisEstudio(int iPaisEstudio) {
        this.iPaisEstudio = iPaisEstudio;
    }

    public int getiDepartamentoEstudio() {
        return iDepartamentoEstudio;
    }

    public void setiDepartamentoEstudio(int iDepartamentoEstudio) {
        this.iDepartamentoEstudio = iDepartamentoEstudio;
    }

    public int getiCiudadEstudio() {
        return iCiudadEstudio;
    }

    public void setiCiudadEstudio(int iCiudadEstudio) {
        this.iCiudadEstudio = iCiudadEstudio;
    }

    public int getiCodAcudiente() {
        return iCodAcudiente;
    }

    public void setiCodAcudiente(int iCodAcudiente) {
        this.iCodAcudiente = iCodAcudiente;
    }

    public String getsFotografia() {
        return sFotografia;
    }

    public void setsFotografia(String sFotografia) {
        this.sFotografia = sFotografia;
    }

     public int getiCodigoEst() {
        return iCodigoEst;
    }

    public void setiCodigoEst(int iCodigoEst) {
        this.iCodigoEst = iCodigoEst;
    }
    
    public int getiTipoSolicitud() {
        return iTipoSolicitud;
    }

    public void setiTipoSolicitud(int iTipoSolicitud) {
        this.iTipoSolicitud = iTipoSolicitud;
    }

    public String getsTipoRol() {
        return sTipoRol;
    }

    public void setsTipoRol(String sTipoRol) {
        this.sTipoRol = sTipoRol;
    }

    public String getsTipoPersona() {
        return sTipoPersona;
    }

    public void setsTipoPersona(String sTipoPersona) {
        this.sTipoPersona = sTipoPersona;
    }

    public int getiTipoIdentificacion() {
        return iTipoIdentificacion;
    }

    public void setiTipoIdentificacion(int iTipoIdentificacion) {
        this.iTipoIdentificacion = iTipoIdentificacion;
    }

    public int getiNumeroIdentificacion() {
        return iNumeroIdentificacion;
    }

    public void setiNumeroIdentificacion(int iNumeroIdentificacion) {
        this.iNumeroIdentificacion = iNumeroIdentificacion;
    }

    public String getsPaisExpedicion() {
        return sPaisExpedicion;
    }

    public void setsPaisExpedicion(String sPaisExpedicion) {
        this.sPaisExpedicion = sPaisExpedicion;
    }

    public String getsLugarExpedicion() {
        return sLugarExpedicion;
    }

    public void setsLugarExpedicion(String sLugarExpedicion) {
        this.sLugarExpedicion = sLugarExpedicion;
    }

    public Date getdFechaExpedicion() {
        return dFechaExpedicion;
    }

    public void setdFechaExpedicion(Date dFechaExpedicion) {
        this.dFechaExpedicion = dFechaExpedicion;
    }

    public String getsFechaExpedicion() {
        return sFechaExpedicion;
    }

    public void setsFechaExpedicion(String sFechaExpedicion) {
        this.sFechaExpedicion = sFechaExpedicion;
    }

    public String getsPrimerNombre() {
        return sPrimerNombre;
    }

    public void setsPrimerNombre(String sPrimerNombre) {
        this.sPrimerNombre = sPrimerNombre;
    }

    public String getsSegundoNombre() {
        return sSegundoNombre;
    }

    public void setsSegundoNombre(String sSegundoNombre) {
        this.sSegundoNombre = sSegundoNombre;
    }

    public String getsPrimerApellido() {
        return sPrimerApellido;
    }

    public void setsPrimerApellido(String sPrimerApellido) {
        this.sPrimerApellido = sPrimerApellido;
    }

    public String getsSegundoApellido() {
        return sSegundoApellido;
    }

    public void setsSegundoApellido(String sSegundoApellido) {
        this.sSegundoApellido = sSegundoApellido;
    }

    public int getiGenero() {
        return iGenero;
    }

    public void setiGenero(int iGenero) {
        this.iGenero = iGenero;
    }

    public int getiCategoriaSisben() {
        return iCategoriaSisben;
    }

    public void setiCategoriaSisben(int iCategoriaSisben) {
        this.iCategoriaSisben = iCategoriaSisben;
    }

    public int getiNacionalidad() {
        return iNacionalidad;
    }

    public void setiNacionalidad(int iNacionalidad) {
        this.iNacionalidad = iNacionalidad; 
    }

    public int getiPaisResidencia() {
        return iPaisResidencia;
    }

    public void setiPaisResidencia(int iPaisResidencia) {
        this.iPaisResidencia = iPaisResidencia;
    }

    public int getiDepartamentoResidencia() {
        return iDepartamentoResidencia;
    }

    public void setiDepartamentoResidencia(int iDepartamentoResidencia) {
        this.iDepartamentoResidencia = iDepartamentoResidencia;
    }

    public int getiCiudadResidencia() {
        return iCiudadResidencia;
    }

    public void setiCiudadResidencia(int iCiudadResidencia) {
        this.iCiudadResidencia = iCiudadResidencia;
    }

    public String getsLocalidadResidencia() {
        return sLocalidadResidencia;
    }

    public void setsLocalidadResidencia(String sLocalidadResidencia) {
        this.sLocalidadResidencia = sLocalidadResidencia;
    }

    public String getsDireccionResidencia() {
        return sDireccionResidencia;
    }

    public void setsDireccionResidencia(String sDireccionResidencia) {
        this.sDireccionResidencia = sDireccionResidencia;
    }

    public String getsBarrioResidencia() {
        return sBarrioResidencia;
    }

    public void setsBarrioResidencia(String sBarrioResidencia) {
        this.sBarrioResidencia = sBarrioResidencia;
    }

    public Date getdFechaNacimiento() {
        return dFechaNacimiento;
    }

    public void setdFechaNacimiento(Date dFechaNacimiento) {
        this.dFechaNacimiento = dFechaNacimiento;
    }

    public String getsFechaNacimiento() {
        return sFechaNacimiento;
    }

    public void setsFechaNacimiento(String sFechaNacimiento) {
        this.sFechaNacimiento = sFechaNacimiento;
    }

    public String getsLugarNacimiento() {
        return sLugarNacimiento;
    }

    public void setsLugarNacimiento(String sLugarNacimiento) {
        this.sLugarNacimiento = sLugarNacimiento;
    }

    public String getsCiudadNacimiento() {
        return sCiudadNacimiento;
    }

    public void setsCiudadNacimiento(String sCiudadNacimiento) {
        this.sCiudadNacimiento = sCiudadNacimiento;
    }

    public int getiGrupoSaniguineo() {
        return iGrupoSaniguineo;
    }

    public void setiGrupoSaniguineo(int iGrupoSaniguineo) {
        this.iGrupoSaniguineo = iGrupoSaniguineo;
    }

    public Date getdFechaInscripcion() {
        return dFechaInscripcion;
    }

    public void setdFechaInscripcion(Date dFechaInscripcion) {
        this.dFechaInscripcion = dFechaInscripcion;
    }

    public String getsFechaInscripcion() {
        return sFechaInscripcion;
    }

    public void setsFechaInscripcion(String sFechaInscripcion) {
        this.sFechaInscripcion = sFechaInscripcion;
    }

    public String getsEstadoCivil() {
        return sEstadoCivil;
    }

    public void setsEstadoCivil(String sEstadoCivil) {
        this.sEstadoCivil = sEstadoCivil;
    }

    public int getiLibretaMilitar() {
        return iLibretaMilitar;
    }

    public void setiLibretaMilitar(int iLibretaMilitar) {
        this.iLibretaMilitar = iLibretaMilitar;
    }

    public String getsNumeroLibretaMilitar() {
        return sNumeroLibretaMilitar;
    }

    public void setsNumeroLibretaMilitar(String sNumeroLibretaMilitar) {
        this.sNumeroLibretaMilitar = sNumeroLibretaMilitar;
    }

    public int getiNivelEducativo() {
        return iNivelEducativo;
    }

    public void setiNivelEducativo(int iNivelEducativo) {
        this.iNivelEducativo = iNivelEducativo;
    }

    public int getIdPeriodoAcademico() {
        return idPeriodoAcademico;
    }

    public String getFondoPensiones() {
        return fondoPensiones;
    }

    public int getIdPaisSecundaria() {
        return idPaisSecundaria;
    }

    public int getIdCategoriaSisben() {
        return idCategoriaSisben;
    }

    public int getIdDptoSecundaria() {
        return idDptoSecundaria;
    }

    public String getNomEscuelaSecun() {
        return nomEscuelaSecun;
    }

    public int getIdCiudadEscuela() {
        return idCiudadEscuela;
    }

    public String getFechaGrado() {
        return fechaGrado;
    }

    public Date getFechaGradoSecunda() {
        return fechaGradoSecunda;
    }

    public int getIdEps() {
        return idEps;
    }

    public void setIdPeriodoAcademico(int idPeriodoAcademico) {
        this.idPeriodoAcademico = idPeriodoAcademico;
    }

    public void setFondoPensiones(String fondoPensiones) {
        this.fondoPensiones = fondoPensiones;
    }

    public void setIdPaisSecundaria(int idPaisSecundaria) {
        this.idPaisSecundaria = idPaisSecundaria;
    }

    public void setIdCategoriaSisben(int idCategoriaSisben) {
        this.idCategoriaSisben = idCategoriaSisben;
    }

    public void setIdDptoSecundaria(int idDptoSecundaria) {
        this.idDptoSecundaria = idDptoSecundaria;
    }

    public void setNomEscuelaSecun(String nomEscuelaSecun) {
        this.nomEscuelaSecun = nomEscuelaSecun;
    }

    public void setIdCiudadEscuela(int idCiudadEscuela) {
        this.idCiudadEscuela = idCiudadEscuela;
    }

    public void setFechaGrado(String fechaGrado) {
        this.fechaGrado = fechaGrado;
    }

    public void setFechaGradoSecunda(Date fechaGradoSecunda) {
        this.fechaGradoSecunda = fechaGradoSecunda;
    }

    public void setIdEps(int idEps) {
        this.idEps = idEps;
    }

    
}
