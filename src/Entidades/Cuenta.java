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
@Table(name = "CUENTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cuenta.findAll", query = "SELECT c FROM Cuenta c")
    , @NamedQuery(name = "Cuenta.findByIdusuario", query = "SELECT c FROM Cuenta c WHERE c.idusuario = :idusuario")
    , @NamedQuery(name = "Cuenta.findByConexion", query = "SELECT c FROM Cuenta c WHERE c.conexion = :conexion")
    , @NamedQuery(name = "Cuenta.findByContrasena", query = "SELECT c FROM Cuenta c WHERE c.contrasena = :contrasena")
    , @NamedQuery(name = "Cuenta.findByApellido", query = "SELECT c FROM Cuenta c WHERE c.apellido = :apellido")
    , @NamedQuery(name = "Cuenta.findByCorreoelectronico", query = "SELECT c FROM Cuenta c WHERE c.correoelectronico = :correoelectronico")})
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDUSUARIO")
    private BigDecimal idusuario;
    @Basic(optional = false)
    @Column(name = "CONEXION")
    private String conexion;
    @Basic(optional = false)
    @Column(name = "CONTRASENA")
    private String contrasena;
    @Column(name = "APELLIDO")
    private String apellido;
    @Column(name = "CORREOELECTRONICO")
    private String correoelectronico;
    @JoinColumn(name = "NOMBRE", referencedColumnName = "IDPERFIL")
    @ManyToOne(optional = false)
    private Perfil nombre;

    public Cuenta() {
    }

    public Cuenta(BigDecimal idusuario) {
        this.idusuario = idusuario;
    }

    public Cuenta(BigDecimal idusuario, String conexion, String contrasena) {
        this.idusuario = idusuario;
        this.conexion = conexion;
        this.contrasena = contrasena;
    }

    public BigDecimal getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(BigDecimal idusuario) {
        this.idusuario = idusuario;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public Perfil getNombre() {
        return nombre;
    }

    public void setNombre(Perfil nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idusuario != null ? idusuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cuenta)) {
            return false;
        }
        Cuenta other = (Cuenta) object;
        if ((this.idusuario == null && other.idusuario != null) || (this.idusuario != null && !this.idusuario.equals(other.idusuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Cuenta[ idusuario=" + idusuario + " ]";
    }
    
}
