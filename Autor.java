package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Autor {
    private String nombre;
    private LinkedList<Libro> libros;

    public Autor(String nombre) {
        this.nombre = nombre;
        this.libros = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Libro> getLibros() {
        return libros;
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
