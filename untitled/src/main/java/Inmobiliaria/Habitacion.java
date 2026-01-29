package Inmobiliaria;

import java.util.ArrayList;

public class Habitacion {



    private String nombre;
    private double metros;



    private ArrayList<Electrodomestico> listaElectrodomestico;
    public Habitacion (String nombre, double metros){
        this.nombre=nombre;
        this.metros=metros;
    }

    public void agregarElectrodomestico(String nombre, double cosumo){
        for (Electrodomestico electrodomestico : listaElectrodomestico) {

            if (Electrodomestico.getNombre().equals(nombre)) {
                System.out.println("El electrodomestico " + nombre + " existe");
                return;
            }
        }
        Inmobiliaria.Electrodomestico electrodomestico = new Electrodomestico(nombre, consumo);
        listaElectrodomestico.add(electrodomestico);

    }

    public static void mostrarElectrodomesticos(){




    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }
    public ArrayList<Electrodomestico> getListaElectrodomestico() {
        return listaElectrodomestico;
    }

    public void setListaElectrodomestico(ArrayList<Electrodomestico> listaElectrodomestico) {
        this.listaElectrodomestico = listaElectrodomestico;
    }
}
