package com.ethos.db;

import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class ConnectionDB {

    private static ConnectionDB INSTANCE;
    private static Connection con;
    private static Properties properties;
    public static StringBuffer ERROR_ConectBD;

    ConnectionDB() {
        ERROR_ConectBD = new StringBuffer("ERROR_ConectBD->");
        try {
            properties = new Properties();
            properties.load(getClass().getClassLoader().getResourceAsStream("ConfigDB.properties"));
            ERROR_ConectBD = new StringBuffer();
        } catch (IOException e) {
            ERROR_ConectBD.append(e.toString()).append(",");
            System.out.println("Error abriendo el archivo database_conf " + e.toString());
        }
    }

    private synchronized static void createInstance() {
        Context initCtx;
        try {
            if (INSTANCE == null || con.isClosed()) {
                INSTANCE = new ConnectionDB();
                properties.getProperty(EnumDB.USER.getValue());
                initCtx = new InitialContext();
                Context envCtx = (Context) initCtx.lookup("java:comp/env");
                DataSource ds = (DataSource) envCtx.lookup("jdbc/EdupolDB");
                con = ds.getConnection();
                ERROR_ConectBD = new StringBuffer();
//                System.out.println("La conexión fue creada");
//            } else {
//                System.out.println("La conexión ya existe");
            }
        } catch (SQLException | NumberFormatException | NamingException e) {
            ERROR_ConectBD.append(e.toString()).append(",");
            System.out.println("Error de conexion " + e.toString());
            Logger.getLogger(ConnectionDB.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public static ConnectionDB getInstance() {
        createInstance();
        return INSTANCE;
    }

    public Connection getConnection() {
        try {
            if (con.isClosed()) {
                getInstance();
            }
        } catch (SQLException e) {
            ERROR_ConectBD.append(e.toString()).append(",");
            System.out.println("Error de conexion " + e.toString());
        }
        return con;
    }

    public void setCerrarConnection() throws SQLException {
        try {
            con.close();
        } catch (SQLException e) {
            ERROR_ConectBD.append(e.toString()).append(",");
            System.out.println("Error al desconectar " + e.toString());
        }
    }
}
