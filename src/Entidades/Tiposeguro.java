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
@Table(name = "TIPOSEGURO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tiposeguro.findAll", query = "SELECT t FROM Tiposeguro t")
    , @NamedQuery(name = "Tiposeguro.findByIdtiposeguro", query = "SELECT t FROM Tiposeguro t WHERE t.idtiposeguro = :idtiposeguro")
    , @NamedQuery(name = "Tiposeguro.findByNombre", query = "SELECT t FROM Tiposeguro t WHERE t.nombre = :nombre")
    , @NamedQuery(name = "Tiposeguro.findByDescripcion", query = "SELECT t FROM Tiposeguro t WHERE t.descripcion = :descripcion")})
public class Tiposeguro implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDTIPOSEGURO")
    private BigDecimal idtiposeguro;
    @Column(name = "NOMBRE")
    private String nombre;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tiposeguro")
    private List<Polizaseguro> polizaseguroList;

    public Tiposeguro() {
    }

    public Tiposeguro(BigDecimal idtiposeguro) {
        this.idtiposeguro = idtiposeguro;
    }

    public BigDecimal getIdtiposeguro() {
        return idtiposeguro;
    }

    public void setIdtiposeguro(BigDecimal idtiposeguro) {
        this.idtiposeguro = idtiposeguro;
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
    public List<Polizaseguro> getPolizaseguroList() {
        return polizaseguroList;
    }

    public void setPolizaseguroList(List<Polizaseguro> polizaseguroList) {
        this.polizaseguroList = polizaseguroList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtiposeguro != null ? idtiposeguro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tiposeguro)) {
            return false;
        }
        Tiposeguro other = (Tiposeguro) object;
        if ((this.idtiposeguro == null && other.idtiposeguro != null) || (this.idtiposeguro != null && !this.idtiposeguro.equals(other.idtiposeguro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tiposeguro[ idtiposeguro=" + idtiposeguro + " ]";
    }
    
}
