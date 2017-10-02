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
@Table(name = "ASEGURADORA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aseguradora.findAll", query = "SELECT a FROM Aseguradora a")
    , @NamedQuery(name = "Aseguradora.findByNombre", query = "SELECT a FROM Aseguradora a WHERE a.nombre = :nombre")
    , @NamedQuery(name = "Aseguradora.findByDireccion", query = "SELECT a FROM Aseguradora a WHERE a.direccion = :direccion")
    , @NamedQuery(name = "Aseguradora.findByAseguradora", query = "SELECT a FROM Aseguradora a WHERE a.aseguradora = :aseguradora")})
public class Aseguradora implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DIRECCION")
    private String direccion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ASEGURADORA")
    private BigDecimal aseguradora;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aseguradora")
    private List<Polizaseguro> polizaseguroList;

    public Aseguradora() {
    }

    public Aseguradora(BigDecimal aseguradora) {
        this.aseguradora = aseguradora;
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

    public BigDecimal getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(BigDecimal aseguradora) {
        this.aseguradora = aseguradora;
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
        hash += (aseguradora != null ? aseguradora.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aseguradora)) {
            return false;
        }
        Aseguradora other = (Aseguradora) object;
        if ((this.aseguradora == null && other.aseguradora != null) || (this.aseguradora != null && !this.aseguradora.equals(other.aseguradora))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Aseguradora[ aseguradora=" + aseguradora + " ]";
    }
    
}
