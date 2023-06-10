/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Entidades.*;
import AccesoADatos.*;



public class VentaData {
    
    private Connection con = null;
    private ProductoData prodData = new ProductoData();
    private ClienteData cliData = new ClienteData();

    public VentaData() {
        con = Conexion.getConexion();
    }
    
     public void realizarVenta(DetalleVenta vent){
        String sql = "INSERT INTO detalleventa (cantidad, precioVenta, idVenta, idProducto) VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, vent.getCantidad());
            ps.setDouble(2, vent.getPrecioVenta());
            ps.setInt(3, vent.getVenta().getId_venta());
            ps.setInt(4, vent.getProducto().getId_producto());
            
            ps.executeUpdate();
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                vent.setId_detalleVenta(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Los detalles de venta se han guardado exitosamente.");
                
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla DetalleVenta. Codigo: " + ex.getLocalizedMessage());
        }
    }
     
     public List<Venta> obtenerVentas(){
         List <Venta> ventas = new ArrayList<>();
         
         try {
            String sql = "SELECT * FROM detalleventa;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            Venta vend;

            while (rs.next()){
                vend = new Venta();
                vend.setId_venta(rs.getInt("idDetalleVenta"));
                
                Producto p = prodData.buscarProducto(rs.getInt("idProducto"));
                vend.setProducto(p);
                
                Cliente c = cliData.buscarCliente(rs.getInt("idCliente"));
                vend.setCliente(c);
                
                vend.setFecha(rs.getDate("fecha").toLocalDate());
                
            }
            ps.close();
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a tabla DetalleVenta. Codigo: "+ex.getLocalizedMessage());

            }
         return ventas;
     }
    
}
