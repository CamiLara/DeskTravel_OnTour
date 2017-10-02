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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "CONTRATO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrato.findAll", query = "SELECT c FROM Contrato c")
    , @NamedQuery(name = "Contrato.findByIdcontrato", query = "SELECT c FROM Contrato c WHERE c.idcontrato = :idcontrato")
    , @NamedQuery(name = "Contrato.findByVendedor", query = "SELECT c FROM Contrato c WHERE c.vendedor = :vendedor")
    , @NamedQuery(name = "Contrato.findByFechainicio", query = "SELECT c FROM Contrato c WHERE c.fechainicio = :fechainicio")
    , @NamedQuery(name = "Contrato.findByFechatermino", query = "SELECT c FROM Contrato c WHERE c.fechatermino = :fechatermino")})
public class Contrato implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDCONTRATO")
    private BigDecimal idcontrato;
    @Basic(optional = false)
    @Column(name = "VENDEDOR")
    private BigInteger vendedor;
    @Column(name = "FECHAINICIO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    @Column(name = "FECHATERMINO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechatermino;
    @JoinColumn(name = "ALUMNO", referencedColumnName = "IDALUMNO")
    @ManyToOne(optional = false)
    private Alumno alumno;
    @JoinColumn(name = "GARANTIA", referencedColumnName = "IDSERVICIO")
    @ManyToOne(optional = false)
    private Servicio garantia;
    @JoinColumn(name = "TIPOCONTRATO", referencedColumnName = "IDTIPOCONTRATO")
    @ManyToOne(optional = false)
    private Tipocontrato tipocontrato;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contrato")
    private List<Anexos> anexosList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "contrato")
    private List<Itinerario> itinerarioList;

    public Contrato() {
    }

    public Contrato(BigDecimal idcontrato) {
        this.idcontrato = idcontrato;
    }

    public Contrato(BigDecimal idcontrato, BigInteger vendedor) {
        this.idcontrato = idcontrato;
        this.vendedor = vendedor;
    }

    public BigDecimal getIdcontrato() {
        return idcontrato;
    }

    public void setIdcontrato(BigDecimal idcontrato) {
        this.idcontrato = idcontrato;
    }

    public BigInteger getVendedor() {
        return vendedor;
    }

    public void setVendedor(BigInteger vendedor) {
        this.vendedor = vendedor;
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

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Servicio getGarantia() {
        return garantia;
    }

    public void setGarantia(Servicio garantia) {
        this.garantia = garantia;
    }

    public Tipocontrato getTipocontrato() {
        return tipocontrato;
    }

    public void setTipocontrato(Tipocontrato tipocontrato) {
        this.tipocontrato = tipocontrato;
    }

    @XmlTransient
    public List<Anexos> getAnexosList() {
        return anexosList;
    }

    public void setAnexosList(List<Anexos> anexosList) {
        this.anexosList = anexosList;
    }

    @XmlTransient
    public List<Itinerario> getItinerarioList() {
        return itinerarioList;
    }

    public void setItinerarioList(List<Itinerario> itinerarioList) {
        this.itinerarioList = itinerarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcontrato != null ? idcontrato.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrato)) {
            return false;
        }
        Contrato other = (Contrato) object;
        if ((this.idcontrato == null && other.idcontrato != null) || (this.idcontrato != null && !this.idcontrato.equals(other.idcontrato))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Contrato[ idcontrato=" + idcontrato + " ]";
    }
    
}
