package Entidades;

public class Cliente {
    private int id_cliente;
    private String apellido;
    private String nombre;
    private String domicilio;
    private int telefono;

    public Cliente() {
    }

    public Cliente(int id_cliente, String apellido, String nombre, String domicilio, int telefono) {
        this.id_cliente = id_cliente;
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public Cliente(String apellido, String nombre, String domicilio, int telefono) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", apellido=" + apellido + ", nombre=" + nombre + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
}
