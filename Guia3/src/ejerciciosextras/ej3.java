
package ejerciciosextras;

import java.util.Scanner;
public class ej3 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba una letra");
        String letra = sc.next();
        
        if(letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u") ){
            System.out.println("Es una vocal");
        }else{
            System.out.println("No es una vocal");
        }
    }
    
}
