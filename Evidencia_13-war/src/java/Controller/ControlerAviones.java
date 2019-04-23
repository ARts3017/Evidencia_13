/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Aviones;
import Facade.AvionesFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Arturo Jr
 */
@Named(value = "controlerAviones")
@SessionScoped
public class ControlerAviones implements Serializable {

    @EJB
    private AvionesFacade facade; 
    Aviones aviones=new Aviones();
    /**
     * Creates a new instance of ControlerAviones
     */
    public ControlerAviones() {
    }
    
    public List<Aviones> getAllAviones()
    {
        return facade.findAll();
    }
    
    public void AddAvion(Aviones avion)
    {
        facade.create(avion);
        
    }

    public Aviones getAviones() {
        return aviones;
    }

    public void setAviones(Aviones aviones) {
        this.aviones = aviones;
    }
    
    
}
