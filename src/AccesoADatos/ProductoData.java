package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Entidades.Producto;

public class ProductoData {
    private Connection conexion = null;

    public ProductoData() {
        conexion = Conexion.getConexion();
    }
    
    public void guardarProducto(Producto producto){
        String sql = "INSERT INTO producto(nombre,precio,stock,estado) VALUES (?,?,?,?);";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setBoolean(4, producto.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                producto.setIdProducto(rs.getInt(1));
            }
            System.out.println("Producto agregado!");
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }
    }
    
    public void modificarProducto(Producto producto) {
        String sql = "UPDATE producto SET nombre=?,precio=?,stock=?,estado=? WHERE idProducto=?;";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.setBoolean(4, producto.getEstado());
            ps.setInt(5, producto.getIdProducto());
            ps.executeUpdate();
            System.out.println("Producto modificado!");
            ps.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }      
    }
    
    public void eliminarProducto(int id) {
        String sql = "UPDATE producto SET estado=false WHERE idProducto=?;";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Producto eliminado!");
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }
    }
    
    public List<Producto> listarProductosConStock() {
        List<Producto> productos = new ArrayList();
        String sql = "SELECT * FROM producto WHERE stock>0 AND estado=true";
        try{
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                productos.add(producto);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error: " + e.getLocalizedMessage());
        }
        return productos;
    }
    
    public List<Producto> listarProductosSinStock() {
        List<Producto> productos = new ArrayList();
        String sql = "SELECT * FROM producto WHERE stock=0";
        try{
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                productos.add(producto);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error: " + e.getLocalizedMessage());
        }
        return productos;
    }
    
    public Producto buscarProducto(int id) {
        Producto producto = null;
        String sql = "SELECT * FROM producto WHERE idProducto=?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                producto = new Producto(rs.getString("nombre"), rs.getString("categoria"), rs.getDouble("precio"), rs.getInt("stock"), rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return producto;
    }
    
        public List<Producto> listarProductos(){
        List<Producto> productos = new ArrayList<>();
        try{
            String sql = "SELECT * FROM producto WHERE estado = 1;";
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                
            }
            ps.close();
        } catch(SQLException ex){
            JOptionPane.showConfirmDialog(null, "Error al acceder a tabla Producto. Codigo: " +ex.getLocalizedMessage());
        
        } return productos;
    }
        
        public Producto buscarProductosPorNombre(String nombre){
        String sql = "SELECT * FROM producto WHERE nombre = ?;";
        Producto pr = null;
        
        try{
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, nombre);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()){
                pr = new Producto();
                pr.setIdProducto(rs.getInt("idProducto"));
                pr.setNombre(rs.getString("nombre"));
                pr.setCategoria(rs.getString("categoria"));
                pr.setPrecio(rs.getDouble("precio"));
                pr.setStock(rs.getInt("stock"));
                pr.setEstado(rs.getBoolean("estado"));
            } else {
                JOptionPane.showMessageDialog(null, "No hay productos en esta categoria.");
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos. Codigo: " +ex.getLocalizedMessage());
        }
        
        return pr;
    }
    
}
