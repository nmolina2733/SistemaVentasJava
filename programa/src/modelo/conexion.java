/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author nmoli
 */
public class conexion {
    
    public static final String URL = "jdbc:mysql://localhost:3306/conexion";
    public static final String usuario = "root";
    public static final String contrasena = "";
    
    
    
    public Connection conectar() throws SQLException{
        Connection conexion=null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = (Connection) DriverManager.getConnection(URL,usuario, contrasena);
            System.out.println("Conexion exitosa");
            
            
        } catch (HeadlessException | ClassNotFoundException | SQLException ex){
            System.err.println("Error, "+ex);
        }
        return conexion;
}
}
    
