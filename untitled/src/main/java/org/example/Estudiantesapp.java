package org.example;

public class Estudiantesapp {
    public static void main(String[] args) {
        Estudiante jorge = new Estudiante("jorge", "1DAM", "jorge@gmail.com");
        System.out.println(jorge.getNia());
        System.out.println(jorge);

        Estudiante raul = new Estudiante("raul", "1DAM", "raul@gmail.com");
        System.out.println(raul.getNia());
        System.out.println(raul);

        Estudiante adrian = new Estudiante("adrian ", "1DAM", "adrian@gmail.com");
        System.out.println(adrian.getNia());
        System.out.println(adrian);
        System.out.println(adrian.getNombre());

        System.out.println("hay " + Estudiante.OBtotalEST() + " estudiantes");

        libro biblia = new libro ( "jesuscristo", "biblia");

        System.out.println(biblia.estadisponible());
        System.out.println(biblia);
    }
}
