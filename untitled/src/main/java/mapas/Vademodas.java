package mapas;

import java.util.Scanner;

public class Vademodas {
    // Asume fichero llamado solution.java
    public class solution {

        static java.util.Scanner in;
        static Scanner teclado = new Scanner(System.in);

        public static boolean casoDePrueba() {

            int num = teclado.nextInt();

            if (num == 0) {
                return false;
            } else {
                return true;
            }
        }
        public static void main(String[] args) {
            in = new java.util.Scanner(System.in);
            while (casoDePrueba()) {

                

            }
        }
    }
}

