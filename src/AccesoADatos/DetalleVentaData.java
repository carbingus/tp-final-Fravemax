package AccesoADatos;

import Entidades.DetalleVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DetalleVentaData {
    private Connection conexion = null;
    private ProductoData productoData = new ProductoData();
    private VentaData ventaData = new VentaData();

    public DetalleVentaData() {
        conexion = Conexion.getConexion();
    }
    
    public void guardarDetalleVenta(DetalleVenta dv) {
        String sql = "INSERT INTO detalleventa(cantidad, precioVenta, idVenta, idProducto) VALUES (?,?,?,?);";
        
        try{
            
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, dv.getCantidad());
            ps.setDouble(2, dv.getPrecioVenta());
            ps.setInt(3, dv.getVenta().getIdVenta());
            ps.setInt(4, dv.getProducto().getIdProducto());
            
            int logro = ps.executeUpdate();
//            ResultSet rs = ps.getGeneratedKeys();

            if (logro == 1){
                
                System.out.println("Los detalles de la venta se han registrado");
                
            } else{
                
                JOptionPane.showConfirmDialog(null, "Los detalles de la venta no se han podido registrar.");
                
                        
            }
//            if (rs.next()){
//                dv.setIdDetalleVenta(rs.getInt(1));
//            }
//            System.out.println("DetalleVenta guardado!");

            ps.close();
        } catch (SQLException e){
            
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla DetalleVenta. Codigo: "+e.getLocalizedMessage());
        }
    }
    
    public DetalleVenta listarDetalleVenta(int idVenta) {
        
        DetalleVenta detVenta = null;
        String sql = "SELECT * FROM detalleVenta WHERE idVenta = ?;";
        
        try {
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ps.setInt(1, idVenta);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                detVenta = new DetalleVenta();
                
                detVenta.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
                detVenta.setCantidad(rs.getInt("cantidad"));
                detVenta.setPrecioVenta(rs.getDouble("precioVenta"));
                detVenta.setVenta(ventaData.buscarVenta(rs.getInt("idVenta")));
                detVenta.setProducto(productoData.buscarProductoPorID(rs.getInt("idProducto")));
                
            }
            
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }
        return detVenta;
    }
    
}
