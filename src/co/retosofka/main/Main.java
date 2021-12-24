package co.retosofka.main;

import co.retosofka.application.Juego;
import co.retosofka.conexion.ConexionBD;
import co.retosofka.model.Categoria;
import co.retosofka.model.Jugador;
import co.retosofka.model.Pregunta;


public class Main {
    
    public static void main(String[] args) {
        
        ConexionBD conexionBD = new ConexionBD();
        conexionBD.Conexion();
        
        Juego juego = new Juego();
        juego.Jugar();
        
        Categoria principiante = new Categoria(1, "Principiante");
        Categoria intermedio = new Categoria(2, "Intermedio");
        Categoria intermedioAlto = new Categoria(3, "IntermedioAlto");
        Categoria avanzado = new Categoria(4, "Avanzado");
        Categoria experto = new Categoria(5, "Experto");
    
    
    
    }   
    
}
