
package Rectangulo;

public class MainRectangulo {

    public static void main(String[] args) {
        Rectangulo r = new Rectangulo();
        r.crearRectangulo();
        System.out.println(r.calcularPerimetro());
        System.out.println(r.calcularSuperficie());
        r.dibujarRectangulo();
        
    }
    
}
