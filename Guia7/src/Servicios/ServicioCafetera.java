/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Servicios;
import Entidades.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public Cafetera crearCafetera(){
        System.out.println("Indique la cantidad máxima de la cafetera");
        int cantidadMaxima = sc.nextInt();
        System.out.println("Indique cantidad del cafe");
        int cantidadActual = sc.nextInt();  
        
        return new Cafetera(cantidadMaxima,cantidadActual);
    }
    public void llenarTaza(Cafetera c, int tamañoTaza){
        if(c.getCantidadActual() < tamañoTaza){
            System.out.println("Se sirvió la cantidad de: " + c.getCantidadActual() + ", la taza no se logró llenar");
            c.setCantidadActual(c.getCantidadActual() - c.getCantidadActual());
        }else if(c.getCantidadActual() >= tamañoTaza){
            System.out.println("Se sirvió y se llenó la taza");
            c.setCantidadActual(c.getCantidadActual() - tamañoTaza);
        }
        
    }
    
    public void vaciarCafetera(Cafetera c){
        System.out.println("Se vació la cafetera, la cantidad actual es: 0");
        c.setCantidadActual(0);
    }
    public void llenarCafetera(Cafetera c){
        System.out.println("¿Cuanto café agregará?");
        int cantidad = sc.nextInt();
        if(cantidad > c.getCantidadMaxima()){
            System.out.println("Se llenará hasta el máximo posible.");
        }else{
            System.out.println("Se llenó la cantidad de: " + cantidad);
        }
        
        c.setCantidadActual(cantidad);
        
    }
    public void mostrarCantidad(Cafetera c){
        System.out.println("La cantidad máxima es: " + c.getCantidadMaxima() + " y la cantidad actual es de: " + c.getCantidadActual());
    }

}
