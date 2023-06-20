package AccesoADatos;

import Entidades.Cliente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class ClienteData {
    private Connection conexion = null;

    public ClienteData() {
        conexion = Conexion.getConexion();
    }
    
    public void guardarCliente(Cliente cliente) {
        String sql = "INSERT INTO cliente(dni,apellido,nombre,domicilio,telefono,estado) VALUES (?,?,?,?,?,?);";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getDomicilio());
            ps.setString(5, cliente.getTelefono());
            ps.setBoolean(6, cliente.getEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                cliente.setIdCliente(rs.getInt(1));
                System.out.println("Cliente agregado!");
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }
    }
    
    public void modificarCliente(Cliente cliente) {
        String sql = "UPDATE cliente SET dni=?,apellido=?,nombre=?,domicilio=?,telefono=?,estado=? WHERE idCliente=?;";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, cliente.getDni());
            ps.setString(2, cliente.getApellido());
            ps.setString(3, cliente.getNombre());
            ps.setString(4, cliente.getDomicilio());
            ps.setString(5, cliente.getTelefono());
            ps.setBoolean(6, cliente.getEstado());
            ps.setInt(7, cliente.getIdCliente());
            ps.executeUpdate();
            System.out.println("Cliente modificado!");
            ps.close();
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }      
    }
    
    public void eliminarCliente(int id) {
        String sql = "UPDATE cliente SET estado=false WHERE idCliente=?;";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Cliente eliminado!");
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getLocalizedMessage());
        }
    }
    
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList();
        String sql = "SELECT * FROM cliente WHERE estado=true";
        try{
            PreparedStatement ps = conexion.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("idCliente"));
                cliente.setDni(rs.getInt("dni"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setDomicilio(rs.getString("domicilio"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setEstado(rs.getBoolean("estado"));
                clientes.add(cliente);
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Error: "+e.getLocalizedMessage());
        }
        return clientes;
    }
    
    public Cliente buscarCliente(int id) {
        Cliente cliente = null;
        String sql = "SELECT * FROM cliente WHERE idCliente=?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente(id, rs.getInt("dni"), rs.getString("apellido"), rs.getString("nombre"), rs.getString("domicilio"), rs.getString("telefono"), rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return cliente;
    }
    
    public Cliente buscarClientePorDni(int dni) {
        Cliente cliente = null;
        String sql = "SELECT * FROM cliente WHERE dni=?";
        try {
            PreparedStatement ps = conexion.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cliente = new Cliente(rs.getInt("idCliente"), dni, rs.getString("apellido"), rs.getString("nombre"), rs.getString("domicilio"), rs.getString("telefono"), rs.getBoolean("estado"));
            }
            ps.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage());
        }
        return cliente;
    }
    
}