
package ejerciciosextras;

import java.util.Scanner;
public class ej7 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique cantidad de números");
        int n = sc.nextInt();
        int cont=0;
        int numMin=0;
        int numMax=0;
        int contMin=0;
        int contMax=0;
        int sumaMin=0;
        int sumaMax=0;
       
        while(cont<n){
            System.out.println("Introduzca número");
            int num = sc.nextInt();
            if(num>numMax){
                numMax=num;
                sumaMax+=num;
                contMax++;
            if(cont==0){
                numMin=numMax;
            }
            }else if(numMin>num){
                numMin=num;
                sumaMin+=num;
                contMin++;
            }  
            
            cont++;
        }
        int suma= sumaMin+sumaMax;
        double promedio = suma/(contMax+contMin);
        System.out.println("El promedio del números es: " + promedio + " el máximo es: "
                + numMax + " y el mínimo: " + numMin);
        
        
    }
    
}
