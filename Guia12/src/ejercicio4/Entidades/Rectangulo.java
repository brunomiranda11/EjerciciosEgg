

package ejercicio4.Entidades;


public class Rectangulo implements CalculoFormas{
    private final double altura;
    private final double base;
    
    public Rectangulo(double altura, double base){
        this.altura = altura;
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base+altura)*2;
    }
    

}
