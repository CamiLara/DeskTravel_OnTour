/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
    , @NamedQuery(name = "Alumno.findByTelefono", query = "SELECT a FROM Alumno a WHERE a.telefono = :telefono")
    , @NamedQuery(name = "Alumno.findByCorreoelectronico", query = "SELECT a FROM Alumno a WHERE a.correoelectronico = :correoelectronico")})
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
    @Column(name = "TELEFONO")
    private BigInteger telefono;
    @Basic(optional = false)
    @Column(name = "CORREOELECTRONICO")
    private String correoelectronico;
    @JoinColumn(name = "APODERADO", referencedColumnName = "IDAPODERADO")
    @OneToOne(optional = false)
    private Apoderado apoderado;
    @JoinColumn(name = "CURSO", referencedColumnName = "IDCURSO")
    @ManyToOne(optional = false)
    private Curso curso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumno")
    private List<Contrato> contratoList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "alumno")
    private Cuentaalumno cuentaalumno;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumno")
    private List<Polizaseguro> polizaseguroList;

    public Alumno() {
    }

    public Alumno(BigDecimal idalumno) {
        this.idalumno = idalumno;
    }

    public Alumno(BigDecimal idalumno, String correoelectronico) {
        this.idalumno = idalumno;
        this.correoelectronico = correoelectronico;
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

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public Apoderado getApoderado() {
        return apoderado;
    }

    public void setApoderado(Apoderado apoderado) {
        this.apoderado = apoderado;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @XmlTransient
    public List<Contrato> getContratoList() {
        return contratoList;
    }

    public void setContratoList(List<Contrato> contratoList) {
        this.contratoList = contratoList;
    }

    public Cuentaalumno getCuentaalumno() {
        return cuentaalumno;
    }

    public void setCuentaalumno(Cuentaalumno cuentaalumno) {
        this.cuentaalumno = cuentaalumno;
    }

    @XmlTransient
    public List<Polizaseguro> getPolizaseguroList() {
        return polizaseguroList;
    }

    public void setPolizaseguroList(List<Polizaseguro> polizaseguroList) {
        this.polizaseguroList = polizaseguroList;
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
