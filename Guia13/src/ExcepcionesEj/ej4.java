
package ExcepcionesEj;

import java.util.Random;
import java.util.Scanner;


public class ej4 {

    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Random r = new Random();
        int numeroAdivinar = r.nextInt(500) + 1;
        String numero="";
        int contador = 0;
        int numeroInt = 0;
        System.out.println("el numero a adivinar es " + numeroAdivinar);
        
        do {
            try{
                System.out.println("INGRESE UN NUMERO ENTRE 1 Y 500 Q CREE Q ES EL INCOGNITO");
                numero = leer.next();
                numeroInt = Integer.parseInt(numero);
                contador++;
                if (numeroInt == numeroAdivinar) {
                    System.out.println("FELICITACIONES HAS ACERTADO!!!");
                }
                if (numeroInt < numeroAdivinar) {
                    System.out.println("EL NUMERO INGRESADO ES MENOR");

                }
                if (numeroInt > numeroAdivinar) {
                    System.out.println("EL NUMERO INGRESADO ES MAYOR");
                }
            }
            catch (NumberFormatException e1) {
                System.out.println("ERROR!!! NO INGRESASTE UN NUMERO");
                contador++;
                
            }
        } while (numeroInt != numeroAdivinar);
        
        System.out.println("USTED HA INTENTADO " + contador + " VECES ADIVINAR EL NUMERO");
    }
    
}
