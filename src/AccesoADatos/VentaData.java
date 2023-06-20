package AccesoADatos;

import Entidades.Cliente;
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
import java.time.LocalDate;

public class VentaData {
    private Connection conexion = null;
    private ClienteData clienteData = new ClienteData();

    public VentaData() {
        conexion = Conexion.getConexion();
    }

    public void guardarVenta(Venta venta) {
        String sql = "INSERT INTO venta(fecha, idCliente) VALUES (?, ?);";
        
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
            
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Venta. Codigo:: "+e.getLocalizedMessage());
            
        }
    }
    
    public Venta buscarVenta(int id) {
        
        Venta venta = null;
        String sql = "SELECT * FROM venta WHERE idVenta = ?";
        
        try {
            
            PreparedStatement ps = conexion.prepareStatement(sql);
            
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                
                venta = new Venta(id, rs.getDate("fecha").toLocalDate(), 
                        clienteData.buscarCliente(rs.getInt("idCliente")));
                
            }
            
            ps.close();
            
        } catch (SQLException e) {
            
            JOptionPane.showMessageDialog(null, "Error al acceder a tabla Venta. Codigo:: "+e.getLocalizedMessage());
            
        }
        return venta;
    }
    
    
    public List<Venta> obtenerVentas(){
        List <Venta> ventas = new ArrayList<>();

        try {
           String sql = "SELECT * FROM venta;";
           
           PreparedStatement ps = conexion.prepareStatement(sql);
           ResultSet rs = ps.executeQuery();
           
           Venta vend;

           while (rs.next()){
               
               vend = new Venta();
               vend.setIdVenta(rs.getInt("idVenta"));
               vend.setFecha(rs.getDate("fecha").toLocalDate());

               Cliente c = new Cliente();
               c.setIdCliente(rs.getInt("idCliente"));
               vend.setCliente(c);

               ventas.add(vend);
               
           }
           
           ps.close();
           
           } catch (SQLException ex){
               
               JOptionPane.showMessageDialog(null, "Error al acceder a tabla Venta. Codigo: "+ex.getLocalizedMessage());

           }
        return ventas;
    }


}
