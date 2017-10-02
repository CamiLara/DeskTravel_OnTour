/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author camil
 */
@Embeddable
public class ActividadaportesPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "ACTIVIDAD")
    private BigInteger actividad;
    @Basic(optional = false)
    @Column(name = "CUENTAALUMNOS")
    private BigInteger cuentaalumnos;
    @Basic(optional = false)
    @Column(name = "APORTE")
    private BigInteger aporte;

    public ActividadaportesPK() {
    }

    public ActividadaportesPK(BigInteger actividad, BigInteger cuentaalumnos, BigInteger aporte) {
        this.actividad = actividad;
        this.cuentaalumnos = cuentaalumnos;
        this.aporte = aporte;
    }

    public BigInteger getActividad() {
        return actividad;
    }

    public void setActividad(BigInteger actividad) {
        this.actividad = actividad;
    }

    public BigInteger getCuentaalumnos() {
        return cuentaalumnos;
    }

    public void setCuentaalumnos(BigInteger cuentaalumnos) {
        this.cuentaalumnos = cuentaalumnos;
    }

    public BigInteger getAporte() {
        return aporte;
    }

    public void setAporte(BigInteger aporte) {
        this.aporte = aporte;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actividad != null ? actividad.hashCode() : 0);
        hash += (cuentaalumnos != null ? cuentaalumnos.hashCode() : 0);
        hash += (aporte != null ? aporte.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActividadaportesPK)) {
            return false;
        }
        ActividadaportesPK other = (ActividadaportesPK) object;
        if ((this.actividad == null && other.actividad != null) || (this.actividad != null && !this.actividad.equals(other.actividad))) {
            return false;
        }
        if ((this.cuentaalumnos == null && other.cuentaalumnos != null) || (this.cuentaalumnos != null && !this.cuentaalumnos.equals(other.cuentaalumnos))) {
            return false;
        }
        if ((this.aporte == null && other.aporte != null) || (this.aporte != null && !this.aporte.equals(other.aporte))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.ActividadaportesPK[ actividad=" + actividad + ", cuentaalumnos=" + cuentaalumnos + ", aporte=" + aporte + " ]";
    }
    
}
