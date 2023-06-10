package Entidades;

public class Producto {
    private int id_producto;
    private String descripcion;
    private double precio;
    private int stock;
    private boolean estado;

    public Producto() {
    }

    public Producto(String descripcion, double precio, int stock, boolean estado) {
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    public Producto(int id_producto, String descripcion, double precio, int stock, boolean estado) {
        this.id_producto = id_producto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.estado = estado;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Producto{" + "id_producto=" + id_producto + ", descripcion=" + descripcion + ", precio=" + precio + ", stock=" + stock + ", estado=" + estado + '}';
    }
    
}
