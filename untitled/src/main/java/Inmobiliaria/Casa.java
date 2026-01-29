package Inmobiliaria;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {

    static Scanner teclado = new Scanner(System.in);
    private ArrayList<Habitacion> listaHabitacion;
    private String direccion;


    private Propietario propietario;

    public Casa(String direccion) {
        this.direccion = direccion;
        listaHabitacion = new ArrayList<>();
        setPropietario();
    }

    public void mostrarHabitacion() {

        System.out.println("casa " + direccion + " tiene " + listaHabitacion.size());
        for (Habitacion habitacion : listaHabitacion) {
            System.out.println(habitacion.getNombre() + habitacion.getMetros());
        }
    }

    public Habitacion getHabitacionMasGrande() {

        Habitacion mayor = listaHabitacion.get(0);
        for (Habitacion habitacion : listaHabitacion) {
            if (habitacion.getMetros() > mayor.getMetros()) {
                mayor = habitacion;
            }
        }
        return mayor;
    }

    public void eliminarHabitaciones(String nombre) {

        for (Habitacion habitacion : listaHabitacion) {
            if (habitacion.getNombre().equals(nombre)) {
                listaHabitacion.remove(habitacion);
                System.out.println("Habitación " + nombre + " borrada con exito");
                return;
            }
        }
    }

    public void crearHabitacion(String nombre, double metros) {

        for (Habitacion habitacion : listaHabitacion) {

            if (habitacion.getNombre().equals(nombre)) {
                System.out.println("la habitacion " + nombre + " existe");
                return;
            }

        }

        Habitacion habitacion = new Habitacion(nombre, metros);
        listaHabitacion.add(habitacion);

    }

    public ArrayList<Habitacion> getListaHabitacion() {
        return listaHabitacion;
    }

    public void setListaHabitacion(ArrayList<Habitacion> listaHabitacion) {
        this.listaHabitacion = listaHabitacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario() {
        System.out.println("introduce nombre propietario");
        String nombre = teclado.next();
        teclado.nextLine();
        int edad = teclado.nextInt();
        this.propietario = propietario;
        System.out.println( nombre + " propietario");
    }
}