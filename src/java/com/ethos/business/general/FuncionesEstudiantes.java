
package com.ethos.business.general;

import com.ethos.DAO.AbstractDAO;
import com.ethos.DAO.AcudienteDAO;
import com.ethos.DAO.CentroAsociadoDAO;
import com.ethos.DAO.CiudadesDAO;
import com.ethos.DAO.DireccionesDAO;
import com.ethos.DAO.EstudiantesDAO;
import com.ethos.DAO.GrupoProgramasDAO;
import com.ethos.DAO.NivelEstudiosDAO;
import com.ethos.DAO.NivelFormacionDAO;
import com.ethos.DAO.PersonasDAO;
import com.ethos.DAO.ProfesionesDAO;
import com.ethos.DAO.ProgramasDAO;
import com.ethos.DAO.RegistroEstudianteDAO;
import com.ethos.DAO.TelefonosDAO;
import com.ethos.model.AcudienteModel;
import com.ethos.model.DireccionesModel;
import com.ethos.model.EstudianteModel;
import com.ethos.model.GrupoProgramasModel;
import com.ethos.model.ListasGeneralesModel;
import com.ethos.model.NivelEstudiosModel;
import com.ethos.model.NivelFormacionModel;
import com.ethos.model.PersonaModel;
import com.ethos.model.ProgramasModel;
import com.ethos.model.RegistroEstudianteModel;
import com.ethos.model.TelefonosModel;
import com.google.gson.JsonObject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Mary
 */

public class FuncionesEstudiantes {
    
    AbstractDAO estudianteDAO;
    AbstractDAO acudienteDAO;
    AbstractDAO personasDAO;
    AbstractDAO telefonosDAO;
    AbstractDAO direccionesDAO;
    AbstractDAO nivelFormacionDAO;
    AbstractDAO nivelEstudiosDAO;
    AbstractDAO grupoProgramaDAO;
    AbstractDAO programasDAO;
    AbstractDAO ciudadesDAO;
    AbstractDAO centroAsociadoDAO;
    AbstractDAO registroEstudianteDAO;
    
    PersonaModel personaEstudianteModel;
    PersonaModel personaAcudienteModel;
    EstudianteModel estudianteModel;
    AcudienteModel acudienteModel;
    TelefonosModel telefonoMovilEstModel;
    TelefonosModel telefonoEstModel;
    DireccionesModel direccionesModel;
    DireccionesModel direccionesAcudienteModel;
    DireccionesModel EmailAcudienteModel;
    TelefonosModel telefonoMovilAcudeienteModel;
    TelefonosModel telefonoAcudiente;
    ListasGeneralesModel listasGeneralesModel;
    RegistroEstudianteModel registroEstudianteModel;
     
    
    
     public String guardarPreRegistro(JsonObject preRegistro) throws ParseException {
        boolean datosGuardadosAcu=false;
        String resultado = "NOK";
        JsonObject estudianteJObject;
        JsonObject acudienteObject;
        JsonObject tipoSolJObject;
        JsonObject nivelEducativoObject;
        JsonObject nacionalidadObject;
        JsonObject tipoIdenJsonObject;
        JsonObject generoJsonObject;
        JsonObject categoriaSisbenJsonObject;
        JsonObject paisResJsonObject;
        JsonObject departamentoResJsonObject;
        JsonObject ciudadResJsonObject;
        JsonObject estadoCivilJsonObject;
        JsonObject grupoSanquineoJsonObject;
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/yyyy");
        
        JsonObject tipoIdenAcudienteJsonObject;
        JsonObject generoAcudienteJsonObject;
        JsonObject MedioMasivoJsonObject;
        JsonObject paisResAcuJsonObject;
        JsonObject departamentoResAcuJsonObject;
        JsonObject ciudadResAcuJsonObject;
        
        JsonObject paisEstJsonObject;
        JsonObject departamentoEstJsonObject;
        JsonObject ciudadEstJsonObject;
        JsonObject universidadJsonObject;
        JsonObject nivelFormacionJsonObject;
        JsonObject tipoEstudioJsonObject;
        JsonObject grupoProgramaJsonObject;
        JsonObject programaJsonObject;
        JsonObject centroAsociadoJsonObject;
        JsonObject informacionUniversidadJsonObject;
                

        estudianteDAO = new EstudiantesDAO();
        personasDAO = new PersonasDAO();                
        telefonosDAO = new TelefonosDAO();
        direccionesDAO = new DireccionesDAO();
        registroEstudianteDAO= new RegistroEstudianteDAO();
        

        estudianteModel = new EstudianteModel();
        personaEstudianteModel = new PersonaModel();
      //  telefonoModel = new TelefonosModel();
      //  direccionesModel = new DireccionesModel();
        FuncionesGenerales funcionesGenerales=new FuncionesGenerales();
        
        estudianteJObject = preRegistro.get("estudiante").getAsJsonObject();
        tipoSolJObject = estudianteJObject.getAsJsonObject("TipoSol");
        nivelEducativoObject=estudianteJObject.getAsJsonObject("NivelEducativo");
        nacionalidadObject=estudianteJObject.getAsJsonObject("Nacionalidad");
        tipoIdenJsonObject=estudianteJObject.getAsJsonObject("Tipoiden");
        generoJsonObject= estudianteJObject.getAsJsonObject("genero");
        categoriaSisbenJsonObject=estudianteJObject.getAsJsonObject("categoriaSisben");
        paisResJsonObject=estudianteJObject.getAsJsonObject("paisRes");
        departamentoResJsonObject=estudianteJObject.getAsJsonObject("depRes");
        ciudadResJsonObject=estudianteJObject.getAsJsonObject("ciudadRes");
        estadoCivilJsonObject=estudianteJObject.getAsJsonObject("estCivil");
        grupoSanquineoJsonObject=estudianteJObject.getAsJsonObject("rh");
        informacionUniversidadJsonObject=estudianteJObject.getAsJsonObject("infoUni");
        universidadJsonObject=informacionUniversidadJsonObject.getAsJsonObject("Universidad");
        nivelFormacionJsonObject=informacionUniversidadJsonObject.getAsJsonObject("NivelFormacion");
        tipoEstudioJsonObject=informacionUniversidadJsonObject.getAsJsonObject("tipEstudio");
        grupoProgramaJsonObject=informacionUniversidadJsonObject.getAsJsonObject("GrupoProgramaAcademico");
        programaJsonObject=informacionUniversidadJsonObject.getAsJsonObject("ProgramaAcademico");
        centroAsociadoJsonObject=estudianteJObject.getAsJsonObject("centroAsociado");
        paisEstJsonObject=estudianteJObject.getAsJsonObject("paisEstudio");
        departamentoEstJsonObject=estudianteJObject.getAsJsonObject("depEstudio");
        ciudadEstJsonObject=estudianteJObject.getAsJsonObject("ciudadEstudio");
        
        
        personaAcudienteModel=(PersonaModel) personasDAO.select(estudianteJObject.get("NumIdentificacion").getAsString());           
        if(personaAcudienteModel.getsIden()!=null){
          resultado="Existe";
        }else{
        String contraseña=funcionesGenerales.encripta(estudianteJObject.get("Contrasena").getAsString(), true);
        personaEstudianteModel.setsClavePersona(contraseña);
        personaEstudianteModel.setsCodPersona(estudianteJObject.get("NumIdentificacion").getAsString());
        personaEstudianteModel.setStipoPersona("N");
        personaEstudianteModel.setIdPerfil(2);
                 try {
            personaEstudianteModel.setdFechaNacimiento(formatoFecha.parse(estudianteJObject.get("FechaNac").getAsString()));
            personaEstudianteModel.setdFechaExpedicion(formatoFecha.parse(estudianteJObject.get("fechaExp").getAsString()));
         } catch (Exception e) {
             System.out.println("date " +e);
         }
        personaEstudianteModel.setiTipoIden(tipoIdenJsonObject.get("iId_Identificacion").getAsInt());
        personaEstudianteModel.setsIden(estudianteJObject.get("NumIdentificacion").getAsString());
        if(estudianteJObject.has("segNombre")==true){
        String nombre=(estudianteJObject.get("segNombre").getAsString().equals(""))?estudianteJObject.get("PriNombre").getAsString():estudianteJObject.get("PriNombre").getAsString()+" "+estudianteJObject.get("segNombre").getAsString();
        personaEstudianteModel.setsNombre(nombre.toUpperCase());
        }else{
         personaEstudianteModel.setsNombre(estudianteJObject.get("PriNombre").getAsString().toUpperCase());
        }
        if(estudianteJObject.has("segNombre")==true){
        String apellido=(estudianteJObject.get("PriApellido").getAsString().equals(""))?estudianteJObject.get("PriApellido").getAsString():estudianteJObject.get("PriApellido").getAsString()+" "+estudianteJObject.get("SegApellido").getAsString();
         personaEstudianteModel.setsApellido(apellido.toUpperCase());
        }else{
          personaEstudianteModel.setsApellido(estudianteJObject.get("PriApellido").getAsString().toUpperCase());  
        }
        personaEstudianteModel.setsGenero(generoJsonObject.get("sInicial").getAsString().toUpperCase());
        personaEstudianteModel.setsCodEstadoCivil(estadoCivilJsonObject.get("sCodigoEstadoCivil").getAsString());
        personaEstudianteModel.setiNivelEst(nivelEducativoObject.get("sCodigo").getAsInt());
       
        
        estudianteModel.setiTipoSolicitud(tipoSolJObject.get("iId_tipoSolicitud").getAsInt());
        estudianteModel.setiNacionalidad(nacionalidadObject.get("sCodigo").getAsInt());
        estudianteModel.setsCiudadNacimiento(estudianteJObject.get("ciudadNacimiento").getAsString().toUpperCase());
   //     estudianteModel.setsLugarNacimiento(estudianteJObject.get("lugarNacimiento").getAsString().toUpperCase());       
        estudianteModel.setsLugarExpedicion(estudianteJObject.get("LugarExp").getAsString().toUpperCase());        
        estudianteModel.setiCategoriaSisben(categoriaSisbenJsonObject.get("iIdCategoriaSisben").getAsInt());
        estudianteModel.setiPaisResidencia(paisResJsonObject.get("sCodigo").getAsInt());
        estudianteModel.setiDepartamentoResidencia(departamentoResJsonObject.get("sCodigo").getAsInt());
        estudianteModel.setiCiudadResidencia(ciudadResJsonObject.get("sCodigo").getAsInt());
        estudianteModel.setsLocalidadResidencia(estudianteJObject.get("locRes").getAsString().toUpperCase());
        estudianteModel.setsBarrioResidencia(estudianteJObject.get("BarrioRes").getAsString().toUpperCase());
        if(estudianteJObject.has("LibretaMilitar")==true){
        estudianteModel.setiLibretaMilitar(estudianteJObject.get("LibretaMilitar").getAsInt());
        }
        estudianteModel.setiLibretaMilitar(0);
        estudianteModel.setiGrupoSaniguineo(grupoSanquineoJsonObject.get("iCodigoTipoSangre").getAsInt());
        estudianteModel.setiPaisEstudio(paisEstJsonObject.get("sCodigo").getAsInt());
        estudianteModel.setiDepartamentoEstudio(paisEstJsonObject.get("sCodigo").getAsInt());
        estudianteModel.setiCiudadEstudio(ciudadEstJsonObject.get("sCodigo").getAsInt());
         
        direccionesModel= new DireccionesModel();
        direccionesModel.setsTipoDir("2");
        direccionesModel.setsCliente(estudianteJObject.get("NumIdentificacion").getAsString());
        direccionesModel.setsDireccion(estudianteJObject.get("dirRes").getAsString());
        
        direccionesModel= new DireccionesModel();
        direccionesModel.setsTipoDir("3");
        direccionesModel.setsCliente(estudianteJObject.get("NumIdentificacion").getAsString());
        direccionesModel.setsDireccion(estudianteJObject.get("email").getAsString());
        
        telefonoMovilEstModel= new TelefonosModel();
        telefonoMovilEstModel.setsTipoTel("2");
        telefonoMovilEstModel.setsIdPersona(estudianteJObject.get("NumIdentificacion").getAsString());
        telefonoMovilEstModel.setsNumero(estudianteJObject.get("telMovil").getAsString());
        
        telefonoEstModel= new TelefonosModel();
        telefonoEstModel.setsTipoTel("1");
        telefonoEstModel.setsIdPersona(estudianteJObject.get("NumIdentificacion").getAsString());
        telefonoEstModel.setsNumero(estudianteJObject.get("tel").getAsString());
        
        registroEstudianteModel = new RegistroEstudianteModel();
        registroEstudianteModel.setiCodUni(universidadJsonObject.get("iCodUniversidad").getAsInt());
        registroEstudianteModel.setiNivelFormacion(nivelFormacionJsonObject.get("iCod_NivelFormacion").getAsInt());
        registroEstudianteModel.setiTipoEstudio(tipoEstudioJsonObject.get("sCodigo").getAsInt());
        registroEstudianteModel.setiGrupoPrograma(grupoProgramaJsonObject.get("iIdGrupo").getAsInt());
        registroEstudianteModel.setiPrograma(programaJsonObject.get("iCodPrograma").getAsInt());
        registroEstudianteModel.setiCodCentroAsociado(centroAsociadoJsonObject.get("iCodCentroAsociado").getAsInt());
        registroEstudianteModel.setiEstadoRegistro(1);
        Date fecha = new Date();
        registroEstudianteModel.setFechaIncripcion(formatoFecha.format(fecha));
        if(!estudianteJObject.get("mayorEdad").getAsBoolean()){
        acudienteObject=preRegistro.get("acudiente").getAsJsonObject();
        paisResAcuJsonObject= acudienteObject.get("paisRes").getAsJsonObject();
        departamentoResAcuJsonObject= acudienteObject.get("depRes").getAsJsonObject();
        ciudadResAcuJsonObject= acudienteObject.get("ciudRes").getAsJsonObject();
        tipoIdenAcudienteJsonObject= acudienteObject.get("tipIden").getAsJsonObject();
        generoAcudienteJsonObject=acudienteObject.get("genero").getAsJsonObject();
        MedioMasivoJsonObject=acudienteObject.get("medioMasivo").getAsJsonObject();
        personaAcudienteModel = new PersonaModel();
        acudienteDAO=new AcudienteDAO();
        
        
        personaAcudienteModel.setsCodPersona(acudienteObject.get("numIden").getAsString());
        personaAcudienteModel.setiTipoIden(tipoIdenAcudienteJsonObject.get("iId_Identificacion").getAsInt());
        personaAcudienteModel.setsIden(acudienteObject.get("numIden").getAsString());
        personaAcudienteModel.setdFechaExpedicion(formatoFecha.parse(acudienteObject.get("fechExp").getAsString()));
        personaAcudienteModel.setsGenero(generoAcudienteJsonObject.get("iIdGenero").getAsString());
        if(acudienteObject.has("segNombre")==true){
        String nombre=(acudienteObject.get("segNombre").getAsString().equals(""))?acudienteObject.get("priNombre").getAsString():acudienteObject.get("priNombre").getAsString()+" "+acudienteObject.get("segNombre").getAsString();
        personaAcudienteModel.setsNombre(nombre.toUpperCase());
        }else{
        personaAcudienteModel.setsNombre(acudienteObject.get("priNombre").getAsString().toUpperCase()); 
        }
        if(acudienteObject.has("segApellido")==true){
         String apellido=(acudienteObject.get("segApellido").getAsString().equals(""))?acudienteObject.get("priApellido").getAsString():acudienteObject.get("priApellido").getAsString()+" "+acudienteObject.get("segApellido").getAsString();
         personaAcudienteModel.setsApellido(apellido.toUpperCase());
        }else{
          personaAcudienteModel.setsApellido(acudienteObject.get("priApellido").getAsString().toUpperCase());  
        }           
        
        acudienteModel = new AcudienteModel();
        acudienteModel.setsPaisResidencia(paisResAcuJsonObject.get("sCodigo").getAsString());
        acudienteModel.setsCiudadResidencia(ciudadResAcuJsonObject.get("sCodigo").getAsString());
        acudienteModel.setsDepartamento(departamentoResAcuJsonObject.get("sCodigo").getAsString());
        acudienteModel.setsTrabajaActual(acudienteObject.get("tipTrabajo").getAsString().toUpperCase());
        acudienteModel.setsTiempoTrabajando(acudienteObject.get("tiempoTrabajo").getAsString());
        acudienteModel.setsNombreEmpresa(acudienteObject.get("nomEmpresa").getAsString().toUpperCase());
        acudienteModel.setsTipoContrato(acudienteObject.get("tipContrato").getAsString().toUpperCase());
        acudienteModel.setsOcupacion(acudienteObject.get("ocupacion").getAsString().toUpperCase());
        acudienteModel.setsTipoVivienda(acudienteObject.get("tipVivienda").getAsString().toUpperCase());
        acudienteModel.setdSalario(acudienteObject.get("salario").getAsDouble());
        if(acudienteObject.has("vehiculo")==true){
           acudienteModel.setsVehiculo(acudienteObject.get("vehiculo").getAsString().toUpperCase()); 
        }
        if(acudienteObject.has("IngresosArr")==true){
           acudienteModel.setdIngArrendamiento(acudienteObject.get("IngresosArr").getAsDouble());
        }
        if(acudienteObject.has("ingresosPension")==true){
          acudienteModel.setdIngPension(acudienteObject.get("ingresosPension").getAsDouble());
        }
        if(acudienteObject.has("otrosIngresos")==true){
           acudienteModel.setdOtrosIngresos1(acudienteObject.get("otrosIngresos").getAsDouble());
        }
     
         if(acudienteObject.has("nombreIngresos")==true){
          acudienteModel.setsNombreOtrosIngresos(acudienteObject.get("nombreIngresos").getAsString().toUpperCase());
        }
         
        if(acudienteObject.has("nomTarjeta")==true){
           acudienteModel.setsTarjetaCredito(acudienteObject.get("nomTarjeta").getAsString().toUpperCase());
        }
     
        if(acudienteObject.has("nomCredito")==true){
           acudienteModel.setsCreditoActual(acudienteObject.get("nomCredito").getAsString().toUpperCase());
        }
        if(acudienteObject.has("valorObli")==true){
           acudienteModel.setdValorObligaciones(acudienteObject.get("valorObli").getAsDouble());
        }
        acudienteModel.setsMedioEdupol(MedioMasivoJsonObject.get("iIdMediosMasivos").getAsString());
        
        
        telefonoAcudiente = new TelefonosModel();
        telefonoAcudiente.setsTipoTel("1");
        telefonoAcudiente.setsNumero(acudienteObject.get("telFij").getAsString());
        telefonoAcudiente.setsIdPersona(acudienteObject.get("numIden").getAsString());
        
        telefonoMovilAcudeienteModel = new  TelefonosModel();
        telefonoMovilAcudeienteModel.setsTipoTel(acudienteObject.get("telMovil").getAsString());
        telefonoMovilAcudeienteModel.setsIdPersona(acudienteObject.get("numIden").getAsString());
       
        
        direccionesAcudienteModel = new DireccionesModel();
        direccionesAcudienteModel.setsTipoDir("2");
        direccionesAcudienteModel.setsDireccion(acudienteObject.get("dirRes").getAsString());
        direccionesAcudienteModel.setsCliente(acudienteObject.get("numIden").getAsString());
        
        EmailAcudienteModel = new DireccionesModel();
        EmailAcudienteModel.setsTipoDir("3");
        EmailAcudienteModel.setsDireccion(acudienteObject.get("email").getAsString());
        EmailAcudienteModel.setsCliente(acudienteObject.get("numIden").getAsString());
        String guardarPersonaAcudiente = personasDAO.insert(personaAcudienteModel);
        acudienteModel.setiCodAcudiente(Integer.parseInt(guardarPersonaAcudiente));
        String guardarAcudiente=acudienteDAO.insert(acudienteModel);
        String guardarTelMovil = telefonosDAO.insert(telefonoMovilAcudeienteModel);
        String guardarTel=telefonosDAO.insert(telefonoAcudiente);
        String guardarDirAcu=direccionesDAO.insert(direccionesAcudienteModel);
        String guardarEmailAcu=direccionesDAO.insert(EmailAcudienteModel);
        if((!guardarPersonaAcudiente.equals("NOK"))&& (!guardarAcudiente.equals("NOK"))&&(!guardarTelMovil.equals("NOK"))&& (!guardarTel.equals("NOK"))&& (!guardarDirAcu.equals("NOK"))&&(!guardarEmailAcu.equals("NOK"))){
            datosGuardadosAcu=true;
        }
        
        }
        try {   
                
                String guardarPersonaEstu = personasDAO.insert(personaEstudianteModel);
                estudianteModel.setiCodigoEst(Integer.parseInt(guardarPersonaEstu));
                String guardarEstudiante = estudianteDAO.insert(estudianteModel);
                registroEstudianteModel.setiCodEstudiente(Integer.parseInt(guardarPersonaEstu));
                String guardarRegistro=registroEstudianteDAO.insert(registroEstudianteModel);
                String guardarTelMovil = telefonosDAO.insert(telefonoMovilEstModel);
                String guardarTel=telefonosDAO.insert(telefonoEstModel);
                String guardarDir=direccionesDAO.insert(direccionesModel);
              if(!estudianteJObject.get("mayorEdad").getAsBoolean()){
                  if(datosGuardadosAcu &&(!guardarRegistro.equals("NOK"))&&(!guardarPersonaEstu.equals("NOK"))&& (!guardarEstudiante.equals("NOK"))&& (!guardarTelMovil.equals("NOK"))&& (!guardarTel.equals("NOK"))&& (!guardarDir.equals("NOK"))){
                       resultado = "OK";
                   }
              }else{
                   if((!guardarRegistro.equals("NOK"))&&(!guardarPersonaEstu.equals("NOK"))&& (!guardarEstudiante.equals("NOK"))&& (!guardarTelMovil.equals("NOK"))&& (!guardarTel.equals("NOK"))&& (!guardarDir.equals("NOK"))){
                       resultado = "OK"; 
                   }
                  }
         } catch (Exception e) {
            System.out.println("Error al guardar los datos: " + e);
        }
        }
        return resultado;
    }
     
     public ListasGeneralesModel obtenerDependenciasUniversidades(JsonObject id){
         JsonObject idUniObject;
         JsonObject idNivelForObject;
         JsonObject idGrupoProgramaObject;
         JsonObject idProgramasObject;
         List<NivelFormacionModel>listNivelFormacionModel;
         List<NivelEstudiosModel>listNivelEstudiosModels;
         List<GrupoProgramasModel>listGrupoProgramasModels;
         List<ProgramasModel>listProgramasModels;
         List<Object> lisObjects= new ArrayList<>();
         listasGeneralesModel = new ListasGeneralesModel();
         try {
             switch(id.get("indiceUni").getAsInt()){
             
             case 1:
                 nivelFormacionDAO = new NivelFormacionDAO();
                 idUniObject=id.get("Universidad").getAsJsonObject();
                 listNivelFormacionModel = nivelFormacionDAO.findAll((Object)idUniObject.get("iCodUniversidad").getAsString());
                 listasGeneralesModel.setListNivelFormacionModels(listNivelFormacionModel);
                 break;
             case 2:
                 nivelEstudiosDAO = new NivelEstudiosDAO();
                 idUniObject=id.get("Universidad").getAsJsonObject();
                 idNivelForObject=id.get("NivelFormacion").getAsJsonObject();
                 lisObjects.add(idUniObject.get("iCodUniversidad").getAsInt());
                 lisObjects.add(idNivelForObject.get("iCod_NivelFormacion").getAsInt());
                 listNivelEstudiosModels=nivelEstudiosDAO.queryAll(lisObjects);
                 listasGeneralesModel.setLisNivelEstudiosModels(listNivelEstudiosModels);
                break;
             case 3:
                 grupoProgramaDAO = new GrupoProgramasDAO();
                 idUniObject=id.get("Universidad").getAsJsonObject();
                 idNivelForObject=id.get("NivelFormacion").getAsJsonObject();
                 idGrupoProgramaObject=id.get("tipEstudio").getAsJsonObject();
                 lisObjects.add(idUniObject.get("iCodUniversidad").getAsInt());
                 lisObjects.add(idNivelForObject.get("iCod_NivelFormacion").getAsInt());
                 lisObjects.add(idGrupoProgramaObject.get("sCodigo").getAsInt());
                 listGrupoProgramasModels=grupoProgramaDAO.queryAll(lisObjects);
                 listasGeneralesModel.setListGrupoProgramasModels(listGrupoProgramasModels);
                 break;
                 
             case 4:
                 programasDAO= new ProgramasDAO();
                 idUniObject=id.get("Universidad").getAsJsonObject();
                 idNivelForObject=id.get("NivelFormacion").getAsJsonObject();
                 idGrupoProgramaObject=id.get("tipEstudio").getAsJsonObject();
                 idProgramasObject=id.get("GrupoProgramaAcademico").getAsJsonObject();
                 lisObjects.add(idUniObject.get("iCodUniversidad").getAsInt());
                 lisObjects.add(idNivelForObject.get("iCod_NivelFormacion").getAsInt());
                 lisObjects.add(idGrupoProgramaObject.get("sCodigo").getAsInt());
                 lisObjects.add(idProgramasObject.get("iIdGrupo").getAsInt());
                 listProgramasModels=programasDAO.queryAll(lisObjects);
                 listasGeneralesModel.setListProgramasModels(listProgramasModels);        
         }
             
         } catch (Exception e) {
             System.out.println("error"+e);
         }
           return listasGeneralesModel;
     }
   
     public ListasGeneralesModel dependenciasPais(JsonObject object){
         System.out.println("aqui estoy dependencia pais");
         List<Object> lisObjects= new ArrayList<>();
         listasGeneralesModel = new ListasGeneralesModel();
         System.out.println("numero......"+object.get("indice").getAsInt());
         if(object.get("indice").getAsInt()==3){
              System.out.println("no debo estar aqui");
             centroAsociadoDAO = new CentroAsociadoDAO();
             lisObjects.add(object.get("sCodigo").getAsInt());
             listasGeneralesModel.setListCentroAsociadoModels(centroAsociadoDAO.queryAll(lisObjects));
         
         }else{
             System.out.println("dentra else......dep pais");
             ciudadesDAO = new CiudadesDAO();
             lisObjects.add(object.get("sCodigo").getAsInt());
             listasGeneralesModel.setLisCiudadModels(ciudadesDAO.queryAll(lisObjects));             
         }
         return listasGeneralesModel;
     }
}
