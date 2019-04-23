/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Ciudades;
import Facade.CiudadesFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Arturo Jr
 */
@Named(value = "controlerCiudades")
@SessionScoped
public class ControlerCiudades implements Serializable {
    
    @EJB
    private Facade.CiudadesFacade facadeCiudades;
    Ciudades ciudad=new Ciudades();

    public Ciudades getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudades ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Creates a new instance of ControlerCiudades
     */
    public ControlerCiudades() {
    }
    
    
    public List<Ciudades> getAllCiudades()
    {
        return facadeCiudades.findAll();
    }
    
    
    public void AddCiudad(Ciudades ciudad)
    {
        
    }

   
    
}
