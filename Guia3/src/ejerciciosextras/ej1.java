
package ejerciciosextras;
import java.util.Scanner;

public class ej1 {

    
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Indique la cantidad de minutos");
       int minutos = sc.nextInt();
       
       int diaMinutos = 1440;
       int horaMinutos = 60;
       int resto=minutos;
       int cantDias =0;
       while(resto > diaMinutos){
           
           resto = minutos % diaMinutos; // 1600 - 1440 = 160  
           cantDias = minutos / diaMinutos; // 
           
       }
       int cantHoras = resto / horaMinutos; // 160 / 60 = 2
       
        System.out.println("La cantidad es: " + cantDias + " dia/s y "
                + cantHoras + " horas.");
    }
    
}
