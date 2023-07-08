

package ExcepcionesEj;

import java.util.Scanner;
import ExceptionDivision.ExceptionDivisiones;


public class DivisionNumero {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private String n1;
    private String n2;
    
    public DivisionNumero(){
        
    }

    public DivisionNumero(String n1, String n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    public int dividir() throws ExceptionDivisiones{
        
        int resultado = 0;
        int intN1 = 0;
        int intN2 = 0; 
        try{
            
            intN1  = Integer.parseInt(n1);
            intN2 = Integer.parseInt(n2);
            resultado = intN1 / intN2;
            
            
        }catch(NumberFormatException e){
            System.out.println("No se puede transformar letra a número");;
        }catch(ArithmeticException a){
            System.out.println("No se puede dividir por 0");
        }catch(Exception n){
            throw n;
        }
     
        return resultado;
    }
    

}
