package examen1p2_josueespinal;
public class Peliculas extends Contenido{
    private String duracion;
    private String cines;
    private String streaming;
    private String plot;

    public Peliculas() {
        super();
    }

    public Peliculas(String duracion, String cines, String streaming, String plot) {
        this.duracion = duracion;
        this.cines = cines;
        this.streaming = streaming;
        this.plot = plot;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getCines() {
        return cines;
    }

    public void setCines(String cines) {
        this.cines = cines;
    }

    public String getStreaming() {
        return streaming;
    }

    public void setStreaming(String streaming) {
        this.streaming = streaming;
    }

    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "duracion=" + duracion + ", cines=" + cines + ", streaming=" + streaming + ", plot=" + plot + '}';
    }
    
    
}
