/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ethos.business.general;

import com.ethos.DAO.AbstractDAO;
import com.ethos.DAO.MenuDAO;
import com.ethos.DAO.ModuloDAO;
import com.ethos.DAO.PaginaDAO;
import com.ethos.DAO.PerfilDAO;
import com.ethos.model.MenuModel;
import com.ethos.model.ModuloModel;
import com.ethos.model.PaginaModel;
import com.ethos.model.PerfilModel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author operaciones
 */
public class CrearMenu {

        public MenuModel obtenerMenu(String idPerfil) {

        MenuModel menuModel;
        PerfilModel perfilModel;
        
        List<String> listPaginas;
        List<String> listModulos;
        List<String> listParaMenu;
        List<ModuloModel> listModuloModel;
        List<PaginaModel> listPaginaModel;
        HashMap listParam = new HashMap();
        
        AbstractDAO menuDAO = new MenuDAO();
        AbstractDAO paginaDAO = new PaginaDAO();
        AbstractDAO perfilDAO = new PerfilDAO();
        AbstractDAO moduloDAO = new ModuloDAO();
        
        listParaMenu = new ArrayList<>();
        listParaMenu.add(idPerfil);
        
        listPaginas = menuDAO.queryAll(listParaMenu);
        listParam.put("listaPaginas", listPaginas);
        
        listModulos = new ArrayList<>();
        listPaginaModel = paginaDAO.findWhere(listParam);
        
        for(PaginaModel paginaModel : listPaginaModel) {
            String modulo = paginaModel.getsModulo();
            if(listModulos.isEmpty() || !listModulos.contains(modulo)){
                listModulos.add(modulo);
            }
        }
        listParam.put("listaModulos", listModulos);
        listModuloModel = moduloDAO.findWhere(listParam);
        
        for(ModuloModel moduloModel : listModuloModel){
            
            String idModulo = moduloModel.getsCodigo();
            List<PaginaModel> listPaginasAux = listPaginaModel;
            List<PaginaModel> listPaginasModulo = new ArrayList<>();

            for(int i=0; i< listPaginaModel.size(); i++){

                PaginaModel paginaModel = listPaginaModel.get(i);
                String idModuloPag = paginaModel.getsModulo();
                
                if(idModulo.equalsIgnoreCase(idModuloPag)){
                    listPaginasModulo.add(paginaModel);
                    listPaginasAux.remove(i);
                    i--;
                }
            }
            listPaginaModel = listPaginasAux;
            moduloModel.setListPaginaModel(listPaginasModulo);
        }
        
        perfilModel = (PerfilModel) perfilDAO.select(idPerfil);
         
        menuModel = new MenuModel();
        menuModel.setPerfilModel(perfilModel);
        menuModel.setListModuloModel(listModuloModel);
        
//        System.out.println("Perfil: " + perfilModel.getsNombre());
        return menuModel;
    }
}
