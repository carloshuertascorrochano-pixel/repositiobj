package coleccion;

import java.util.ArrayList;
import java.util.Stack;

public class coleccion {

    static void main(String[] args) {

        ArrayList<Integer> listanums = new ArrayList<>();

        Stack<Integer> pila = new Stack<>();
        pila.push(2);
        pila.push(9);
        pila.push(12);


        System.out.println(pila.peek());
        pila.pop();
        System.out.println(pila.peek());

    }


}
