/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "ACTIVIDADAPORTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividadaportes.findAll", query = "SELECT a FROM Actividadaportes a")
    , @NamedQuery(name = "Actividadaportes.findByActividad", query = "SELECT a FROM Actividadaportes a WHERE a.actividadaportesPK.actividad = :actividad")
    , @NamedQuery(name = "Actividadaportes.findByCuentaalumnos", query = "SELECT a FROM Actividadaportes a WHERE a.actividadaportesPK.cuentaalumnos = :cuentaalumnos")
    , @NamedQuery(name = "Actividadaportes.findByMonto", query = "SELECT a FROM Actividadaportes a WHERE a.monto = :monto")
    , @NamedQuery(name = "Actividadaportes.findByAporte", query = "SELECT a FROM Actividadaportes a WHERE a.actividadaportesPK.aporte = :aporte")})
public class Actividadaportes implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ActividadaportesPK actividadaportesPK;
    @Column(name = "MONTO")
    private BigInteger monto;
    @JoinColumn(name = "ACTIVIDAD", referencedColumnName = "IDACTIVIDAD", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Actividad actividad1;
    @JoinColumn(name = "CUENTAALUMNOS", referencedColumnName = "IDCUENTAALUMNOS", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Cuentaalumno cuentaalumno;

    public Actividadaportes() {
    }

    public Actividadaportes(ActividadaportesPK actividadaportesPK) {
        this.actividadaportesPK = actividadaportesPK;
    }

    public Actividadaportes(BigInteger actividad, BigInteger cuentaalumnos, BigInteger aporte) {
        this.actividadaportesPK = new ActividadaportesPK(actividad, cuentaalumnos, aporte);
    }

    public ActividadaportesPK getActividadaportesPK() {
        return actividadaportesPK;
    }

    public void setActividadaportesPK(ActividadaportesPK actividadaportesPK) {
        this.actividadaportesPK = actividadaportesPK;
    }

    public BigInteger getMonto() {
        return monto;
    }

    public void setMonto(BigInteger monto) {
        this.monto = monto;
    }

    public Actividad getActividad1() {
        return actividad1;
    }

    public void setActividad1(Actividad actividad1) {
        this.actividad1 = actividad1;
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
        hash += (actividadaportesPK != null ? actividadaportesPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividadaportes)) {
            return false;
        }
        Actividadaportes other = (Actividadaportes) object;
        if ((this.actividadaportesPK == null && other.actividadaportesPK != null) || (this.actividadaportesPK != null && !this.actividadaportesPK.equals(other.actividadaportesPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Actividadaportes[ actividadaportesPK=" + actividadaportesPK + " ]";
    }
    
}
