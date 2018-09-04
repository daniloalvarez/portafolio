package Entidad;
// Generated 12-jul-2016 17:53:12 by Hibernate Tools 4.3.1


import java.math.BigDecimal;

/**
 * Detasoli generated by hbm2java
 */
public class Detasoli  implements java.io.Serializable {


     private BigDecimal idsolicitud;
     private BigDecimal encasoliNumsolicitud;
     private BigDecimal linea;
     private String productoCodproducto;
     private BigDecimal cantsolicitada;
     private BigDecimal productoSedeIdSede;

    public Detasoli() {
    }

	
    public Detasoli(BigDecimal idsolicitud, BigDecimal encasoliNumsolicitud, String productoCodproducto, BigDecimal productoSedeIdSede) {
        this.idsolicitud = idsolicitud;
        this.encasoliNumsolicitud = encasoliNumsolicitud;
        this.productoCodproducto = productoCodproducto;
        this.productoSedeIdSede = productoSedeIdSede;
    }
    public Detasoli(BigDecimal idsolicitud, BigDecimal encasoliNumsolicitud, BigDecimal linea, String productoCodproducto, BigDecimal cantsolicitada, BigDecimal productoSedeIdSede) {
       this.idsolicitud = idsolicitud;
       this.encasoliNumsolicitud = encasoliNumsolicitud;
       this.linea = linea;
       this.productoCodproducto = productoCodproducto;
       this.cantsolicitada = cantsolicitada;
       this.productoSedeIdSede = productoSedeIdSede;
    }
   
    public BigDecimal getIdsolicitud() {
        return this.idsolicitud;
    }
    
    public void setIdsolicitud(BigDecimal idsolicitud) {
        this.idsolicitud = idsolicitud;
    }
    public BigDecimal getEncasoliNumsolicitud() {
        return this.encasoliNumsolicitud;
    }
    
    public void setEncasoliNumsolicitud(BigDecimal encasoliNumsolicitud) {
        this.encasoliNumsolicitud = encasoliNumsolicitud;
    }
    public BigDecimal getLinea() {
        return this.linea;
    }
    
    public void setLinea(BigDecimal linea) {
        this.linea = linea;
    }
    public String getProductoCodproducto() {
        return this.productoCodproducto;
    }
    
    public void setProductoCodproducto(String productoCodproducto) {
        this.productoCodproducto = productoCodproducto;
    }
    public BigDecimal getCantsolicitada() {
        return this.cantsolicitada;
    }
    
    public void setCantsolicitada(BigDecimal cantsolicitada) {
        this.cantsolicitada = cantsolicitada;
    }
    public BigDecimal getProductoSedeIdSede() {
        return this.productoSedeIdSede;
    }
    
    public void setProductoSedeIdSede(BigDecimal productoSedeIdSede) {
        this.productoSedeIdSede = productoSedeIdSede;
    }




}


