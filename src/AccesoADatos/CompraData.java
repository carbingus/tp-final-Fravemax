package AccesoADatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import Entidades.Compra;

public class CompraData {
    private Connection conexion = null;
    private ProveedorData proveedorData = new ProveedorData();

    public CompraData() {
        conexion = Conexion.getConexion();
    }
    
    public void guardarCompra(Compra compra) {
        String sql = "INSERT INTO compra(idProvedor,fecha) VALUES (?,?);";
        try{
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, compra.getProveedor().getIdProveedor());
            ps.setDate(2, Date.valueOf(compra.getFecha()));
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                compra.setIdCompra(rs.getInt(1));
            }
            System.out.println("Compra guardada!");
            ps.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }
    }
    
    public Compra buscarCompra(int id) {
        Compra compra = null;
        String sql = "SELECT * FROM compra WHERE idCompra=?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                compra = new Compra(id, proveedorData.buscarProveedor(rs.getInt("idProvedor")), rs.getDate("fecha").toLocalDate());
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return compra;
    }
    
}
