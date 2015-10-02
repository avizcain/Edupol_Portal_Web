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
public class RegistroEstudianteQuery {
    
    public static final String QUERY_GUARDAR_REGISTRO="INSERT INTO REGISTRO_ESTUDIANTE ( ID_ESTUDIANTE, ID_UNIVERSIDAD_PROGRAMA, ID_CENTRO_ASOCIADO, ID_ESTADO_REGISTRO, FECHA_INSCRIPCION) VALUES (?,?,?,?,convert(datetime,?))"; 
    public static final String QUERY_ULTIMO_CODIGO="select max(id_registo)from REGISTRO_ESTUDIANTE";
    public static final String QUERY_GET_CODIGO_UNIVERSIDADES_PROGRAMAS="SELECT	ID_COD_UNI_PRO 	FROM UNIVERSIDAD_PROGRAMA where I_COD_UNIV=? and I_COD_NIV_FOR=? and I_COD_NIV_EST=? and  I_COD_GRUPO=? and I_COD_PROGRAMA=?";
    public static final String QUERY_GET_REGISTRO_ESTUDIANTE = "SELECT * FROM REGISTRO_ESTUDIANTE WHERE ID_ESTUDIANTE = ?";  
}
