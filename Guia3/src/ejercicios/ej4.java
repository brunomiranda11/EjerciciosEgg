
package ejercicios;
import java.util.Scanner;

public class ej4 {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduza una palabra o frase");
        String frase = sc.nextLine();
        
        if(frase.substring(0,1).equals("a")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
    
}
