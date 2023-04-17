
package Servicios;
import Entidades.Raices;
import java.util.Scanner;

public class ServicioRaices {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Raices crearRaices(){
        System.out.println("Indique valor de a");
        int a = sc.nextInt();
        System.out.println("Indique valor de b");
        int b = sc.nextInt();
        System.out.println("Indique valor de c");
        int c = sc.nextInt();
        
        return new Raices(a,b,c);
        
    }
    
    public double getDiscriminante(Raices r){
        return (Math.pow(r.getB(),2))-4*r.getA()*r.getC();
    }
    
    public boolean tieneRaices(Raices r){
        return getDiscriminante(r)>=0;
    }
    public boolean tieneRaiz(Raices r){
        return getDiscriminante(r)==0;
    }
    
    public void obtenerRaices(Raices r){
         double r1 = (-r.getB() + Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
         double r2 = (-r.getB() - Math.sqrt(getDiscriminante(r))) / (2 * r.getA());
         
         if (tieneRaices(r)) {
            System.out.println("Raiz 1: " + r1);
            System.out.println("Raiz 2: " + r2);
        } else {
            System.out.println("No tiene raices.");
        }
    }
    
      public void obtenerRaiz(Raices r) {
        if (tieneRaiz(r)) {
            double x = -r.getB() / (2 * r.getA());
            System.out.println("La única solución es: " + x);
        } else {
            System.out.println("No existe una única solución.");
        }
    }
      
       public void calcular(Raices r) {
        if (tieneRaices(r)) {
            obtenerRaices(r);
        } else if (tieneRaiz(r)) {
            obtenerRaiz(r);
        } else {
            System.out.println("No existen soluciones reales.");
        }
        System.out.println("================================================");
    }

}
