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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ACTIVIDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividad.findAll", query = "SELECT a FROM Actividad a")
    , @NamedQuery(name = "Actividad.findByIdactividad", query = "SELECT a FROM Actividad a WHERE a.idactividad = :idactividad")})
public class Actividad implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDACTIVIDAD")
    private BigDecimal idactividad;
    @JoinColumn(name = "TIPOACTIVIDAD_IDTIPOACTIVIDAD", referencedColumnName = "IDTIPOACTIVIDAD")
    @ManyToOne(optional = false)
    private Tipoactividad tipoactividadIdtipoactividad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actividad")
    private Collection<Curso> cursoCollection;

    public Actividad() {
    }

    public Actividad(BigDecimal idactividad) {
        this.idactividad = idactividad;
    }

    public BigDecimal getIdactividad() {
        return idactividad;
    }

    public void setIdactividad(BigDecimal idactividad) {
        this.idactividad = idactividad;
    }

    public Tipoactividad getTipoactividadIdtipoactividad() {
        return tipoactividadIdtipoactividad;
    }

    public void setTipoactividadIdtipoactividad(Tipoactividad tipoactividadIdtipoactividad) {
        this.tipoactividadIdtipoactividad = tipoactividadIdtipoactividad;
    }

    @XmlTransient
    public Collection<Curso> getCursoCollection() {
        return cursoCollection;
    }

    public void setCursoCollection(Collection<Curso> cursoCollection) {
        this.cursoCollection = cursoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idactividad != null ? idactividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.idactividad == null && other.idactividad != null) || (this.idactividad != null && !this.idactividad.equals(other.idactividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Actividad[ idactividad=" + idactividad + " ]";
    }
    
}
