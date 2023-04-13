

package Rectangulo;

import java.util.Scanner;


public class Rectangulo {
    private int base;
    private int altura;
    
public Rectangulo(int base, int altura){
    this.base = base;
    this.altura = altura;
}
public Rectangulo(){
    
}

public double calcularSuperficie(){
    return base*altura;
} 

public void crearRectangulo(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la base");
        this.base = sc.nextInt();
        System.out.println("Ingrese la altura");
        this.altura = sc.nextInt();
}

public double calcularPerimetro(){
    return (base+altura)*2;
}
public void dibujarRectangulo(){
    for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {
                if (i == 0 || j == 0 || j == base - 1 || i == altura - 1) {
                    System.out.print(" *");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
    
}
}

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}

