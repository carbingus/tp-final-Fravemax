package AccesoADatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import Entidades.Proveedor;

public class ProveedorData {
    private Connection conexion = null;

    public ProveedorData() {
        conexion = Conexion.getConexion();
    }
    
    public void guardarCliente(Proveedor proveedor) {
        String sql = "INSERT INTO proveedor(razonSocial,domicilio,telefono) VALUES (?,?,?);";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                proveedor.setIdProveedor(rs.getInt(1));
            }
            System.out.println("Proveedor agregado!");
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }
    }
    
    public void modificarProveedor(Proveedor proveedor) {
        String sql = "UPDATE proveedor SET razonSocial=?,domicilio=?,telefono=? WHERE idProvedor=?;";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setString(1, proveedor.getRazonSocial());
            ps.setString(2, proveedor.getDomicilio());
            ps.setString(3, proveedor.getTelefono());
            ps.setInt(4, proveedor.getIdProveedor());
            ps.executeUpdate();
            System.out.println("Proveedor modificado!");
            ps.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }
    }
    
    public void eliminarProveedor(int id) {
        String sql = "DELETE FROM proveedor WHERE idProvedor=?;";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Proveedor eliminado!");
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }
    }
    
    public List<Proveedor> listarProveedores(int id) {
        List<Proveedor> proveedores = new ArrayList();
        String sql = "SELECT * FROM proveedor";
        try{
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Proveedor proveedor = new Proveedor();
                proveedor.setIdProveedor(rs.getInt("idProvedor"));
                proveedor.setRazonSocial(rs.getString("razonSocial"));
                proveedor.setDomicilio(rs.getString("domicilio"));
                proveedor.setTelefono(rs.getString("telefono"));
                proveedores.add(proveedor);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error: " + e.getLocalizedMessage());
        }
        return proveedores;
    }
    
}
