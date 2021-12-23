package co.retosofka.model;


public class Categoria {
    
    int nivelDificultad;
    String descripcion;

    public Categoria(int nivelDificultad, String descripcion) {
        this.nivelDificultad = nivelDificultad;
        this.descripcion = descripcion;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
    
}
