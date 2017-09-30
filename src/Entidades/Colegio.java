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
import javax.persistence.JoinColumns;
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
@Table(name = "COLEGIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Colegio.findAll", query = "SELECT c FROM Colegio c")
    , @NamedQuery(name = "Colegio.findByIdcolegio", query = "SELECT c FROM Colegio c WHERE c.idcolegio = :idcolegio")
    , @NamedQuery(name = "Colegio.findByNombre", query = "SELECT c FROM Colegio c WHERE c.nombre = :nombre")})
public class Colegio implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @Basic(optional = false)
    @Column(name = "IDCOLEGIO")
    private BigDecimal idcolegio;
    @Column(name = "NOMBRE")
    private String nombre;
    @JoinColumns({
        @JoinColumn(name = "CURSO_IDCURSO", referencedColumnName = "IDCURSO")
        , @JoinColumn(name = "CURSO_ACTIVIDAD_IDACTIVIDAD", referencedColumnName = "ACTIVIDAD_IDACTIVIDAD")})
    @ManyToOne
    private Curso curso;

    public Colegio() {
    }

    public Colegio(BigDecimal idcolegio) {
        this.idcolegio = idcolegio;
    }

    public BigDecimal getIdcolegio() {
        return idcolegio;
    }

    public void setIdcolegio(BigDecimal idcolegio) {
        this.idcolegio = idcolegio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idcolegio != null ? idcolegio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Colegio)) {
            return false;
        }
        Colegio other = (Colegio) object;
        if ((this.idcolegio == null && other.idcolegio != null) || (this.idcolegio != null && !this.idcolegio.equals(other.idcolegio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entidades.Colegio[ idcolegio=" + idcolegio + " ]";
    }
    
}
