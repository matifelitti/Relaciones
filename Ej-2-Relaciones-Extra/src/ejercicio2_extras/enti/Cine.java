package ejercicio2_extras.enti;

import java.util.ArrayList;

public class Cine {

    private Pelicula pelicula;
    private ArrayList<Espectador> espectadores;
    private int precioEntrada;
    private boolean[][] asientosB;
    private String[][] asientosS;
    private Espectador[][] asientosE;

    public Cine() {
        asientosB = new boolean[8][6];
        asientosS = new String[8][6];
        asientosE = new Espectador[8][6];
        crearAsientos();
    }

    public void crearAsientos() {
        String[] numeros = {"8", "7", "6", "5", "4", "3", "2", "1"};
        String[] letras = {"A", "B", "C", "D", "E", "F"};
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                asientosB[i][j] = false;
                asientosE[i][j] = null;
                asientosS[i][j] = "" + numeros[i] + " " + letras[j]+"  ";
                //System.out.print(asientosS[i][j] + "  ");
            }
            //System.out.println("");
        }

    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public ArrayList<Espectador> getEspectadores() {
        return espectadores;
    }

    public void setEspectadores(ArrayList<Espectador> espectadores) {
        this.espectadores = espectadores;
    }

    public int getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(int precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public boolean[][] getAsientosB() {
        return asientosB;
    }

    public void setAsientosB(boolean[][] asientosB) {
        this.asientosB = asientosB;
    }

    public String[][] getAsientosS() {
        return asientosS;
    }

    public void setAsientosS(String[][] asientosS) {
        this.asientosS = asientosS;
    }

    public Espectador[][] getAsientosE() {
        return asientosE;
    }

    public void setAsientosE(Espectador[][] asientosE) {
        this.asientosE = asientosE;
    }

}
