/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "TIPOACTIVIDADVIAJE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoactividadviaje.findAll", query = "SELECT t FROM Tipoactividadviaje t")
    , @NamedQuery(name = "Tipoactividadviaje.findByIdtipoactividadviaje", query = "SELECT t FROM Tipoactividadviaje t WHERE t.idtipoactividadviaje = :idtipoactividadviaje")
    , @NamedQuery(name = "Tipoactividadviaje.findByNombre", query = "SELECT t FROM Tipoactividadviaje t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tipoactividadviaje.findByDescripcion", query = "SELECT t FROM Tipoactividadviaje t WHERE t.descripcion = :descripcion")})
public class Tipoactividadviaje implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDTIPOACTIVIDADVIAJE")
    private BigDecimal idtipoactividadviaje;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoactividadviaje")
    private List<Actividadviaje> actividadviajeList;

    public Tipoactividadviaje() {
    }

    public Tipoactividadviaje(BigDecimal idtipoactividadviaje) {
        this.idtipoactividadviaje = idtipoactividadviaje;
    }

    public BigDecimal getIdtipoactividadviaje() {
        return idtipoactividadviaje;
    }

    public void setIdtipoactividadviaje(BigDecimal idtipoactividadviaje) {
        this.idtipoactividadviaje = idtipoactividadviaje;
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

    @XmlTransient
    public List<Actividadviaje> getActividadviajeList() {
        return actividadviajeList;
    }

    public void setActividadviajeList(List<Actividadviaje> actividadviajeList) {
        this.actividadviajeList = actividadviajeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipoactividadviaje != null ? idtipoactividadviaje.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoactividadviaje)) {
            return false;
        }
        Tipoactividadviaje other = (Tipoactividadviaje) object;
        if ((this.idtipoactividadviaje == null && other.idtipoactividadviaje != null) || (this.idtipoactividadviaje != null && !this.idtipoactividadviaje.equals(other.idtipoactividadviaje))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tipoactividadviaje[ idtipoactividadviaje=" + idtipoactividadviaje + " ]";
    }
    
}
