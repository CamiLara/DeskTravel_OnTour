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
@Table(name = "SERVICIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicios.findAll", query = "SELECT s FROM Servicios s")
    , @NamedQuery(name = "Servicios.findByIdservicios", query = "SELECT s FROM Servicios s WHERE s.idservicios = :idservicios")})
public class Servicios implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDSERVICIOS")
    private BigDecimal idservicios;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicios")
    private Collection<Contratov2> contratov2Collection;
    @JoinColumn(name = "TIPOSERVICIOS_IDTIPOSERVICIOS", referencedColumnName = "IDTIPOSERVICIOS")
    @ManyToOne(optional = false)
    private Tiposervicios tiposerviciosIdtiposervicios;

    public Servicios() {
    }

    public Servicios(BigDecimal idservicios) {
        this.idservicios = idservicios;
    }

    public BigDecimal getIdservicios() {
        return idservicios;
    }

    public void setIdservicios(BigDecimal idservicios) {
        this.idservicios = idservicios;
    }

    @XmlTransient
    public Collection<Contratov2> getContratov2Collection() {
        return contratov2Collection;
    }

    public void setContratov2Collection(Collection<Contratov2> contratov2Collection) {
        this.contratov2Collection = contratov2Collection;
    }

    public Tiposervicios getTiposerviciosIdtiposervicios() {
        return tiposerviciosIdtiposervicios;
    }

    public void setTiposerviciosIdtiposervicios(Tiposervicios tiposerviciosIdtiposervicios) {
        this.tiposerviciosIdtiposervicios = tiposerviciosIdtiposervicios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idservicios != null ? idservicios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicios)) {
            return false;
        }
        Servicios other = (Servicios) object;
        if ((this.idservicios == null && other.idservicios != null) || (this.idservicios != null && !this.idservicios.equals(other.idservicios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Servicios[ idservicios=" + idservicios + " ]";
    }
    
}
