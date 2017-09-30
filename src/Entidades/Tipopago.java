/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "TIPOPAGO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipopago.findAll", query = "SELECT t FROM Tipopago t")
    , @NamedQuery(name = "Tipopago.findByIdtipopago", query = "SELECT t FROM Tipopago t WHERE t.idtipopago = :idtipopago")
    , @NamedQuery(name = "Tipopago.findByDescripcion", query = "SELECT t FROM Tipopago t WHERE t.descripcion = :descripcion")})
public class Tipopago implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDTIPOPAGO")
    private BigDecimal idtipopago;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "PAGO_IDPAGO", referencedColumnName = "IDPAGO")
    @OneToOne(optional = false)
    private Pago pagoIdpago;

    public Tipopago() {
    }

    public Tipopago(BigDecimal idtipopago) {
        this.idtipopago = idtipopago;
    }

    public BigDecimal getIdtipopago() {
        return idtipopago;
    }

    public void setIdtipopago(BigDecimal idtipopago) {
        this.idtipopago = idtipopago;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Pago getPagoIdpago() {
        return pagoIdpago;
    }

    public void setPagoIdpago(Pago pagoIdpago) {
        this.pagoIdpago = pagoIdpago;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipopago != null ? idtipopago.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipopago)) {
            return false;
        }
        Tipopago other = (Tipopago) object;
        if ((this.idtipopago == null && other.idtipopago != null) || (this.idtipopago != null && !this.idtipopago.equals(other.idtipopago))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tipopago[ idtipopago=" + idtipopago + " ]";
    }
    
}
