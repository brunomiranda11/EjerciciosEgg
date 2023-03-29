
package ejercicios;

import java.util.Scanner;
public class ej2 {
     public static void datosPersona() {
        Scanner leer = new Scanner(System.in);
        int n, edad;
        String nombre, opcion;
        boolean mayor;
        do {

            System.out.println("Ingrese el nombre de la persona: ");
            nombre = leer.next();

            System.out.println("Ingrese la edad de " + nombre + ": ");
            edad = leer.nextInt();

            mayor = (edad >= 18);
            System.out.println(nombre + " tiene " + edad + " años y es " + (mayor ? "mayor" : "menor") + " de edad.");

            System.out.println("¿Desea ingresar más personas? (Sí/No)");
            opcion = leer.next();
        } while (!opcion.equalsIgnoreCase("No"));
    }

    
    public static void main(String[] args) {
        datosPersona();
        
       
    }
    
}
