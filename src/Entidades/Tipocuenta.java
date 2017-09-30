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
@Table(name = "TIPOCUENTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipocuenta.findAll", query = "SELECT t FROM Tipocuenta t")
    , @NamedQuery(name = "Tipocuenta.findByIdtipocuenta", query = "SELECT t FROM Tipocuenta t WHERE t.idtipocuenta = :idtipocuenta")
    , @NamedQuery(name = "Tipocuenta.findByNombre", query = "SELECT t FROM Tipocuenta t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tipocuenta.findByCuentaalumnoIdcuentaalumnos", query = "SELECT t FROM Tipocuenta t WHERE t.cuentaalumnoIdcuentaalumnos = :cuentaalumnoIdcuentaalumnos")})
public class Tipocuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDTIPOCUENTA")
    private BigDecimal idtipocuenta;
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "CUENTAALUMNO_IDCUENTAALUMNOS")
    private BigInteger cuentaalumnoIdcuentaalumnos;

    public Tipocuenta() {
    }

    public Tipocuenta(BigDecimal idtipocuenta) {
        this.idtipocuenta = idtipocuenta;
    }

    public Tipocuenta(BigDecimal idtipocuenta, BigInteger cuentaalumnoIdcuentaalumnos) {
        this.idtipocuenta = idtipocuenta;
        this.cuentaalumnoIdcuentaalumnos = cuentaalumnoIdcuentaalumnos;
    }

    public BigDecimal getIdtipocuenta() {
        return idtipocuenta;
    }

    public void setIdtipocuenta(BigDecimal idtipocuenta) {
        this.idtipocuenta = idtipocuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        hash += (idtipocuenta != null ? idtipocuenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocuenta)) {
            return false;
        }
        Tipocuenta other = (Tipocuenta) object;
        if ((this.idtipocuenta == null && other.idtipocuenta != null) || (this.idtipocuenta != null && !this.idtipocuenta.equals(other.idtipocuenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tipocuenta[ idtipocuenta=" + idtipocuenta + " ]";
    }
    
}
