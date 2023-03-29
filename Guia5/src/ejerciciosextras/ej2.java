
package ejerciciosextras;

import java.util.Scanner;


public class ej2 {
     public static int [] llenarVector(int [] a){
        for (int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random()*10+1);
        }
        
        return a;
    }
     
     public static void mostrarVector(int [] a){
        for (int i = 0; i< a.length;i++){
            System.out.print("|" + a[i] + "|");
        }
        System.out.println("");
    }
     
     public static boolean compararVectores(int[] a, int[] b){
         for (int i = 0; i < a.length;i++){
             if(a[i] != b[i]){
                 return false;
             }
         }
         return true;
     }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique la cantidad de números que contenga los vectores");
        int n = sc.nextInt();
        int [] a = new int [n];
        int [] b = new int [n];
        llenarVector(a);
        llenarVector(b);
        mostrarVector(a);
        mostrarVector(b);
        if(compararVectores(a,b)){
            System.out.println("Los vectores son iguales");
        }else{
            System.out.println("Los vectores no son iguales");
        }
        
    }
    
}
