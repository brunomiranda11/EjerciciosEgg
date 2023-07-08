/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExcepcionesEj;

import java.util.Random;
import java.util.Scanner;


public class ej4v2 {

    
            
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        Random r = new Random();
        int numeroAdivinar = r.nextInt(500) + 1;
        int numero=0;
        int contador = 0;
        System.out.println("el numero a adivinar es " + numeroAdivinar);
        
        do {
            try{
                System.out.println("INGRESE UN NUMERO ENTRE 1 Y 500 Q CREE Q ES EL INCOGNITO");
                numero = leer.nextInt();
                contador++;
                if (numero == numeroAdivinar) {
                    System.out.println("FELICITACIONES HAS ACERTADO!!!");
                   
                }
                if (numero < numeroAdivinar) {
                    System.out.println("EL NUMERO INGRESADO ES MENOR");

                }
                if (numero > numeroAdivinar) {
                    System.out.println("EL NUMERO INGRESADO ES MAYOR");
                }
            }
            catch (Exception e1) {
                System.out.println("ERROR!!! NO INGRESASTE UN NUMERO");
                contador++;
               
                
            }
        } while (numero != numeroAdivinar);
         System.out.println("USTED AH INTENTADO " + contador + " VECES ADIVINAR EL NUMERO");
    }
    
}
