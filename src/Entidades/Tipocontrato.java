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
@Table(name = "TIPOCONTRATO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipocontrato.findAll", query = "SELECT t FROM Tipocontrato t")
    , @NamedQuery(name = "Tipocontrato.findByIdtipocontrato", query = "SELECT t FROM Tipocontrato t WHERE t.idtipocontrato = :idtipocontrato")
    , @NamedQuery(name = "Tipocontrato.findByNombre", query = "SELECT t FROM Tipocontrato t WHERE t.nombre = :nombre")})
public class Tipocontrato implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDTIPOCONTRATO")
    private BigDecimal idtipocontrato;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipocontratoIdtipocontrato")
    private Collection<Contratov2> contratov2Collection;

    public Tipocontrato() {
    }

    public Tipocontrato(BigDecimal idtipocontrato) {
        this.idtipocontrato = idtipocontrato;
    }

    public Tipocontrato(BigDecimal idtipocontrato, String nombre) {
        this.idtipocontrato = idtipocontrato;
        this.nombre = nombre;
    }

    public BigDecimal getIdtipocontrato() {
        return idtipocontrato;
    }

    public void setIdtipocontrato(BigDecimal idtipocontrato) {
        this.idtipocontrato = idtipocontrato;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        hash += (idtipocontrato != null ? idtipocontrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocontrato)) {
            return false;
        }
        Tipocontrato other = (Tipocontrato) object;
        if ((this.idtipocontrato == null && other.idtipocontrato != null) || (this.idtipocontrato != null && !this.idtipocontrato.equals(other.idtipocontrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tipocontrato[ idtipocontrato=" + idtipocontrato + " ]";
    }
    
}
