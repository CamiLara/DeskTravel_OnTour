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
@Table(name = "ACTIVIDADVIAJE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividadviaje.findAll", query = "SELECT a FROM Actividadviaje a")
    , @NamedQuery(name = "Actividadviaje.findByIdactividadviaje", query = "SELECT a FROM Actividadviaje a WHERE a.idactividadviaje = :idactividadviaje")})
public class Actividadviaje implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDACTIVIDADVIAJE")
    private BigDecimal idactividadviaje;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actividadviaje")
    private Collection<Destinoactividadviaje> destinoactividadviajeCollection;

    public Actividadviaje() {
    }

    public Actividadviaje(BigDecimal idactividadviaje) {
        this.idactividadviaje = idactividadviaje;
    }

    public BigDecimal getIdactividadviaje() {
        return idactividadviaje;
    }

    public void setIdactividadviaje(BigDecimal idactividadviaje) {
        this.idactividadviaje = idactividadviaje;
    }

    @XmlTransient
    public Collection<Destinoactividadviaje> getDestinoactividadviajeCollection() {
        return destinoactividadviajeCollection;
    }

    public void setDestinoactividadviajeCollection(Collection<Destinoactividadviaje> destinoactividadviajeCollection) {
        this.destinoactividadviajeCollection = destinoactividadviajeCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idactividadviaje != null ? idactividadviaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividadviaje)) {
            return false;
        }
        Actividadviaje other = (Actividadviaje) object;
        if ((this.idactividadviaje == null && other.idactividadviaje != null) || (this.idactividadviaje != null && !this.idactividadviaje.equals(other.idactividadviaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Actividadviaje[ idactividadviaje=" + idactividadviaje + " ]";
    }
    
}
