
package pkg4relextra;

import java.util.Scanner;
import pkg4relextra.Entidades.Simulador;

public class Main {

    public static void main(String[] args) {
        Simulador s = new Simulador();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese cantidad de alumnos a crear: numero mayor a 10 e igual o menor a 21");
        int ca = leer.nextInt();
        s.crearListaAlumnos(ca);
        s.mostrarListaAlumnos();
        s.votacion();
        s.mostrarVotosAlumno();
        s.mostrarListaAlumnos();
        s.recuento();
        s.crearFacilitadores();
        
    }
    
}
