package PartidoTenis;

public class Set {

    private int puntosJ2;
    private int puntosJ1;

    public Set (int puntosJ1, int puntosJ2){
    this.puntosJ1=puntosJ1;
    this.puntosJ2=puntosJ2;


    }

    public int getPuntosJ1() {
        return puntosJ1;
    }

    public void setPuntosJ1(int puntosJ1) {
        this.puntosJ1 = puntosJ1;
    }

    public int getPuntosJ2() {
        return puntosJ2;
    }

    public void setPuntosJ2(int puntosJ2) {
        this.puntosJ2 = puntosJ2;
    }

    @Override
     public String toString(){

        return "[puntosJ1 = " + puntosJ1  + ", puntosJ1 = " + puntosJ2 + " .";

    }
}
