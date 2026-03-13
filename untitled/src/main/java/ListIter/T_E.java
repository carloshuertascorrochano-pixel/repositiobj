package ListIter;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class T_E {

    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ArrayList<Character> lista = new ArrayList<>();
        ListIterator<Character> it = lista.listIterator();

        String Frase = teclado.nextLine();

        for (Character letra : Frase.toCharArray()){

            switch (letra){

                case'-':
                    if(it.hasPrevious()){
                        it.previous();
                    }
                    break;
                case'+':
                    if(it.hasNext()){
                        it.next();
                    }
                    break;
                case'*':
                    if(it.hasPrevious()){
                        it.previous();
                        it.remove();
                    }
                    break;


                default:
                    it.add(letra);


            }
        }

        for (Character letra : lista){

            System.out.println(letra);

        }


    }
} // class solution