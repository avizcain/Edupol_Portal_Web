 
package com.ethos.control.general;


import com.ethos.business.general.FuncionesEstudiantes;
import com.ethos.business.general.FuncionesGenerales;
import com.ethos.model.ListasGeneralesModel;
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
 * @author Mary
 */


public class PreRegistroControl extends HttpServlet {
    private FuncionesGenerales funcionesGeneral;
    private ListasGeneralesModel listasGenerales;
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
  

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
        funcionesGeneral=new FuncionesGenerales();
        try {
//            System.out.println("idUser: "+sesion.getAttribute("codUser").toString());
                listasGenerales=funcionesGeneral.obtenerDatosActualizar();
                json = new Gson().toJson(listasGenerales);
                
            
                  System.out.println("json preregistro: " + json);
        } catch (Exception e) {
            System.out.println("Exception in PreRegiStroControl: " + e);
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
        
        String json = "";
        String respuesta;
            FuncionesGenerales funcion = new FuncionesGenerales();
        FuncionesEstudiantes funcionEstudiantes= new FuncionesEstudiantes();
        try {
            BufferedReader reader = request.getReader();
            JsonObject dataJson = funcion.recibirDatos(reader);
            switch(dataJson.get("condicion").getAsInt()){
                case 0:
                    respuesta=funcionEstudiantes.guardarPreRegistro(dataJson);
                    json = new Gson().toJson(respuesta);
                    break;
                case 1:
                    listasGenerales=funcionEstudiantes.obtenerDependenciasUniversidades(dataJson);
                    json = new Gson().toJson(listasGenerales);
                    break;
                case 2:
                    listasGenerales=funcionEstudiantes.dependenciasPais(dataJson);
                    json = new Gson().toJson(listasGenerales);

                    break;
            }
            
        } catch (Exception e) {
            System.out.println("Error al obterner datos en Actualizar Control: " + e);
            json = new Gson().toJson("NOK");
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
