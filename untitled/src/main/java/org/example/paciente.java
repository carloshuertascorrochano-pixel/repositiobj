package org.example;

import java.util.Random;

public class paciente {

    Random aleatorio = new Random();
    private static final char def_genero= 'X';
    private String nombre;
    private int edad;
    private String dni = "";
    private char gemero;
    private double peso;
    private int altura;

    public paciente (String nombre,int edad,char gemero,double peso,int altura){
        this.nombre=nombre;
        this.edad=edad;
        dni=generardni();
        this.gemero=gemero;
        this.peso=peso;
        this.altura=altura;




    }
    public paciente(){

        this(null,0,def_genero,0,0);
    }
    public String generardni(){

        for (int i = 0; i < 8; i++) {
            int num = aleatorio.nextInt(10);

        }

        return dni;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public char getGemero() {
        return gemero;
    }

    public void setGemero(char gemero) {
        this.gemero = gemero;
    }
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
