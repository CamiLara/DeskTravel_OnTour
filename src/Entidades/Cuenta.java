package Entidades;
// Generated 02-10-2017 21:55:43 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Cuenta generated by hbm2java
 */
public class Cuenta  implements java.io.Serializable {


     private BigDecimal idcuenta;
     private String conexion;
     private String contrasena;
     private BigDecimal nombre;
     private String apellido;
     private String correoelectronico;

    public Cuenta() {
    }

	
    public Cuenta(BigDecimal idcuenta, String conexion, String contrasena, BigDecimal nombre) {
        this.idcuenta = idcuenta;
        this.conexion = conexion;
        this.contrasena = contrasena;
        this.nombre = nombre;
    }
    public Cuenta(BigDecimal idcuenta, String conexion, String contrasena, BigDecimal nombre, String apellido, String correoelectronico) {
       this.idcuenta = idcuenta;
       this.conexion = conexion;
       this.contrasena = contrasena;
       this.nombre = nombre;
       this.apellido = apellido;
       this.correoelectronico = correoelectronico;
    }
   
    public BigDecimal getIdcuenta() {
        return this.idcuenta;
    }
    
    public void setIdcuenta(BigDecimal idcuenta) {
        this.idcuenta = idcuenta;
    }
    public String getConexion() {
        return this.conexion;
    }
    
    public void setConexion(String conexion) {
        this.conexion = conexion;
    }
    public String getContrasena() {
        return this.contrasena;
    }
    
    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    public BigDecimal getNombre() {
        return this.nombre;
    }
    
    public void setNombre(BigDecimal nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCorreoelectronico() {
        return this.correoelectronico;
    }
    
    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }




}


