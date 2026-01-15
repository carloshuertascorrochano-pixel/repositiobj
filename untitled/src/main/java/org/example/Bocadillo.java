package org.example;

public class Bocadillo {
    private String nombre;
    private String pan;
    private String ingredientes;
    private String salsas;
    private double precio;


    public Bocadillo(String nombre, String pan, String ingredientes, String salsas, double precio) {
        this.nombre = nombre;
        this.pan=pan;
        this.ingredientes =ingredientes;
        this.salsas=salsas;
        this.precio=precio;

    }
    public Bocadillo(){
    }
    public String getnombre (){
        return nombre;
    }
    public void setnombre (String nombre){
        this.nombre = nombre;
    }
    public String getpan (){
        return pan;
    }
    public void setpan (String pan){
        this.pan = pan;
    }
    public String getingredientes (){
        return ingredientes;
    }
    public void setingredientes (String ingredientes){
        this.ingredientes = ingredientes;
    }
    public String getsalsas (){
        return salsas;
    }
    public void setSalsas (String salsas){
        this.salsas = salsas;
    }
    public double getPrecio (){
        return precio;
    }
    public void setPrecio (double precio){
        this.precio = precio;
    }

    public void imprimirInfoBocata (){

        System.out.println("nombre: " + nombre);
        System.out.println("tipo pan: " + pan);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("salsas" + salsas);
        System.out.println("precio" + precio);

    }
}