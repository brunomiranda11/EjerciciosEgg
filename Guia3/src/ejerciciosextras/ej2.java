/*  B tome el valor de C, 
    C tome el valor de A, 
    A tome el valor de D y 
    D tome el valor de B*/
package ejerciciosextras;


public class ej2 {

   
    public static void main(String[] args) {
      int a=1;
      int b=2;
      int c=3;
      int d=4;
      int aux;
      
        System.out.println("==INICIALES==");
        System.out.println("A: " + a + " B: "+ b + " C: " + c + " D: " + d);
     aux = b; //aux = 2
     b = c; // b = 3
     c = a; // 
     a = d;
     d = aux;
     System.out.println("==FINALES==");
     System.out.println("A: " + a + " B: "+ b + " C: " + c + " D: " + d);
     
     
     
     
    }
    
}
