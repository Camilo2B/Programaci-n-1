package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.LinkedList;
import java.util.List;

public class AgendaApp {
    private static List<Contactos> contactos = new LinkedList<>();
    private static List<Grupos> grupos = new LinkedList<>();
    private static List<Reuniones> reuniones = new LinkedList<>();

    public static void main(String[] args) {
        // Crear contactos
        Contactos contacto1 = new Contactos("Erwin", "Harder", "xxxx", "312xxxx", "erwinj.uqvirtual.edu.co");
        Contactos contacto2 = new Contactos("Camilo", "Ruiz", "00000", "3100000", "camilor.uqvirtual.edu.co");
        Contactos contacto3 = new Contactos("Laura", "Lr", "00000", "5678", "laura.uqvirtual.edu.co");
        Contactos contacto4 = new Contactos("Pedro", "Pd", "00000", "312xxxx", "pedro.uqvirtual.edu.co");
        Contactos contacto5 = new Contactos("Nikoll", "Nk", "00000", "3134", "nikoll.uqvirtual.edu.co");
        Contactos contacto6 = new Contactos("Santiago", "Harder", "xxxx", "2222", "santiago.uqvirtual.edu.co");
        Contactos contacto7 = new Contactos("Camila", "Cam", "00000", "1111", "camila.uqvirtual.edu.co");
        Contactos contacto8 = new Contactos("Andres", "And", "00000", "7777", "andres.uqvirtual.edu.co");
        Contactos contacto9 = new Contactos("Pedro", "Pd", "00000", "312xxxx", "pedro.uqvirtual.edu.co");
        Contactos contacto10 = new Contactos("Juliana", "Juli", "00000", "5555", "juliana.uqvirtual.edu.co");


        // Agregar contactos a la lista
        agregarContacto(contacto1);
        agregarContacto(contacto2);
        agregarContacto(contacto3);
        agregarContacto(contacto4);
        agregarContacto(contacto5);
        agregarContacto(contacto6);
        agregarContacto(contacto7);
        agregarContacto(contacto8);
        agregarContacto(contacto9);
        agregarContacto(contacto10);


        // Crear grupos y agregar contactos
        Grupos grupoAmigos = new Grupos("Amigos", Grupos.Categoria.AMIGOS);
        Grupos grupoFamilia = new Grupos("Familia", Grupos.Categoria.FAMILIA);
        Grupos grupoFiesta = new Grupos("Fiesta", Grupos.Categoria.FIESTA);
        Grupos grupoOficina = new Grupos("Oficina", Grupos.Categoria.OFICINA);

        grupoAmigos.agregarContacto(contacto1);
        grupoAmigos.agregarContacto(contacto2);
        grupoAmigos.agregarContacto(contacto3);
        grupoAmigos.agregarContacto(contacto4);
        grupoAmigos.agregarContacto(contacto5);
        grupoFamilia.agregarContacto(contacto6);
        grupoFamilia.agregarContacto(contacto7);
        grupoFamilia.agregarContacto(contacto8);
        grupoFamilia.agregarContacto(contacto9);
        grupoFamilia.agregarContacto(contacto10);
        grupoFiesta.agregarContacto(contacto1);
        grupoFiesta.agregarContacto(contacto3);
        grupoFiesta.agregarContacto(contacto5);
        grupoFiesta.agregarContacto(contacto7);
        grupoFiesta.agregarContacto(contacto9);
        grupoOficina.agregarContacto(contacto2);
        grupoOficina.agregarContacto(contacto4);
        grupoOficina.agregarContacto(contacto6);
        grupoOficina.agregarContacto(contacto8);
        grupoOficina.agregarContacto(contacto10);

        // Agregar grupos a la lista
        grupos.add(grupoAmigos);
        grupos.add(grupoFamilia);
        grupos.add(grupoFiesta); 
        grupos.add(grupoOficina); 

        // Crear una reunión y agregar asistentes
        Reuniones reunion = new Reuniones("Reunión de trabajo", LocalDate.of(2024, 9, 15), LocalTime.of(10, 0));
        reunion.agregarAsistente(contacto1);
        reunion.agregarAsistente(contacto2);
        reunion.agregarAsistente(contacto9);
        reunion.agregarAsistente(contacto8);
        reunion.agregarAsistente(contacto7);

        // Agregar reunión a la lista
        reuniones.add(reunion);

        // Mostrar información de TODOS los grupos (Oficina, fiesta, familia, amigos)
        System.out.println("\nInformación de grupos:");
        for (Grupos grupo : grupos) {
            System.out.println(grupo);
        }

        System.out.println("\nInformación de reuniones:");
        for (Reuniones x : reuniones) {
            System.out.println(x);
        }
    }

    // Método para agregar contacto a la lista
    public static boolean agregarContacto(Contactos contacto) {
        if (compararContacto(contacto.getNombre(), contacto.getTelefono())) {
            System.out.println("Error, el contacto ya existe.");
            return false;
        } else {
            contactos.add(contacto);
            System.out.println("Contacto agregado.");
            return true;
        }
    }

    // Método para comparar contacto por nombre y teléfono
    public static boolean compararContacto(String nombre, String telefono) {
        for (Contactos contacto : contactos) {
            if (contacto.getNombre().equals(nombre) && contacto.getTelefono().equals(telefono)) {
                return true;
            }
        }
        return false;
    }
}


// Revisar LOCALDATE, LOCAL TIME