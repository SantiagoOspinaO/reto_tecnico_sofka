package co.retosofka.main;

import co.retosofka.conexion.ConexionBD;


public class Main {
    
    public static void main(String[] args) {
        
        ConexionBD conexionBD = new ConexionBD();
        conexionBD.Conexion();
    }
    
}
