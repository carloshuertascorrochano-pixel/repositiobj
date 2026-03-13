package mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejer2 {

    static Scanner teclado = new Scanner(System.in);

    static void main(String[] args) {

        System.out.println("Introduce la palabra");

        System.out.println("introduce una palabra...");
        String palabra = teclado.nextLine();

        HashMap<String, Integer> mapita = new HashMap<>();

    }
}
//        for (String palabra : palabra.split(" ")) {
//
//            if (mapita.containsKey(palabra)) {
//                mapita.put(palabra, mapita.get(palabra) + 1);
//
//            } else {
//
//                mapita.put(palabra,mapita.getOrDefault(palabra, 1));
//
//            }
//
//            for (Map.Entry<String, Integer> mapa : mapita.entrySet()) {
//
//                System.out.println(mapa.getKey() + ":" + mapa.getValue());
//
//
//            }
//        }
//    }
//}