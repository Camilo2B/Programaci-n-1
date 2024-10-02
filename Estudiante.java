package co.edu.uniquindio.poo;

public class Estudiante extends Persona {
    private int prestamosRealizados;

    public Estudiante(String nombre, String cedula, String telefono, String correo) {
        super(nombre, cedula, telefono, correo);
        this.prestamosRealizados = 0;
    }

    public int getPrestamosRealizados() {
        return prestamosRealizados;
    }

    public void incrementarPrestamos() {
        this.prestamosRealizados++;
    }

    @Override
    public String toString() {
        return getNombre() + " (" + getCedula() + ")";
    }
}
