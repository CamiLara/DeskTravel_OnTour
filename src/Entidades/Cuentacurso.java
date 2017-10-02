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
@Table(name = "CUENTACURSO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuentacurso.findAll", query = "SELECT c FROM Cuentacurso c")
    , @NamedQuery(name = "Cuentacurso.findByIdcuentacurso", query = "SELECT c FROM Cuentacurso c WHERE c.idcuentacurso = :idcuentacurso")
    , @NamedQuery(name = "Cuentacurso.findBySaldo", query = "SELECT c FROM Cuentacurso c WHERE c.saldo = :saldo")})
public class Cuentacurso implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDCUENTACURSO")
    private BigDecimal idcuentacurso;
    @Column(name = "SALDO")
    private BigInteger saldo;
    @JoinColumn(name = "CURSO", referencedColumnName = "IDCURSO")
    @ManyToOne(optional = false)
    private Curso curso;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuentacurso")
    private List<Pago> pagoList;

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

    public BigInteger getSaldo() {
        return saldo;
    }

    public void setSaldo(BigInteger saldo) {
        this.saldo = saldo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @XmlTransient
    public List<Pago> getPagoList() {
        return pagoList;
    }

    public void setPagoList(List<Pago> pagoList) {
        this.pagoList = pagoList;
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
