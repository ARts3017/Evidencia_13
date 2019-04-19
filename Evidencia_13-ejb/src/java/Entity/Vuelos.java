/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Arturo Jr
 */
@Entity
@Table(name = "vuelos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vuelos.findAll", query = "SELECT v FROM Vuelos v")
    , @NamedQuery(name = "Vuelos.findById", query = "SELECT v FROM Vuelos v WHERE v.id = :id")
    , @NamedQuery(name = "Vuelos.findByNumeroVuelo", query = "SELECT v FROM Vuelos v WHERE v.numeroVuelo = :numeroVuelo")
    , @NamedQuery(name = "Vuelos.findByNumeroAvion", query = "SELECT v FROM Vuelos v WHERE v.numeroAvion = :numeroAvion")
    , @NamedQuery(name = "Vuelos.findByOrigen", query = "SELECT v FROM Vuelos v WHERE v.origen = :origen")
    , @NamedQuery(name = "Vuelos.findByDestino", query = "SELECT v FROM Vuelos v WHERE v.destino = :destino")
    , @NamedQuery(name = "Vuelos.findByNumeroPasajeros", query = "SELECT v FROM Vuelos v WHERE v.numeroPasajeros = :numeroPasajeros")
    , @NamedQuery(name = "Vuelos.findByFechaInicio", query = "SELECT v FROM Vuelos v WHERE v.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Vuelos.findByFechaFin", query = "SELECT v FROM Vuelos v WHERE v.fechaFin = :fechaFin")
    , @NamedQuery(name = "Vuelos.findByHoraInicio", query = "SELECT v FROM Vuelos v WHERE v.horaInicio = :horaInicio")
    , @NamedQuery(name = "Vuelos.findByHoraFin", query = "SELECT v FROM Vuelos v WHERE v.horaFin = :horaFin")})
public class Vuelos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "numeroVuelo")
    private String numeroVuelo;
    @Basic(optional = false)
    @Column(name = "numeroAvion")
    private String numeroAvion;
    @Basic(optional = false)
    @Column(name = "origen")
    private String origen;
    @Basic(optional = false)
    @Column(name = "destino")
    private String destino;
    @Column(name = "numeroPasajeros")
    private Integer numeroPasajeros;
    @Column(name = "fechaInicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fechaFin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Column(name = "horaInicio")
    @Temporal(TemporalType.TIME)
    private Date horaInicio;
    @Column(name = "horaFin")
    @Temporal(TemporalType.TIME)
    private Date horaFin;

    public Vuelos() {
    }

    public Vuelos(Integer id) {
        this.id = id;
    }

    public Vuelos(Integer id, String numeroVuelo, String numeroAvion, String origen, String destino) {
        this.id = id;
        this.numeroVuelo = numeroVuelo;
        this.numeroAvion = numeroAvion;
        this.origen = origen;
        this.destino = destino;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumeroVuelo() {
        return numeroVuelo;
    }

    public void setNumeroVuelo(String numeroVuelo) {
        this.numeroVuelo = numeroVuelo;
    }

    public String getNumeroAvion() {
        return numeroAvion;
    }

    public void setNumeroAvion(String numeroAvion) {
        this.numeroAvion = numeroAvion;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public void setNumeroPasajeros(Integer numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
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
        if (!(object instanceof Vuelos)) {
            return false;
        }
        Vuelos other = (Vuelos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entity.Vuelos[ id=" + id + " ]";
    }
    
}
