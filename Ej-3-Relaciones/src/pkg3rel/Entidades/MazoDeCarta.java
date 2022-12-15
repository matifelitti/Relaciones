
package pkg3rel.Entidades;

public class MazoDeCarta {

    private int siguiente;
    private Carta [] c;

    
    public static final int MAZO = 40;

    public MazoDeCarta() {
        this.siguiente = 0;
        this.c = new Carta[MAZO];
        arraymazo();
        barajar();
    }

    
    public void arraymazo() {
        String[] oceb = Carta.OCEB;

        for (int i = 0; i < oceb.length; i++) {
            for (int j = 0; j < Carta.CARTASXPALO; j++) {
                if (!(j == 7 || j == 8)) {
                    if (j >= 9) {
                        c[((i * (Carta.CARTASXPALO - 2)) + (j - 2))] = new Carta(j + 1, oceb[i]);
                    } else {
                        c[((i * (Carta.CARTASXPALO - 2)) + j)] = new Carta(j + 1, oceb[i]);
                    }
                }
            }
        }

    }

    
    public void barajar() {
        int random;
        Carta ca;

        for (int i = 0; i < c.length; i++) {
            random = Carta.numRandom(0, MAZO -1);
            ca = c[i];
            c[i] = c[random];
            c[random] = ca;
        }

        this.siguiente = 0;
    }


    public Carta siguienteCarta(){
        Carta ca = null;
        if (siguiente == MAZO) {
            System.out.println("No hay cartas");
        } else {
            ca = c[siguiente++];
        }
        
        return ca;
    }
    

    public int cartasDisponibles(){
        return MAZO - siguiente;
    }
    
    
    public Carta[] darCartas(int pedirncartas) {

        if (pedirncartas > MAZO) {
            System.out.println("Pidió más cartas de las que hay en el mazo");
        } else {
            if (cartasDisponibles() < pedirncartas) {
                System.out.println("Pidió más cartas de las que hay disponibles");
            } else {
                Carta[] darCarta = new Carta[pedirncartas];

                for (int i = 0; i < darCarta.length; i++) {
                    darCarta[i] = siguienteCarta();
                }
                return darCarta;
            }
        }
        return null;
    }
    
    
    public void cartasMonton(){
        if (cartasDisponibles() == MAZO) {
            System.out.println("No ha salido ninguna carta");
        } else {
            for (int i = 0; i < siguiente; i++) {
                System.out.println(c[i]);
            }
        }
    }
    
    
    public void mostrarBarajas() {
        if (cartasDisponibles() == 0) {
            System.out.println("No se puede mostrar ninguna carta");
        } else {
            for (int i = siguiente; i < c.length; i++) {
                System.out.println(c[i]);
            }
        }
    }
    
    

}


