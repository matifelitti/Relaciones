
package pkg2rel;

import java.util.ArrayList;
import java.util.Scanner;
import pkg2rel.Entidades.Juego;
import pkg2rel.Entidades.Jugador;
import pkg2rel.Entidades.RevolverDeVerdad;

public class Main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        RevolverDeVerdad rdv = new RevolverDeVerdad();
        ArrayList<Jugador> ju = new ArrayList();
        
        System.out.println("Ingrese cantidad de jugadores");
        int ingresecant = leer.nextInt();
        if (ingresecant>6 || ingresecant<1) {
            ingresecant=6;
        }
        
        for (int i = 0; i < ingresecant; i++) {
            System.out.println("Ingrese id del jugador");
            Jugador j1 = new Jugador(leer.nextInt());
            ju.add(j1);
        }
        
        Juego j = new Juego();
        rdv.llenarRevolver();
        j.llenarJuego(ju, rdv);
        
        System.out.println("Ingrese dinero a apostar por persona");
        int dxp= leer.nextInt();
        
        boolean siguiente = true;
        int turno = 0;
        while (siguiente) {
            System.out.println(rdv);
            if (turno == (ingresecant)) {
                turno = 0;
            }
            siguiente = j.ronda(turno);
            if (siguiente) {
                System.out.println("Jugador sigue vivo");
            } else {
                int dineroproporcional = (dxp*ingresecant)/(ingresecant-1);
                System.out.println("Juego finalizado. Se reparten $" +dineroproporcional+ " por cada persona con vida");
            }
            turno++;
        }
        
        
    }
}
