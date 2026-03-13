package MUXAMIELesCACA;

import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

public class Entrenador extends MUrxamielFC{
    Scanner entrada = new Scanner(System.in);

    @Setter
    @Getter
    private Equipos equipos;
   @Setter
   @Getter
   private String formacionPreferida;



   public Entrenador (Equipos equipos, String formacionPreferida , String nombre, int edad){

       this.equipos=equipos;
       this.formacionPreferida=formacionPreferida;
       super(nombre,edad);
   }

   public void planificarentrenamiento(){

       System.out.println("todos cagaran mucho asi que trae paraguas");
       System.out.println("Introduce forma de la caca");
        String caca = entrada.next();

   }



    @Override
    public void equipoMurxamielFC() {
    }

    @Override
    public String toString() {
        return "Entrenador{" +
                "equipos=" + equipos +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }

}
