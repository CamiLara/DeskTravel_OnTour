/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
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
@Table(name = "COLABORADOR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colaborador.findAll", query = "SELECT c FROM Colaborador c")
    , @NamedQuery(name = "Colaborador.findById", query = "SELECT c FROM Colaborador c WHERE c.id = :id")
    , @NamedQuery(name = "Colaborador.findByNombre", query = "SELECT c FROM Colaborador c WHERE c.nombre = :nombre")
    , @NamedQuery(name = "Colaborador.findByUsuarioTipousuarioIdusuario", query = "SELECT c FROM Colaborador c WHERE c.usuarioTipousuarioIdusuario = :usuarioTipousuarioIdusuario")})
public class Colaborador implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private BigDecimal id;
    @Basic(optional = false)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "USUARIO_TIPOUSUARIO_IDUSUARIO")
    private BigInteger usuarioTipousuarioIdusuario;
    @Lob
    @Column(name = "RUT")
    private Object rut;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "colaboradorId")
    private Tipocolaborador tipocolaborador;

    public Colaborador() {
    }

    public Colaborador(BigDecimal id) {
        this.id = id;
    }

    public Colaborador(BigDecimal id, String nombre, BigInteger usuarioTipousuarioIdusuario) {
        this.id = id;
        this.nombre = nombre;
        this.usuarioTipousuarioIdusuario = usuarioTipousuarioIdusuario;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigInteger getUsuarioTipousuarioIdusuario() {
        return usuarioTipousuarioIdusuario;
    }

    public void setUsuarioTipousuarioIdusuario(BigInteger usuarioTipousuarioIdusuario) {
        this.usuarioTipousuarioIdusuario = usuarioTipousuarioIdusuario;
    }

    public Object getRut() {
        return rut;
    }

    public void setRut(Object rut) {
        this.rut = rut;
    }

    public Tipocolaborador getTipocolaborador() {
        return tipocolaborador;
    }

    public void setTipocolaborador(Tipocolaborador tipocolaborador) {
        this.tipocolaborador = tipocolaborador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colaborador)) {
            return false;
        }
        Colaborador other = (Colaborador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Colaborador[ id=" + id + " ]";
    }
    
}
