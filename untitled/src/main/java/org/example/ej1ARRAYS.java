package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ej1ARRAYS {
    public static void main(String[] args) {

        ArrayList<String> listacompra = new ArrayList<>();

        System.out.println("Lista vacia " + listacompra.isEmpty());

        listacompra.add("terraneitor");
        listacompra.add("gluten");

        System.out.println("Lista vacia " + listacompra.isEmpty());


        System.out.println(listacompra);

        listacompra.addAll(Arrays.asList("pan", "lenteja", "jamon", "yogur", "pepinos"));

        System.out.println(listacompra);

        System.out.println("Elementos en la lista " + listacompra.get(2));

        listacompra.remove(2);

        listacompra.add(2,"queso");

        System.out.println(listacompra);

        System.out.println("El queso esta en la posición " + listacompra.indexOf("queso"));

        System.out.println(listacompra.size());

        ArrayList<String> copia = new ArrayList<>(listacompra);

        copia.clear();

        System.out.println(copia.isEmpty());

        System.out.println(copia.equals(listacompra));

        copia.addAll(Arrays.asList("pan", "lenteja"));

        System.out.println(copia);
        

        ArrayList<Integer> preciocompra = new ArrayList<>();

        preciocompra.addAll(Arrays.asList(24, 7, 92, 15, 38, 61, 4, 73, 56, 88));

        System.out.println(listacompra);
        System.out.println(preciocompra);



    }

}
