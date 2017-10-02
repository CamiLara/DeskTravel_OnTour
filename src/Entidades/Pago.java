/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "PAGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pago.findAll", query = "SELECT p FROM Pago p")
    , @NamedQuery(name = "Pago.findByIdpago", query = "SELECT p FROM Pago p WHERE p.idpago = :idpago")
    , @NamedQuery(name = "Pago.findByFechapago", query = "SELECT p FROM Pago p WHERE p.fechapago = :fechapago")
    , @NamedQuery(name = "Pago.findByDetalle", query = "SELECT p FROM Pago p WHERE p.detalle = :detalle")
    , @NamedQuery(name = "Pago.findByMontocancelado", query = "SELECT p FROM Pago p WHERE p.montocancelado = :montocancelado")})
public class Pago implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDPAGO")
    private BigDecimal idpago;
    @Column(name = "FECHAPAGO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechapago;
    @Column(name = "DETALLE")
    private String detalle;
    @Column(name = "MONTOCANCELADO")
    private String montocancelado;
    @JoinColumn(name = "CUENTAALUMNO", referencedColumnName = "IDCUENTAALUMNOS")
    @ManyToOne(optional = false)
    private Cuentaalumno cuentaalumno;
    @JoinColumn(name = "CUENTACURSO", referencedColumnName = "IDCUENTACURSO")
    @ManyToOne(optional = false)
    private Cuentacurso cuentacurso;
    @JoinColumn(name = "TIPOPAGO", referencedColumnName = "IDTIPOPAGO")
    @ManyToOne(optional = false)
    private Tipopago tipopago;

    public Pago() {
    }

    public Pago(BigDecimal idpago) {
        this.idpago = idpago;
    }

    public BigDecimal getIdpago() {
        return idpago;
    }

    public void setIdpago(BigDecimal idpago) {
        this.idpago = idpago;
    }

    public Date getFechapago() {
        return fechapago;
    }

    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getMontocancelado() {
        return montocancelado;
    }

    public void setMontocancelado(String montocancelado) {
        this.montocancelado = montocancelado;
    }

    public Cuentaalumno getCuentaalumno() {
        return cuentaalumno;
    }

    public void setCuentaalumno(Cuentaalumno cuentaalumno) {
        this.cuentaalumno = cuentaalumno;
    }

    public Cuentacurso getCuentacurso() {
        return cuentacurso;
    }

    public void setCuentacurso(Cuentacurso cuentacurso) {
        this.cuentacurso = cuentacurso;
    }

    public Tipopago getTipopago() {
        return tipopago;
    }

    public void setTipopago(Tipopago tipopago) {
        this.tipopago = tipopago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpago != null ? idpago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pago)) {
            return false;
        }
        Pago other = (Pago) object;
        if ((this.idpago == null && other.idpago != null) || (this.idpago != null && !this.idpago.equals(other.idpago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Pago[ idpago=" + idpago + " ]";
    }
    
}
