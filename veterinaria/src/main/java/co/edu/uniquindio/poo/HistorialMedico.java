package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class HistorialMedico {
    private LocalDate fecha;
    private String diagnostico;
    private String tratamiento;
    private String observaciones;
    private Veterinario veterinario;

    public HistorialMedico(LocalDate fecha, String diagnostico, String tratamiento, String observaciones, Veterinario veterinario) {
        this.fecha = fecha;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
        this.observaciones = observaciones;
        this.veterinario = veterinario;
    }

    @Override
    public String toString() {
        return "HistorialMedico{" +
                "fecha=" + fecha +
                ", diagnostico='" + diagnostico + '\'' +
                ", tratamiento='" + tratamiento + '\'' +
                ", observaciones='" + observaciones + '\'' +
                ", veterinario=" + veterinario +
                '}';
    }
}
