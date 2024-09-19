package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class VeterinariaApp {
    private String nombre;
    private String direccion;
    private String telefono;
    private LinkedList<Veterinario> veterinarios;
    private LinkedList<Dueño> dueños;

    public VeterinariaApp(String nombre, String direccion, String telefono) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.veterinarios = new LinkedList<>();
        this.dueños = new LinkedList<>();
    }

    public void agregarVeterinario(Veterinario veterinario) {
        veterinarios.add(veterinario);
    }

    public void agregarDueño(Dueño dueño) {
        dueños.add(dueño);
    }

    public void mostrarDatosVeterinaria() {
        System.out.println("Veterinaria: " + nombre);
        System.out.println("Dirección: " + direccion);
        System.out.println("Teléfono: " + telefono);
        System.out.println("\nVeterinarios:");
        for (Veterinario vet : veterinarios) {
            System.out.println(vet);
        }
        System.out.println("\nDueños y sus Mascotas:");
        for (Dueño dueño : dueños) {
            System.out.println(dueño);
            for (Mascota mascota : dueño.getMascotas()) {
                System.out.println(" Mascota: " + mascota);
                for (HistorialMedico historial : mascota.getHistorialMedico()) {
                    System.out.println("  Historial: " + historial);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Crear veterinarios
        Veterinario vet1 = new Veterinario("Dr. Harder", "VET123", EspecieOEspecialidad.PERROS);
        Veterinario vet2 = new Veterinario("Dra. Ruiz", "VET456", EspecieOEspecialidad.GATOS);

        // Crear veterinaria
        VeterinariaApp clinica = new VeterinariaApp("Salud Animal", "Calle  123", "312xxx");

        // Agregar veterinarios
        clinica.agregarVeterinario(vet1);
        clinica.agregarVeterinario(vet2);

        // Crear dueños y mascotas
        Dueño dueño1 = new Dueño("Erwin", "Calle 567", "311xxx");
        Mascota mascota1 = new Mascota("Ahri", 3, EspecieOEspecialidad.PERROS);
        Mascota mascota2 = new Mascota("Lupe", 2, EspecieOEspecialidad.GATOS);

        // Agregar mascotas al dueño
        dueño1.agregarMascota(mascota1);
        dueño1.agregarMascota(mascota2);

        // Crear historial médico
        HistorialMedico historial1 = new HistorialMedico(LocalDate.now(), "Infección", "Antibióticos", "Control en 1 semana", vet1);
        HistorialMedico historial2 = new HistorialMedico(LocalDate.now(), "Desparasitación", "Píldoras", "Una dosis diaria", vet2);

        // Agregar historial a las mascotas
        mascota1.agregarHistorial(historial1);
        mascota2.agregarHistorial(historial2);

        // Agregar dueño a la clínica
        clinica.agregarDueño(dueño1);

        // Mostrar datos de la veterinaria
        clinica.mostrarDatosVeterinaria();
    }
}
