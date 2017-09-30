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
public class DestinoactividadviajePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "DESTINO_IDDESTINO")
    private BigInteger destinoIddestino;
    @Basic(optional = false)
    @Column(name = "ACTIVIDADVIAJE_IDACTIVIDADVIAJE")
    private BigInteger actividadviajeIdactividadviaje;

    public DestinoactividadviajePK() {
    }

    public DestinoactividadviajePK(BigInteger destinoIddestino, BigInteger actividadviajeIdactividadviaje) {
        this.destinoIddestino = destinoIddestino;
        this.actividadviajeIdactividadviaje = actividadviajeIdactividadviaje;
    }

    public BigInteger getDestinoIddestino() {
        return destinoIddestino;
    }

    public void setDestinoIddestino(BigInteger destinoIddestino) {
        this.destinoIddestino = destinoIddestino;
    }

    public BigInteger getActividadviajeIdactividadviaje() {
        return actividadviajeIdactividadviaje;
    }

    public void setActividadviajeIdactividadviaje(BigInteger actividadviajeIdactividadviaje) {
        this.actividadviajeIdactividadviaje = actividadviajeIdactividadviaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (destinoIddestino != null ? destinoIddestino.hashCode() : 0);
        hash += (actividadviajeIdactividadviaje != null ? actividadviajeIdactividadviaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DestinoactividadviajePK)) {
            return false;
        }
        DestinoactividadviajePK other = (DestinoactividadviajePK) object;
        if ((this.destinoIddestino == null && other.destinoIddestino != null) || (this.destinoIddestino != null && !this.destinoIddestino.equals(other.destinoIddestino))) {
            return false;
        }
        if ((this.actividadviajeIdactividadviaje == null && other.actividadviajeIdactividadviaje != null) || (this.actividadviajeIdactividadviaje != null && !this.actividadviajeIdactividadviaje.equals(other.actividadviajeIdactividadviaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.DestinoactividadviajePK[ destinoIddestino=" + destinoIddestino + ", actividadviajeIdactividadviaje=" + actividadviajeIdactividadviaje + " ]";
    }
    
}
