package examen1p2_josueespinal;

public class Series extends Contenido{
    private String temporadas;
    private String clasificacion;
    private String estreno;
    private String actores;

    public Series() {
        super();
    }

    public Series(String temporadas, String clasificacion, String estreno, String actores) {
        this.temporadas = temporadas;
        this.clasificacion = clasificacion;
        this.estreno = estreno;
        this.actores = actores;
    }

    public String getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(String temporadas) {
        this.temporadas = temporadas;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public String getEstreno() {
        return estreno;
    }

    public void setEstreno(String estreno) {
        this.estreno = estreno;
    }

    public String getActores() {
        return actores;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return "Series{" + "temporadas=" + temporadas + ", clasificacion=" + clasificacion + ", estreno=" + estreno + ", actores=" + actores + '}';
    }
    
}
