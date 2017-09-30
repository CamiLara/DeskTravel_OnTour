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
import javax.persistence.ManyToMany;
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
@Table(name = "POLIZASEGURO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Polizaseguro.findAll", query = "SELECT p FROM Polizaseguro p")
    , @NamedQuery(name = "Polizaseguro.findByIdpoliza", query = "SELECT p FROM Polizaseguro p WHERE p.idpoliza = :idpoliza")})
public class Polizaseguro implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDPOLIZA")
    private BigDecimal idpoliza;
    @ManyToMany(mappedBy = "polizaseguroCollection")
    private Collection<Aseguradora> aseguradoraCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "polizaseguroIdpoliza")
    private Collection<Tiposeguro> tiposeguroCollection;

    public Polizaseguro() {
    }

    public Polizaseguro(BigDecimal idpoliza) {
        this.idpoliza = idpoliza;
    }

    public BigDecimal getIdpoliza() {
        return idpoliza;
    }

    public void setIdpoliza(BigDecimal idpoliza) {
        this.idpoliza = idpoliza;
    }

    @XmlTransient
    public Collection<Aseguradora> getAseguradoraCollection() {
        return aseguradoraCollection;
    }

    public void setAseguradoraCollection(Collection<Aseguradora> aseguradoraCollection) {
        this.aseguradoraCollection = aseguradoraCollection;
    }

    @XmlTransient
    public Collection<Tiposeguro> getTiposeguroCollection() {
        return tiposeguroCollection;
    }

    public void setTiposeguroCollection(Collection<Tiposeguro> tiposeguroCollection) {
        this.tiposeguroCollection = tiposeguroCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpoliza != null ? idpoliza.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Polizaseguro)) {
            return false;
        }
        Polizaseguro other = (Polizaseguro) object;
        if ((this.idpoliza == null && other.idpoliza != null) || (this.idpoliza != null && !this.idpoliza.equals(other.idpoliza))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Polizaseguro[ idpoliza=" + idpoliza + " ]";
    }
    
}
