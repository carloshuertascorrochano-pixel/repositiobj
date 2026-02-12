package carrefour;

import java.util.Scanner;


public class Reponedor extends Persona{

        static Scanner teclado = new Scanner(System.in);

        private int pasillo;

        public Reponedor(int codigo, String nombre, double sueldo){
            super(codigo,nombre,sueldo);

        }

        public int getCaja() {
            return pasillo;
        }

        public void setCaja(int caja) {
            this.pasillo = caja;
        }

        public void setcaja(){
            System.out.println("introduce caja");
            pasillo= teclado.nextInt();
            teclado.nextLine();
        }
        @Override
        public  void mostrarinfo(){
            super.mostrarinfo();
            System.out.println("pasillo " + pasillo);


        }

    @Override
    public void trabajar() {

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




