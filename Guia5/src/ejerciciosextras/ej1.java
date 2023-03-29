/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextras;

import java.util.Scanner;



public class ej1 {
    
    public static int [] llenarVector(int [] a){
        for (int i = 0; i < a.length; i++){
            a[i] = (int) (Math.random()*11+1);
        }
        
        return a;
    }
    
    public static int sumaVector(int [] a){
        int suma=0;
        for (int i = 0; i < a.length;i++){
            suma += a[i];
        }
        return suma;
    }
    
    public static void mostrarVector(int [] a){
        for (int i = 0; i< a.length;i++){
            System.out.print("|" + a[i] + "|");
        }
        System.out.println("");
    }

  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique la cantidad de números que contenga el vector");
        int n = sc.nextInt();
        int [] a = new int [n];
        llenarVector(a);
        mostrarVector(a);
        
        System.out.println("La suma de todos los números del vector es: " + sumaVector(a));
        
    
    }
    
}
