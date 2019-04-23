/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Nombre;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Arturo Jr
 */
@Named(value = "controllerNombre")
@SessionScoped
public class ControllerNombre implements Serializable {
    
    @EJB
    private Facade.NombreFacade facade;
    private Nombre name=new Nombre();

    /**
     * Creates a new instance of ControllerNombre
     */
    public ControllerNombre() {
    }
    
    public List<Nombre> getAllNombres()
    {
        return facade.findAll();
    }
    
    public void addNombre(Nombre name)
    {
        
        facade.create(name);
    }

    public Nombre getName() {
        return name;
    }

    public void setName(Nombre name) {
        this.name = name;
    }
    
    
}
