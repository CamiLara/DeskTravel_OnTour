package Entidades;
// Generated 02-10-2017 21:55:43 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Actividadaportes generated by hbm2java
 */
public class Actividadaportes  implements java.io.Serializable {


     private ActividadaportesId id;
     private BigDecimal monto;

    public Actividadaportes() {
    }

	
    public Actividadaportes(ActividadaportesId id) {
        this.id = id;
    }
    public Actividadaportes(ActividadaportesId id, BigDecimal monto) {
       this.id = id;
       this.monto = monto;
    }
   
    public ActividadaportesId getId() {
        return this.id;
    }
    
    public void setId(ActividadaportesId id) {
        this.id = id;
    }
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }




}


