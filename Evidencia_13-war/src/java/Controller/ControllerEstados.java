/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Entity.Estados;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author Arturo Jr
 */
@Named(value = "controllerEstados")
@SessionScoped
public class ControllerEstados implements Serializable {

    @EJB
    private Facade.EstadosFacade facadeEstados;
    /**
     * Creates a new instance of ControllerEstados
     */
    public ControllerEstados() {
    }
    
    public List<Estados> getAllEstados()
    {
        return facadeEstados.findAll();
    }
}
