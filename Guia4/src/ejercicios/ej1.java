/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;

public class ej1 {
    public static int operacionAritmetica(int a,int b, String option){
        switch(option.toLowerCase()){
                case "suma": return (a+b);
                case "resta": return a-b;
                case "multi": return (a*b);
                case "div": return (a/b);
                default: return 0;
        }
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique valor 1 y valor 2");
        int x = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("¿Que hará con los valores?");
        System.out.println("==(suma)==(resta)==(multi)==(div)==");   
        String opcion = sc.next();
 
        System.out.println("El resultado es: " + operacionAritmetica(x,z,opcion));
        
        
    }
    
}
