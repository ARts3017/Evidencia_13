/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Vuelos;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Arturo Jr
 */
@Named(value = "controllerVuelos")
@SessionScoped
public class ControllerVuelos implements Serializable {

    
    @EJB
    private Facade.VuelosFacade facadeVuelos;
    /**
     * Creates a new instance of ControllerVuelos
     */
    public ControllerVuelos() {
    }
    
    public List<Vuelos> getAllVuelos()
    {
        return facadeVuelos.findAll();
    }
    
    public void InsertVuelos(Vuelos vuelos)
    {
        facadeVuelos.create(vuelos);
    }
   
    
}
