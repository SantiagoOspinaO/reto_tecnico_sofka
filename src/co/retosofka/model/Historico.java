package co.retosofka.model;


public class Historico {
    
    Jugador jugador;
    Pregunta pregunta;
    OpcionRespuesta opcionRespuesta;
    boolean gana;

    public Historico(Jugador jugador, Pregunta pregunta, OpcionRespuesta opcionRespuesta) {
        this.jugador = jugador;
        this.pregunta = pregunta;
        this.opcionRespuesta = opcionRespuesta;
    }
    
    
    
}
