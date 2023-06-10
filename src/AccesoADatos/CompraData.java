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


public class CompraData {
    
    private Connection con = null;


    public CompraData() {
        con = Conexion.getConexion();
    }
    
    public void realizarPedido(DetalleCompra comp){
        String sql = "INSERT INTO detallecompra (cantidad, precioCosto, idCompra, idProducto) VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, comp.getCantidad());
            ps.setDouble(2, comp.getPrecioCosto());
            ps.setInt(3, comp.getCompra().getId_compra());
            ps.setInt(4, comp.getProducto().getId_producto());
            
            ps.executeUpdate();
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                comp.setId_detalle(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "El pedido se ha guardado exitosamente.");
                
            }
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla DetalleCompra. Codigo: " + ex.getLocalizedMessage());
        }
    }
}
