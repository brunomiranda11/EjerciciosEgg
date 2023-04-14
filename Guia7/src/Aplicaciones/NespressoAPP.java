
package Aplicaciones;
import Entidades.Cafetera;
import Servicios.ServicioCafetera;

public class NespressoAPP {

  
    public static void main(String[] args) {
        
        ServicioCafetera serv = new ServicioCafetera();
        Cafetera c = serv.crearCafetera();
        serv.llenarTaza(c, 70);
        serv.mostrarCantidad(c);
        serv.vaciarCafetera(c);
        serv.mostrarCantidad(c);
        serv.llenarCafetera(c);
        serv.mostrarCantidad(c);
       
     
        
        
       
    }
    
}
