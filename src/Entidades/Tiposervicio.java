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
@Table(name = "TIPOSERVICIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposervicio.findAll", query = "SELECT t FROM Tiposervicio t")
    , @NamedQuery(name = "Tiposervicio.findByIdtiposervicio", query = "SELECT t FROM Tiposervicio t WHERE t.idtiposervicio = :idtiposervicio")
    , @NamedQuery(name = "Tiposervicio.findByNombre", query = "SELECT t FROM Tiposervicio t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tiposervicio.findByDescripcion", query = "SELECT t FROM Tiposervicio t WHERE t.descripcion = :descripcion")})
public class Tiposervicio implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDTIPOSERVICIO")
    private BigDecimal idtiposervicio;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tiposervicio")
    private List<Servicio> servicioList;

    public Tiposervicio() {
    }

    public Tiposervicio(BigDecimal idtiposervicio) {
        this.idtiposervicio = idtiposervicio;
    }

    public BigDecimal getIdtiposervicio() {
        return idtiposervicio;
    }

    public void setIdtiposervicio(BigDecimal idtiposervicio) {
        this.idtiposervicio = idtiposervicio;
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
    public List<Servicio> getServicioList() {
        return servicioList;
    }

    public void setServicioList(List<Servicio> servicioList) {
        this.servicioList = servicioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtiposervicio != null ? idtiposervicio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposervicio)) {
            return false;
        }
        Tiposervicio other = (Tiposervicio) object;
        if ((this.idtiposervicio == null && other.idtiposervicio != null) || (this.idtiposervicio != null && !this.idtiposervicio.equals(other.idtiposervicio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tiposervicio[ idtiposervicio=" + idtiposervicio + " ]";
    }
    
}
