
package pkg3rel.Entidades;

public class Carta {
    
    private int numero;
    private String palo;

    public static final String[] OCEB = {"ORO", "COPA", "ESPADA", "BASTO"};
    public static final int CARTASXPALO = 12;

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    
    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    @Override
    public String toString() {
        return numero + " de " + palo;
    }
    
    public static int numRandom(int min, int max) {
        int n = (int) (Math.random() * (min - (max + 1)) + (max + 1));
        return n;
    }
            
}
