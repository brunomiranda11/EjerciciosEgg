
package ejercicios;
import java.util.Scanner;

public class ej5 {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int n = sc.nextInt();
        int suma = 0;
        if(n <= 0){
            System.out.println("Valor fuera de rango");
        }else{
            do{
                int a = sc.nextInt();
                suma += a;
            }while(suma <= n);
            System.out.println("El valor: " + n + " fue superado por el valor: " + suma);
        }
        
    }
    
}
