package Entidades;
// Generated 02-10-2017 21:55:43 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Pago generated by hbm2java
 */
public class Pago  implements java.io.Serializable {


     private BigDecimal idpago;
     private BigDecimal cuentacurso;
     private Date fechapago;
     private String detalle;
     private String montocancelado;
     private BigDecimal tipopago;
     private BigDecimal cuentaalumno;

    public Pago() {
    }

	
    public Pago(BigDecimal idpago, BigDecimal cuentacurso, BigDecimal tipopago, BigDecimal cuentaalumno) {
        this.idpago = idpago;
        this.cuentacurso = cuentacurso;
        this.tipopago = tipopago;
        this.cuentaalumno = cuentaalumno;
    }
    public Pago(BigDecimal idpago, BigDecimal cuentacurso, Date fechapago, String detalle, String montocancelado, BigDecimal tipopago, BigDecimal cuentaalumno) {
       this.idpago = idpago;
       this.cuentacurso = cuentacurso;
       this.fechapago = fechapago;
       this.detalle = detalle;
       this.montocancelado = montocancelado;
       this.tipopago = tipopago;
       this.cuentaalumno = cuentaalumno;
    }
   
    public BigDecimal getIdpago() {
        return this.idpago;
    }
    
    public void setIdpago(BigDecimal idpago) {
        this.idpago = idpago;
    }
    public BigDecimal getCuentacurso() {
        return this.cuentacurso;
    }
    
    public void setCuentacurso(BigDecimal cuentacurso) {
        this.cuentacurso = cuentacurso;
    }
    public Date getFechapago() {
        return this.fechapago;
    }
    
    public void setFechapago(Date fechapago) {
        this.fechapago = fechapago;
    }
    public String getDetalle() {
        return this.detalle;
    }
    
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }
    public String getMontocancelado() {
        return this.montocancelado;
    }
    
    public void setMontocancelado(String montocancelado) {
        this.montocancelado = montocancelado;
    }
    public BigDecimal getTipopago() {
        return this.tipopago;
    }
    
    public void setTipopago(BigDecimal tipopago) {
        this.tipopago = tipopago;
    }
    public BigDecimal getCuentaalumno() {
        return this.cuentaalumno;
    }
    
    public void setCuentaalumno(BigDecimal cuentaalumno) {
        this.cuentaalumno = cuentaalumno;
    }




}


