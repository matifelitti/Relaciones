
package pkg2rel.Entidades;

import java.util.ArrayList;

public class Juego {
    private RevolverDeVerdad rev;
    private ArrayList<Jugador> jug;

    public Juego() {
    }

    public Juego(RevolverDeVerdad rev, ArrayList<Jugador> jug) {
        this.rev = rev;
        this.jug = jug;
    }

    
    
    public RevolverDeVerdad getRev() {
        return rev;
    }

    public ArrayList<Jugador> getJugadores() {
        return jug;
    }

    public void setRev(RevolverDeVerdad rev) {
        this.rev = rev;
    }

    public void setJug(ArrayList<Jugador> jug) {
        this.jug = jug;
    }
    
    
    public void llenarJuego(ArrayList<Jugador>j, RevolverDeVerdad r){
        rev = r;
        jug = j;
    }
    
    public boolean ronda (int i){
        boolean siguiente = true;
        jug.get(i).disparo(rev);
        if (jug.get(i).isMuerto()) {
            siguiente=false;
        }
        return siguiente;
    }
    
    @Override
    public String toString() {
        return "Juego{" + "rev =" + rev + ", jugadores =" + jug + '}';
    }
    
    
}
