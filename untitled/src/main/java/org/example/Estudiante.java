package org.example;

public class Estudiante {

    private static String correo = "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";
    private static int cont_est = 0;
    private String nombre;
    private String curso;
    private String email;
    private int nia;

    public Estudiante(String nombre, String curso, String email) {

        this.email = email;
        this.curso = curso;
        this.nombre = nombre;
        this.nia = cont_est++;

    }

    public Estudiante(String nombre) {
        this(nombre, "", "");
    }

    public static boolean validarcorreo(String correo) {
        if (correo.matches(correo)) {
            return true;
        } else {
            return false;
        }
    }

    public static int OBtotalEST() {

        return cont_est;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNia() {
        return nia;
    }

    public void setNia(int nia) {
        this.nia = nia;
    }

    @Override
    public String toString() {

        System.out.println("paciente [nombre = " + nombre + " ]");
        return "";
    }
}