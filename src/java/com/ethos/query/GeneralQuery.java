





package com.ethos.query;

/**
 *
 * @author Mary
 */


public class GeneralQuery {
    
    public static final String QUERY_GETTIPOSOLICITUD="SELECT * FROM TIPO_SOLICITUD";
    public static final String QUERY_GET_GENERO="SELECT * FROM GENERO";
    public static final String QUERY_GET_CATEGORIA_GENERO=("SELECT * FROM CATEGORIA_SISBEN");
    public static final String QUERY_GETTIPO_IDENTIFICACON="SELECT * FROM tipos_iden ORDER BY I_CODIGO ASC";
    public static final String QUERY_MEDIOS_MASIVOS="SELECT * FROM MEDIOS_MASIVOS";
    public static final String QUERY_PROFESIONES="SELECT I_CODIGO,C_DESCRIPCION FROM PROFESIONES";
    public static final String QUERY_GET_CIUDADES= "SELECT I_CODIGO,C_NOMBRE FROM CIUDADES WHERE I_NIVEL=1 ORDER BY C_NOMBRE ASC";
    public static final String QUERY_GET_TIPO_SANGUINEO="SELECT* FROM  GRUPOS_SANGUINEO;";
    public static final String QUERY_GET_DEPENDENCIAS_CIUDADES="SELECT I_CODIGO,C_NOMBRE FROM CIUDADES where I_UBICACION=? ORDER BY C_NOMBRE ASC";
    public static final String QUERY_GET_CENTRO_ASOCIADOS="SELECT I_CODIGO,C_NOMBRES\n" +
                                                          "FROM PERSONAS where I_TIPO_CLIENTE=7 and I_CIUDAD_RES=? ORDER BY  I_CODIGO ASC";
    public static final String QUERY_GET_COMUNIDAD="SELECT *FROM COMUNIDAD";    
    public static final String QUERY_GET_TIPO_TRABAJO="SELECT * FROM TIPO_TRABAJO"; 
    public static final String QUERY_GET_TIPO_EPS="SELECT * FROM EPS";
    public static final String QUERY_GET_TIPO_FORMA_PAGO="SELECT I_COD_FPAGO, C_DESC_FPAGO FROM FORMA_PAGO";
    public static final String QUERY_GET_TIPO_PERIODO_ACADEMICO="select i_COD_PER_ACA,C_DESCRIPCION from PERIODO_ACADEMICO";
    public static final String QUERY_GET_LISTAR_CIUDADES="SELECT *FROM CIUDADES WHERE I_NIVEL = 4";
    
    
    /**-----------------------------------------------------------------------------------------------
     * Query's DavMen
     * -----------------------------------------------------------------------------------------------
    */
    public static final String QUERY_GET_REGISTRO_IDICFES="SELECT ID_ICFES FROM REGISTRO_ESTUDIANTE WHERE ID_ESTUDIANTE = ?";    
    public static final String QUERY_GET_ICFES="SELECT * FROM ICFES WHERE ID_ICFES = ?";    
    
    /**-----------------------------------------------------------------------------------------------*/
}
