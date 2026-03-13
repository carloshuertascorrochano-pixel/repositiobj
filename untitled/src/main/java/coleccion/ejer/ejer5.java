package coleccion.ejer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class ejer5 {

    static Scanner teclado = new Scanner(System.in);
    static void main(String[] args) {

        Deque <Character> cola = new LinkedList<>();
        String palabra = "reconocer";

        for (int i = 0; i < palabra.length(); i++) {

            cola.offer(palabra.charAt(i));

        }

        while(!cola.isEmpty()){
            if(cola.peekLast()==cola.peekFirst()){

                cola.pollFirst();
                cola.pollLast();

            }else{
                System.out.println("palabra no palindroma");
                break;
            }
        }
        if (cola.isEmpty()){
            System.out.println("palabra palindrona");
        }





        }

    }


