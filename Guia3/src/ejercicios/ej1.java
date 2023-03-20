
package ejercicios;

import java.util.Scanner;
public class ej1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número para determinar si es par o no");
        int n = sc.nextInt();
        
        if (n%2==0){
            System.out.println("El número: " + n + "es par");
        }else{
            System.out.println("El número: " + n + " es impar");
        }
        
        
    }
    
}
