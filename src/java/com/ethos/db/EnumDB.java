/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.db;

/**
 *
 * @author dmendez
 */
public enum EnumDB {
      
    //Propiedades bd SqlServer
    DRIVER("driver"),
    SUBPROTOCOL("subprotocol"),
    HOST("host"),
    SERVICE_NAME("db_database"),
    USER("user"),
    PASSWORD("password"),
    PORT("port"),
    INSTANCENAME("instanceName"),
    
    //Propiedades bd oracle
    DRIVER_ORCL("driver_orcl"),
    SUBPROTOCOL_ORCL("subprotocol_orcl"),
    HOST_ORCL("host_orcl"),
    SERVICE_NAME_ORCL("db_database_orcl"),
    USER_ORCL("user_orcl"),
    PASSWORD_ORCL("password_orcl"),
    PORT_ORCL("port_orcl"),
    
    //Seleccion MotorBD
    MOTORBD("motorBd");
     
    private String value;

    /**
     * Constructora de la enumeracion.
     *
     * @param value Valor del estado.
     * @param description Descripcion del estado.
     */
    private EnumDB(String value) {
        this.value = value;

    }

    /**
     * Obtiene el valor de la enumeracion actual.
     *
     * @return El valor de la enumeracion actual.
     */
    public String getValue() {
        return this.value;
    }
}
