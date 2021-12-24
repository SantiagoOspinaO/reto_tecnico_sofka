package co.retosofka.model;

public class Respuesta {
    
    int respuestaID;
    char respuestaNumeral;
    String respuestaDescripcion;
    Pregunta pregunta;

    public Respuesta(char respuestaNumeral, String respuestaDescripcion, Pregunta pregunta) {
        this.respuestaNumeral = respuestaNumeral;
        this.respuestaDescripcion = respuestaDescripcion;
        this.pregunta = pregunta;
    }
    
}
