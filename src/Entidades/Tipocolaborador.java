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
@Table(name = "TIPOCOLABORADOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipocolaborador.findAll", query = "SELECT t FROM Tipocolaborador t")
    , @NamedQuery(name = "Tipocolaborador.findByIdtipocolaborador", query = "SELECT t FROM Tipocolaborador t WHERE t.idtipocolaborador = :idtipocolaborador")
    , @NamedQuery(name = "Tipocolaborador.findByDescripcion", query = "SELECT t FROM Tipocolaborador t WHERE t.descripcion = :descripcion")})
public class Tipocolaborador implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDTIPOCOLABORADOR")
    private BigDecimal idtipocolaborador;
    @Column(name = "DESCRIPCION")
    private String descripcion;
    @JoinColumn(name = "COLABORADOR_ID", referencedColumnName = "ID")
    @OneToOne(optional = false)
    private Colaborador colaboradorId;

    public Tipocolaborador() {
    }

    public Tipocolaborador(BigDecimal idtipocolaborador) {
        this.idtipocolaborador = idtipocolaborador;
    }

    public BigDecimal getIdtipocolaborador() {
        return idtipocolaborador;
    }

    public void setIdtipocolaborador(BigDecimal idtipocolaborador) {
        this.idtipocolaborador = idtipocolaborador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Colaborador getColaboradorId() {
        return colaboradorId;
    }

    public void setColaboradorId(Colaborador colaboradorId) {
        this.colaboradorId = colaboradorId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idtipocolaborador != null ? idtipocolaborador.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipocolaborador)) {
            return false;
        }
        Tipocolaborador other = (Tipocolaborador) object;
        if ((this.idtipocolaborador == null && other.idtipocolaborador != null) || (this.idtipocolaborador != null && !this.idtipocolaborador.equals(other.idtipocolaborador))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Tipocolaborador[ idtipocolaborador=" + idtipocolaborador + " ]";
    }
    
}
