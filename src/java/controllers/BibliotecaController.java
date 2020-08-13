/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import entidades.Biblioteca;
import java.io.Serializable;
import java.util.ResourceBundle;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.faces.model.SelectItem;

/**
 *
 * @author Roberto Avelar
 */
@ManagedBean(name = "bibliotecaController")
@SessionScoped
public class BibliotecaController implements Serializable {

    private Biblioteca current;
    private DataModel items = null;
   
    public BibliotecaController() {
    }

    public Biblioteca getSelected() {
    
        return current;
    }

    public String prepareList() {
       
        return "List";
    }

    public String prepareView() {
        
        return "View";
    }

    public String prepareCreate() {
       
        return "Create";
    }

    public String create() {
   return null;
    }

    public String prepareEdit() {
        
        return "Edit";
    }

    public String update() {
        return null;
    }

    public String destroy() {
        
        return "List";
    }

    public String destroyAndView() {
           return null;

    }

    private void performDestroy() {
       
    }

    private void updateCurrentItem() {
       
    }

    public DataModel getItems() {
       
        return items;
    }

    private void recreateModel() {
        items = null;
    }

    private void recreatePagination() {
       
    }

    public String next() {
      
        return "List";
    }

    public String previous() {
       
        return "List";
    }

    public SelectItem[] getItemsAvailableSelectMany() {
       return null;
    }

    public SelectItem[] getItemsAvailableSelectOne() {
        return null;
       
    }

   

}

