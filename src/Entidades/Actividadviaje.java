/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "ACTIVIDADVIAJE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividadviaje.findAll", query = "SELECT a FROM Actividadviaje a")
    , @NamedQuery(name = "Actividadviaje.findByIdactividadviaje", query = "SELECT a FROM Actividadviaje a WHERE a.idactividadviaje = :idactividadviaje")
    , @NamedQuery(name = "Actividadviaje.findByNombre", query = "SELECT a FROM Actividadviaje a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Actividadviaje.findByDescripcion", query = "SELECT a FROM Actividadviaje a WHERE a.descripcion = :descripcion")
    , @NamedQuery(name = "Actividadviaje.findByFechainicio", query = "SELECT a FROM Actividadviaje a WHERE a.fechainicio = :fechainicio")
    , @NamedQuery(name = "Actividadviaje.findByFechatermino", query = "SELECT a FROM Actividadviaje a WHERE a.fechatermino = :fechatermino")})
public class Actividadviaje implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDACTIVIDADVIAJE")
    private BigDecimal idactividadviaje;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @Column(name = "FECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Column(name = "FECHATERMINO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechatermino;
    @JoinColumn(name = "TIPOACTIVIDADVIAJE", referencedColumnName = "IDTIPOACTIVIDADVIAJE")
    @ManyToOne(optional = false)
    private Tipoactividadviaje tipoactividadviaje;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actividadviaje1")
    private List<Itinerario> itinerarioList;

    public Actividadviaje() {
    }

    public Actividadviaje(BigDecimal idactividadviaje) {
        this.idactividadviaje = idactividadviaje;
    }

    public BigDecimal getIdactividadviaje() {
        return idactividadviaje;
    }

    public void setIdactividadviaje(BigDecimal idactividadviaje) {
        this.idactividadviaje = idactividadviaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public Tipoactividadviaje getTipoactividadviaje() {
        return tipoactividadviaje;
    }

    public void setTipoactividadviaje(Tipoactividadviaje tipoactividadviaje) {
        this.tipoactividadviaje = tipoactividadviaje;
    }

    @XmlTransient
    public List<Itinerario> getItinerarioList() {
        return itinerarioList;
    }

    public void setItinerarioList(List<Itinerario> itinerarioList) {
        this.itinerarioList = itinerarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idactividadviaje != null ? idactividadviaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividadviaje)) {
            return false;
        }
        Actividadviaje other = (Actividadviaje) object;
        if ((this.idactividadviaje == null && other.idactividadviaje != null) || (this.idactividadviaje != null && !this.idactividadviaje.equals(other.idactividadviaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Actividadviaje[ idactividadviaje=" + idactividadviaje + " ]";
    }
    
}
