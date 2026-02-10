package PartidoTenis;

public class Set {

    private int puntosJ1;
    private int puntosJ2;

    public Set(int puntosJ1, int puntosJ2) {

        if (!puntuacionValida(puntosJ1, puntosJ2)) {
            throw new IllegalArgumentException("Puntuación de set no válida: "
                    + puntosJ1 + " - " + puntosJ2);
        }

        this.puntosJ1 = puntosJ1;
        this.puntosJ2 = puntosJ2;
    }

    private boolean puntuacionValida(int p1, int p2) {

        // No se permiten negativos
        if (p1 < 0 || p2 < 0) return false;

        // Caso normal: alguien llega a 6
        if (p1 == 6 && p2 <= 4) return true;
        if (p2 == 6 && p1 <= 4) return true;

        // Tie-break
        if (p1 == 7 && (p2 == 5 || p2 == 6)) return true;
        if (p2 == 7 && (p1 == 5 || p1 == 6)) return true;

        return false;
    }

    public int getPuntosJ1() {
        return puntosJ1;
    }

    public int getPuntosJ2() {
        return puntosJ2;
    }
}
