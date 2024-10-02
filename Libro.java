package co.edu.uniquindio.poo;


public class Libro {
    private String codigo;
    private String isbn;
    private Autor autor;
    private String titulo;
    private String editorial;
    private String fecha;
    private int unidadesDisponibles;
    private int cantidadPrestamos;

    public Libro(String codigo, String isbn, Autor autor, String titulo, String editorial, String fecha, int unidadesDisponibles) {
        this.codigo = codigo;
        this.isbn = isbn;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
        this.fecha = fecha;
        this.unidadesDisponibles = unidadesDisponibles;
        this.cantidadPrestamos = 0;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(int unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public int getCantidadPrestamos() {
        return cantidadPrestamos;
    }

    public void incrementarPrestamos() {
        this.cantidadPrestamos++;
    }

    @Override
    public String toString() {
        return titulo + " de " + autor.getNombre();
    }
}
