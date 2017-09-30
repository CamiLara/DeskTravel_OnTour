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
@Table(name = "POLIZASEGUROS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Polizaseguros.findAll", query = "SELECT p FROM Polizaseguros p")
    , @NamedQuery(name = "Polizaseguros.findByIdpolizas", query = "SELECT p FROM Polizaseguros p WHERE p.idpolizas = :idpolizas")})
public class Polizaseguros implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDPOLIZAS")
    private BigDecimal idpolizas;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "polizasegurosIdpolizas")
    private Collection<Contratov2> contratov2Collection;

    public Polizaseguros() {
    }

    public Polizaseguros(BigDecimal idpolizas) {
        this.idpolizas = idpolizas;
    }

    public BigDecimal getIdpolizas() {
        return idpolizas;
    }

    public void setIdpolizas(BigDecimal idpolizas) {
        this.idpolizas = idpolizas;
    }

    @XmlTransient
    public Collection<Contratov2> getContratov2Collection() {
        return contratov2Collection;
    }

    public void setContratov2Collection(Collection<Contratov2> contratov2Collection) {
        this.contratov2Collection = contratov2Collection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpolizas != null ? idpolizas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Polizaseguros)) {
            return false;
        }
        Polizaseguros other = (Polizaseguros) object;
        if ((this.idpolizas == null && other.idpolizas != null) || (this.idpolizas != null && !this.idpolizas.equals(other.idpolizas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Polizaseguros[ idpolizas=" + idpolizas + " ]";
    }
    
}
