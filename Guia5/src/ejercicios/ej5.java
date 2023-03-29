
package ejercicios;

import java.util.Scanner;

public class ej5 {
    public static int [] [] rellenarMatriz(int [][] a){
         Scanner sc = new Scanner(System.in);
        for (int i = 0; i < a.length;i++){
            for (int j = 0; j < a.length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        return a;
    }
      public static void mostrarMatriz(int [][] a){
         for (int i = 0; i < a.length;i++){
            for (int j = 0; j < a.length;j++){
                System.out.print("|" + a[i][j] + "|");
            }
             System.out.println("");
        }
        
    }
    
    public static boolean esMagica(int[][] a){
        int sumaColumnas=0;
        int sumaDiagonal=0;
        int sumaDiagonal2=0;
        int sumaHorizontal=0;
        int sumaVertical = 0;
        for (int i = 0; i < a.length;i++){
            
            
            for (int j = 0; j < a.length;j++){
                if(i == j ){
                    sumaDiagonal += a[i][j];     
                }
                if (i + j == 3 - 1) {
                    sumaDiagonal2 += a[i][j]; 
                }
                sumaHorizontal += a[i][j];
                sumaVertical += a[j][i];
            }
        }
        
        return (sumaHorizontal/3) == (sumaDiagonal + sumaDiagonal2)/2 && sumaHorizontal == sumaVertical;
    }
    


    public static void main(String[] args) {
       int [] [] a = new int [3][3];
       rellenarMatriz(a);
       
       mostrarMatriz(a);
       
       if(esMagica(a)){
           System.out.println("La matriz es mágica");
       }else{
           System.out.println("No es mágica");
       }

        
        
    }
    
}
