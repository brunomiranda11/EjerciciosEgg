
package Aplicaciones;
import Entidades.Raices;
import Servicios.ServicioRaices;
public class RaicesAPP {

    
    public static void main(String[] args) {
        
        ServicioRaices sr = new ServicioRaices();
        
        Raices r = sr.crearRaices();
        
        sr.calcular(r);
        
    }
    
}
