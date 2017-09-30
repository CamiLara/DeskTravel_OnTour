/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigInteger;
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
@Table(name = "DESTINOACTIVIDADVIAJE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Destinoactividadviaje.findAll", query = "SELECT d FROM Destinoactividadviaje d")
    , @NamedQuery(name = "Destinoactividadviaje.findByDestinoIddestino", query = "SELECT d FROM Destinoactividadviaje d WHERE d.destinoactividadviajePK.destinoIddestino = :destinoIddestino")
    , @NamedQuery(name = "Destinoactividadviaje.findByActividadviajeIdactividadviaje", query = "SELECT d FROM Destinoactividadviaje d WHERE d.destinoactividadviajePK.actividadviajeIdactividadviaje = :actividadviajeIdactividadviaje")})
public class Destinoactividadviaje implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected DestinoactividadviajePK destinoactividadviajePK;
    @JoinColumn(name = "ACTIVIDADVIAJE_IDACTIVIDADVIAJE", referencedColumnName = "IDACTIVIDADVIAJE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Actividadviaje actividadviaje;

    public Destinoactividadviaje() {
    }

    public Destinoactividadviaje(DestinoactividadviajePK destinoactividadviajePK) {
        this.destinoactividadviajePK = destinoactividadviajePK;
    }

    public Destinoactividadviaje(BigInteger destinoIddestino, BigInteger actividadviajeIdactividadviaje) {
        this.destinoactividadviajePK = new DestinoactividadviajePK(destinoIddestino, actividadviajeIdactividadviaje);
    }

    public DestinoactividadviajePK getDestinoactividadviajePK() {
        return destinoactividadviajePK;
    }

    public void setDestinoactividadviajePK(DestinoactividadviajePK destinoactividadviajePK) {
        this.destinoactividadviajePK = destinoactividadviajePK;
    }

    public Actividadviaje getActividadviaje() {
        return actividadviaje;
    }

    public void setActividadviaje(Actividadviaje actividadviaje) {
        this.actividadviaje = actividadviaje;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (destinoactividadviajePK != null ? destinoactividadviajePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Destinoactividadviaje)) {
            return false;
        }
        Destinoactividadviaje other = (Destinoactividadviaje) object;
        if ((this.destinoactividadviajePK == null && other.destinoactividadviajePK != null) || (this.destinoactividadviajePK != null && !this.destinoactividadviajePK.equals(other.destinoactividadviajePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Destinoactividadviaje[ destinoactividadviajePK=" + destinoactividadviajePK + " ]";
    }
    
}
