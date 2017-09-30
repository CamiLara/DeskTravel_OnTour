/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "ALUMNO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Alumno.findAll", query = "SELECT a FROM Alumno a")
    , @NamedQuery(name = "Alumno.findByIdalumno", query = "SELECT a FROM Alumno a WHERE a.idalumno = :idalumno")
    , @NamedQuery(name = "Alumno.findByNombre", query = "SELECT a FROM Alumno a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Alumno.findByDirecci\u00f3n", query = "SELECT a FROM Alumno a WHERE a.direcci\u00f3n = :direcci\u00f3n")
    , @NamedQuery(name = "Alumno.findByCuentaalumnoIdcuentaalumnos", query = "SELECT a FROM Alumno a WHERE a.cuentaalumnoIdcuentaalumnos = :cuentaalumnoIdcuentaalumnos")
    , @NamedQuery(name = "Alumno.findByTelefono", query = "SELECT a FROM Alumno a WHERE a.telefono = :telefono")})
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDALUMNO")
    private BigDecimal idalumno;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DIRECCI\u00d3N")
    private String dirección;
    @Basic(optional = false)
    @Column(name = "CUENTAALUMNO_IDCUENTAALUMNOS")
    private BigInteger cuentaalumnoIdcuentaalumnos;
    @Column(name = "TELEFONO")
    private BigInteger telefono;
    @JoinTable(name = "RELATION_39", joinColumns = {
        @JoinColumn(name = "ALUMNO_IDALUMNO", referencedColumnName = "IDALUMNO")}, inverseJoinColumns = {
        @JoinColumn(name = "CURSO_IDCURSO", referencedColumnName = "IDCURSO")
        , @JoinColumn(name = "CURSO_ACTIVIDAD_IDACTIVIDAD", referencedColumnName = "ACTIVIDAD_IDACTIVIDAD")})
    @ManyToMany
    private Collection<Curso> cursoCollection;
    @JoinColumn(name = "APODERADO_IDAPODERADO", referencedColumnName = "IDAPODERADO")
    @OneToOne(optional = false)
    private Apoderado apoderadoIdapoderado;

    public Alumno() {
    }

    public Alumno(BigDecimal idalumno) {
        this.idalumno = idalumno;
    }

    public Alumno(BigDecimal idalumno, BigInteger cuentaalumnoIdcuentaalumnos) {
        this.idalumno = idalumno;
        this.cuentaalumnoIdcuentaalumnos = cuentaalumnoIdcuentaalumnos;
    }

    public BigDecimal getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(BigDecimal idalumno) {
        this.idalumno = idalumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public BigInteger getCuentaalumnoIdcuentaalumnos() {
        return cuentaalumnoIdcuentaalumnos;
    }

    public void setCuentaalumnoIdcuentaalumnos(BigInteger cuentaalumnoIdcuentaalumnos) {
        this.cuentaalumnoIdcuentaalumnos = cuentaalumnoIdcuentaalumnos;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    @XmlTransient
    public Collection<Curso> getCursoCollection() {
        return cursoCollection;
    }

    public void setCursoCollection(Collection<Curso> cursoCollection) {
        this.cursoCollection = cursoCollection;
    }

    public Apoderado getApoderadoIdapoderado() {
        return apoderadoIdapoderado;
    }

    public void setApoderadoIdapoderado(Apoderado apoderadoIdapoderado) {
        this.apoderadoIdapoderado = apoderadoIdapoderado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idalumno != null ? idalumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.idalumno == null && other.idalumno != null) || (this.idalumno != null && !this.idalumno.equals(other.idalumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Alumno[ idalumno=" + idalumno + " ]";
    }
    
}
