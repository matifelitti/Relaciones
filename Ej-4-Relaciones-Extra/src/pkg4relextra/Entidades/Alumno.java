
package pkg4relextra.Entidades;

import java.util.HashSet;

public class Alumno {
    private String nombre;
    private Integer dni;
    private HashSet<String> cantvotos;
    private Integer votos;
    
    public Alumno() {
    }

    public Alumno(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
        cantvotos = new HashSet();
        votos = 0;
    }



    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public HashSet<String> getCantvotos() {
        return cantvotos;
    }

    public Integer getVotos() {
        return votos;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setCantvotos(HashSet<String> cantvotos) {
        this.cantvotos = cantvotos;
    }

    public void setVotos(Integer votos) {
        this.votos = votos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "Nombre = " + nombre + ", DNI = " + dni + ", Cantidad de Votos = " + cantvotos + ", Votos recibidos = " + votos + '}';
    }

 

    
}
