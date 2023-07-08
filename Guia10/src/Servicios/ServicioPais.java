

package Servicios;

import Entidades.Pais;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Scanner;


public class ServicioPais {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private TreeSet<Pais> paises = new TreeSet();
    private Iterator<Pais> it;
    
    public Pais agregarPais(){
        System.out.println("Indique el nombre del país");
        String pais = sc.next();
        
        return new Pais(pais);
    }
    
    public void crearLista(){
        String respuesta="";
        do{
           Pais pais = agregarPais();
            agregarLista(pais);
            System.out.println("¿Desea agregar otro país? (s/n)");
            respuesta = sc.next();
        }while(respuesta.equalsIgnoreCase("s"));
    }
    
    public void agregarLista(Pais p){
        paises.add(p);
    }
    
    public void mostrarLista(){
        for (Pais p : paises) {
            System.out.println(p.toString());
        }
    }
    
    public void buscarEnLista(){
        it = paises.iterator();
        System.out.println("Indique el pais a buscar");
        String p = sc.next();
        while(it.hasNext()){
            Pais pais = it.next();
            if(pais.getPais().equalsIgnoreCase(p)){
                it.remove();
            System.out.println("Se eliminó: " + pais.getPais());
            break;
            }
        }
        System.out.println("No se encontró el pais");
      
    }

}
