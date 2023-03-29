
package ejercicios;

import java.util.Scanner;
//EN REALIDAD ES EL EJERCICIO 5 XD

public class ej6 {
    
     public static int [] [] rellenarMatriz(int [][] a){
         Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length;i++){
            for (int j = 0; j < a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        return a;
    }
      public static int [][] matrizTraspuesta(int [][] a, int[][] b){
        for (int i = 0; i < b.length;i++){
            for (int j = 0; j < b.length;j++){
                b[i][j]=a[j][i];
            }
        }
        return b;
    }
      
    public static void mostrarMatriz(int [][] a){
         for (int i = 0; i < a.length;i++){
            for (int j = 0; j < a.length;j++){
                System.out.print("|" + a[i][j] + "|");
            }
             System.out.println("");
        }
        
    }
    
    public static boolean esAntisimetrica(int[][] a, int [][]b){
         for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i][j] != -b[i][j]) {
                    return false;
                }
            }
        }
         
        return true;
    }
     
    public static void main(String[] args) {
        
       int [] [] a = new int [3][3];
       int [] [] b = new int [3][3];
       rellenarMatriz(a);
       matrizTraspuesta(a,b);
       
       mostrarMatriz(a);
       System.out.println("=========");
       mostrarMatriz(b);
       
       if(esAntisimetrica(a,b)){
           System.out.println("La matriz ES antisimetrica.");
       }else{
           System.out.println("La matriz NO es antisimetrica.");
       }
        
       
    }
    
}
