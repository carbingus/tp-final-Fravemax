/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Entidades.*;


/**
 *
 * @author extha
 */
public class ProductoData {
    
    private Connection con = null;

    public ProductoData() {
        con = Conexion.getConexion();
    }
    
    public void registrarProducto(Producto producto){
        String sql = "INSERT INTO producto (nombre, precio, cantidadProducto, estado) VALUES (?, ?, ?, ?)";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setDouble(2,producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setBoolean(4,producto.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
             if (rs.next()){
                producto.setId_producto(rs.getInt(1));
                System.out.println("producto agregado con exito");
                JOptionPane.showMessageDialog(null, "Producto agregado con exito.");
            } else {
                 JOptionPane.showMessageDialog(null, "El producto no fue agregado.");
            }
             
            ps. close();
            
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Producto "+ex.getLocalizedMessage());
            
        }
    }
    
    public Producto buscarProducto (int id){
        Producto producto = new Producto();
        String sql = "SELECT nombre, precio, stock, estado FROM producto WHERE idProducto = ?";
        PreparedStatement ps = null;
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                producto.setId_producto(id);
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock)"));
                producto.setEstado(rs.getBoolean("estado"));
                
            } else {
                JOptionPane.showMessageDialog(null, "No existe el producto.");
            }
            ps.close();
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos. Codigo: "+ ex.getLocalizedMessage());
        }
        
        return producto;
    }
    
    public Producto modificarProducto (Producto producto){
        String sql = "UPDATE producto SET nombre = ?, precio = ?, stock = ?, estado = ? WHERE idProducto = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setBoolean(4,producto.isEstado());
            int logro = ps.executeUpdate();
            if (logro == 1){
                JOptionPane.showMessageDialog(null, "Producto modificado exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "No se ha podido modificar el producto\nO el producto indicado no existe.");
            }    
            
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al acceder a tabla Productos. Codigo: " +ex.getLocalizedMessage());
                    }
        return producto;
        }
    
}
