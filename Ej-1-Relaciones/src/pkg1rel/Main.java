
package pkg1rel;

import java.util.ArrayList;
import java.util.Scanner;
import pkg1rel.Entidades.Perro;
import pkg1rel.Entidades.Persona;

public class Main {
    
    public static void main(String[] args) {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona pers = new Persona();
    Perro p = new Perro();
    ArrayList<Persona> person = new ArrayList();
    ArrayList<Perro> perros = new ArrayList();

        int acu = 0;
        do {
            System.out.println("Cree la persona");
            System.out.println("Ingrese nombre de la persona");
            pers.setNombre(leer.next());
            System.out.println("Ingrese apellido de la persona");
            pers.setApellido(leer.next());
            System.out.println("Ingrese edad de la persona");
            pers.setEdad(leer.nextInt());
            System.out.println("Ingrese DNI de la persona");
            pers.setDni(leer.nextInt());
            pers.setPerro(p);
            person.add(pers);
            acu++;
            pers = new Persona();
        } while (acu < 2);

        int acu2 = 0;
        do {
            System.out.println("Cree el perro");
            System.out.println("Ingrese nombre del perro");
            p.setNombre(leer.next());
            System.out.println("Ingrese raza del perro");
            p.setRaza(leer.next());
            System.out.println("Ingrese edad del perro");
            p.setEdad(leer.nextInt());
            System.out.println("Ingrese tamaño del perro");
            p.setTamano(leer.nextInt());
            perros.add(p);
            acu2++;
            p = new Perro();
        } while (acu2 < 2);
        
        System.out.println("------------------------------");
        
        
        for (Persona persona : person) {
            System.out.println("La persona " + persona.getNombre() + " " + persona.getApellido() + " puede adoptar estos perros:");
            for (Perro perro : perros) {
                System.out.println(perro.getNombre());
            }
            System.out.println("Que perro desea adoptar?");
            String adoptar = leer.next();
            int acu3 = 0;
            for (int i = 0; i < perros.size(); i++) {
                if (adoptar.equalsIgnoreCase(perros.get(i).getNombre())) {
                    persona.setPerro(perros.get(i));
                    acu3++;
                    perros.remove(i);
                }
            }
            
            
            if (acu3 == 0) {
                System.out.println("No se adoptó perro");
            } else {
                System.out.println("La persona " + persona.getNombre() + " " + persona.getApellido() + " adoptó a : " + persona.getPerro().getNombre());
            }
        }
        
        
        System.out.println("------------------------------");
        
        for (Persona persona : person) {
            if (persona.getPerro()== null) {
                System.out.println("La persona " + persona.getNombre() + " " + persona.getApellido() + " no adoptó ningún perro: ");
            }
        }
        
        for (Persona aux : person) {
            System.out.println(aux);
        }
        
    }

}
    
