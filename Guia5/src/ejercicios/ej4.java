
package ejercicios;

import java.util.Scanner;

public class ej4 {
    public static int [] [] rellenarMatriz(int [][] a){
        for (int i = 0; i < a.length;i++){
            for (int j = 0; j < a.length;j++){
                a[i][j]=(int) (Math.random()*10);
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int [] [] a = new int [3][3];
       int [] [] b = new int [3][3];
       rellenarMatriz(a);
       matrizTraspuesta(a,b);
       
       mostrarMatriz(a);
        System.out.println("=========");
       mostrarMatriz(b);  
    }
    
}
