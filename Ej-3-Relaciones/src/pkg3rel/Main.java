
package pkg3rel;

import java.util.Scanner;
import pkg3rel.Entidades.Carta;
import pkg3rel.Entidades.MazoDeCarta;

public class Main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        MazoDeCarta mc = new MazoDeCarta();
        mc.barajar();
        
        System.out.println("Ingrese un número de cartas a mostrar");
        mc.darCartas(leer.nextInt());
        System.out.println("");
        
        mc.siguienteCarta();
        
        System.out.println("Cartas que han salido");
        mc.cartasMonton();
        System.out.println("");
        

        System.out.println("Hay " + mc.cartasDisponibles() + " cartas disponibles");
        System.out.println("");
        mc.siguienteCarta();
        
        mc.barajar();
        
        System.out.println("Ingrese un número de cartas a mostrar");
        Carta [] c = mc.darCartas(leer.nextInt());
         
        
        System.out.println("Cartas que han salido");
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
        

    }


    
    
}
