package AccesoADatos;

import Entidades.DetalleCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class DetalleCompraData {
    private Connection conexion = null;
    private ProductoData productoData = new ProductoData();
    private CompraData compraData = new CompraData();    

    public DetalleCompraData() {
        conexion = Conexion.getConexion();
    }
    
    public void guardarDetalleCompra(DetalleCompra dc) {
        String sql = "INSERT INTO detallecompra(cantidad, precioCosto, idCompra, idProducto) VALUES (?,?,?,?);";
        
        try{
            
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setInt(1, dc.getCantidad());
            ps.setDouble(2, dc.getPrecioCosto());
            ps.setInt(3, dc.getCompra().getIdCompra());
            ps.setInt(4, dc.getProducto().getIdProducto());
            
            int logro = ps.executeUpdate();
            
//            ResultSet rs = ps.getGeneratedKeys();

            if (logro == 1){
                
                System.out.println("Los detalles del pedido se han registrado");
                
            } else{
                
                JOptionPane.showMessageDialog(null, "Los detalles del pedido no se han podido registrar.");
                
            }
            
            ps.close();
            
        } catch (SQLException ex){
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla DetalleCompra. Codigo: "+ex.getLocalizedMessage());
        }
    }
    
    public List<DetalleCompra> listarDetalleCompras() {
        
        List<DetalleCompra> lista = new ArrayList();
        String sql = "SELECT * FROM detallecompra";
        
        try {
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                DetalleCompra dc = new DetalleCompra();
                
                dc.setIdDetalle(rs.getInt("idDetalle"));
                dc.setCantidad(rs.getInt("cantidad"));
                dc.setPrecioCosto(rs.getDouble("precioCosto"));
                dc.setCompra(compraData.buscarCompra(rs.getInt("idCompra")));
                dc.setProducto(productoData.buscarProductoPorID(rs.getInt("idProducto")));
                
                lista.add(dc);
            }
            
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }
        return lista;
    }
    
}
