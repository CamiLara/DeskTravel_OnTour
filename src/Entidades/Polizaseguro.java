/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "POLIZASEGURO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Polizaseguro.findAll", query = "SELECT p FROM Polizaseguro p")
    , @NamedQuery(name = "Polizaseguro.findByIdpolizaseguros", query = "SELECT p FROM Polizaseguro p WHERE p.idpolizaseguros = :idpolizaseguros")
    , @NamedQuery(name = "Polizaseguro.findByDescripci\u00f3n", query = "SELECT p FROM Polizaseguro p WHERE p.descripci\u00f3n = :descripci\u00f3n")
    , @NamedQuery(name = "Polizaseguro.findByVigenciainicio", query = "SELECT p FROM Polizaseguro p WHERE p.vigenciainicio = :vigenciainicio")
    , @NamedQuery(name = "Polizaseguro.findByVigenciatermino", query = "SELECT p FROM Polizaseguro p WHERE p.vigenciatermino = :vigenciatermino")
    , @NamedQuery(name = "Polizaseguro.findByFechacontratacion", query = "SELECT p FROM Polizaseguro p WHERE p.fechacontratacion = :fechacontratacion")
    , @NamedQuery(name = "Polizaseguro.findByMontoasegurado", query = "SELECT p FROM Polizaseguro p WHERE p.montoasegurado = :montoasegurado")})
public class Polizaseguro implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDPOLIZASEGUROS")
    private BigDecimal idpolizaseguros;
    @Column(name = "DESCRIPCI\u00d3N")
    private BigInteger descripción;
    @Column(name = "VIGENCIAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vigenciainicio;
    @Column(name = "VIGENCIATERMINO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date vigenciatermino;
    @Column(name = "FECHACONTRATACION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechacontratacion;
    @Column(name = "MONTOASEGURADO")
    private BigInteger montoasegurado;
    @JoinColumn(name = "ALUMNO", referencedColumnName = "IDALUMNO")
    @ManyToOne(optional = false)
    private Alumno alumno;
    @JoinColumn(name = "ASEGURADORA", referencedColumnName = "ASEGURADORA")
    @ManyToOne(optional = false)
    private Aseguradora aseguradora;
    @JoinColumn(name = "TIPOSEGURO", referencedColumnName = "IDTIPOSEGURO")
    @ManyToOne(optional = false)
    private Tiposeguro tiposeguro;

    public Polizaseguro() {
    }

    public Polizaseguro(BigDecimal idpolizaseguros) {
        this.idpolizaseguros = idpolizaseguros;
    }

    public BigDecimal getIdpolizaseguros() {
        return idpolizaseguros;
    }

    public void setIdpolizaseguros(BigDecimal idpolizaseguros) {
        this.idpolizaseguros = idpolizaseguros;
    }

    public BigInteger getDescripción() {
        return descripción;
    }

    public void setDescripción(BigInteger descripción) {
        this.descripción = descripción;
    }

    public Date getVigenciainicio() {
        return vigenciainicio;
    }

    public void setVigenciainicio(Date vigenciainicio) {
        this.vigenciainicio = vigenciainicio;
    }

    public Date getVigenciatermino() {
        return vigenciatermino;
    }

    public void setVigenciatermino(Date vigenciatermino) {
        this.vigenciatermino = vigenciatermino;
    }

    public Date getFechacontratacion() {
        return fechacontratacion;
    }

    public void setFechacontratacion(Date fechacontratacion) {
        this.fechacontratacion = fechacontratacion;
    }

    public BigInteger getMontoasegurado() {
        return montoasegurado;
    }

    public void setMontoasegurado(BigInteger montoasegurado) {
        this.montoasegurado = montoasegurado;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Aseguradora getAseguradora() {
        return aseguradora;
    }

    public void setAseguradora(Aseguradora aseguradora) {
        this.aseguradora = aseguradora;
    }

    public Tiposeguro getTiposeguro() {
        return tiposeguro;
    }

    public void setTiposeguro(Tiposeguro tiposeguro) {
        this.tiposeguro = tiposeguro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpolizaseguros != null ? idpolizaseguros.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Polizaseguro)) {
            return false;
        }
        Polizaseguro other = (Polizaseguro) object;
        if ((this.idpolizaseguros == null && other.idpolizaseguros != null) || (this.idpolizaseguros != null && !this.idpolizaseguros.equals(other.idpolizaseguros))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Polizaseguro[ idpolizaseguros=" + idpolizaseguros + " ]";
    }
    
}
