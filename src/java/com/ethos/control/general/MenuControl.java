/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.control.general;

import com.ethos.business.general.CrearMenu;
import com.ethos.business.general.FuncionesGenerales;
import com.ethos.model.MenuModel;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author operaciones
 */
public class MenuControl extends HttpServlet {

    private static final long serialVersionUID = 1L;

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        HttpSession sesion = request.getSession();
        String json = "";

        CrearMenu menud = new CrearMenu();
        if (sesion.getAttribute("idPerfil") != null) {
            MenuModel menuModel = menud.obtenerMenu(sesion.getAttribute("idPerfil").toString());
            json = new Gson().toJson(menuModel);
        }
        response.setContentType("application/json;charset=Utf-8");
        response.getWriter().write(json);
        System.out.println("Json Menu: " + json);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String json;
        JsonObject dataJson;
        FuncionesGenerales funcion = new FuncionesGenerales();
        BufferedReader reader = request.getReader();
        dataJson = funcion.recibirDatos(reader);

        String pagina = request.getContextPath()+dataJson.get("pagina").getAsString();
        System.out.println("pagina: " + pagina);
        json = "{\"pagina\":\""+pagina+"\"}";
        response.setContentType("application/json;charset=Utf-8");
        response.getWriter().write(json);
        
//        response.setContentType("text/html");
//        response.sendRedirect(pagina);

//        RequestDispatcher rqDisparcher;
//        rqDisparcher = request.getRequestDispatcher("http://www.google.com");
//        rqDisparcher.forward(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
