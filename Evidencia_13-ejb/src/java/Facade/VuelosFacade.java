/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Entity.Vuelos;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Arturo Jr
 */
@Stateless
public class VuelosFacade extends AbstractFacade<Vuelos> {

    @PersistenceContext(unitName = "Evidencia_13-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VuelosFacade() {
        super(Vuelos.class);
    }
    
}
