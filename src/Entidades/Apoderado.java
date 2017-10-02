/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "APODERADO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Apoderado.findAll", query = "SELECT a FROM Apoderado a")
    , @NamedQuery(name = "Apoderado.findByIdapoderado", query = "SELECT a FROM Apoderado a WHERE a.idapoderado = :idapoderado")
    , @NamedQuery(name = "Apoderado.findByNombre", query = "SELECT a FROM Apoderado a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Apoderado.findByRut", query = "SELECT a FROM Apoderado a WHERE a.rut = :rut")
    , @NamedQuery(name = "Apoderado.findByDireccion", query = "SELECT a FROM Apoderado a WHERE a.direccion = :direccion")
    , @NamedQuery(name = "Apoderado.findByTelefono", query = "SELECT a FROM Apoderado a WHERE a.telefono = :telefono")
    , @NamedQuery(name = "Apoderado.findByCelular", query = "SELECT a FROM Apoderado a WHERE a.celular = :celular")})
public class Apoderado implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDAPODERADO")
    private BigDecimal idapoderado;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "RUT")
    private String rut;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "TELEFONO")
    private BigInteger telefono;
    @Column(name = "CELULAR")
    private String celular;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "apoderado")
    private Alumno alumno;

    public Apoderado() {
    }

    public Apoderado(BigDecimal idapoderado) {
        this.idapoderado = idapoderado;
    }

    public Apoderado(BigDecimal idapoderado, String nombre) {
        this.idapoderado = idapoderado;
        this.nombre = nombre;
    }

    public BigDecimal getIdapoderado() {
        return idapoderado;
    }

    public void setIdapoderado(BigDecimal idapoderado) {
        this.idapoderado = idapoderado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public BigInteger getTelefono() {
        return telefono;
    }

    public void setTelefono(BigInteger telefono) {
        this.telefono = telefono;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idapoderado != null ? idapoderado.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apoderado)) {
            return false;
        }
        Apoderado other = (Apoderado) object;
        if ((this.idapoderado == null && other.idapoderado != null) || (this.idapoderado != null && !this.idapoderado.equals(other.idapoderado))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Apoderado[ idapoderado=" + idapoderado + " ]";
    }
    
}
