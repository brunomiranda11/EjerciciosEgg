/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosextras;

import java.util.Scanner;
public class ej13 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique un número");
        int n = sc.nextInt();
        System.out.println("===ESCALERA===");
       for(int i = 1; i <= n;i++){
           
           for(int j = 1; j <= i;j++){
               
                System.out.print(j);
                
               }
           
             System.out.println("");
           }
        System.out.println("===FIN-ESCALERA===");
         
       }
        
    }
    

