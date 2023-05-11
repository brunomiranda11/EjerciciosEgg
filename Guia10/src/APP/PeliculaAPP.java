

package APP;

import Servicios.ServiciosPelicula;


public class PeliculaAPP {

   
    public static void main(String[] args) {
        ServiciosPelicula servPelicula = new ServiciosPelicula();
        
        servPelicula.listaPeliculas();
        System.out.println("==MAYOR A MENOR==");
        servPelicula.ordenarMayorAMenor();
        System.out.println("===========");
        System.out.println("MENOR A MAYOR");
        servPelicula.ordenarMenorAMayor();
        System.out.println("============");
        System.out.println("TITULO ALFABETICAMENTE");
        servPelicula.ordenarTitulo();
        System.out.println("============");
        System.out.println("DIRECTOR ALFABETICAMENTE");
        servPelicula.ordenarDirector();
        System.out.println("===========");
        System.out.println("LISTA MAYOR A UNA HORA");
        servPelicula.mostrarMayorHora();
        System.out.println("===========");
    }
    
}
