/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
public class ej4 {
    public static boolean esPrimo(int n){
        int cont=0;
        for(int i = 1; i <= n;i++){
            if(n%i==0){
                cont++;
            }
            
        }
        return cont == 2;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique un número para saber si es primo: ");
        int n= sc.nextInt();
        System.out.println(esPrimo(n));
        
        
    }
    
}
