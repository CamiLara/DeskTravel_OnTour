/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "CURSO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Curso.findAll", query = "SELECT c FROM Curso c")
    , @NamedQuery(name = "Curso.findByIdcurso", query = "SELECT c FROM Curso c WHERE c.cursoPK.idcurso = :idcurso")
    , @NamedQuery(name = "Curso.findByNombre", query = "SELECT c FROM Curso c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Curso.findByActividadIdactividad", query = "SELECT c FROM Curso c WHERE c.cursoPK.actividadIdactividad = :actividadIdactividad")})
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CursoPK cursoPK;
    @Column(name = "NOMBRE")
    private String nombre;
    @ManyToMany(mappedBy = "cursoCollection")
    private Collection<Alumno> alumnoCollection;
    @JoinColumn(name = "ACTIVIDAD_IDACTIVIDAD", referencedColumnName = "IDACTIVIDAD", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Actividad actividad;
    @JoinColumn(name = "CUENTACURSO_IDCUENTACURSO", referencedColumnName = "IDCUENTACURSO")
    @OneToOne(optional = false)
    private Cuentacurso cuentacursoIdcuentacurso;
    @OneToMany(mappedBy = "curso")
    private Collection<Colegio> colegioCollection;

    public Curso() {
    }

    public Curso(CursoPK cursoPK) {
        this.cursoPK = cursoPK;
    }

    public Curso(BigInteger idcurso, BigInteger actividadIdactividad) {
        this.cursoPK = new CursoPK(idcurso, actividadIdactividad);
    }

    public CursoPK getCursoPK() {
        return cursoPK;
    }

    public void setCursoPK(CursoPK cursoPK) {
        this.cursoPK = cursoPK;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public Collection<Alumno> getAlumnoCollection() {
        return alumnoCollection;
    }

    public void setAlumnoCollection(Collection<Alumno> alumnoCollection) {
        this.alumnoCollection = alumnoCollection;
    }

    public Actividad getActividad() {
        return actividad;
    }

    public void setActividad(Actividad actividad) {
        this.actividad = actividad;
    }

    public Cuentacurso getCuentacursoIdcuentacurso() {
        return cuentacursoIdcuentacurso;
    }

    public void setCuentacursoIdcuentacurso(Cuentacurso cuentacursoIdcuentacurso) {
        this.cuentacursoIdcuentacurso = cuentacursoIdcuentacurso;
    }

    @XmlTransient
    public Collection<Colegio> getColegioCollection() {
        return colegioCollection;
    }

    public void setColegioCollection(Collection<Colegio> colegioCollection) {
        this.colegioCollection = colegioCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cursoPK != null ? cursoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Curso)) {
            return false;
        }
        Curso other = (Curso) object;
        if ((this.cursoPK == null && other.cursoPK != null) || (this.cursoPK != null && !this.cursoPK.equals(other.cursoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Curso[ cursoPK=" + cursoPK + " ]";
    }
    
}
