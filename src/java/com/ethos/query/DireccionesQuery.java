/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.query;

/**
 *
 * @author operaciones
 */
public class DireccionesQuery {

    public static final String queryDatosUpdate = "UPDATE DIRECCIONES"
            + " SET C_DIRECCION = ?,"
            + "	I_CIUDAD = ?,"
            + "	C_BARRIO = ?"
            + " WHERE I_CLIENTE = ?"
            + " AND I_TIPO_DIR = ?;";
    
    public static final String QUERY_ULTIMO_CODIGO="select max(i_codigo) from DIRECCIONES";
    
    public static final String QUERY_GUARDAR_DIRRECCIONES="INSERT INTO DIRECCIONES(I_CODIGO, I_CLIENTE, I_TIPO_DIR, C_DIRECCION)VALUES"
                        +"(?,?,?,?)";
}
