package MUXAMIELesCACA;

public abstract class MUrxamielFC {

    private String nombre;
    private int edad;


    public MUrxamielFC(String nombre, int edad){
        this.nombre=nombre;
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public abstract void equipoMurxamielFC();

    @Override
    public String toString() {
        return "MUrxamielFC{" +
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
