
package APP;
import Servicios.ServiciosRaza;
import java.util.Scanner;

public class RazasAPP {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        ServiciosRaza ServRaza = new ServiciosRaza();
     
      ServRaza.crearLista();
      
      ServRaza.mostrarRazas();
      
      ServRaza.buscarRaza();
      
      ServRaza.mostrarRazas();
    }
    
}
