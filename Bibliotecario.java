package co.edu.uniquindio.poo;

public class Bibliotecario extends Persona {
    private double salario;
    private int prestamosRealizados;
    private int aniosAntiguedad;

    public Bibliotecario(String nombre, String cedula, String telefono, String correo, double salario, int aniosAntiguedad) {
        super(nombre, cedula, telefono, correo);
        this.salario = salario;
        this.aniosAntiguedad = aniosAntiguedad;
        this.prestamosRealizados = 0;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getPrestamosRealizados() {
        return prestamosRealizados;
    }

    public void incrementarPrestamos() {
        this.prestamosRealizados++;
    }

    public int getAniosAntiguedad() {
        return aniosAntiguedad;
    }

    public void setAniosAntiguedad(int aniosAntiguedad) {
        this.aniosAntiguedad = aniosAntiguedad;
    }

    public double calcularPagoTotal() {
        double pagoBase = prestamosRealizados * 0.2;
        double bonificacion = pagoBase * (0.02 * aniosAntiguedad);
        return salario + pagoBase + bonificacion;
    }

    @Override
    public String toString() {
        return getNombre() + " (" + getCedula() + ")";
    }
}
