/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;
import java.util.Scanner;
public class ej2 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Por favor, escriba su contraseña");
        String pass = sc.nextLine();
        if(pass.equals("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
        
        
    }
    
}
