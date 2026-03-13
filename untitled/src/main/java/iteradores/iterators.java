package iteradores;

import Inmobiliaria.Immoapp;

import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

public class iterators {

    static void main(String[] args) {

        TreeSet<String> lista = new TreeSet<>();
        lista.add("Pikachu");
        lista.add("Charmander");
        lista.add("Squirtle");
        lista.add("Bulbasur");
        lista.add("Magikarp");


//        for (String pokemon : lista){
//
//            if(pokemon.equals("Squirtle")){
//                lista.remove(pokemon);
//            }
//
//        }

        Iterator<String> it= lista.iterator();

        while(it.hasNext()){

            String pokemon = it.next();

            if(pokemon.equals("Pikachu")){
                it.remove();
            }

            System.out.println(pokemon);

        }

        System.out.println(lista);


        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Nicki Nickole", 4);
        mapa.put("Hermion", 7);

        Iterator<Map.Entry<String,Integer>> mapita = mapa.entrySet().iterator();

        while(mapita.hasNext()){

            Map.Entry<String,Integer>novia = mapita.next();
            System.out.println(novia.getKey() + " ha durado " + novia.getValue());

            if(novia.getKey().equals("Hermion")){

                mapita.remove();

            }


        }
    }
}
