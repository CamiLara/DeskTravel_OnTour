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
public class ItinerarioPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "DESTINO")
    private BigInteger destino;
    @Basic(optional = false)
    @Column(name = "ORIGEN")
    private BigInteger origen;
    @Basic(optional = false)
    @Column(name = "ACTIVIDADVIAJE")
    private BigInteger actividadviaje;

    public ItinerarioPK() {
    }

    public ItinerarioPK(BigInteger destino, BigInteger origen, BigInteger actividadviaje) {
        this.destino = destino;
        this.origen = origen;
        this.actividadviaje = actividadviaje;
    }

    public BigInteger getDestino() {
        return destino;
    }

    public void setDestino(BigInteger destino) {
        this.destino = destino;
    }

    public BigInteger getOrigen() {
        return origen;
    }

    public void setOrigen(BigInteger origen) {
        this.origen = origen;
    }

    public BigInteger getActividadviaje() {
        return actividadviaje;
    }

    public void setActividadviaje(BigInteger actividadviaje) {
        this.actividadviaje = actividadviaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (destino != null ? destino.hashCode() : 0);
        hash += (origen != null ? origen.hashCode() : 0);
        hash += (actividadviaje != null ? actividadviaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ItinerarioPK)) {
            return false;
        }
        ItinerarioPK other = (ItinerarioPK) object;
        if ((this.destino == null && other.destino != null) || (this.destino != null && !this.destino.equals(other.destino))) {
            return false;
        }
        if ((this.origen == null && other.origen != null) || (this.origen != null && !this.origen.equals(other.origen))) {
            return false;
        }
        if ((this.actividadviaje == null && other.actividadviaje != null) || (this.actividadviaje != null && !this.actividadviaje.equals(other.actividadviaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.ItinerarioPK[ destino=" + destino + ", origen=" + origen + ", actividadviaje=" + actividadviaje + " ]";
    }
    
}
