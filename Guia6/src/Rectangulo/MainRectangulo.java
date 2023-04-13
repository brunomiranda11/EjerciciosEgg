
package Rectangulo;

public class MainRectangulo {

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        r.crearRectangulo();
        System.out.println(r.calcularPerimetro());
        System.out.println(r.calcularSuperficie());
        r.dibujarRectangulo();
       Rectangulo r1 = new Rectangulo();
        r1.crearRectangulo();
        System.out.println(r1.calcularPerimetro());
        System.out.println(r1.calcularSuperficie());
         r1.dibujarRectangulo();
       
        
    }
    
}
