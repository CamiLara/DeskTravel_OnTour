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
@Table(name = "TIPOSERVICIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposervicios.findAll", query = "SELECT t FROM Tiposervicios t")
    , @NamedQuery(name = "Tiposervicios.findByIdtiposervicios", query = "SELECT t FROM Tiposervicios t WHERE t.idtiposervicios = :idtiposervicios")
    , @NamedQuery(name = "Tiposervicios.findByNombre", query = "SELECT t FROM Tiposervicios t WHERE t.nombre = :nombre")})
public class Tiposervicios implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDTIPOSERVICIOS")
    private BigDecimal idtiposervicios;
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tiposerviciosIdtiposervicios")
    private Collection<Servicios> serviciosCollection;

    public Tiposervicios() {
    }

    public Tiposervicios(BigDecimal idtiposervicios) {
        this.idtiposervicios = idtiposervicios;
    }

    public BigDecimal getIdtiposervicios() {
        return idtiposervicios;
    }

    public void setIdtiposervicios(BigDecimal idtiposervicios) {
        this.idtiposervicios = idtiposervicios;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Servicios> getServiciosCollection() {
        return serviciosCollection;
    }

    public void setServiciosCollection(Collection<Servicios> serviciosCollection) {
        this.serviciosCollection = serviciosCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtiposervicios != null ? idtiposervicios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposervicios)) {
            return false;
        }
        Tiposervicios other = (Tiposervicios) object;
        if ((this.idtiposervicios == null && other.idtiposervicios != null) || (this.idtiposervicios != null && !this.idtiposervicios.equals(other.idtiposervicios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tiposervicios[ idtiposervicios=" + idtiposervicios + " ]";
    }
    
}
