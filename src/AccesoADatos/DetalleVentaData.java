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
        String sql = "INSERT INTO detalleventa(cantidad,precioVenta,idVenta,idProducto) VALUES (?,?,?,?);";
        try{
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dv.getCantidad());
            ps.setDouble(2, dv.getPrecioVenta());
            ps.setInt(3, dv.getVenta().getIdVenta());
            ps.setInt(4, dv.getProducto().getIdProducto());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                dv.setIdDetalleVenta(rs.getInt(1));
            }
            System.out.println("DetalleVenta guardado!");
            ps.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }
    }
    
    public List<DetalleVenta> listarDetalleVentas() {
        List<DetalleVenta> lista = new ArrayList();
        String sql = "SELECT * FROM DetalleVenta";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                DetalleVenta dv = new DetalleVenta();
                dv.setIdDetalleVenta(rs.getInt("idDetalleVenta"));
                dv.setCantidad(rs.getInt("cantidad"));
                dv.setPrecioVenta(rs.getDouble("precioVenta"));
                dv.setVenta(ventaData.buscarVenta(rs.getInt("idVenta")));
                dv.setProducto(productoData.buscarProducto(rs.getInt("idProducto")));
                lista.add(dv);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }
        return lista;
    }
    
}
