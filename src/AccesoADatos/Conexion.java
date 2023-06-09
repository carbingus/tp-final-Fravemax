package AccesoADatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost/";
    private static final String DB = "fravemaxelectrodomesticos";
    private static final String USUARIO = "root";
    private static String PASSWORD = "";
    
    private static Connection connection;
    
    private Conexion(){}
    
    public static Connection getConexion() {
        if (connection == null) {
            try 
            {
                Class.forName("org.mariadb.jdbc.Driver");
                connection = DriverManager.getConnection(URL+DB, USUARIO, PASSWORD);
            } 
            catch (SQLException ex) 
            {
                JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos. Codigo: " + ex.getMessage());
            } 
            catch (ClassNotFoundException ex) 
            {
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers. Codigo: " + ex.getLocalizedMessage());
            }
        }
    return connection;
    }
    
}
