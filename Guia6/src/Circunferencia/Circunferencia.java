

package Circunferencia;

import static java.lang.Math.PI;
import java.util.Scanner;


public class Circunferencia {
    private double radio;
    
   public Circunferencia(double radio){
        this.radio = radio;
    }
    
    public void crearC(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        this.radio = sc.nextDouble();
        
    }
    
    public double area(){
        return Math.pow((PI*radio),2);
    }
    public double perimetro(){
        return 2*PI*radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
