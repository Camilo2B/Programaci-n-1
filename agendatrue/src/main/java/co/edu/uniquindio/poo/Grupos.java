package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Grupos {
    private String nombre;
    private Categoria categoria;
    private List<Contactos> contactos;

    public enum Categoria {
        OFICINA,
        FIESTA,
        AMIGOS,
        FAMILIA
    }

    public Grupos(String nombre, Categoria categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.contactos = new LinkedList<>();
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public List<Contactos> getContactos() {
        return contactos;
    }

    // Métodos para agregar y eliminar contactos
    public boolean agregarContacto(Contactos contacto) {
        if (contactos.size() < 5 && !contactos.contains(contacto)) {
            contactos.add(contacto);
            return true;
        }
        return false;
    }

    public boolean eliminarContacto(Contactos contacto) {
        return contactos.remove(contacto);
    }

    @Override
    public String toString() {
        return "Grupo: " + nombre + " (" + categoria + "), Contactos: " + contactos;
    }
}