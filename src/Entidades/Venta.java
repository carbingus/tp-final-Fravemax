/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.time.LocalDate;

/**
 *
 * @author extha
 */
public class Venta {
    private int id_venta;
    private LocalDate fecha;
    private int id_cliente;

    public Venta() {
    }

    public Venta(int id_venta, LocalDate fecha, int id_cliente) {
        this.id_venta = id_venta;
        this.fecha = fecha;
        this.id_cliente = id_cliente;
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

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    @Override
    public String toString() {
        return "Venta{" + "id_venta=" + id_venta + ", fecha=" + fecha + ", id_cliente=" + id_cliente + '}';
    }
    
    
    
}
