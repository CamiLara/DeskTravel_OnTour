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
@Table(name = "CUENTAALUMNO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuentaalumno.findAll", query = "SELECT c FROM Cuentaalumno c")
    , @NamedQuery(name = "Cuentaalumno.findByIdcuentaalumnos", query = "SELECT c FROM Cuentaalumno c WHERE c.idcuentaalumnos = :idcuentaalumnos")
    , @NamedQuery(name = "Cuentaalumno.findByCupototal", query = "SELECT c FROM Cuentaalumno c WHERE c.cupototal = :cupototal")
    , @NamedQuery(name = "Cuentaalumno.findByCupoutilizado", query = "SELECT c FROM Cuentaalumno c WHERE c.cupoutilizado = :cupoutilizado")
    , @NamedQuery(name = "Cuentaalumno.findByAporte", query = "SELECT c FROM Cuentaalumno c WHERE c.aporte = :aporte")
    , @NamedQuery(name = "Cuentaalumno.findBySaldo", query = "SELECT c FROM Cuentaalumno c WHERE c.saldo = :saldo")})
public class Cuentaalumno implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDCUENTAALUMNOS")
    private BigDecimal idcuentaalumnos;
    @Column(name = "CUPOTOTAL")
    private BigInteger cupototal;
    @Column(name = "CUPOUTILIZADO")
    private BigInteger cupoutilizado;
    @Basic(optional = false)
    @Column(name = "APORTE")
    private BigInteger aporte;
    @Column(name = "SALDO")
    private BigInteger saldo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuentaalumno")
    private List<Actividadaportes> actividadaportesList;
    @JoinColumn(name = "ALUMNO", referencedColumnName = "IDALUMNO")
    @OneToOne(optional = false)
    private Alumno alumno;
    @JoinColumn(name = "TIPOCUENTA", referencedColumnName = "IDTIPOCUENTA")
    @ManyToOne(optional = false)
    private Tipocuenta tipocuenta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuentaalumno")
    private List<Estadocuenta> estadocuentaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cuentaalumno")
    private List<Pago> pagoList;

    public Cuentaalumno() {
    }

    public Cuentaalumno(BigDecimal idcuentaalumnos) {
        this.idcuentaalumnos = idcuentaalumnos;
    }

    public Cuentaalumno(BigDecimal idcuentaalumnos, BigInteger aporte) {
        this.idcuentaalumnos = idcuentaalumnos;
        this.aporte = aporte;
    }

    public BigDecimal getIdcuentaalumnos() {
        return idcuentaalumnos;
    }

    public void setIdcuentaalumnos(BigDecimal idcuentaalumnos) {
        this.idcuentaalumnos = idcuentaalumnos;
    }

    public BigInteger getCupototal() {
        return cupototal;
    }

    public void setCupototal(BigInteger cupototal) {
        this.cupototal = cupototal;
    }

    public BigInteger getCupoutilizado() {
        return cupoutilizado;
    }

    public void setCupoutilizado(BigInteger cupoutilizado) {
        this.cupoutilizado = cupoutilizado;
    }

    public BigInteger getAporte() {
        return aporte;
    }

    public void setAporte(BigInteger aporte) {
        this.aporte = aporte;
    }

    public BigInteger getSaldo() {
        return saldo;
    }

    public void setSaldo(BigInteger saldo) {
        this.saldo = saldo;
    }

    @XmlTransient
    public List<Actividadaportes> getActividadaportesList() {
        return actividadaportesList;
    }

    public void setActividadaportesList(List<Actividadaportes> actividadaportesList) {
        this.actividadaportesList = actividadaportesList;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Tipocuenta getTipocuenta() {
        return tipocuenta;
    }

    public void setTipocuenta(Tipocuenta tipocuenta) {
        this.tipocuenta = tipocuenta;
    }

    @XmlTransient
    public List<Estadocuenta> getEstadocuentaList() {
        return estadocuentaList;
    }

    public void setEstadocuentaList(List<Estadocuenta> estadocuentaList) {
        this.estadocuentaList = estadocuentaList;
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
        hash += (idcuentaalumnos != null ? idcuentaalumnos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuentaalumno)) {
            return false;
        }
        Cuentaalumno other = (Cuentaalumno) object;
        if ((this.idcuentaalumnos == null && other.idcuentaalumnos != null) || (this.idcuentaalumnos != null && !this.idcuentaalumnos.equals(other.idcuentaalumnos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Cuentaalumno[ idcuentaalumnos=" + idcuentaalumnos + " ]";
    }
    
}
