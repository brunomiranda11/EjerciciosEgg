

package Servicios;
import Entidades.NIF;
import java.util.Scanner;

public class ServicioNIF {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public NIF crearNIF(){
        System.out.println("Indique su DNI");
        int DNI = sc.nextInt();
        int pos = DNI % 23;
        String [] listaLetras = {"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
        String letra = listaLetras[pos];
        return new NIF(DNI,letra);
    }
    
    public void mostrar(NIF n){
        System.out.println(n.getDNI()+ "-" + n.getLetra());
    }

}
