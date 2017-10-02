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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "ANEXOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Anexos.findAll", query = "SELECT a FROM Anexos a")
    , @NamedQuery(name = "Anexos.findByIdanexo", query = "SELECT a FROM Anexos a WHERE a.idanexo = :idanexo")
    , @NamedQuery(name = "Anexos.findByFile", query = "SELECT a FROM Anexos a WHERE a.file = :file")
    , @NamedQuery(name = "Anexos.findByToken", query = "SELECT a FROM Anexos a WHERE a.token = :token")})
public class Anexos implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDANEXO")
    private BigDecimal idanexo;
    @Basic(optional = false)
    @Column(name = "File")
    private String file;
    @Column(name = "TOKEN")
    private String token;
    @JoinColumn(name = "CONTRATO", referencedColumnName = "IDCONTRATO")
    @ManyToOne(optional = false)
    private Contrato contrato;

    public Anexos() {
    }

    public Anexos(BigDecimal idanexo) {
        this.idanexo = idanexo;
    }

    public Anexos(BigDecimal idanexo, String file) {
        this.idanexo = idanexo;
        this.file = file;
    }

    public BigDecimal getIdanexo() {
        return idanexo;
    }

    public void setIdanexo(BigDecimal idanexo) {
        this.idanexo = idanexo;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Contrato getContrato() {
        return contrato;
    }

    public void setContrato(Contrato contrato) {
        this.contrato = contrato;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idanexo != null ? idanexo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Anexos)) {
            return false;
        }
        Anexos other = (Anexos) object;
        if ((this.idanexo == null && other.idanexo != null) || (this.idanexo != null && !this.idanexo.equals(other.idanexo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Anexos[ idanexo=" + idanexo + " ]";
    }
    
}
