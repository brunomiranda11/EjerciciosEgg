/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;


public class prueba {
   
    public static void main(String[] args) {
        String f="frase de prueba";
        String fn = "";
        for (int i = 0; i < f.length(); i++ ){
            fn += f.substring(i, i);
            
        }
        
        System.out.println(fn);
        
    }
    
}
