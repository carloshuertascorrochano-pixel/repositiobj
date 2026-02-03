package Inmobiliaria;

public class Electrodomestico {



    private String nombre;
    private double consumo;


    public Electrodomestico (String nombre, double consumo){
        this.nombre=nombre;
        this.consumo=consumo;

    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }



}
