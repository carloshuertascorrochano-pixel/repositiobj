package Biblio;

import java.time.LocalDateTime;

public class Prestamo {
    
    private libro Libro;
    private Estudiante estudiante;
    private LocalDateTime fecha;
    
    public Prestamo (libro Libro,Estudiante estudiante){
        
        fecha=LocalDateTime.now();
        this.estudiante=estudiante;
        this.Libro = Libro;
        
        
    }
    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public libro getLibro() {
        return Libro;
    }

    public void setLibro(libro libro) {
        Libro = libro;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
