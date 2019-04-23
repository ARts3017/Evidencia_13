/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Paises;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Arturo Jr
 */
@Named(value = "controllerPaises")
@SessionScoped
public class ControllerPaises implements Serializable {
    
    @EJB
    private Facade.PaisesFacade facadePaises;
    private Paises paises=new Paises();

    /**
     * Creates a new instance of ControllerPaises
     */
    public ControllerPaises() {
    }
    
    public List<Paises> getAllPaises()
    {
        return facadePaises.findAll();
    }
    
    public void AddPaises(Paises pais)
    {
        facadePaises.create(pais);
    }

    public Paises getPaises() {
        return paises;
    }

    public void setPaises(Paises paises) {
        this.paises = paises;
    }
    
    
}
