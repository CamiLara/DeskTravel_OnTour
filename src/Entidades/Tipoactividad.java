/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "TIPOACTIVIDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoactividad.findAll", query = "SELECT t FROM Tipoactividad t")
    , @NamedQuery(name = "Tipoactividad.findByIdtipoactividad", query = "SELECT t FROM Tipoactividad t WHERE t.idtipoactividad = :idtipoactividad")
    , @NamedQuery(name = "Tipoactividad.findByNombre", query = "SELECT t FROM Tipoactividad t WHERE t.nombre = :nombre")})
public class Tipoactividad implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDTIPOACTIVIDAD")
    private BigDecimal idtipoactividad;
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoactividadIdtipoactividad")
    private Collection<Actividad> actividadCollection;

    public Tipoactividad() {
    }

    public Tipoactividad(BigDecimal idtipoactividad) {
        this.idtipoactividad = idtipoactividad;
    }

    public BigDecimal getIdtipoactividad() {
        return idtipoactividad;
    }

    public void setIdtipoactividad(BigDecimal idtipoactividad) {
        this.idtipoactividad = idtipoactividad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Actividad> getActividadCollection() {
        return actividadCollection;
    }

    public void setActividadCollection(Collection<Actividad> actividadCollection) {
        this.actividadCollection = actividadCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoactividad != null ? idtipoactividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoactividad)) {
            return false;
        }
        Tipoactividad other = (Tipoactividad) object;
        if ((this.idtipoactividad == null && other.idtipoactividad != null) || (this.idtipoactividad != null && !this.idtipoactividad.equals(other.idtipoactividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tipoactividad[ idtipoactividad=" + idtipoactividad + " ]";
    }
    
}
