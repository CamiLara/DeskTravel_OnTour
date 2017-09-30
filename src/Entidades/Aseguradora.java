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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "ASEGURADORA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aseguradora.findAll", query = "SELECT a FROM Aseguradora a")
    , @NamedQuery(name = "Aseguradora.findById", query = "SELECT a FROM Aseguradora a WHERE a.id = :id")})
public class Aseguradora implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @JoinTable(name = "ASEGURADORASEGURO", joinColumns = {
        @JoinColumn(name = "ASEGURADORA_ID", referencedColumnName = "ID")}, inverseJoinColumns = {
        @JoinColumn(name = "POLIZASEGURO_IDPOLIZA", referencedColumnName = "IDPOLIZA")})
    @ManyToMany
    private Collection<Polizaseguro> polizaseguroCollection;

    public Aseguradora() {
    }

    public Aseguradora(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    @XmlTransient
    public Collection<Polizaseguro> getPolizaseguroCollection() {
        return polizaseguroCollection;
    }

    public void setPolizaseguroCollection(Collection<Polizaseguro> polizaseguroCollection) {
        this.polizaseguroCollection = polizaseguroCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aseguradora)) {
            return false;
        }
        Aseguradora other = (Aseguradora) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Aseguradora[ id=" + id + " ]";
    }
    
}
