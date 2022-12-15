
package pkg4relextra.Entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import pkg4relextra.Entidades.Comparadores.Comparadores;

public class Simulador {
    ArrayList <Alumno> a = new ArrayList();
    Alumno al = new Alumno();
    
    
    public String[] crearNombre() {
        String[] nombresrandom = new String[21];
        String[] nombre = {"Andrea", "Bartolo", "Candela", "Dario", "Emma", "Federico",
            "Gisela", "Horacio", "Irma", "Jacobo", "Karina", "Leonardo", "Maria", "Nicolas", "Olga",
            "Pedro", "Rocio", "Sebastian", "Teresa", "Victor", "Ximena"};
        String[] apellido = {"Armani", "Bonano", "Cespedes", "Damico", "Ezpeleta", "Felitti",
            "Gonzalez", "Garcia", "Luciani", "Morla", "Nolasco", "Olazabal", "Primo", "Quesada",
            "Ramirez", "Sosa", "Trastámara", "Urquiza", "Venesia", "Vigna", "Zucardo"};

        for (int i = 0; i < 21; i++) {
            nombresrandom[i] = nombre[(int) (Math.floor(Math.random() * ((nombre.length - 1) - 0 + 1) + 0))] + " "
            + apellido[(int) (Math.floor(Math.random() * ((apellido.length - 1) - 0 + 1) + 0))];
        }
        return nombresrandom;
    }

    
    public int crearDni (){
        int n1 = 3000000;
        int n2 = 47000000;
        int dnirandom = 0;
        for (int i = 0; i < 21; i++) {
            dnirandom = (int) (Math.floor(Math.random()*(n2-(n1+1)+(n1))));
        }
        return dnirandom;
    }

    
    public ArrayList crearListaAlumnos(int cant){
 
        for (int i = 0; i < cant; i++) {
            a.add(new Alumno(crearNombre()[i], crearDni()));
        }
        return a;
    }
    
    public void mostrarListaAlumnos(){
        
        for (Alumno alumno : a) {
            System.out.println(alumno);
        } 
    }
    
    public void votacion(){
        
        for (int i = 0; i < a.size(); i++) {
            a.get(i).setCantvotos(votosAlumno(a.get(i),i));
        }

    }
    
    public HashSet<String> votosAlumno(Alumno al, int i) {
        boolean val;
        int alu;
        HashSet<String> lista = new HashSet<>();
        for (int j = 0; j < 3; j++) {
            do {
                do {
                    alu = (int) (Math.random() * a.size());
                } while (alu == i);
                val = false;
                for (String aux : lista) {
                    if (aux.equals(a.get(alu).getNombre()) && !val) {
                        val = true;
                    }
                }
            } while (val);
            lista.add(a.get(alu).getNombre());
            a.get(alu).setVotos(a.get(alu).getVotos() + 1);
        }
        return lista;
    }
    
    public void mostrarVotosAlumno(){
        for (Alumno aux : a) {
            System.out.println("El alumno " + aux.getNombre() + " voto a " + aux.getCantvotos());
        }
        
    }
    
    public void recuento(){
        for (Alumno aux : a) {
            System.out.println("El alumno " + aux.getNombre() + " tiene " + aux.getVotos() + " votos ");
        }
        
    }
    
    public void crearFacilitadores(){
        Collections.sort(a, Comparadores.ordenarxvotos);
        System.out.println("Facilitadores: ");
        for (int i = 0; i < 5; i++) {
            System.out.println("Facilitador" + a.get(i).getNombre());
        }
        System.out.println("Facilitadores suplentes : ");
                for (int i = 5; i < 10; i++) {
            System.out.println("Facilitador suplente" + a.get(i).getNombre());
        }
    }
    
    
}
