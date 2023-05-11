
package Servicios;

import Entidades.Perro;
import java.util.ArrayList;

import java.util.Iterator;
import java.util.Scanner;

public class ServiciosRaza {
    private ArrayList<Perro> razas;
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private Iterator<Perro> it;
    
    
    public ServiciosRaza(){
       this.razas = new ArrayList();
    }
    
    public Perro agregarRaza(){
        System.out.println("Indique la raza del perro");
        String raza = sc.next();
        Perro p = new Perro(raza);
        return p;
        
    }
    public void agregarLista(Perro p){
        razas.add(p);
        
    }
    
    public void crearLista(){
           String respuesta = "";
        do{
           Perro razaCreada = agregarRaza();
           
           agregarLista(razaCreada);
           System.out.println("¿Desea agregar otra raza? Indique respuesta (SI/NO)");
           respuesta = sc.next();
        }while(respuesta.equalsIgnoreCase("si"));
        
    }
    
    public void mostrarRazas(){
       
        for (Perro elem : razas) {
            System.out.println(elem);      
        }
        System.out.println("La cantidad de la lista de razas es de: " + razas.size());
    }
    
    public void buscarRaza(){
        it = razas.iterator();
        System.out.println("Indique la raza que quiera buscar");
        String raza = sc.next();
        while(it.hasNext()){
            if(it.next().getRaza().equalsIgnoreCase(raza)){
                it.remove();
                
            }
            
        }
        
        mostrarRazas();
    }
    
    

}
