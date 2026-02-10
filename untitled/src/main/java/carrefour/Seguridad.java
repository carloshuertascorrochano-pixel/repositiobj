package carrefour;

import java.util.ArrayList;
import java.util.Scanner;

    public class Seguridad extends Persona{

        static Scanner teclado = new Scanner(System.in);

        private String empresa;



        private ArrayList<String> listaarmas;

        public Seguridad(int codigo, String nombre, double sueldo){
            super(codigo,nombre,sueldo);

        }

        public String getEmpresa() {
            return empresa;
        }

        public void setEmpresa(String empresa) {
            this.empresa = empresa;
        }

        public void setcaja(){
            System.out.println("introduce caja");
            empresa = teclado.nextLine();
            teclado.nextLine();
        }

        public ArrayList<String> getListaarmas() {
            return listaarmas;
        }

        public void setListaarmas(ArrayList<String> listaarmas) {
            this.listaarmas = listaarmas;
        }

        @Override
        public  void mostrarinfo(){
            super.mostrarinfo();
            System.out.println("empresa " + empresa);
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


