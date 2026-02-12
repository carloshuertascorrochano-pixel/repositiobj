package carrefour;

import java.util.Scanner;

public class Cajero extends Persona{

       static Scanner teclado = new Scanner(System.in);

        private int caja;

        public Cajero(int codigo, String nombre, double sueldo){
            super(codigo,nombre,sueldo);

        }

        public int getCaja() {
            return caja;
        }

        public void setCaja(int caja) {
            this.caja = caja;
        }

        public void setcaja(){
            System.out.println("introduce caja");
            caja= teclado.nextInt();
            teclado.nextLine();
        }
    @Override
    public  void mostrarinfo(){
        super.mostrarinfo();
        System.out.println("cajero" + caja);


    }

    @Override
    public void trabajar() {
        System.out.println("cobrando productos");
    }


    @Override
    public int getCodigo() {
        return super.getCodigo();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public double getSueldo() {
        return super.getSueldo();
    }
}



