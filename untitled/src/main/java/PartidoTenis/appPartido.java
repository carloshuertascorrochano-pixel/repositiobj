package PartidoTenis;

public class appPartido {

    public static void main(String[] args) {

        // Crear jugadores
        ClaseJugador j1 = new ClaseJugador("Nadal", 1);
        ClaseJugador j2 = new ClaseJugador("Djokovic", 2);

        // Crear partido
        Partido partido = new Partido(j1, j2);

        // Insertar sets
        partido.insertarSet(6, 4);
        partido.insertarSet(7, 6);

        // Mostrar jugadores y rivales
        System.out.println("Jugador 1: " + j1.getNombre()
                + " | Rival: " + j1.getRival().getNombre());


        System.out.println("Jugador 2: " + j2.getNombre()
                + " | Rival: " + j2.getRival().getNombre());

        // Mostrar sets
        System.out.println("\nPuntuación de los sets:");
        int contador = 1;
        for (Set s : partido.getSets()) {
            System.out.println("Set " + contador + ": "
                    + s.getPuntosJ1() + " - " + s.getPuntosJ2());
            contador++;
        }

        // Total de sets
        System.out.println("\nTotal de sets jugados: "
                + partido.getSets().size());
    }
}


