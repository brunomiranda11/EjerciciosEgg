
package Utilidades;

import Entidades.Pelicula;
import java.util.Comparator;


public class Comparadores {
       public static Comparator<Pelicula> ordenarMayorMenor = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t1.getDuracion().compareTo(t.getDuracion());
        }
    };
       
    public static Comparator<Pelicula> ordenarMenorMayor = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDuracion().compareTo(t1.getDuracion());
        }
    };
    
       public static Comparator<Pelicula> ordenarTituloAbc = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareToIgnoreCase(t1.getTitulo());
        }
    };
       
        public static Comparator<Pelicula> ordenarDirectorAbc = new Comparator<Pelicula> () {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return t.getDirector().compareToIgnoreCase(t1.getDirector());
        }
    };
    


}
