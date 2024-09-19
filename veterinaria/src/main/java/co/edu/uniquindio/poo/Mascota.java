package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Mascota {
    private String nombre;
    private int edad;
    private EspecieOEspecialidad especie;
    private LinkedList<HistorialMedico> historialMedico;

    public Mascota(String nombre, int edad, EspecieOEspecialidad especie) {
        this.nombre = nombre;
        this.edad = edad;
        this.especie = especie;
        this.historialMedico = new LinkedList<>();
    }

    public void agregarHistorial(HistorialMedico historial) {
        historialMedico.add(historial);
    }

    public LinkedList<HistorialMedico> getHistorialMedico() {
        return historialMedico;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", especie=" + especie +
                '}';
    }
}
