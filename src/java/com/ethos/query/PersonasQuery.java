/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.query;

/**
 *
 * @author DavidFernando
 */
public class PersonasQuery {

    private FunctionsDB functionDB;

    public static final String queryDatosUpdate = "UPDATE PERSONAS"
            /*1*/+ " SET N_SALARIO = ?,"
            /*2*/+ " C_DIRECCION = ?,"
            /*3*/+ " C_TELEFONO = ?,"
            /*4*/+ " I_NIVEL_ESTUDIO = ?,"
            /*5*/+ " C_E_MAIL = ?,"
            /*6*/+ " I_NUM_PER_CAR = ?,"
            /*7*/+ " I_CIUDAD_RES = ?,"
            /*8*/+ " C_ESTADO_CIVIL = ?"
            /*9*/+ " WHERE I_CODIGO = ?; ";

    public static final String queryObtenerDatosPersonaLogin = "SELECT "
            /*1*/+ " I_CODIGO,"
            /*2*/+ " I_TIPO_CLIENTE,"
            /*3*/+ " C_CLAVE"
            + " FROM PERSONAS"
            + " WHERE C_IDENTIFICACION= ?; ";
    
    public static final String QUERY_GUARDAR_DATOS="INSERT INTO PERSONAS (i_codigo,c_tipo_person,c_identificacion,i_tipo_iden,i_tipo_cliente,f_fecha_exp,c_apellidos,c_nombres,c_sexo,f_fec_nacimiento,c_estado_civil,I_NIVEL_ESTUDIO,C_CLAVE)\n" +
                                                    "values(?,?,?,?,?,convert(datetime,?),?,?,?,convert(datetime,?),?,?,?)";
    public static final String QUERY_ULTIMO_CODIGO="select max(i_codigo) from PERSONAS";
     
    
    public static final String QUERY_PERSONA_EXISTE="select C_IDENTIFICACION from personas where C_IDENTIFICACION=?";
     
    /**
     * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     *
     * @description Metodo que obtiene una query a ejecutar
     * @param tipoConn
     * @return Query
     * ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     */
    public String queryDatosPersona(String tipoConn) {

        functionDB = new FunctionsDB();
        String fechaNacimiento = functionDB.toChar("P.F_FEC_NACIMIENTO", tipoConn);
        String fechaExpedicion = functionDB.toChar("P.F_FECHA_EXP", tipoConn);

        String query = "SELECT"
                /*1*/ + " P.C_IDENTIFICACION,"
                /*2*/ + " P.I_CIUDAD_RES,"
                /*3*/ + " P.N_SALARIO,"
                /*4*/ + " P.I_CIUDAD_NAC,"
                /*5*/ + " (SELECT CIU.C_NOMBRE FROM CIUDADES CIU WHERE CIU.I_CODIGO=P.I_CIUDAD_NAC) AS CIUDAD_NAC,"
                /*6*/ + " " + fechaNacimiento + " AS F_FEC_NACIMIENTO,"
                /*7*/ + " I_CIUDAD_EXP,"
                /*8*/ + " (SELECT CIU.C_NOMBRE FROM CIUDADES CIU WHERE CIU.I_CODIGO=P.I_CIUDAD_EXP) AS CIUDAD_EXP,"
                /*9*/ + " " + fechaExpedicion + " AS F_FECHA_EXP,"
                /*10*/ + " P.I_TIPO_ACT_EC,"
                /*11*/ + " P.I_NIVEL_ESTUDIO,"
                /*12*/ + " P.I_NUM_PER_CAR,"
                /*13*/ + " P.C_ESTADO_CIVIL,"
                /*14*/ + " P.C_NICKNAME,"
                /*15*/ + " P.C_AFICION,"
                /*16*/ + " P.C_NOMBRES,"
                /*17*/ + " P.C_APELLIDOS,"
                /*18*/ + " P.C_E_MAIL,"
                /*19*/ + " (SELECT DIR.C_DIRECCION FROM DIRECCIONES DIR WHERE DIR.I_CLIENTE = P.I_CODIGO  AND I_TIPO_DIR = 6) AS EMAIL_CORP,"
                /*20*/ + " P.C_DIRECCION,"
                /*21*/ + " D.C_DIRECCION,"
                /*22*/ + " D.C_BARRIO,"
                /*23*/ + " D.C_TEL_ARRENDA,"
                /*24*/ + " T.C_NUMERO,"
                /*25*/ + " P.C_TELEFONO,"
                /*26*/ + " (SELECT TEL.C_NUMERO  FROM TELEFONOS TEL  WHERE TEL.I_CLIENTE = P.I_CODIGO AND I_TIPO_TEL = 4) AS S_CELULAR"
                + " FROM PERSONAS P"
                + " INNER JOIN DIRECCIONES D ON D.I_CLIENTE = P.I_CODIGO"
                + " INNER JOIN TELEFONOS T ON T.I_CLIENTE = P.I_CODIGO"
                + " WHERE D.I_TIPO_DIR = 1"
                + " AND T.I_TIPO_TEL = 2"
                + " AND P.I_CODIGO = ?;";

        return query;
    }
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
}
