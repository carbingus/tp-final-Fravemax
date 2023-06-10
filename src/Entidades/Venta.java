package Entidades;

import java.time.LocalDate;

public class Venta {
    private int id_venta;
    private LocalDate fecha;
    private Cliente cliente;

    public Venta() {
    }

    public Venta(LocalDate fecha, Cliente cliente) {
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public Venta(int id_venta, LocalDate fecha, Cliente cliente) {
        this.id_venta = id_venta;
        this.fecha = fecha;
        this.cliente = cliente;
    }

    public int getId_venta() {
        return id_venta;
    }

    public void setId_venta(int id_venta) {
        this.id_venta = id_venta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", fecha=" + fecha + ", cliente=" + cliente + '}';
    }
    
}
