/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "ORIGEN")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Origen.findAll", query = "SELECT o FROM Origen o")
    , @NamedQuery(name = "Origen.findByIdorigen", query = "SELECT o FROM Origen o WHERE o.idorigen = :idorigen")})
public class Origen implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDORIGEN")
    private BigDecimal idorigen;
    @JoinColumn(name = "PAIS_IDPAIS", referencedColumnName = "IDPAIS")
    @ManyToOne(optional = false)
    private Pais paisIdpais;

    public Origen() {
    }

    public Origen(BigDecimal idorigen) {
        this.idorigen = idorigen;
    }

    public BigDecimal getIdorigen() {
        return idorigen;
    }

    public void setIdorigen(BigDecimal idorigen) {
        this.idorigen = idorigen;
    }

    public Pais getPaisIdpais() {
        return paisIdpais;
    }

    public void setPaisIdpais(Pais paisIdpais) {
        this.paisIdpais = paisIdpais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idorigen != null ? idorigen.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Origen)) {
            return false;
        }
        Origen other = (Origen) object;
        if ((this.idorigen == null && other.idorigen != null) || (this.idorigen != null && !this.idorigen.equals(other.idorigen))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Origen[ idorigen=" + idorigen + " ]";
    }
    
}
