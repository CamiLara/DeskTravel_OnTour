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
@Table(name = "DESTINO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Destino.findAll", query = "SELECT d FROM Destino d")
    , @NamedQuery(name = "Destino.findByIddestino", query = "SELECT d FROM Destino d WHERE d.iddestino = :iddestino")
    , @NamedQuery(name = "Destino.findByNombre", query = "SELECT d FROM Destino d WHERE d.nombre = :nombre")})
public class Destino implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDDESTINO")
    private BigDecimal iddestino;
    @Column(name = "NOMBRE")
    private String nombre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "destino1")
    private List<Itinerario> itinerarioList;
    @JoinColumn(name = "PAIS", referencedColumnName = "IDPAIS")
    @ManyToOne(optional = false)
    private Pais pais;

    public Destino() {
    }

    public Destino(BigDecimal iddestino) {
        this.iddestino = iddestino;
    }

    public BigDecimal getIddestino() {
        return iddestino;
    }

    public void setIddestino(BigDecimal iddestino) {
        this.iddestino = iddestino;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @XmlTransient
    public List<Itinerario> getItinerarioList() {
        return itinerarioList;
    }

    public void setItinerarioList(List<Itinerario> itinerarioList) {
        this.itinerarioList = itinerarioList;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iddestino != null ? iddestino.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Destino)) {
            return false;
        }
        Destino other = (Destino) object;
        if ((this.iddestino == null && other.iddestino != null) || (this.iddestino != null && !this.iddestino.equals(other.iddestino))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Destino[ iddestino=" + iddestino + " ]";
    }
    
}
