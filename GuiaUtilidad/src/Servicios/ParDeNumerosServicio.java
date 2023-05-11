
package Servicios;
import Entidades.ParDeNumeros;
import java.util.Scanner;

public class ParDeNumerosServicio {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public ParDeNumeros crearValores(){
        System.out.println("Ingrese el primer número");
        double num1 = sc.nextInt();
        System.out.println("Ingrese el ségundo número");
        double num2 = sc.nextInt();
        
        return new ParDeNumeros(num1,num2);
        
    }
    
    public double devolverMayor(ParDeNumeros n){
        return Math.max(n.getNum1(), n.getNum2());
    }
    
    public double devolverMenor(ParDeNumeros n){
        return Math.min(n.getNum1(), n.getNum2());
    }
    
    
   public void calcularPotencia(ParDeNumeros n){
       double mayor = Math.round(devolverMayor(n));
       double menor = Math.round(devolverMenor(n));
       System.out.println(Math.pow(devolverMayor(n),devolverMenor(n)));
       
   }
   
    public void calcularRaiz(ParDeNumeros n){
       double menor = Math.abs(devolverMenor(n));
       System.out.println(Math.sqrt(menor));
       
   }
   

}
