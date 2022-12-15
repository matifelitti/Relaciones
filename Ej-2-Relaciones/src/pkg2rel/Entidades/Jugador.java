
package pkg2rel.Entidades;

public class Jugador {
    private Integer id;
    private String nombre;
    private boolean muerto;

    public Jugador(int id) {
        this.id = id;
        this.nombre = "Jugador = " + id;
        this.muerto = false;
    }
    

    public Integer getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMuerto() {
        return muerto;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMuerto(boolean muerto) {
        this.muerto = muerto;
    }
    
    
    public boolean disparo(RevolverDeVerdad rev){
        boolean flag=false;
        System.out.println("Le toca el turno al " + nombre);
        if (rev.disparar()) {
            muerto = true;
            flag = true;
            System.out.println("El " + nombre + " ha muerto.");
        }
        rev.siguienteBala();
        return flag;
    }

    @Override
    public String toString() {
        return "Jugador{" + "id = " + id + ", nombre = " + nombre + ", muerto = " + muerto + '}';
    }
  
}
