package Entidades;
// Generated 02-10-2017 21:55:43 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Aseguradora generated by hbm2java
 */
public class Aseguradora  implements java.io.Serializable {


     private BigDecimal idaseguradora;
     private String nombre;
     private String direccion;

    public Aseguradora() {
    }

	
    public Aseguradora(BigDecimal idaseguradora) {
        this.idaseguradora = idaseguradora;
    }
    public Aseguradora(BigDecimal idaseguradora, String nombre, String direccion) {
       this.idaseguradora = idaseguradora;
       this.nombre = nombre;
       this.direccion = direccion;
    }
   
    public BigDecimal getIdaseguradora() {
        return this.idaseguradora;
    }
    
    public void setIdaseguradora(BigDecimal idaseguradora) {
        this.idaseguradora = idaseguradora;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }




}


