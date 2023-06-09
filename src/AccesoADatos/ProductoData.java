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


/**
 *
 * @author extha
 */
public class ProductoData {
    
    private Connection con = null;

    public ProductoData() {
        con = Conexion.getConexion();
    }
    
    public void guardarProducto(Producto producto){
//        String sql = "INSERT INTO productos (Nombre, Descripcion, Precio, CantidadProducto) VALUES (?, ?, ?, ?)";
//        
//        try{
//            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
//            ps.setString(1, producto.getNombre());
//            ps.setString(2,producto.getDescripcion());
//            ps.setDouble(3, producto.getPrecioActual());
//            ps.setInt(4, producto.getStock());
//        }
    }
    
    
}
