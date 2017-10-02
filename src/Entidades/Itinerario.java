/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "ITINERARIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Itinerario.findAll", query = "SELECT i FROM Itinerario i")
    , @NamedQuery(name = "Itinerario.findByDestino", query = "SELECT i FROM Itinerario i WHERE i.itinerarioPK.destino = :destino")
    , @NamedQuery(name = "Itinerario.findByOrigen", query = "SELECT i FROM Itinerario i WHERE i.itinerarioPK.origen = :origen")
    , @NamedQuery(name = "Itinerario.findByActividadviaje", query = "SELECT i FROM Itinerario i WHERE i.itinerarioPK.actividadviaje = :actividadviaje")
    , @NamedQuery(name = "Itinerario.findByFechainicio", query = "SELECT i FROM Itinerario i WHERE i.fechainicio = :fechainicio")
    , @NamedQuery(name = "Itinerario.findByFechatermino", query = "SELECT i FROM Itinerario i WHERE i.fechatermino = :fechatermino")})
public class Itinerario implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ItinerarioPK itinerarioPK;
    @Column(name = "FECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Column(name = "FECHATERMINO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechatermino;
    @JoinColumn(name = "ACTIVIDADVIAJE", referencedColumnName = "IDACTIVIDADVIAJE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Actividadviaje actividadviaje1;
    @JoinColumn(name = "CONTRATO", referencedColumnName = "IDCONTRATO")
    @ManyToOne(optional = false)
    private Contrato contrato;
    @JoinColumn(name = "DESTINO", referencedColumnName = "IDDESTINO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Destino destino1;
    @JoinColumn(name = "ORIGEN", referencedColumnName = "IDORIGEN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Origen origen1;

    public Itinerario() {
    }

    public Itinerario(ItinerarioPK itinerarioPK) {
        this.itinerarioPK = itinerarioPK;
    }

    public Itinerario(BigInteger destino, BigInteger origen, BigInteger actividadviaje) {
        this.itinerarioPK = new ItinerarioPK(destino, origen, actividadviaje);
    }

    public ItinerarioPK getItinerarioPK() {
        return itinerarioPK;
    }

    public void setItinerarioPK(ItinerarioPK itinerarioPK) {
        this.itinerarioPK = itinerarioPK;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechatermino() {
        return fechatermino;
    }

    public void setFechatermino(Date fechatermino) {
        this.fechatermino = fechatermino;
    }

    public Actividadviaje getActividadviaje1() {
        return actividadviaje1;
    }

    public void setActividadviaje1(Actividadviaje actividadviaje1) {
        this.actividadviaje1 = actividadviaje1;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    public Destino getDestino1() {
        return destino1;
    }

    public void setDestino1(Destino destino1) {
        this.destino1 = destino1;
    }

    public Origen getOrigen1() {
        return origen1;
    }

    public void setOrigen1(Origen origen1) {
        this.origen1 = origen1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itinerarioPK != null ? itinerarioPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itinerario)) {
            return false;
        }
        Itinerario other = (Itinerario) object;
        if ((this.itinerarioPK == null && other.itinerarioPK != null) || (this.itinerarioPK != null && !this.itinerarioPK.equals(other.itinerarioPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Itinerario[ itinerarioPK=" + itinerarioPK + " ]";
    }
    
}
