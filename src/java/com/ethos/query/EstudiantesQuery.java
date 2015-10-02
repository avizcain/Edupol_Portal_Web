/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.query;

/**
 *
 * @author Operaciones-GerenteC
 */
public class EstudiantesQuery {
    
    public static final String GUARDAR_DATOS_ESTUDIANTE="INSERT INTO ESTUDIANTES" 
       +" (ID_ESTUDIANTE,"
       + " ID_CATEGORIA_SISBEN,"
       + " NACIONALIDAD,"
       + " ID_PAIS_RES,"
       + " ID_DEPARTAMENTO_RES,"
       + " ID_CIUDAD_RES,"
       + " ID_LOCALIDAD_RES,"
       + " ID_BARRIO_RES,"
       + " GRUPO_SANGUINEO,"
       + " NUM_LIBRETA,"
       + " FOTOGRAFIA,"
       + " ID_ACUDIENTE,"
       + " ID_PAIS_ESTUDIO,"
       + " ID_DEPARTAMENTO_ESTUDIO,"
       + " ID_CIUDAD_ESTUDIO,"
       + " ESTRATO,"
       + "ID_TIPO_SOLICITUD,"
            + "Ciudad_Nacimiento,"
            + "Lugar_Nacimiento)" +
       " VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    
    public static final String QUERY_LISTAR_ESTUDIANTES_PREREGISTRO="select p.C_IDENTIFICACION,p.c_nombres,p.C_APELLIDOS,u.C_DESCRIPCION,e.FECHA_INSCRIPCION from personas p  inner join REGISTRO_ESTUDIANTE e on p.I_CODIGO=e.ID_ESTUDIANTE inner join UNIVERSIDAD_PROGRAMA u_p on e.ID_UNIVERSIDAD_PROGRAMA=u_p.ID_COD_UNI_PRO inner join UNIVERSIDAD u on u_p.I_COD_UNIV=u.I_COD_UNIV";
    public static final String QUERY_FILTRAR_ESTUDIANTES="select p.C_IDENTIFICACION,p.c_nombres,p.C_APELLIDOS,u.C_DESCRIPCION,e.FECHA_INSCRIPCION from personas p  inner join REGISTRO_ESTUDIANTE e on p.I_CODIGO=e.ID_ESTUDIANTE inner join UNIVERSIDAD_PROGRAMA u_p on e.ID_UNIVERSIDAD_PROGRAMA=u_p.ID_COD_UNI_PRO inner join UNIVERSIDAD u on u_p.I_COD_UNIV=u.I_COD_UNIV where p.C_IDENTIFICACION =  ? ";
    public static final String QUERY_GET_DATOS_COMPLEMENTARIOS_ESTUDIANTE ="SELECT ID_ESTUDIANTE, ID_PER_ACA, FONDO_PENSION_CESANTIAS, ID_PAIS_SECUNDARIA, ID_CATEGORIA_SISBEN, ID_DPTO_SECUNDARIA, NOM_ESCUELA_SECUN, ID_CIUDAD_SECUNDARIA, FECHA_GRADO_SECUNDA, ID_EPS  FROM ESTUDIANTES WHERE ID_ESTUDIANTE = ?";
}
