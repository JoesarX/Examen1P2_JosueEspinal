package examen1p2_josueespinal;

public class Contenido {
    private String nombre;

    public Contenido() {
    }

    public Contenido(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Contenido{" + "nombre=" + nombre + '}';
    }
    
}
