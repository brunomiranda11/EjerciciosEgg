/*
 Leer la altura de N personas y 
determinar el promedio de estaturas que se encuentran por debajo de 1.60 mts.
y el promedio de estaturas en general.
 */
package ejerciciosextras;
import java.awt.BorderLayout;
import java.util.Scanner;

public class ej6 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique cantidad de personas");
        int n = sc.nextInt();
        int cont = 1;
        int contDebajo = 0;
        int contGeneral = 0;
        double alturaDebajo=0;
        double alturaGeneral =0;
        
        while(cont<n){
            System.out.println("Indique la altura de la persona " + cont);
            double altura = sc.nextDouble();
            
            if (altura <= 1.60){
                alturaDebajo += altura;
                contDebajo++;
            }else if (altura >1.60){
                alturaGeneral += altura;
                contGeneral++;
            }
            
            cont++;
        }
        
        System.out.println("El promedio de altura debajo de 1.60 es: " + (alturaDebajo/contDebajo));
        System.out.println("El promedio de altura general es de: " + (alturaGeneral/contGeneral));
        
    }
    
}
