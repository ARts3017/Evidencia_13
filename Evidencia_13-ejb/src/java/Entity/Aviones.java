/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Arturo Jr
 */
@Entity
@Table(name = "aviones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aviones.findAll", query = "SELECT a FROM Aviones a")
    , @NamedQuery(name = "Aviones.findById", query = "SELECT a FROM Aviones a WHERE a.id = :id")
    , @NamedQuery(name = "Aviones.findByNumeroAvion", query = "SELECT a FROM Aviones a WHERE a.numeroAvion = :numeroAvion")
    , @NamedQuery(name = "Aviones.findByCapacidadPasajeros", query = "SELECT a FROM Aviones a WHERE a.capacidadPasajeros = :capacidadPasajeros")
    , @NamedQuery(name = "Aviones.findByModelo", query = "SELECT a FROM Aviones a WHERE a.modelo = :modelo")})
public class Aviones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numeroAvion")
    private String numeroAvion;
    @Basic(optional = false)
    @Column(name = "capacidadPasajeros")
    private int capacidadPasajeros;
    @Basic(optional = false)
    @Column(name = "modelo")
    private String modelo;

    public Aviones() {
    }

    public Aviones(Integer id) {
        this.id = id;
    }

    public Aviones(Integer id, String numeroAvion, int capacidadPasajeros, String modelo) {
        this.id = id;
        this.numeroAvion = numeroAvion;
        this.capacidadPasajeros = capacidadPasajeros;
        this.modelo = modelo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroAvion() {
        return numeroAvion;
    }

    public void setNumeroAvion(String numeroAvion) {
        this.numeroAvion = numeroAvion;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aviones)) {
            return false;
        }
        Aviones other = (Aviones) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Aviones[ id=" + id + " ]";
    }
    
}
