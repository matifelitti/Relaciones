
package pkg4relextra.Entidades;

import java.util.ArrayList;

public class Voto {
    private Alumno alum;
    private ArrayList votosemitidos;

    public Voto() {
    }

    public Voto(Alumno alum, ArrayList votosemitidos) {
        this.alum = alum;
        this.votosemitidos = votosemitidos;
    }

    public Alumno getAlum() {
        return alum;
    }

    public ArrayList getVotosemitidos() {
        return votosemitidos;
    }

    public void setAlum(Alumno alum) {
        this.alum = alum;
    }

    public void setVotosemitidos(ArrayList votosemitidos) {
        this.votosemitidos = votosemitidos;
    }

    @Override
    public String toString() {
        return "Voto{" + "Alumno = " + alum + ", Votos Emitidos = " + votosemitidos + '}';
    }
    
    
    
    
    
}
