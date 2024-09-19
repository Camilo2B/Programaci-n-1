package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Dueño {
    private String nombre;
    private String direccion;
    private String telefono;
    private LinkedList<Mascota> mascotas;

    public Dueño(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.mascotas = new LinkedList<>();
    }

    public void agregarMascota(Mascota mascota) {
        mascotas.add(mascota);
    }

    public LinkedList<Mascota> getMascotas() {
        return mascotas;
    }

    @Override
    public String toString() {
        return "Dueño{" +
                "nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
