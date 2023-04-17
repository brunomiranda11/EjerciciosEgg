
package Aplicaciones;
import Entidades.NIF;
import Servicios.ServicioNIF;

public class VerificadorAPP {

    public static void main(String[] args) {
        ServicioNIF sn = new ServicioNIF();
        
        NIF n = sn.crearNIF();
        
        sn.mostrar(n);
        
    }
    
}
