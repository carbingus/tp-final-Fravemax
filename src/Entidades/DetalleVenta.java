package Entidades;

public class DetalleVenta {
    private int idDetalleVenta;
    private int cantidad;
    private double precioVenta;
    private Venta venta;
    private Producto producto;

    public DetalleVenta() {
    }

    public DetalleVenta(int cantidad, double precioVenta, Venta venta, Producto producto) {
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.venta = venta;
        this.producto = producto;
    }

    public DetalleVenta(int idDetalleVenta, int cantidad, double precioVenta, Venta venta, Producto producto) {
        this.idDetalleVenta = idDetalleVenta;
        this.cantidad = cantidad;
        this.precioVenta = precioVenta;
        this.venta = venta;
        this.producto = producto;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    @Override
    public String toString() {
        return "DetalleVenta{" + "idDetalleVenta=" + idDetalleVenta + ", cantidad=" + cantidad + ", precioVenta=" + precioVenta + ", venta=" + venta + ", producto=" + producto + '}';
    }
    
}
