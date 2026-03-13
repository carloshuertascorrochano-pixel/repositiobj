package coleccion;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class colas {

    static void main(String[] args) {

        LinkedList <String> cola = new LinkedList<>();


        cola.offer("Blessd");
        cola.offer("Yatra");
        cola.offer("Morat");


        System.out.println(cola.poll());
        System.out.println(cola.peek());

        cola.offerFirst("Pirlo");
        System.out.println(cola.peek());
        System.out.println(cola.pollLast());

        Queue<String> cola2 = new ArrayBlockingQueue<>(2);

        cola2.offer("Jorge");
        cola2.offer("Adrian");
        cola2.offer("Jacobo");

        System.out.println(cola2);



    }
}
