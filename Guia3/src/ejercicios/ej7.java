
package ejercicios;
import java.util.Scanner;
public class ej7 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       String cadena="";
       int cantCorrectas = 0;
       int cantIncorrectas = 0;
       String opcionSalir="No";
        do{
            System.out.println("==RS232==");
            cadena=sc.nextLine();

             if(cadena.substring(0, 1).equals("X") && cadena.substring(4, 5).equals("O") && cadena.length()==5){
             System.out.println("Clave correcta");
            cantCorrectas += 1;
            }else if(cadena.equals("&&&&&")){
                 System.out.println("===ADIOS===");
                 break;
            }
             else{
                 System.out.println("Clave incorrecta");
                cantIncorrectas +=1;
                    
                }
            
        }while(cadena!="&&&&&");
        
        System.out.println("La cantidad de mensajes enviados exitosamente: " + cantCorrectas);
        System.out.println("La cantidad de mensajes NO enviados exitosamente: " + cantIncorrectas);
    }
    
}
