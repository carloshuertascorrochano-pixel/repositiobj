package PartidoTenis;

import java.util.ArrayList;

public class Partido {

    private ClaseJugador jugador1;
    private ClaseJugador jugador2;
    private ArrayList<Set> sets;

    public Partido(ClaseJugador jugador1, ClaseJugador jugador2) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;

        // Relación reflexiva
        jugador1.setRival(jugador2);
        jugador2.setRival(jugador1);

        this.sets = new ArrayList<>();
    }

    public void insertarSet(int puntosJ1, int puntosJ2) {
        Set nuevoSet = new Set(puntosJ1, puntosJ2);
        sets.add(nuevoSet);
    }

    public ArrayList<Set> getSets() {
        return sets;
    }

    public ClaseJugador getJugador1() {
        return jugador1;
    }

    public ClaseJugador getJugador2() {
        return jugador2;
    }
}
