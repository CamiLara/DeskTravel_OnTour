package Entidades;
// Generated 02-10-2017 21:55:43 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Destino generated by hbm2java
 */
public class Destino  implements java.io.Serializable {


     private BigDecimal iddestino;
     private String nombre;
     private BigDecimal pais;

    public Destino() {
    }

	
    public Destino(BigDecimal iddestino, BigDecimal pais) {
        this.iddestino = iddestino;
        this.pais = pais;
    }
    public Destino(BigDecimal iddestino, String nombre, BigDecimal pais) {
       this.iddestino = iddestino;
       this.nombre = nombre;
       this.pais = pais;
    }
   
    public BigDecimal getIddestino() {
        return this.iddestino;
    }
    
    public void setIddestino(BigDecimal iddestino) {
        this.iddestino = iddestino;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public BigDecimal getPais() {
        return this.pais;
    }
    
    public void setPais(BigDecimal pais) {
        this.pais = pais;
    }




}


