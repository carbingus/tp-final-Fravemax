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
        String sql = "INSERT INTO producto(nombre, categoria, precio, stock, estado) VALUES (?, ?, ?, ?, ?);";
        
        try {
            
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, producto.getNombre());
            ps.setString(2,producto.getCategoria());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.getEstado());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                
                producto.setIdProducto(rs.getInt(1));
            }
            System.out.println("Producto agregado!");
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Producto. Codigo:  "+ex.getLocalizedMessage());
        }
    }
    
    public void modificarProducto(Producto producto) {
        
        String sql = "UPDATE producto SET nombre = ?, categoria = ?, precio = ?, stock = ?, estado = ? WHERE idProducto = ?;";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ps.setString(1, producto.getNombre());
            ps.setString(2,producto.getCategoria());
            ps.setDouble(3, producto.getPrecio());
            ps.setInt(4, producto.getStock());
            ps.setBoolean(5, producto.getEstado());
            ps.setInt(6, producto.getIdProducto());
            
            int logro = ps.executeUpdate();
            
            if (logro == 1){
                
                System.out.println( "Los datos del producto se han actualizado de forma correcta.");
                
            } else {
                
                JOptionPane.showMessageDialog(null, "Ha habido un error al actualizad el producto indicado.");
                
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Producto. Codigo:  "+ex.getLocalizedMessage());
        }
    }
    
    public void eliminarProducto(int id) {
        
        String sql = "UPDATE producto SET estado = false WHERE idProducto = ?;";
        
        try {
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ps.setInt(1, id);
            ps.executeUpdate();
            
            System.out.println("Producto eliminado!");
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Producto. Codigo:  "+ex.getLocalizedMessage());
            
        }
    }
        
    public Producto buscarProducto(String nombre) {
        
        Producto prod = null;
        String sql = "SELECT * FROM producto WHERE nombre = ?";
        
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                prod = new Producto();
                
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombre"));
                prod.setCategoria(rs.getString("categoria"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estado"));
            } else {
                
                JOptionPane.showMessageDialog(null, "No existen productos cuyo nombre sea similar a lo solicitado.");
                
            }
            
            ps.close();
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Producto. Codigo:  "+ex.getLocalizedMessage());
            
        }
        return prod;
    }
    
    public Producto buscarProductoPorID(int id) {
        Producto prod = null;
        String sql = "SELECT * FROM producto WHERE idProducto= ?";
        
        try {
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombre"));
                prod.setCategoria(rs.getString("categoria"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estado"));
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Producto. Codigo:  "+ex.getLocalizedMessage());
        }
        return prod;
    }
    

        
        public Producto buscarProductosNombreParcial(String nombre){
            
        String sql = "SELECT * FROM producto WHERE nombre = ?";
        Producto prod = null;
        
        try{
            String nombreParcial = "%" + nombre + "%";
            
            if (conexion!=null){
                PreparedStatement ps = conexion.prepareStatement(sql);
                ps.setString(1, nombreParcial);
            
                ResultSet rs = ps.executeQuery();
                
                if(rs != null && rs.next()){
                    prod = new Producto();
                    prod.setIdProducto(rs.getInt("idProducto"));
                    prod.setNombre(rs.getString("nombre"));
                    prod.setCategoria(rs.getString("categoria"));
                    prod.setPrecio(rs.getDouble("precio"));
                    prod.setStock(rs.getInt("stock"));
                    prod.setEstado(rs.getBoolean("estado"));
                }
                rs.close();
                ps.close();
            }
  
//            while (rs.next()){
//                prod = new Producto();
//                prod.setIdProducto(rs.getInt("idProducto"));
//                prod.setNombre(rs.getString("nombre"));
//                prod.setCategoria(rs.getString("categoria"));
//                prod.setPrecio(rs.getDouble("precio"));
//                prod.setStock(rs.getInt("stock"));
//                prod.setEstado(rs.getBoolean("estado"));
//            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Productos. Codigo: " +ex.getLocalizedMessage());
        }
        
        return prod;
    }
        
    public List<Producto> listarProductos(){
        
        List<Producto> productos = new ArrayList<>();
        
        try{
            String sql = "SELECT * FROM producto WHERE estado = 1";
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                
                Producto prod = new Producto();
                prod.setIdProducto(rs.getInt("idProducto"));
                prod.setNombre(rs.getString("nombre"));
                prod.setCategoria(rs.getString("categoria"));
                prod.setPrecio(rs.getDouble("precio"));
                prod.setStock(rs.getInt("stock"));
                prod.setEstado(rs.getBoolean("estado"));
                productos.add(prod);
            }
            ps.close();
            
        } catch(SQLException ex){
            
            JOptionPane.showConfirmDialog(null, "Error al acceder a tabla Producto. Codigo: " +ex.getLocalizedMessage());
        
        } return productos;
    }
    
    public List<Producto> listarProductosPorNombre(String nombre){
            List<Producto> productos = new ArrayList<>();
            
        try{
            String sql = "SELECT * FROM producto WHERE nombre LIKE ? AND estado = 1";
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ps.setString(1,"%"+nombre+"%");
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()){
                
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                
                productos.add(producto);
                
            }
            
            ps.close();
            
        } catch(SQLException ex){
            
            JOptionPane.showConfirmDialog(null, "Error al acceder a tabla Producto. Codigo: " +ex.getLocalizedMessage());
        
        } return productos;
    }
        
    
    public List<Producto> listarProductosConStock() {
        
        List<Producto> productos = new ArrayList();
        String sql = "SELECT * FROM producto WHERE stock > 0 AND estado = true";
        
        try{
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Producto producto = new Producto();
                
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                
                productos.add(producto);
            }
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Producto. Codigo:  "+ex.getLocalizedMessage());
            
        }
        return productos;
    }
    
    public List<Producto> listarProductosSinStock() {
        
        List<Producto> productos = new ArrayList();
        String sql = "SELECT * FROM producto WHERE stock = 0";
        
        try{
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Producto producto = new Producto();
                
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setCategoria(rs.getString("categoria"));
                producto.setPrecio(rs.getDouble("precio"));
                producto.setStock(rs.getInt("stock"));
                producto.setEstado(rs.getBoolean("estado"));
                
                productos.add(producto);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Producto. Codigo:  "+ex.getLocalizedMessage());
            
        }
        return productos;
    }
}
