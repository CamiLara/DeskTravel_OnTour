package Entidades;
// Generated 02-10-2017 21:55:43 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * ActividadaportesJnId generated by hbm2java
 */
public class ActividadaportesJnId  implements java.io.Serializable {


     private String jnOperation;
     private String jnOracleUser;
     private Date jnDatetime;
     private String jnNotes;
     private String jnAppln;
     private BigDecimal jnSession;
     private BigDecimal actividad;
     private BigDecimal cuentaalumnos;
     private BigDecimal monto;
     private BigDecimal aporte;

    public ActividadaportesJnId() {
    }

	
    public ActividadaportesJnId(String jnOperation, String jnOracleUser, Date jnDatetime, BigDecimal actividad, BigDecimal cuentaalumnos, BigDecimal aporte) {
        this.jnOperation = jnOperation;
        this.jnOracleUser = jnOracleUser;
        this.jnDatetime = jnDatetime;
        this.actividad = actividad;
        this.cuentaalumnos = cuentaalumnos;
        this.aporte = aporte;
    }
    public ActividadaportesJnId(String jnOperation, String jnOracleUser, Date jnDatetime, String jnNotes, String jnAppln, BigDecimal jnSession, BigDecimal actividad, BigDecimal cuentaalumnos, BigDecimal monto, BigDecimal aporte) {
       this.jnOperation = jnOperation;
       this.jnOracleUser = jnOracleUser;
       this.jnDatetime = jnDatetime;
       this.jnNotes = jnNotes;
       this.jnAppln = jnAppln;
       this.jnSession = jnSession;
       this.actividad = actividad;
       this.cuentaalumnos = cuentaalumnos;
       this.monto = monto;
       this.aporte = aporte;
    }
   
    public String getJnOperation() {
        return this.jnOperation;
    }
    
    public void setJnOperation(String jnOperation) {
        this.jnOperation = jnOperation;
    }
    public String getJnOracleUser() {
        return this.jnOracleUser;
    }
    
    public void setJnOracleUser(String jnOracleUser) {
        this.jnOracleUser = jnOracleUser;
    }
    public Date getJnDatetime() {
        return this.jnDatetime;
    }
    
    public void setJnDatetime(Date jnDatetime) {
        this.jnDatetime = jnDatetime;
    }
    public String getJnNotes() {
        return this.jnNotes;
    }
    
    public void setJnNotes(String jnNotes) {
        this.jnNotes = jnNotes;
    }
    public String getJnAppln() {
        return this.jnAppln;
    }
    
    public void setJnAppln(String jnAppln) {
        this.jnAppln = jnAppln;
    }
    public BigDecimal getJnSession() {
        return this.jnSession;
    }
    
    public void setJnSession(BigDecimal jnSession) {
        this.jnSession = jnSession;
    }
    public BigDecimal getActividad() {
        return this.actividad;
    }
    
    public void setActividad(BigDecimal actividad) {
        this.actividad = actividad;
    }
    public BigDecimal getCuentaalumnos() {
        return this.cuentaalumnos;
    }
    
    public void setCuentaalumnos(BigDecimal cuentaalumnos) {
        this.cuentaalumnos = cuentaalumnos;
    }
    public BigDecimal getMonto() {
        return this.monto;
    }
    
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
    public BigDecimal getAporte() {
        return this.aporte;
    }
    
    public void setAporte(BigDecimal aporte) {
        this.aporte = aporte;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ActividadaportesJnId) ) return false;
		 ActividadaportesJnId castOther = ( ActividadaportesJnId ) other; 
         
		 return ( (this.getJnOperation()==castOther.getJnOperation()) || ( this.getJnOperation()!=null && castOther.getJnOperation()!=null && this.getJnOperation().equals(castOther.getJnOperation()) ) )
 && ( (this.getJnOracleUser()==castOther.getJnOracleUser()) || ( this.getJnOracleUser()!=null && castOther.getJnOracleUser()!=null && this.getJnOracleUser().equals(castOther.getJnOracleUser()) ) )
 && ( (this.getJnDatetime()==castOther.getJnDatetime()) || ( this.getJnDatetime()!=null && castOther.getJnDatetime()!=null && this.getJnDatetime().equals(castOther.getJnDatetime()) ) )
 && ( (this.getJnNotes()==castOther.getJnNotes()) || ( this.getJnNotes()!=null && castOther.getJnNotes()!=null && this.getJnNotes().equals(castOther.getJnNotes()) ) )
 && ( (this.getJnAppln()==castOther.getJnAppln()) || ( this.getJnAppln()!=null && castOther.getJnAppln()!=null && this.getJnAppln().equals(castOther.getJnAppln()) ) )
 && ( (this.getJnSession()==castOther.getJnSession()) || ( this.getJnSession()!=null && castOther.getJnSession()!=null && this.getJnSession().equals(castOther.getJnSession()) ) )
 && ( (this.getActividad()==castOther.getActividad()) || ( this.getActividad()!=null && castOther.getActividad()!=null && this.getActividad().equals(castOther.getActividad()) ) )
 && ( (this.getCuentaalumnos()==castOther.getCuentaalumnos()) || ( this.getCuentaalumnos()!=null && castOther.getCuentaalumnos()!=null && this.getCuentaalumnos().equals(castOther.getCuentaalumnos()) ) )
 && ( (this.getMonto()==castOther.getMonto()) || ( this.getMonto()!=null && castOther.getMonto()!=null && this.getMonto().equals(castOther.getMonto()) ) )
 && ( (this.getAporte()==castOther.getAporte()) || ( this.getAporte()!=null && castOther.getAporte()!=null && this.getAporte().equals(castOther.getAporte()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getJnOperation() == null ? 0 : this.getJnOperation().hashCode() );
         result = 37 * result + ( getJnOracleUser() == null ? 0 : this.getJnOracleUser().hashCode() );
         result = 37 * result + ( getJnDatetime() == null ? 0 : this.getJnDatetime().hashCode() );
         result = 37 * result + ( getJnNotes() == null ? 0 : this.getJnNotes().hashCode() );
         result = 37 * result + ( getJnAppln() == null ? 0 : this.getJnAppln().hashCode() );
         result = 37 * result + ( getJnSession() == null ? 0 : this.getJnSession().hashCode() );
         result = 37 * result + ( getActividad() == null ? 0 : this.getActividad().hashCode() );
         result = 37 * result + ( getCuentaalumnos() == null ? 0 : this.getCuentaalumnos().hashCode() );
         result = 37 * result + ( getMonto() == null ? 0 : this.getMonto().hashCode() );
         result = 37 * result + ( getAporte() == null ? 0 : this.getAporte().hashCode() );
         return result;
   }   


}

