package examen1p2_josueespinal;

public class Miniseries extends Contenido{
    private int temporadas;
    private String genero;
    private int duracion;
    private String descripcion;

    public Miniseries() {
        super();
    }

    public Miniseries(int temporadas, String genero, int duracion, String descripcion) {
        this.temporadas = temporadas;
        this.genero = genero;
        this.duracion = duracion;
        this.descripcion = descripcion;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Miniseries{" + "temporadas=" + temporadas + ", genero=" + genero + ", duracion=" + duracion + ", descripcion=" + descripcion + '}';
    }
    
}
