package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class BibliotecaApp {
    private LinkedList<Bibliotecario> bibliotecarios;
    private LinkedList<Estudiante> estudiantes;
    private LinkedList<Libro> libros;
    private LinkedList<Prestamo> prestamos;

    public BibliotecaApp() {
        bibliotecarios = new LinkedList<>();
        estudiantes = new LinkedList<>();
        libros = new LinkedList<>();
        prestamos = new LinkedList<>();
    }

    public void agregarBibliotecario(Bibliotecario bibliotecario) {
        bibliotecarios.add(bibliotecario);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void crearPrestamo(Estudiante estudiante, Bibliotecario bibliotecario) {
        Prestamo prestamo = new Prestamo(estudiante, bibliotecario);
        prestamos.add(prestamo);
    }

    public Estudiante estudianteConMasPrestamos() {
        Estudiante mayor = null;
        int maxPrestamos = 0;
        for (Estudiante e : estudiantes) {
            if (e.getPrestamosRealizados() > maxPrestamos) {
                maxPrestamos = e.getPrestamosRealizados();
                mayor = e;
            }
        }
        return mayor;
    }

    public double totalPagoBibliotecarios() {
        double total = 0;
        for (Bibliotecario b : bibliotecarios) {
            total += b.calcularPagoTotal();
        }
        return total;
    }

    public int consultarPrestamosPorLibro(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro.getCantidadPrestamos();
            }
        }
        return 0;
    }

    public void mostrarPrestamosPorBibliotecario() {
        for (Bibliotecario bibliotecario : bibliotecarios) {
            System.out.println(bibliotecario + " ha realizado " + bibliotecario.getPrestamosRealizados() + " préstamos.");
        }
    }

    public static void main(String[] args) {
        BibliotecaApp biblioteca = new BibliotecaApp();

        // Crear bibliotecarios
        Bibliotecario bibliotecario1 = new Bibliotecario("Juan", "123", "321-456", "juan@mail.com", 1000, 5);
        biblioteca.agregarBibliotecario(bibliotecario1);

        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante("Camilo", "4456", "310xxxx", "camilo@gmail.com");
        biblioteca.agregarEstudiante(estudiante1);
        Estudiante estudiante2 = new Estudiante("Erwin", "123", "312xxxx", "erwinharder@gmail.com");
        biblioteca.agregarEstudiante(estudiante2);

        // Crear autores y libros
        Autor autor1 = new Autor("Gabriel García Márquez");
        Libro libro1 = new Libro("001", "123456", autor1, "Cien Años de Soledad", "Penguin", "1967", 100
        );
        Autor autor2= new Autor("Willem");
        Libro libro2 = new Libro("002", "123489", autor2, "Willem de Soledad", "librosapp", "2000", 0);
        biblioteca.agregarLibro(libro1);
        autor1.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        autor1.agregarLibro(libro2);

        // Crear préstamo
        biblioteca.crearPrestamo(estudiante1, bibliotecario1);

        // Adicionar libro al préstamo
        biblioteca.prestamos.get(0).agregarLibro(libro1);
        biblioteca.prestamos.get(0).agregarLibro(libro2);

        // Mostrar el estudiante con más préstamos
        System.out.println("Estudiante con más préstamos: " + biblioteca.estudianteConMasPrestamos());

        // Mostrar el total de pago a los bibliotecarios
        System.out.println("Total a pagar a los bibliotecarios: " + biblioteca.totalPagoBibliotecarios());

        // Consultar préstamos por nombre de libro
        System.out.println("Cantidad de préstamos de 'Cien Años de Soledad': " + biblioteca.consultarPrestamosPorLibro("Cien Años de Soledad"));
        System.out.println("Cantidad de préstamos de 'Willem de Soledad': " + biblioteca.consultarPrestamosPorLibro("Willem de Soledad"));

        // Mostrar préstamos por bibliotecario
        biblioteca.mostrarPrestamosPorBibliotecario();
    }
}
