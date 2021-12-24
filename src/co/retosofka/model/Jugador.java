package co.retosofka.model;

import co.retosofka.conexion.ConexionBD;
import java.beans.Statement;
import java.util.Date;
import java.sql.SQLException;


public class Jugador {
    
    int id;
    String nombre;
    String apellido;
    Date fechaCumpleaños;
    
    ConexionBD conexionBD = new ConexionBD();
    Statement sentencia = null;
    String Jugador;

    public void insertarJugador(int id,String nombre,String apellido,Date fechaCumpleaños)throws SQLException {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaCumpleaños = fechaCumpleaños;
        String sqlInsert="INSERT INTO " + Jugador + "(id, nombre, Apellidos, Nota) "+
                "VALUES("+id+",'"+nombre+"','"+apellido+"','"+fechaCumpleaños+"');";
       
        try {
            
            conexionBD.Conexion();
//            sentencia = conexionBD.createStatement();
//            sentencia.executeUpdate(sqlInsert);
//            sentencia.close();
//            conexionBD.close();
            System.out.println("Datos insertados");
        }catch(Exception e){
            System.out.println("Error al insertar datos en la tabla" + e);
        }
    }
    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaCumpleaños() {
        return fechaCumpleaños;
    }

    public void setFechaCumpleaños(Date fechaCumpleaños) {
        this.fechaCumpleaños = fechaCumpleaños;
    }
    
    
    
}
