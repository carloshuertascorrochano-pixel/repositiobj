package PartidoTenis;

public class ClaseJugador {



    private String nombre;
    private String rival;
    private int ranking;

    public ClaseJugador (String nombre, int ranking){

        this.nombre=nombre;
        this.ranking=ranking;

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public String getRival() {
        return rival;
    }

    public void setRival(String rival) {
        this.rival = rival;
    }
    @Override
    public String toString(){

        return "[nombre = " + nombre  + ", rival = " + rival + ", ranking = " + ranking + " .]";

    }
}
