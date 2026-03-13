package coleccion.ejer3o4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class ejer3 {

    static void main(String[] args) {

        LinkedList<String> playlist = new LinkedList<>();


        playlist.offer("coches chocones");
        playlist.offer("manos en el ano");
        playlist.offer("ositos gominola");
        playlist.offer("La cafetera");

        while (!playlist.isEmpty()) {
            System.out.println(("Estado de la playlist " + playlist));
            System.out.println("Reproduciendo " + playlist.peek());
            playlist.poll();
            System.out.println("Estado de la playlist después de reproducirla canción " + playlist);
        }
        System.out.println("La playlist ha terminado");
    }

}