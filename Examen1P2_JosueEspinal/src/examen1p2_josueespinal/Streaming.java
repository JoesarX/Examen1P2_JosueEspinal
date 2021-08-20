
package examen1p2_josueespinal;

import java.util.ArrayList;

public class Streaming {
    
    private String nombre;
    private double precio;
    private String calificacion;
    private String fecha;
    private String empresa;
    private ArrayList<Contenido> c = new ArrayList<Contenido>();

    public Streaming() {
        
    }

    public Streaming(String nombre, double precio, String calificacion, String fecha, String empresa) {
        this.nombre = nombre;
        this.precio = precio;
        this.calificacion = calificacion;
        this.fecha = fecha;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<Contenido> getC() {
        return c;
    }

    public void setC(Contenido c) {
        this.c.add(c);
    }

    @Override
    public String toString() {
        return "Streaming{" + "nombre=" + nombre + ", precio=" + precio + ", calificacion=" + calificacion + ", fecha=" + fecha + ", empresa=" + empresa + ", c=" + c + '}';
    }
    
    
}
