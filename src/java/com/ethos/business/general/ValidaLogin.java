/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.business.general;

import com.ethos.DAO.AbstractDAO;
import com.ethos.DAO.PersonasDAO;
import com.ethos.model.PersonaModel;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author operaciones
 */
public class ValidaLogin {

    public HashMap autenticarCredenciales(JsonObject credencial) {

        int idPerfil = 0;
        String codUser = " ";
        HashMap listParam;
        HashMap listDataUser;
        List<PersonaModel> datosPersona;

        String validacion = "Login invalido";
        String usuario = credencial.get("username").getAsString();
        String password = credencial.get("password").getAsString();

        AbstractDAO personaDao = new PersonasDAO();
        FuncionesGenerales funcionesGenerales = new FuncionesGenerales();

        listParam = new HashMap();
        listDataUser = new HashMap();
        List<String> listParamaetros = new ArrayList<>();

        listParamaetros.add(usuario);
        listParam.put("listaPersonas", listParamaetros);


        datosPersona = personaDao.findWhere(listParam);

        if (!datosPersona.isEmpty() || datosPersona.size() < 0) {

            codUser = datosPersona.get(0).getsCodPersona();
            idPerfil = datosPersona.get(0).getIdPerfil();

            String pass = datosPersona.get(0).getsClavePersona();
            String encriptaPass = funcionesGenerales.encripta(password, true);

            if (pass.equalsIgnoreCase(encriptaPass)) {
                validacion = "OK";
            }
        } else {
            validacion = "El usuario no existe";
        }
        
        listDataUser.put("idUser", usuario);
        listDataUser.put("idPerfil", idPerfil);
        listDataUser.put("codUser", codUser);
        listDataUser.put("respuesta", validacion);
        
        return listDataUser;
    }
}
