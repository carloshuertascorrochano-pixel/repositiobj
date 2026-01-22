package org.example;

public class libro {

    private static int cantidadlibros = 0;
    private static int librosdisp = 0;

    private static final String cadenaID = "LIB";

    private String autor;
    private String titulo;
    private boolean disponible;
    private String id;

    public libro(String autor, String titulo) {

        this.autor = autor;
        this.titulo = titulo;
        disponible = true;
        id = generarid();
        cantidadlibros++;
        librosdisp++;
    }

    private String generarid() {
        return cadenaID + cantidadlibros;
    }

    public void prestar() {
        if (disponible) {
            disponible = false;
            System.out.println("el libro " + titulo + " ha sido prestado");
            librosdisp--;
        } else {
            System.out.println("el libro " + titulo + " no esta disponible");
        }
    }

    public void devolver() {
        if (!disponible) {
            disponible = true;
            System.out.println("el libro " + titulo + " ha sido devuelto");
            librosdisp++;
        } else {
            System.out.println("el libro " + titulo + " esta disponible, no devuelvas");
        }
    }

    public boolean estadisponible() {
        return disponible;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {

        System.out.println("paciente [ autor " + autor + " de titulo" + titulo + " ]");
        return "";

    }
}