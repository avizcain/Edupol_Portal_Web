/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.control.general;

import com.ethos.business.general.ActualizarDatos;
import com.ethos.business.general.FuncionesGenerales;
import com.ethos.model.ActualizaModel;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import java.io.BufferedReader;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author operaciones
 */
public class ActualizarControl extends HttpServlet {

    private static final long serialVersionUID = -2104430395705044542L;
    private ActualizarDatos actualizaDatos;

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
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
        ActualizaModel actualizaModel;
        actualizaDatos = new ActualizarDatos();

        try {
//            System.out.println("idUser: "+sesion.getAttribute("codUser").toString());
            if (sesion.getAttribute("codUser") != null) {
                actualizaModel = actualizaDatos.obtenerDatosActualizar(sesion.getAttribute("codUser").toString());
                json = new Gson().toJson(actualizaModel);
            }
//            System.out.println("json: " + json);
        } catch (Exception e) {
            System.out.println("Exception in AuctalizarControl: " + e);
        }
        response.setContentType("application/json;charset=Utf-8");
        response.getWriter().write(json);
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

        String json = null;
        String respuesta;
        actualizaDatos = new ActualizarDatos();
        FuncionesGenerales funcion = new FuncionesGenerales();
        try {
            BufferedReader reader = request.getReader();
            JsonObject dataJson = funcion.recibirDatos(reader);
            respuesta = actualizaDatos.updatePerson(dataJson, "6666");
            json = new Gson().toJson(respuesta);
//            System.out.println("dataJason: " + dataJson);
//            System.out.println("respJason: " + json);
        } catch (Exception e) {
            System.out.println("Error al obterner datos en Actualizar Control: " + e);
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
