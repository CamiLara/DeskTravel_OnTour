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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author camil
 */
@Entity
@Table(name = "MENU")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Menu.findAll", query = "SELECT m FROM Menu m")
    , @NamedQuery(name = "Menu.findByIdmenu", query = "SELECT m FROM Menu m WHERE m.idmenu = :idmenu")
    , @NamedQuery(name = "Menu.findByNombre", query = "SELECT m FROM Menu m WHERE m.nombre = :nombre")
    , @NamedQuery(name = "Menu.findByUsuarioTipousuarioIdusuario", query = "SELECT m FROM Menu m WHERE m.usuarioTipousuarioIdusuario = :usuarioTipousuarioIdusuario")})
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDMENU")
    private BigDecimal idmenu;
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @Column(name = "USUARIO_TIPOUSUARIO_IDUSUARIO")
    private BigInteger usuarioTipousuarioIdusuario;

    public Menu() {
    }

    public Menu(BigDecimal idmenu) {
        this.idmenu = idmenu;
    }

    public Menu(BigDecimal idmenu, BigInteger usuarioTipousuarioIdusuario) {
        this.idmenu = idmenu;
        this.usuarioTipousuarioIdusuario = usuarioTipousuarioIdusuario;
    }

    public BigDecimal getIdmenu() {
        return idmenu;
    }

    public void setIdmenu(BigDecimal idmenu) {
        this.idmenu = idmenu;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmenu != null ? idmenu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Menu)) {
            return false;
        }
        Menu other = (Menu) object;
        if ((this.idmenu == null && other.idmenu != null) || (this.idmenu != null && !this.idmenu.equals(other.idmenu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Menu[ idmenu=" + idmenu + " ]";
    }
    
}
