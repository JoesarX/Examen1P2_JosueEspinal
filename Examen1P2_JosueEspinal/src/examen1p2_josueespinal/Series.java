package examen1p2_josueespinal;

public class Series extends Contenido{
    private int temporadas;
    private String clasificacion;
    private String estreno;
    private int actores;

    public Series() {
        super();
    }

    public Series(int temporadas, String clasificacion, String estreno, int actores) {
        this.temporadas = temporadas;
        this.clasificacion = clasificacion;
        this.estreno = estreno;
        this.actores = actores;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
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

    public int getActores() {
        return actores;
    }

    public void setActores(int actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return "Series{" + "temporadas=" + temporadas + ", clasificacion=" + clasificacion + ", estreno=" + estreno + ", actores=" + actores + '}';
    }
    
}
