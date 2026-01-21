package org.example;

import java.util.Scanner;

public class apppaciente {

    public static void main(String[] args){
//    paciente carlos = new paciente("carlos", 80, 'H', 40, 160);
//
//        System.out.println(carlos.getDni());
//
//        if (carlos.EsMayorDeEdad()){
//            System.out.println("mayor");
//        }else{
//            System.out.println("menor");
//        }
//
//
//        paciente pablo = new paciente ("pablo", 80, 'H', 40, 160);
//
//        System.out.println(pablo.getGemero());
        Scanner entrada = new Scanner(System.in);

        System.out.println("Introduce el nombre, la edad, sexo, peso y altura.");
        System.out.println("nombre");
        String nombre = entrada.nextLine();
        System.out.println("edad");
        int edad = entrada.nextInt();
        System.out.println("peso");
        double peso = entrada.nextDouble();
        System.out.println("altura");
        double altura = entrada.nextDouble();


        paciente pedroSanchez = new paciente ( nombre, edad, 'H', peso, altura);




    }
}
