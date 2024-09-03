package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class Reuniones {
    private String descripcion;
    private LocalDate fecha;
    private LocalTime hora;
    private List<Contactos> asistentes;

    public Reuniones(String descripcion, LocalDate fecha, LocalTime hora) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.asistentes = new LinkedList<>();
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public List<Contactos> getAsistentes() {
        return asistentes;
    }

    // Métodos para agregar y eliminar personas que asistirán a la reunión
    public boolean agregarAsistente(Contactos contacto) {
        if (!asistentes.contains(contacto)) {
            asistentes.add(contacto);
            return true;
        }
        return false;
    }

    public boolean eliminarAsistente(Contactos contacto) {
        return asistentes.remove(contacto);
    }

    @Override
    public String toString() {
        return "Reunión: " + descripcion + ", Fecha: " + fecha + ", Hora: " + hora + ", Asistentes: " + asistentes;
    }
}