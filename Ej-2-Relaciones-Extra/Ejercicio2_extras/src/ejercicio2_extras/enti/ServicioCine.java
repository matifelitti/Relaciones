package ejercicio2_extras.enti;

import java.util.ArrayList;

public class ServicioCine {

    java.util.Scanner cr = new java.util.Scanner(System.in).useDelimiter("\n");
    java.util.Scanner cr2 = new java.util.Scanner(System.in).useDelimiter("\n");
    java.util.Scanner cr3 = new java.util.Scanner(System.in).useDelimiter("\n");

    private Cine cine;
    private Espectador espectador;
    private Pelicula pelicula;

    public ServicioCine() {
        espectador = new Espectador();
        pelicula = new Pelicula();
        cine = new Cine();
    }

    public void crearCine() {
        System.out.println("-------CINE-------");

        System.out.println("---PELICULA---");
        cine.setPelicula(crearPelicula());
        System.out.println("---PRECIO---");
        System.out.println("Ingresar precio: ");
        cine.setPrecioEntrada(cr2.nextInt());
        System.out.println("---SALA DE ASIENTOS---");
        mostrarSalaDeAsientos();
        System.out.println("---SALA DE ESPECTADORES---");
        cine.setEspectadores(llenarSala());
        System.out.println("---UBICAR ESPECTADORES---");
        System.out.println("........");
        ubicarEspectador();
        System.out.println("---SALA DE ASIENTOS---");
        mostrarSalaDeAsientos();
    }

    public Pelicula crearPelicula() {
        /*private String titulo;
    private double duracion;
    private int edadMinima;
    private String director;*/
        System.out.println("Ingresar nombre del titulo: ");
        String titulo = cr.nextLine();
        System.out.println("Ingresar duración: ");
        double duracion = cr.nextDouble();
        System.out.println("Ingresar edad mínima: ");
        int edadMinima = cr.nextInt();
        System.out.println("Ingresar nombre del director: ");
        String director = cr2.nextLine();
        return new Pelicula(titulo, duracion, edadMinima, director);
    }

    public Espectador crearEspectador() {
        /*private String nombre;
    private int edad;
    private int dinero;*/
        System.out.println("Ingresar nombre: ");
        String nombre = cr3.nextLine();
        System.out.println("Ingresar edad: ");
        int edad = cr.nextInt();
        System.out.println("Ingresar dinero: ");
        int dinero = cr.nextInt();
        return new Espectador(nombre, edad, dinero);
    }

    public ArrayList<Espectador> llenarSala() {
        ArrayList<Espectador> espectadores = new ArrayList<>();
        ArrayList<Espectador> espectadores_edadMinima = new ArrayList<>();
        ArrayList<Espectador> espectadores_costo = new ArrayList<>();
        ArrayList<Espectador> espectadores_edadMinima_y_costo = new ArrayList<>();

        System.out.println("Ingresar n° de espectadores: ");
        int n = cr2.nextInt();
        while (n < 1 || n > 48) {
            if (n < 1) {
                System.out.println("Debe ingresar al menos un espectador.");
            } else if (n > 48) {
                System.out.println("Debe ingresar como máximo 48 espectadores");
            }
            System.out.println("Ingresar n° de espectadores: ");
            n = cr.nextInt();
        }

        for (int i = 0; i < n; i++) {
            espectador = crearEspectador();
            if (espectador.getDinero() < cine.getPrecioEntrada() && espectador.getEdad() < cine.getPelicula().getEdadMinima()) {
                // Si el dinero del espectador es menor al precio del entrada
                // y Si la edad del espectador es menor al edad mínima de la pelicula
                espectadores_edadMinima_y_costo.add(espectador);
            } else if (espectador.getDinero() < cine.getPrecioEntrada()) {
                // Si el dinero del espectador es menor al precio del entrada
                espectadores_costo.add(espectador);
            } else if (espectador.getEdad() < cine.getPelicula().getEdadMinima()) {
                // Si la edad del espectador es menor al edad mínima de la pelicula 
                espectadores_edadMinima.add(espectador);
            } else {
                espectadores.add(espectador);
            }
        }
        if (espectadores.size() > 0) {
            System.out.println("---ESPECTADORES EN LA SALA---");
            for (Espectador aux : espectadores) {
                System.out.println("• " + aux.toString());
            }
        } else {
            System.out.println("NINGUN ESPECTADOR PUDO INGRESAR A LA SALA");
        }
        if (espectadores_edadMinima_y_costo.size() > 0) {
            System.out.println("--ESPECTADORES POR FALTA DE DINERO Y EDAD MINIMA---");
            for (Espectador aux : espectadores_edadMinima_y_costo) {
                System.out.println("• " + aux.toString());
            }
        }
        if (espectadores_costo.size() > 0) {
            System.out.println("--ESPECTADORES POR FALTA DE DINERO---");
            for (Espectador aux : espectadores_costo) {
                System.out.println("• " + aux.toString());
            }
        }
        if (espectadores_edadMinima.size() > 0) {
            System.out.println("--ESPECTADORES POR FALTA DE EDAD MINIMA---");
            for (Espectador aux : espectadores_edadMinima) {
                System.out.println("• " + aux.toString());
            }
        }

        return espectadores;
    }

    public void ubicarEspectador() {
        boolean[][] asientosB = new boolean[8][6];
        String[][] asientosS = new String[8][6];
        Espectador[][] asientosE = new Espectador[8][6];
        asientosB = cine.getAsientosB();
        asientosS = cine.getAsientosS();
        asientosE = cine.getAsientosE();
        int i, j;
        for (Espectador aux : cine.getEspectadores()) {
            do {
                i = (int) (Math.random() * 9); // 0-8
                j = (int) (Math.random() * 7); // 0-6
            } while (asientosB[i][j]);
            asientosB[i][j] = true;
            asientosS[i][j] = cambiarX(asientosS[i][j]);
            asientosE[i][j] = aux;
        }
        cine.setAsientosB(asientosB);
        cine.setAsientosS(asientosS);
        cine.setAsientosE(asientosE);
    }

    public void mostrarSalaDeAsientos() {
        String[][] asientosS = new String[8][6];
        asientosS = cine.getAsientosS();
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(asientosS[i][j] + " | ");
            }
            System.out.println("");
        }
    }
    
    public String cambiarX(String palabra){
        String palabra2 ="";
        for (int i = 0; i < palabra.length()-1; i++) {
            palabra2 += palabra.substring(i, i+1);
        }       
        return palabra2+"X";
    }
}
