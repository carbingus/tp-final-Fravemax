package AccesoADatos;

import Entidades.DetalleCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class DetalleCompraData {
    private Connection conexion = null;

    public DetalleCompraData() {
        conexion = Conexion.getConexion();
    }
    
    public void guardarDetalleCompra(DetalleCompra dc) {
        String sql = "INSERT INTO detallecompra(cantidad,precioCosto,idCompra,idProducto) VALUES (?,?,?,?);";
        try{
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, dc.getCantidad());
            ps.setDouble(2, dc.getPrecioCosto());
            ps.setInt(3, dc.getCompra().getIdCompra());
            ps.setInt(4, dc.getProducto().getIdProducto());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                dc.setIdDetalle(rs.getInt(1));
            }
            System.out.println("DetalleCompra guardado!");
            ps.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }
    }
}
