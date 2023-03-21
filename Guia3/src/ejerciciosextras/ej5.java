
package ejerciciosextras;
import java.util.Scanner;

public class ej5 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el tipo de socio");
        String tipoSocio = sc.next();
        System.out.println("Introduzca el valor del tratamiento");
        int costo = sc.nextInt();
        
        if(tipoSocio.equalsIgnoreCase("a")){
            System.out.println("Usted tiene 50% de descuento. El total a abonar será: ");
            System.out.println(costo-(costo*0.5));
        }else if(tipoSocio.equalsIgnoreCase("b")){
            System.out.println("Usted tiene 35% de descuento. El total a abonar será: ");
            System.out.println(costo-(costo*0.35));
        }else if(tipoSocio.equalsIgnoreCase("c")){
             System.out.println("Usted no posee descuento. El total a abonar será: ");
            System.out.println(costo);
        }else{
            System.out.println("Introduzca un tipo de socio válido");
        }
        
    }
    
}
