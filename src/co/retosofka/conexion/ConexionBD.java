package co.retosofka.conexion;

import com.sun.jdi.connect.spi.Connection;
import java.sql.DriverManager;


public class ConexionBD {
    
    public String driver = "com.mysql.cj.jdbc.Driver";
    public String user = "postgres";
    public String pass = "Admin";
    public String url = "jdbc:mysql://localhost:3306/";
    public String nameBD = "retosofka_BD";
    
    public Connection connection;

    public ConexionBD() {
    }
   
    public Connection Conexion() {
        try{
            Class.forName(driver);
            connection =  (Connection) DriverManager.getConnection(url + nameBD, user, pass);
            System.out.println("Conexion establecida");
            
        } catch (Exception e){
            System.out.println("Error de conexion: " + e);
        }
        return connection;
    }    
    
}
