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
public class UniversidadesQuery {
    
    public static final String QUERY_GET_UNIVERSIDAS="select * from Universidad";
    public static final String QUERY_GET_NIVELFORMACION="select DISTINCT f.I_COD_NIV_FOR,f.c_descripcion  from nivel_formacion f inner join UNIVERSIDAD_PROGRAMA u_p on f.I_COD_NIV_FOR=u_p.I_COD_NIV_FOR\n" +
                                                        "where u_p.I_COD_UNIV=?";
    public static final String QUERY_GET_NIVELESTUDIOS="select DISTINCT e.I_COD_NIV_EST,e.C_DESCRIPCION  from NIVEL_ESTUDIOS e inner join UNIVERSIDAD_PROGRAMA u_p on e.I_COD_NIV_EST=u_p.I_COD_NIV_EST\n" +
                                                       "where u_p.I_COD_UNIV=? and u_p.I_COD_NIV_FOR=?";
    
    public static final String QUERY_GET_GRUPOPROGRAMAS="select DISTINCT g_p.I_COD_GRUPO,g_p.C_DESCRIPCION  from GRUPO_PROGRAMA g_p inner join UNIVERSIDAD_PROGRAMA u_p on g_p.I_COD_GRUPO=u_p.I_COD_GRUPO\n" +
                                                        "where u_p.I_COD_UNIV=? and u_p.I_COD_NIV_FOR=? and u_p.I_COD_NIV_EST=?";
    public static final String QUERY_GET_PROGRAMAS="select p.I_COD_PROGRAMA,p.C_DESCRIPCION from PROGRAMAS p inner join UNIVERSIDAD_PROGRAMA u_p on p.I_COD_PROGRAMA=u_p.I_COD_PROGRAMA\n" +
                                                   "where u_p.I_COD_UNIV=? and u_p.I_COD_NIV_FOR=? and u_p.I_COD_NIV_EST=? and u_p.I_COD_GRUPO=?";
    
}
