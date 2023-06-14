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
import Entidades.Venta;

public class VentaData {
    private Connection conexion = null;
    private ProductoData productoData = new ProductoData();
    private ClienteData clienteData = new ClienteData();

    public VentaData() {
        conexion = Conexion.getConexion();
    }

    public void guardarVenta(Venta venta) {
        String sql = "INSERT INTO venta(fecha,idCliente) VALUES (?,?);";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(venta.getFecha()));
            ps.setInt(2, venta.getCliente().getIdCliente());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                venta.setIdVenta(rs.getInt(1));
            }
            System.out.println("Venta guardada!");
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }
    }
    
    public Venta buscarVenta(int id) {
        Venta venta = null;
        String sql = "SELECT * FROM venta WHERE idVenta=?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                venta = new Venta(id, rs.getDate("fecha").toLocalDate(), clienteData.buscarCliente(rs.getInt("idCliente")));
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return venta;
    }

//    public List<Venta> obtenerVentas() {
//        List<Venta> ventas = new ArrayList();
//        try {
//            String sql = "SELECT * FROM detalleventa;";
//            PreparedStatement ps = conexion.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
//            Venta vend;
//
//            while (rs.next()) {
//                vend = new Venta();
//                vend.setId_venta(rs.getInt("idDetalleVenta"));
//
//                Producto p = productoData.buscarProducto(rs.getInt("idProducto"));
//                vend.setProducto(p);
//
//                Cliente c = clienteData.buscarCliente(rs.getInt("idCliente"));
//                vend.setCliente(c);
//
//                vend.setFecha(rs.getDate("fecha").toLocalDate());
//
//            }
//            ps.close();
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, "Error al acceder a tabla DetalleVenta. Codigo: " + ex.getLocalizedMessage());
//
//        }
//        return ventas;
//    }

}
