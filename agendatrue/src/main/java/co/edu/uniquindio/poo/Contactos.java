package co.edu.uniquindio.poo;

public class Contactos {
    private String nombre;
    private String alias;
    private String direccion;
    private String telefono;
    private String email;

    public Contactos(String nombre, String alias, String direccion, String telefono, String email){
        this.nombre = nombre;
        this.alias = alias;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        assert !nombre.isBlank();
        assert !alias.isBlank();
        assert !direccion.isBlank();
        assert !telefono.isBlank();
        assert !email.isBlank();
        assert email.contains("@");

    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return nombre + ", " + alias + ", " + direccion + ", " + telefono + ", " + email;
    }

    @Override
    public boolean equals(Object objeto) { //Agarra los nombres y los telefonos para compararlos
        if (this == objeto) return true; // Si ambos objetos son la misma instancia, son iguales
        if (objeto == null || getClass() != objeto.getClass()) return false; // Si el objeto es null o de una clase diferente, no son iguales
        Contactos contacto = (Contactos) objeto; // Cast del objeto a Contactos
        return nombre.equals(contacto.nombre) && telefono.equals(contacto.telefono); // Comparar nombre y teléfono
    }
}