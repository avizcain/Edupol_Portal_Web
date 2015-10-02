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
public class AcudienteQuery {
    
    public static final String QUERY_GUARDAR_ACUDIENTE="INSERT INTO ACUDIENTE\n" +
"	(ID_ACUDIENTE,"
        + " EMPRESA_EMPLEO, "
        + "TIPO_CONTRATO, "
        + "TIEMPO_LABORADO,"
        + " EMPLEADO_INDEPENDIENTE,"
        + " INGRESO_ARRIENDO,"
        + " INGRESO_PENSION,"
        + " JUSTIFICACION_OTROS_INGR, "
        + "INGRESOS_OTRO, "
        + "TIPO_VIVIENDA,"
        + " VEHICULO,"
        + " OCUPACION,"
        + " SALARIO, "
        + "Tarjeta,"
        + " CREDITO_ACTUAL,"
        + " VALOR_OBLIGACION,"
        + " MEDIO_MASIVO,"
        + "PAIS_RESIDENCIA,"
        + " DEPARTAMENTO_RESIDENCIA,"
        + " CIUDAD_RESIDENCIA)\n" +
        "VALUES \n" +
"	(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
    
    
    
}
