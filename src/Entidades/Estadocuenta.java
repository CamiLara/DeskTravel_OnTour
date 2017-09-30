/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
    , @NamedQuery(name = "Estadocuenta.findByCuentaalumnoIdcuentaalumnos", query = "SELECT e FROM Estadocuenta e WHERE e.cuentaalumnoIdcuentaalumnos = :cuentaalumnoIdcuentaalumnos")})
public class Estadocuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "CUENTAALUMNO_IDCUENTAALUMNOS")
    private BigInteger cuentaalumnoIdcuentaalumnos;

    public Estadocuenta() {
    }

    public Estadocuenta(BigDecimal id) {
        this.id = id;
    }

    public Estadocuenta(BigDecimal id, BigInteger cuentaalumnoIdcuentaalumnos) {
        this.id = id;
        this.cuentaalumnoIdcuentaalumnos = cuentaalumnoIdcuentaalumnos;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public BigInteger getCuentaalumnoIdcuentaalumnos() {
        return cuentaalumnoIdcuentaalumnos;
    }

    public void setCuentaalumnoIdcuentaalumnos(BigInteger cuentaalumnoIdcuentaalumnos) {
        this.cuentaalumnoIdcuentaalumnos = cuentaalumnoIdcuentaalumnos;
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
