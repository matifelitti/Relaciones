
package pkg4relextra.Entidades.Comparadores;

import java.util.Comparator;
import pkg4relextra.Entidades.Alumno;

public class Comparadores {
     public static Comparator<Alumno> ordenarxvotos = new Comparator<Alumno>() {
        @Override
        public int compare(Alumno t, Alumno t1) {
            return t1.getVotos().compareTo(t.getVotos());
        }
    };

    
    
}
