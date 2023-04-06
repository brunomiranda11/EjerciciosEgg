
package Operaciones;

public class MainOperacion {

 
    public static void main(String[] args) {
        Operacion o = new Operacion();
        o.crearOperacion();
        System.out.println("suma= " + o.sumar());
        System.out.println("resta= " + o.restar());
        System.out.println("multi= " + o.multiplicar());
        System.out.println("div= " + o.dividir());
     
    }
    
}
