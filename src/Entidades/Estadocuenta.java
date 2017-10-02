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
@Table(name = "ESTADOCUENTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Estadocuenta.findAll", query = "SELECT e FROM Estadocuenta e")
    , @NamedQuery(name = "Estadocuenta.findById", query = "SELECT e FROM Estadocuenta e WHERE e.id = :id")
    , @NamedQuery(name = "Estadocuenta.findByDetalle", query = "SELECT e FROM Estadocuenta e WHERE e.detalle = :detalle")})
public class Estadocuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Column(name = "DETALLE")
    private String detalle;
    @JoinColumn(name = "CUENTAALUMNO", referencedColumnName = "IDCUENTAALUMNOS")
    @ManyToOne(optional = false)
    private Cuentaalumno cuentaalumno;

    public Estadocuenta() {
    }

    public Estadocuenta(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public Cuentaalumno getCuentaalumno() {
        return cuentaalumno;
    }

    public void setCuentaalumno(Cuentaalumno cuentaalumno) {
        this.cuentaalumno = cuentaalumno;
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
        if (!(object instanceof Estadocuenta)) {
            return false;
        }
        Estadocuenta other = (Estadocuenta) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Estadocuenta[ id=" + id + " ]";
    }
    
}
