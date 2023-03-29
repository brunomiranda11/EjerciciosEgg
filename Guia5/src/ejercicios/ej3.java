
package ejercicios;

import java.util.Scanner;


public class ej3 {
    
    public static void contarDigitos(int [] a){
        int cont = 0;
        int resto = 0;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;
        int cont4 = 0;
        int cont5 = 0;
        for(int i = 0; i < a.length;i++){
            cont = 0;
            while (a[i]!= 0){
               a[i] = a[i] / 10;
               
                cont++;
            }
            switch(cont){
                case 1: cont1++; break;
                case 2: cont2++; break;
                case 3: cont3++; break;
                case 4: cont4++; break;
                case 5: cont5++; break;
            }        
        }
        System.out.println("La cantidad de números con 1 dígito: " + cont1);
        System.out.println("La cantidad de números con 2 dígito: " + cont2);
        System.out.println("La cantidad de números con 3 dígito: " + cont3);
        System.out.println("La cantidad de números con 4 dígito: " + cont4);
        System.out.println("La cantidad de números con 5 dígito: " + cont5);
    }
    public static int [] llenarVector(int [] a){
        for (int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random()*100000);
        }
        
        return a;
    }

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = sc.nextInt();
        int [] a = new int [n];
        llenarVector(a);
        contarDigitos(a);
       
    }
    
}
