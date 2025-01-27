package Entidad;
// Generated 12-jul-2016 17:53:12 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;

/**
 * Encadevol generated by hbm2java
 */
public class Encadevol  implements java.io.Serializable {


     private BigDecimal idDevolucion;
     private Date fechadevolucion;
     private BigDecimal encapresIdPrestamo;
     private String comentario;

    public Encadevol() {
    }

	
    public Encadevol(BigDecimal idDevolucion) {
        this.idDevolucion = idDevolucion;
    }
    public Encadevol(BigDecimal idDevolucion, Date fechadevolucion, BigDecimal encapresIdPrestamo, String comentario) {
       this.idDevolucion = idDevolucion;
       this.fechadevolucion = fechadevolucion;
       this.encapresIdPrestamo = encapresIdPrestamo;
       this.comentario = comentario;
    }
   
    public BigDecimal getIdDevolucion() {
        return this.idDevolucion;
    }
    
    public void setIdDevolucion(BigDecimal idDevolucion) {
        this.idDevolucion = idDevolucion;
    }
    public Date getFechadevolucion() {
        return this.fechadevolucion;
    }
    
    public void setFechadevolucion(Date fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }
    public BigDecimal getEncapresIdPrestamo() {
        return this.encapresIdPrestamo;
    }
    
    public void setEncapresIdPrestamo(BigDecimal encapresIdPrestamo) {
        this.encapresIdPrestamo = encapresIdPrestamo;
    }
    public String getComentario() {
        return this.comentario;
    }
    
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }




}


