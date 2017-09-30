/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author camil
 */
@Embeddable
public class Contratov2PK implements Serializable {

    @Basic(optional = false)
    @Column(name = "IDCONTRATO")
    private BigInteger idcontrato;
    @Basic(optional = false)
    @Column(name = "SERVICIOS_IDSERVICIOS")
    private BigInteger serviciosIdservicios;

    public Contratov2PK() {
    }

    public Contratov2PK(BigInteger idcontrato, BigInteger serviciosIdservicios) {
        this.idcontrato = idcontrato;
        this.serviciosIdservicios = serviciosIdservicios;
    }

    public BigInteger getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(BigInteger idcontrato) {
        this.idcontrato = idcontrato;
    }

    public BigInteger getServiciosIdservicios() {
        return serviciosIdservicios;
    }

    public void setServiciosIdservicios(BigInteger serviciosIdservicios) {
        this.serviciosIdservicios = serviciosIdservicios;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontrato != null ? idcontrato.hashCode() : 0);
        hash += (serviciosIdservicios != null ? serviciosIdservicios.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contratov2PK)) {
            return false;
        }
        Contratov2PK other = (Contratov2PK) object;
        if ((this.idcontrato == null && other.idcontrato != null) || (this.idcontrato != null && !this.idcontrato.equals(other.idcontrato))) {
            return false;
        }
        if ((this.serviciosIdservicios == null && other.serviciosIdservicios != null) || (this.serviciosIdservicios != null && !this.serviciosIdservicios.equals(other.serviciosIdservicios))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Contratov2PK[ idcontrato=" + idcontrato + ", serviciosIdservicios=" + serviciosIdservicios + " ]";
    }
    
}
