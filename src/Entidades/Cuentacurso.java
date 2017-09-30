/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "CUENTACURSO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuentacurso.findAll", query = "SELECT c FROM Cuentacurso c")
    , @NamedQuery(name = "Cuentacurso.findByIdcuentacurso", query = "SELECT c FROM Cuentacurso c WHERE c.idcuentacurso = :idcuentacurso")})
public class Cuentacurso implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDCUENTACURSO")
    private BigDecimal idcuentacurso;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "cuentacursoIdcuentacurso")
    private Curso curso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuentacursoIdcuentacurso")
    private Collection<Pago> pagoCollection;

    public Cuentacurso() {
    }

    public Cuentacurso(BigDecimal idcuentacurso) {
        this.idcuentacurso = idcuentacurso;
    }

    public BigDecimal getIdcuentacurso() {
        return idcuentacurso;
    }

    public void setIdcuentacurso(BigDecimal idcuentacurso) {
        this.idcuentacurso = idcuentacurso;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @XmlTransient
    public Collection<Pago> getPagoCollection() {
        return pagoCollection;
    }

    public void setPagoCollection(Collection<Pago> pagoCollection) {
        this.pagoCollection = pagoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcuentacurso != null ? idcuentacurso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentacurso)) {
            return false;
        }
        Cuentacurso other = (Cuentacurso) object;
        if ((this.idcuentacurso == null && other.idcuentacurso != null) || (this.idcuentacurso != null && !this.idcuentacurso.equals(other.idcuentacurso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Cuentacurso[ idcuentacurso=" + idcuentacurso + " ]";
    }
    
}
