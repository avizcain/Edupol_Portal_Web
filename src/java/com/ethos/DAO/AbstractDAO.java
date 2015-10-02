/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.DAO;

import com.ethos.db.ConnectionDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author DavidFernando
 * @param <T>
 */
public abstract class AbstractDAO<T> {

    protected Connection conn;
    protected ResultSet rsT;
    private final Class<T> entityClass;
    protected PreparedStatement psQuery;
    private final  ConnectionDB connectionDB;

    public AbstractDAO(Class<T> entityClass) {
        connectionDB = ConnectionDB.getInstance();
        this.entityClass = entityClass;
    }

    public abstract T select(Object id);

    public abstract String insert(T entityClass);

    public abstract boolean update(T entityClass);

    public abstract String delete(Object id);

    public abstract List<T> findAll();
    
    public abstract List<T> findWhere(HashMap<String,Object> parameters);
    
    public abstract List<Object> queryAll(List<Object> parameters);
    
    public abstract List<T> findAll(Object id); 

    public Class<T> getEntityClass() {
        return entityClass;
    }

    public void closeConnection(){
        try {
                if (psQuery != null) {
                    psQuery.close();
                }
                if (rsT != null) {
                    rsT.close();
                }
                if(conn != null){
                    conn.close();
                }
            } catch (SQLException e) {
                System.out.println("Error" + e);
            }
    }
    
    public ConnectionDB getConnectionDB() {
        return connectionDB;
    }

}
