package org.example;

public class televisor {

    private int canal;
    private int volumen;

    private static final int def_canal = 1;
    private static final int def_volumen = 5;

    public televisor(int canal, int volumen) {
        this.canal = canal;
        this.volumen = volumen;
    }
    public televisor(){
        canal=def_canal;
        volumen=def_volumen;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }
    public void subircanal(){

        if(canal == 100){
            canal = 1;
        }else{
            canal = canal + 1;
        }

    }
    public void bajarCanal(){

        if (canal == 1){
            canal = 100;
        }else{
            canal = canal -1;
        }
        System.out.println("canal " + canal);
    }
    public void subirvolumen(){
        if (volumen <100){
            volumen = volumen + 1;
        }
        System.out.println("volumen " + volumen);
    }
    public void bajarvolumen(){
        if (volumen > 0){
            volumen = volumen +1;
        }
        System.out.println("volumen " + volumen);
    }


}