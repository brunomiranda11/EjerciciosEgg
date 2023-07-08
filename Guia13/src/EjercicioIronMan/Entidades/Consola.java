

package EjercicioIronMan.Entidades;

import java.util.Random;


public class Consola {
    private Botas botas;
    private Guantes guantes;
    private int energia;
    
    
    
    public Consola(){
        
    }
    
    public Consola(Botas botas, Guantes guantes, int energia){
        this.botas = botas;
        this.guantes = guantes;
        this.energia = 100;
    }
    
    public void recarga(){
        System.out.println("=====RECARGANDO SALUD=====");
        System.out.println("=====15%=====");
        System.out.println("=====43%=====");
        System.out.println("=====73%=====");
        System.out.println("=====100%=====");
        System.out.println("=====TODAS LAS PARTES FUERON RECARGADAS EXITOSAMENTE=====");
        energia -= 1;
        this.botas.recargarVida();
        this.guantes.recargarVida();
        
    }
    public void informacion(){
        System.out.println("===MOSTRANDO INFORMACION DE ARMADURA===");
        energia -= 1;
        this.botas.toString();
        this.guantes.toString();          
    }
    
    public void volar(){
        System.out.println("===VOLANDO===");
        energia -= 1;
        Random r = new Random();
        int tiempo = r.nextInt(14)+1;
        int consumoBotas = this.botas.propulsar(tiempo);
        int consumoGuantes = this.guantes.usoVolar(tiempo);
    }

}
