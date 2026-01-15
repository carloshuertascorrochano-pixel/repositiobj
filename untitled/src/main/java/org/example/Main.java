package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Bocadillo pepito = new Bocadillo("pepito", "normal", "bacon", "barbacoa", 10);

        pepito.imprimirInfoBocata();

        System.out.println(pepito.getnombre() + " " + pepito.getPrecio() + "$");

        Bocadillo vacio = new Bocadillo();

        vacio.setnombre("chivito");

        vacio.imprimirInfoBocata();

    }
    
}