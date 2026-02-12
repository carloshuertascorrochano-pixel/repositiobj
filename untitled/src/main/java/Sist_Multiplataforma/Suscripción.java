package Sist_Multiplataforma;

public abstract class Suscripción {




    private String nombrePlan;
    private double precio;

    public Suscripción (String nombrePlan, double precio){

        this.nombrePlan=nombrePlan;
        this.precio=precio;

    }

    public static void mostrarinfo(String nombrePlan, double precio){

        System.out.println("Nombre del Plan" + nombrePlan + " " + ", El precio es " + precio);

    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }


    public abstract void obtenerbeneficios();

    @Override
    public String toString() {
        return "Suscripción{" +
                "nombrePlan='" + nombrePlan + '\'' +
                ", precio=" + precio +
                '}';
    }
}
