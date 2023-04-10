

package ejerciciosExtras;

import java.util.Scanner;


public class Puntos {
    int x1;
    int x2;
    int y1;
    int y2;
    
    public Puntos(int x1, int x2, int y1, int y2){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public Puntos(){
        
    }
    
    public double Distancia (Puntos p){
       return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    public void crearPuntos(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de x1: ");
        this.x1 = sc.nextInt();
        System.out.println("Ingrese el valor de x2: ");
        this.x2 = sc.nextInt();
        System.out.println("Ingrese el valor de y1: ");
        this.y1 = sc.nextInt();
        System.out.println("Ingrese el valor de y2: ");
        this.y2 = sc.nextInt();
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

}
