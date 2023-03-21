
package ejercicios;

import java.util.Scanner;
public class ej6 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        int a = sc.nextInt();
         System.out.println("Ingrese el segundo número");
        int b = sc.nextInt();
        String opcion = "";
        String menuSalir = "N";
        System.out.println("====[MENÚ]====");
        System.out.println("1-SUMA"
                + " 2-RESTA"
                + " 3-MULTIPLICACIÓN"
                + " 4-DIVISIÓN"
                + " 5-SALIR");
        do{
            System.out.println("Elija una opción");
            opcion = sc.next();
            switch(opcion){
                case "1": System.out.println("La suma es: " + (a+b)); break;
                case "2": System.out.println("La resta es: " + (a-b)); break;
                case "3": System.out.println("La multiplicación es: " + (a*b)); break;
                case "4": System.out.println("La división es: " + (a/b)); break;
                case "5": System.out.println("Ha elegido la opción de salir.");
                    System.out.println("¿Está seguro de salir? (S/N)");
                    menuSalir = sc.next();
                break;
                
                default: System.out.println("Escriba una opción correcta");}
            
             
            
        }while(menuSalir.equals("N"));
        System.out.println("====Gracias por usar nuestra app :)====");
        
        
        
    }
    
}
