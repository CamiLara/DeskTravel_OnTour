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
@Table(name = "TIPOSEGURO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposeguro.findAll", query = "SELECT t FROM Tiposeguro t")
    , @NamedQuery(name = "Tiposeguro.findById", query = "SELECT t FROM Tiposeguro t WHERE t.id = :id")
    , @NamedQuery(name = "Tiposeguro.findByNombre", query = "SELECT t FROM Tiposeguro t WHERE t.nombre = :nombre")})
public class Tiposeguro implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "NOMBRE")
    private String nombre;
    @JoinColumn(name = "POLIZASEGURO_IDPOLIZA", referencedColumnName = "IDPOLIZA")
    @ManyToOne(optional = false)
    private Polizaseguro polizaseguroIdpoliza;

    public Tiposeguro() {
    }

    public Tiposeguro(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Polizaseguro getPolizaseguroIdpoliza() {
        return polizaseguroIdpoliza;
    }

    public void setPolizaseguroIdpoliza(Polizaseguro polizaseguroIdpoliza) {
        this.polizaseguroIdpoliza = polizaseguroIdpoliza;
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
        if (!(object instanceof Tiposeguro)) {
            return false;
        }
        Tiposeguro other = (Tiposeguro) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tiposeguro[ id=" + id + " ]";
    }
    
}
