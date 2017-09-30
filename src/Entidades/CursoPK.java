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
public class CursoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IDCURSO")
    private BigInteger idcurso;
    @Basic(optional = false)
    @Column(name = "ACTIVIDAD_IDACTIVIDAD")
    private BigInteger actividadIdactividad;

    public CursoPK() {
    }

    public CursoPK(BigInteger idcurso, BigInteger actividadIdactividad) {
        this.idcurso = idcurso;
        this.actividadIdactividad = actividadIdactividad;
    }

    public BigInteger getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(BigInteger idcurso) {
        this.idcurso = idcurso;
    }

    public BigInteger getActividadIdactividad() {
        return actividadIdactividad;
    }

    public void setActividadIdactividad(BigInteger actividadIdactividad) {
        this.actividadIdactividad = actividadIdactividad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcurso != null ? idcurso.hashCode() : 0);
        hash += (actividadIdactividad != null ? actividadIdactividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CursoPK)) {
            return false;
        }
        CursoPK other = (CursoPK) object;
        if ((this.idcurso == null && other.idcurso != null) || (this.idcurso != null && !this.idcurso.equals(other.idcurso))) {
            return false;
        }
        if ((this.actividadIdactividad == null && other.actividadIdactividad != null) || (this.actividadIdactividad != null && !this.actividadIdactividad.equals(other.actividadIdactividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.CursoPK[ idcurso=" + idcurso + ", actividadIdactividad=" + actividadIdactividad + " ]";
    }
    
}
