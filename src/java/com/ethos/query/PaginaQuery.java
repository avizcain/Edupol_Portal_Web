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
public class PaginaQuery {
    
    public static final String queryGetPaginas = "SELECT * FROM PAGINA WHERE I_CODIGO IN (?)";
}
