package formiguer;

import java.time.LocalDate;
import java.util.Scanner;

import lombok.*;


import lombok.NoArgsConstructor;

@NoArgsConstructor



public class Invitado {
    Scanner entrada = new Scanner(System.in);
    @Getter @Setter
    private String nombre;
    @Getter @Setter
    private String profesión;
    @Getter
    private LocalDate fecha_visita;
    @Getter @Setter
    private int temporada;

    public Invitado(String carlo, String zambombero, int temporada) {

    }

    public void fecha_visita(int visita){
        System.out.println("Primera fecha invitado" );
        int visita2 = entrada.nextInt();
        System.out.println("Segunda fecha");
        int visita1 = entrada.nextInt();
        System.out.println("tercera fecha");
        int visita3 = entrada.nextInt();
    }
//    public int vecesinvitados(String nombre){
//
//    }
//    public int invitadostemporada(){}



    }

