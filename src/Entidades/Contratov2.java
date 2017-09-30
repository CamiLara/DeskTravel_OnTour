/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "CONTRATOV2")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contratov2.findAll", query = "SELECT c FROM Contratov2 c")
    , @NamedQuery(name = "Contratov2.findByIdcontrato", query = "SELECT c FROM Contratov2 c WHERE c.contratov2PK.idcontrato = :idcontrato")
    , @NamedQuery(name = "Contratov2.findByFechainicio", query = "SELECT c FROM Contratov2 c WHERE c.fechainicio = :fechainicio")
    , @NamedQuery(name = "Contratov2.findByFechatermino", query = "SELECT c FROM Contratov2 c WHERE c.fechatermino = :fechatermino")
    , @NamedQuery(name = "Contratov2.findByServiciosIdservicios", query = "SELECT c FROM Contratov2 c WHERE c.contratov2PK.serviciosIdservicios = :serviciosIdservicios")
    , @NamedQuery(name = "Contratov2.findByColaboradorId", query = "SELECT c FROM Contratov2 c WHERE c.colaboradorId = :colaboradorId")})
public class Contratov2 implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Contratov2PK contratov2PK;
    @Column(name = "FECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Column(name = "FECHATERMINO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechatermino;
    @Basic(optional = false)
    @Column(name = "COLABORADOR_ID")
    private BigInteger colaboradorId;
    @JoinColumn(name = "ANEXOS_IDANEXO", referencedColumnName = "IDANEXO")
    @ManyToOne(optional = false)
    private Anexos anexosIdanexo;
    @JoinColumn(name = "POLIZASEGUROS_IDPOLIZAS", referencedColumnName = "IDPOLIZAS")
    @ManyToOne(optional = false)
    private Polizaseguros polizasegurosIdpolizas;
    @JoinColumn(name = "SERVICIOS_IDSERVICIOS", referencedColumnName = "IDSERVICIOS", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Servicios servicios;
    @JoinColumn(name = "TIPOCONTRATO_IDTIPOCONTRATO", referencedColumnName = "IDTIPOCONTRATO")
    @ManyToOne(optional = false)
    private Tipocontrato tipocontratoIdtipocontrato;

    public Contratov2() {
    }

    public Contratov2(Contratov2PK contratov2PK) {
        this.contratov2PK = contratov2PK;
    }

    public Contratov2(Contratov2PK contratov2PK, BigInteger colaboradorId) {
        this.contratov2PK = contratov2PK;
        this.colaboradorId = colaboradorId;
    }

    public Contratov2(BigInteger idcontrato, BigInteger serviciosIdservicios) {
        this.contratov2PK = new Contratov2PK(idcontrato, serviciosIdservicios);
    }

    public Contratov2PK getContratov2PK() {
        return contratov2PK;
    }

    public void setContratov2PK(Contratov2PK contratov2PK) {
        this.contratov2PK = contratov2PK;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechatermino() {
        return fechatermino;
    }

    public void setFechatermino(Date fechatermino) {
        this.fechatermino = fechatermino;
    }

    public BigInteger getColaboradorId() {
        return colaboradorId;
    }

    public void setColaboradorId(BigInteger colaboradorId) {
        this.colaboradorId = colaboradorId;
    }

    public Anexos getAnexosIdanexo() {
        return anexosIdanexo;
    }

    public void setAnexosIdanexo(Anexos anexosIdanexo) {
        this.anexosIdanexo = anexosIdanexo;
    }

    public Polizaseguros getPolizasegurosIdpolizas() {
        return polizasegurosIdpolizas;
    }

    public void setPolizasegurosIdpolizas(Polizaseguros polizasegurosIdpolizas) {
        this.polizasegurosIdpolizas = polizasegurosIdpolizas;
    }

    public Servicios getServicios() {
        return servicios;
    }

    public void setServicios(Servicios servicios) {
        this.servicios = servicios;
    }

    public Tipocontrato getTipocontratoIdtipocontrato() {
        return tipocontratoIdtipocontrato;
    }

    public void setTipocontratoIdtipocontrato(Tipocontrato tipocontratoIdtipocontrato) {
        this.tipocontratoIdtipocontrato = tipocontratoIdtipocontrato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (contratov2PK != null ? contratov2PK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contratov2)) {
            return false;
        }
        Contratov2 other = (Contratov2) object;
        if ((this.contratov2PK == null && other.contratov2PK != null) || (this.contratov2PK != null && !this.contratov2PK.equals(other.contratov2PK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Contratov2[ contratov2PK=" + contratov2PK + " ]";
    }
    
}
