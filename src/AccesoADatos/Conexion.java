/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author extha
 */
package AccesoADatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String URL = "jdbc:mysql://localhost/";
    private static final String DB = "fravemax";
    private static final String USUARIO = "root";
    private static String PASSWORD = "";
    
    private static Connection connection;
    
    private Conexion(){} // metodo constructor
    
    // aca simplemente generamos una conexion
    public static Connection getConexion(){
        if (connection == null){
            try{
                Class.forName("org.mariadb.jdbc.Driver");
                
                connection = DriverManager.
                        getConnection(URL+DB, USUARIO, PASSWORD);
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Error al conectarse a la Base de Datos " + ex.getMessage());

          
            } catch (ClassNotFoundException ex){
                JOptionPane.showMessageDialog(null, "Error al cargar los drivers " + ex.getLocalizedMessage());

            }
        }
    return connection;
    }
    
}
