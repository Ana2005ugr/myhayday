package modelos;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author pc
 */
public class Trigo {
    public static final String ICONO = "/img/trigo.png";
    public static final int DURACION =2;
    public static final int EXPERIENCIA = 1;
    public static final int PRECIO_VENTA = 2;
    public static final int RIEGO = 10;
    
    private String icono;
    private int duracionProduccion;
    private int experienciaRecolecta;
    private int precioVenta;
    private int riego;
    
    
    public Trigo(String icono, int duracionProduccion, int experienciaRecolecta, int precioVenta, int Riego){
        this.icono = icono;
        this.duracionProduccion = duracionProduccion;
        this.experienciaRecolecta = experienciaRecolecta;
        this.precioVenta = precioVenta;
    }
    
    public Trigo(){
        this(ICONO,DURACION,EXPERIENCIA, PRECIO_VENTA, RIEGO);
    }
    
    public Trigo(Trigo otro){
        this(otro.icono, otro.duracionProduccion, otro.experienciaRecolecta, otro.precioVenta, otro.riego);
    }
    
    public String geticono(){
        return icono;
    }
    public void seticono(){
        this.icono = icono;
    }

    public int getDuracionProduccion() {
        return duracionProduccion;
    }
    public void setDuracionProduccion(int duracionProduccion) {
        this.duracionProduccion = duracionProduccion;
    }
    
    public int getexperienciaRecolecta(){
        return experienciaRecolecta;
    }
    public void setexperienciaRecolecta(int experienciaRecolecta){
        this.experienciaRecolecta = experienciaRecolecta;
    }
    
    public int getprecioVenta(){
        return precioVenta;
    }
    public void setprecioVenta(){
        this.precioVenta = precioVenta;
    }
    
    public int getRiego(){
        return riego;
    }
    public void setRiego(){
        this.riego = riego;
    }
}
