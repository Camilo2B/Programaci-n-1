package co.edu.uniquindio.poo;

public class Veterinario {
    private String nombre;
    private String licencia;
    private EspecieOEspecialidad especialidad;

    public Veterinario(String nombre, String licencia, EspecieOEspecialidad especialidad) {
        this.nombre = nombre;
        this.licencia = licencia;
        this.especialidad = especialidad;
    }

    @Override
    public String toString() {
        return "Veterinario{" +
                "nombre='" + nombre + '\'' +
                ", licencia='" + licencia + '\'' +
                ", especialidad=" + especialidad +
                '}';
    }
}
