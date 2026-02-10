package PartidoTenis;

public class ClaseJugador {

    private String nombre;
    private int ranking;
    private ClaseJugador rival;

    public ClaseJugador(String nombre, int ranking) {
        this.nombre = nombre;
        this.ranking = ranking;
        this.rival = null;
    }

    public String getNombre() {
        return nombre;
    }

    public int getRanking() {
        return ranking;
    }

    public ClaseJugador getRival() {
        return rival;
    }

    public void setRival(ClaseJugador rival) {
        this.rival = rival;
    }
}
