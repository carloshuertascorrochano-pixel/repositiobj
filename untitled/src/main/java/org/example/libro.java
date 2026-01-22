package org.example;

public class libro {

    private static int cantidadlibros = 0;
    private static int librosdisp = 0;

    private static final String cadenaID = "LIB";

    private String autor;
    private String titulo;
    private boolean disponible;
    private String id;
    private Estudiante estudiantePrestado;

    public libro(String autor, String titulo) {

        this.autor = autor;
        this.titulo = titulo;
        disponible = true;
        id = generarid();
        cantidadlibros++;
        librosdisp++;
        //no estabas
        estudiantePrestado = null;
    }
    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }
    private String generarid() {
        return cadenaID + cantidadlibros;
    }
    // no estabas mira prestar

    public void prestar(Estudiante estudiante) {
        if (disponible) {
            disponible = false;
            System.out.println("el libro " + titulo + " ha sido prestado a " + estudiante.getNombre() + " de " + estudiante.getCurso());
            librosdisp--;
            //mire sao
            estudiantePrestado=estudiante;
        } else {
            System.out.println("el libro " + titulo + " no esta disponible");
        }
    }
//mire aqui tambien
    public void devolver(Estudiante estudiante) {
        if (!disponible) {
            disponible = true;
            System.out.println("el libro " + titulo + " ha sido devuelto");
            librosdisp++;
            //broooooooooooo
            estudiantePrestado=null;
        } else {
            System.out.println("el libro " + titulo + " esta disponible, no devuelvas" + estudiante.getNombre() + " de " + estudiante.getCurso());
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
// mire to String
    @Override
    public String toString() {

        System.out.println("paciente [ autor " + autor + " de titulo" + titulo + "estudiante" + estudiantePrestado + " ]");
        return "";

    }
}