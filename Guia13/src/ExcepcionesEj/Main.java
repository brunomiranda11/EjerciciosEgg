

package ExcepcionesEj;



public class Main {

    
    public static void main(String[] args) {
        
        ClaseConArray arr = new ClaseConArray();
        ClaseConArray arr2 = new ClaseConArray();
        DivisionNumero dn = new DivisionNumero("3","0");
        
        try{
            arr.llenarArrayConElementosN(6);
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        try{
            System.out.println(dn.dividir());
        }catch(Exception e){
            System.out.println(e.getMessage());  
    }
    }
    
}
    
