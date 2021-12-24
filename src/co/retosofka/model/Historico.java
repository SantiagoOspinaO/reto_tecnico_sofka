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

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Pregunta getPregunta() {
        return pregunta;
    }

    public void setPregunta(Pregunta pregunta) {
        this.pregunta = pregunta;
    }

    public OpcionRespuesta getOpcionRespuesta() {
        return opcionRespuesta;
    }

    public void setOpcionRespuesta(OpcionRespuesta opcionRespuesta) {
        this.opcionRespuesta = opcionRespuesta;
    }

    public boolean isGana() {
        return gana;
    }

    public void setGana(boolean gana) {
        this.gana = gana;
    }
      
    
    
}
