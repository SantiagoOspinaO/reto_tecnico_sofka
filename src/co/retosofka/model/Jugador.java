package co.retosofka.model;

import java.util.Date;


public class Jugador {
    
    String nombre;
    String apellido;
    Date fechaCumpleaños;

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
