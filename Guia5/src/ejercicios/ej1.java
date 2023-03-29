
package ejercicios;


public class ej1 {
    public static int [] llenarVector(int [] a){
        for (int i = 0; i < a.length; i++){
            a[i] = i+1;
        }
        
        return a;
    }
    
    public static void mostrarVectorDescendente(int [] a){
        for (int i = 0; i < a.length; i++){
            System.out.println("|" + a[i] + "|");
        }
    }

   
    public static void main(String[] args) {
        int [] a = new int [100];
        llenarVector(a);
        mostrarVectorDescendente(a);
        
        
    }
    
}
