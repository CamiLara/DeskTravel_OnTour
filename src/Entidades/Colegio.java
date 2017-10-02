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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "COLEGIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colegio.findAll", query = "SELECT c FROM Colegio c")
    , @NamedQuery(name = "Colegio.findByIdcolegio", query = "SELECT c FROM Colegio c WHERE c.idcolegio = :idcolegio")
    , @NamedQuery(name = "Colegio.findByNombre", query = "SELECT c FROM Colegio c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Colegio.findByDireccion", query = "SELECT c FROM Colegio c WHERE c.direccion = :direccion")
    , @NamedQuery(name = "Colegio.findByTelefono", query = "SELECT c FROM Colegio c WHERE c.telefono = :telefono")})
public class Colegio implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDCOLEGIO")
    private BigDecimal idcolegio;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DIRECCION")
    private String direccion;
    @Column(name = "TELEFONO")
    private BigInteger telefono;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "colegio")
    private List<Curso> cursoList;
    @JoinColumn(name = "COMUNA_IDCOMUNA", referencedColumnName = "IDCOMUNA")
    @ManyToOne(optional = false)
    private Comuna comunaIdcomuna;

    public Colegio() {
    }

    public Colegio(BigDecimal idcolegio) {
        this.idcolegio = idcolegio;
    }

    public BigDecimal getIdcolegio() {
        return idcolegio;
    }

    public void setIdcolegio(BigDecimal idcolegio) {
        this.idcolegio = idcolegio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    @XmlTransient
    public List<Curso> getCursoList() {
        return cursoList;
    }

    public void setCursoList(List<Curso> cursoList) {
        this.cursoList = cursoList;
    }

    public Comuna getComunaIdcomuna() {
        return comunaIdcomuna;
    }

    public void setComunaIdcomuna(Comuna comunaIdcomuna) {
        this.comunaIdcomuna = comunaIdcomuna;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcolegio != null ? idcolegio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colegio)) {
            return false;
        }
        Colegio other = (Colegio) object;
        if ((this.idcolegio == null && other.idcolegio != null) || (this.idcolegio != null && !this.idcolegio.equals(other.idcolegio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Colegio[ idcolegio=" + idcolegio + " ]";
    }
    
}
