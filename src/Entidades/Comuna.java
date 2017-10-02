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
@Table(name = "COMUNA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Comuna.findAll", query = "SELECT c FROM Comuna c")
    , @NamedQuery(name = "Comuna.findByIdcomuna", query = "SELECT c FROM Comuna c WHERE c.idcomuna = :idcomuna")
    , @NamedQuery(name = "Comuna.findByNombre", query = "SELECT c FROM Comuna c WHERE c.nombre = :nombre")})
public class Comuna implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDCOMUNA")
    private BigDecimal idcomuna;
    @Column(name = "NOMBRE")
    private String nombre;
    @JoinColumn(name = "REGION", referencedColumnName = "IDREGION")
    @ManyToOne(optional = false)
    private Region region;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "comunaIdcomuna")
    private List<Colegio> colegioList;

    public Comuna() {
    }

    public Comuna(BigDecimal idcomuna) {
        this.idcomuna = idcomuna;
    }

    public BigDecimal getIdcomuna() {
        return idcomuna;
    }

    public void setIdcomuna(BigDecimal idcomuna) {
        this.idcomuna = idcomuna;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    @XmlTransient
    public List<Colegio> getColegioList() {
        return colegioList;
    }

    public void setColegioList(List<Colegio> colegioList) {
        this.colegioList = colegioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcomuna != null ? idcomuna.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Comuna)) {
            return false;
        }
        Comuna other = (Comuna) object;
        if ((this.idcomuna == null && other.idcomuna != null) || (this.idcomuna != null && !this.idcomuna.equals(other.idcomuna))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Comuna[ idcomuna=" + idcomuna + " ]";
    }
    
}
