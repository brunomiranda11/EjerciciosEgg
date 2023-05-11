

package Servicios;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import Utilidades.Comparadores;
import java.util.Collections;
import java.util.Iterator;


public class ServiciosPelicula {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Pelicula> peliculas = new ArrayList();
    private Iterator<Pelicula> it;
    
   
    

    public Pelicula agregarPelicula() {
        System.out.println("Ingrese el titulo");
        String titulo = sc.next();
        System.out.println("Ingrese el nombre del Director");
        String director = sc.next();
        System.out.println("Ingrese la duración (hora,minutos)");
        Double duracion = sc.nextDouble();
        return new Pelicula(titulo,director,duracion);
    }
    
    public void agregarLista(Pelicula p){
        peliculas.add(p);
    }
    
    public void listaPeliculas(){
        String respuesta;
        do{
            Pelicula peliculaNueva = agregarPelicula();
            agregarLista(peliculaNueva);
            System.out.println("¿Desea agregar una pelicula nueva? (s/n)");
            respuesta = sc.next();
            
        }while(respuesta.equalsIgnoreCase("s"));
        
    }
    
    public void ordenarMayorAMenor(){
        Collections.sort(peliculas, Comparadores.ordenarMayorMenor);
        mostrarLista();
    }
    
    public void ordenarMenorAMayor(){
        Collections.sort(peliculas, Comparadores.ordenarMenorMayor);
        mostrarLista();
    }
    public void ordenarTitulo(){
        Collections.sort(peliculas, Comparadores.ordenarTituloAbc);
        mostrarLista();
    }
      public void ordenarDirector(){
        Collections.sort(peliculas, Comparadores.ordenarDirectorAbc);
        mostrarLista();
    }
    
    public void mostrarLista(){
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }
    
    public void mostrarMayorHora(){
        it = peliculas.iterator();
        while(it.hasNext()){
            Pelicula pelicula = it.next();
            if(pelicula.getDuracion() > 1){
                System.out.println(pelicula.getTitulo());
            }
        }
    }
 

}
