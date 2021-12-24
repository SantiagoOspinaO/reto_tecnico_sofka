package co.retosofka.conexion;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;


public class ConexionBD {
    
    
    String database = "C:\\Users\\Usuario\\OneDrive\\Documentos\\Projects Netbeans\\Base de datos\\retosofka_BD.db";
    String url = "jdbc:sqlite:";
    
    public Connection connection = null;
   
    public void Conexion() {
        try{
            connection = DriverManager.getConnection(url + database);
            System.out.println("Conexion establecida");
            
        } catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
    }
   
}
