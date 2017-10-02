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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ACTIVIDAD")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Actividad.findAll", query = "SELECT a FROM Actividad a")
    , @NamedQuery(name = "Actividad.findByIdactividad", query = "SELECT a FROM Actividad a WHERE a.idactividad = :idactividad")})
public class Actividad implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDACTIVIDAD")
    private BigDecimal idactividad;
    @JoinColumn(name = "CURSO_IDCURSO", referencedColumnName = "IDCURSO")
    @ManyToOne(optional = false)
    private Curso cursoIdcurso;
    @JoinColumn(name = "TIPOACTIVIDAD", referencedColumnName = "IDTIPOACTIVIDAD")
    @ManyToOne(optional = false)
    private Tipoactividad tipoactividad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actividad1")
    private List<Actividadaportes> actividadaportesList;

    public Actividad() {
    }

    public Actividad(BigDecimal idactividad) {
        this.idactividad = idactividad;
    }

    public BigDecimal getIdactividad() {
        return idactividad;
    }

    public void setIdactividad(BigDecimal idactividad) {
        this.idactividad = idactividad;
    }

    public Curso getCursoIdcurso() {
        return cursoIdcurso;
    }

    public void setCursoIdcurso(Curso cursoIdcurso) {
        this.cursoIdcurso = cursoIdcurso;
    }

    public Tipoactividad getTipoactividad() {
        return tipoactividad;
    }

    public void setTipoactividad(Tipoactividad tipoactividad) {
        this.tipoactividad = tipoactividad;
    }

    @XmlTransient
    public List<Actividadaportes> getActividadaportesList() {
        return actividadaportesList;
    }

    public void setActividadaportesList(List<Actividadaportes> actividadaportesList) {
        this.actividadaportesList = actividadaportesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idactividad != null ? idactividad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Actividad)) {
            return false;
        }
        Actividad other = (Actividad) object;
        if ((this.idactividad == null && other.idactividad != null) || (this.idactividad != null && !this.idactividad.equals(other.idactividad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Actividad[ idactividad=" + idactividad + " ]";
    }
    
}
