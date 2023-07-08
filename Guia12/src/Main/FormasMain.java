
package Main;

import ejercicio4.Entidades.Circulo;
import ejercicio4.Entidades.Rectangulo;


public class FormasMain {

    
    public static void main(String[] args) {
        Circulo c = new Circulo(20);
        Rectangulo r = new Rectangulo(15,20);
        
        System.out.println(r.calcularArea() + " " + r.calcularPerimetro());
        
        System.out.println(c.calcularArea() + " " + c.calcularPerimetro());
        
    }
    
}
