
package ejercicios;
import java.util.Scanner;


public class ej2 {
     public static int [] llenarVector(int [] a){
        for (int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random()*11);
        }
        
        return a;
    }
     
    public static void verRepetidos (int [] a, int n){
        int cont=0;
        for (int i = 0; i < a.length; i++){
            if(a[i] == n){
                System.out.println("El número: " + n + " se encuentra en la posición: " + i);
                cont++;
            }               
        }
        if(cont < 2){
        System.out.println("El número: " + n + " no se repite");
        }else{
            System.out.println("El número: " + n + " se repite: " + cont + " veces.");
        }
    }
    

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = sc.nextInt();
        System.out.println("¿Qué número quiere buscar?");
        int b = sc.nextInt();
        int [] a = new int [n];
        llenarVector(a);
        verRepetidos(a,b);
    }
    
}
