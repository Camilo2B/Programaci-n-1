package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Prestamo {
    private Estudiante estudiante;
    private Bibliotecario bibliotecario;
    private LinkedList<Libro> libros;

    public Prestamo(Estudiante estudiante, Bibliotecario bibliotecario) {
        this.estudiante = estudiante;
        this.bibliotecario = bibliotecario;
        this.libros = new LinkedList<>();
        bibliotecario.incrementarPrestamos();
        estudiante.incrementarPrestamos();
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void agregarLibro(Libro libro) {
        if (libro != null && libro.getCantidadPrestamos() < libro.getUnidadesDisponibles()) {
            libros.add(libro);
            libro.incrementarPrestamos();
        } else {
            System.out.println("No hay más unidades disponibles de este libro.");
        }
    }

    @Override
    public String toString() {
        return "Préstamo realizado por: " + estudiante + ", Bibliotecario: " + bibliotecario + ", Libros: " + libros;
    }
}
