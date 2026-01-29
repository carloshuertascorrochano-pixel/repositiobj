package Inmobiliaria;

public class Immoapp {

    public static void  main (String[] args){


        Casa pisito = new Casa ("Calle Falsa 123");

        pisito.crearHabitacion("cocina", 20);
        pisito.crearHabitacion("baño", 7);
        pisito.crearHabitacion("comedor", 40);
        pisito.crearHabitacion("comedor", 40);

       pisito.mostrarHabitacion();
        System.out.println("Habitacion mas grande = " + pisito.getHabitacionMasGrande());

        pisito.eliminarHabitaciones("baño");

    }
}
