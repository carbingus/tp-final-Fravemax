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
import Entidades.*;
import AccesoADatos.*;

public class ClienteData {
    
    private Connection con = null;

    public ClienteData() {
        con = Conexion.getConexion();
    }
    
    public void guardarCliente(Cliente cliente){
        String sql = "INSERT INTO clientes (Nombre, Apellido, Domicilio, Telefono) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, cliente.getNombre()); // asignamos nombre
            ps.setString(2, cliente.getApellido()); //asignamos apellido
            ps.setString(3, cliente.getDomicilio()); // asignamos domicilio
            ps.setInt(4, cliente.getTelefono()); //asignamos telefono
            ps.executeUpdate(); // le decimos al PreparedStatement que introduzca los datos a la BD
            ResultSet rs = ps.getGeneratedKeys(); // pedimos las keys generadas para poder utilizarlas
            if (rs.next()) { // verificamos se pueda agregar un cliente en el siguiente lugar disponible
                cliente.setId_cliente(rs.getInt(1)); //id incremental generado automaticamente por DB
                JOptionPane.showMessageDialog(null, "Cliente añadido con exito.");
            } else { // el cliente no se pudo añadir
                JOptionPane.showMessageDialog(null, "El cliente no fue añadido.");
            }

            ps.close();
            } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Clientes "+ex.getLocalizedMessage());
            //aca nos indica si hubo un error
        }
        }
    }

