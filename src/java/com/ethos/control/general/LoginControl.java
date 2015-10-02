/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.control.general;

import com.ethos.business.general.FuncionesGenerales;
import com.ethos.business.general.ValidaLogin;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author dmendez
 */
public class LoginControl extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public LoginControl() {
        super();
    }

    /**
     * //
     * <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on
     * the + sign on the left to edit the code.">
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

        HttpSession session = request.getSession();

        String json = " ";
        String respuesta = "";

        HashMap mapDataUser;
        ValidaLogin validaLogin = new ValidaLogin();
        try {
            JsonObject dataJson;
            FuncionesGenerales funcion = new FuncionesGenerales();
            BufferedReader reader = request.getReader();
            dataJson = funcion.recibirDatos(reader);
//            System.out.println("json " + dataJson);

            if (!dataJson.toString().equalsIgnoreCase("{}")) {

                mapDataUser = validaLogin.autenticarCredenciales(dataJson);
                session.setAttribute("idUser", mapDataUser.get("idUser").toString());
                session.setAttribute("codUser", mapDataUser.get("codUser").toString());
                session.setAttribute("idPerfil", mapDataUser.get("idPerfil").toString());
                respuesta = mapDataUser.get("respuesta").toString();
                session.setMaxInactiveInterval(5*60);
                System.out.println("TIMEOUT: "+session.getMaxInactiveInterval());
                json = new Gson().toJson(respuesta);

            } else {
                session.invalidate();
                json = new Gson().toJson("Por favor ingresar sus credenciales");
            }
        } catch (Exception e) {
            session.invalidate();
            System.out.println("Error en LoginControl al validar credenciales: " + e);
        }

        response.setContentType("application/json;charset=Utf-8");
        response.getWriter().write(json);
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
