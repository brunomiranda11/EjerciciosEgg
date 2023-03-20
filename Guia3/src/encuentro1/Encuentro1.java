
package encuentro1;
import java.util.Scanner;
public class Encuentro1 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el primer número");
        int x = sc.nextInt();
        System.out.println("Escriba el segundo número");
        int z = sc.nextInt();
        System.out.println("La suma entre los números es: " + (x + z));
        sc.nextLine();
        System.out.println("¿Cuál es tu nombre?");
        String name = sc.nextLine();
        System.out.println("Buen día " + name);
        System.out.println(name.toUpperCase());
        System.out.println("Indique una frase en mayúsculas");
        String frase = sc.nextLine();
        System.out.println(frase.toLowerCase());
        double C = 27;
        double F = 32 + (9*C/5);
        System.out.println("La cantidad de grados Centigrados es: " + C + " Y en Farenheit: " + F);
        int n  = 4;
        System.out.println(Math.sqrt(n) +  " " + Math.sqrt(n*2) + " " + Math.sqrt(n*3));
       
        
    }
    
}
