/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author extha
 */
public class Proveedor {
    private int id_proveedor;
    private String razonSocial;
    private String domicilio;
    private int telefono;

    public Proveedor() {
    }

    public Proveedor(int id_proveedor, String razonSocial, String domicilio, int telefono) {
        this.id_proveedor = id_proveedor;
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
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
        return "Proveedor{" + "id_proveedor=" + id_proveedor + ", razonSocial=" + razonSocial + ", domicilio=" + domicilio + ", telefono=" + telefono + '}';
    }
    
    
    
}
