
package APP;

import Servicios.ServicioPais;


public class PaisAPP {

    
    public static void main(String[] args) {
        ServicioPais servPais = new ServicioPais();     
        
        servPais.crearLista();
        
        servPais.mostrarLista();
        
        servPais.buscarEnLista();
        
        servPais.mostrarLista();
    }
    
}
