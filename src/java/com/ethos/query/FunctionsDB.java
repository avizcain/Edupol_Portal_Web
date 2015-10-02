/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.query;

import java.util.List;

/**
 *
 * @author dmendez
 */
public class FunctionsDB {

    /**----------------------------------------------------------------------------------------------------------------------------------------------------------------------------
     * @description Agrega sentencia de conversion a cadena, para Oracle o SqlServer  
     * @param sql
     * @param bd
     * @return String
     *----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/
    public String toChar(String sql, String bd) {
        String function;

        if (bd.contains("SQLServer") || bd.contains("SQL Server")) {
            function = " LEFT(CONVERT(VARCHAR," + sql + ",103),10)";
        } else {
            function=" TO_CHAR("+sql+",DD/MM/YYYY)";
        }
            return function;
        }
    /*----------------------------------------------------------------------------------------------------------------------------------------------------------------------------*/

    public String createQuery(String query, List<String> parametros) {
        String queryComplete;
        
        StringBuilder queryBuilder = new StringBuilder("");
        for( int i = 0; i< parametros.size(); i++){
            queryBuilder.append(parametros.get(i));
            if(i != parametros.size() -1) queryBuilder.append(",");
        }
        queryComplete = query.replace("?", queryBuilder.toString());
        return queryComplete;
    }
}
