package co.retosofka.main;

import co.retosofka.application.Juego;
import co.retosofka.conexion.ConexionBD;
import co.retosofka.model.Jugador;


public class Main {
    
    public static void main(String[] args) {
        
        ConexionBD conexionBD = new ConexionBD();
        conexionBD.Conexion();
        
        Juego juego = new Juego();
        juego.Jugar();
    }   
    
}
