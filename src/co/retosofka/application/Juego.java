package co.retosofka.application;

import co.retosofka.model.Jugador;
import java.util.Scanner;

public class Juego {
    
    public void Jugar(){
        
        Jugador jugador1 = new Jugador();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba su nombre");
        String nombre = scanner.nextLine();
        jugador1.setNombre(nombre);
        System.out.println("Escriba su apellido");
        String apellido = scanner.nextLine();
        jugador1.setApellido(apellido);
        System.out.println("Hola " + jugador1.getNombre() + " " + jugador1.getApellido());
                   
    }
    
}
