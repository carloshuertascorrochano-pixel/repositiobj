package Biblio;

import java.util.ArrayList;

public class Editorial {


    private String nombre;
    private String pais;
    private ArrayList<libro> listalibro;
    public Editorial (String nombre, String pais){
        this.nombre=nombre;
        this.pais=pais;
    }
    public Editorial (){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

}
