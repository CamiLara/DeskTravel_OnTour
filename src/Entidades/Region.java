/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
@Table(name = "REGION")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Region.findAll", query = "SELECT r FROM Region r")
    , @NamedQuery(name = "Region.findByIdregion", query = "SELECT r FROM Region r WHERE r.idregion = :idregion")
    , @NamedQuery(name = "Region.findByNombre", query = "SELECT r FROM Region r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Region.findByComunaIdcomuna", query = "SELECT r FROM Region r WHERE r.comunaIdcomuna = :comunaIdcomuna")})
public class Region implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDREGION")
    private BigDecimal idregion;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "COMUNA_IDCOMUNA")
    private BigInteger comunaIdcomuna;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "regionIdregion")
    private Collection<Pais> paisCollection;

    public Region() {
    }

    public Region(BigDecimal idregion) {
        this.idregion = idregion;
    }

    public Region(BigDecimal idregion, String nombre, BigInteger comunaIdcomuna) {
        this.idregion = idregion;
        this.nombre = nombre;
        this.comunaIdcomuna = comunaIdcomuna;
    }

    public BigDecimal getIdregion() {
        return idregion;
    }

    public void setIdregion(BigDecimal idregion) {
        this.idregion = idregion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigInteger getComunaIdcomuna() {
        return comunaIdcomuna;
    }

    public void setComunaIdcomuna(BigInteger comunaIdcomuna) {
        this.comunaIdcomuna = comunaIdcomuna;
    }

    @XmlTransient
    public Collection<Pais> getPaisCollection() {
        return paisCollection;
    }

    public void setPaisCollection(Collection<Pais> paisCollection) {
        this.paisCollection = paisCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idregion != null ? idregion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Region)) {
            return false;
        }
        Region other = (Region) object;
        if ((this.idregion == null && other.idregion != null) || (this.idregion != null && !this.idregion.equals(other.idregion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Region[ idregion=" + idregion + " ]";
    }
    
}
