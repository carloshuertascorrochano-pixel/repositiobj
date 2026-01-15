package org.example;

public class Persona {

    private String nombre;
    private String DNI;
    private int edad;


    public Persona(String nombre, String DNI, int edad) {
        this.nombre = nombre;
        this.DNI = DNI;
        this.edad = edad;
    }

    public Persona() {
    }


    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String nombre) {
        this.nombre = DNI;
    }

    public void imprimirInfoPersona() {

        System.out.println("nombre: " + nombre);
        System.out.println("tipo pan: " + DNI);
        System.out.println("Ingredientes: " + edad);

    }

}