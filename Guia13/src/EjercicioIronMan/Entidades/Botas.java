

package EjercicioIronMan.Entidades;

import java.util.Random;


public class Botas extends Armadura {
    
    private Propulsor propulsorIzq;
    private Propulsor propulsorDer;
    
    
    public Botas(){
        
    }

    public Propulsor getPropulsorIzq() {
        return propulsorIzq;
    }

    public void setPropulsorIzq(Propulsor propulsorIzq) {
        this.propulsorIzq = propulsorIzq;
    }

    public Propulsor getPropulsorDer() {
        return propulsorDer;
    }

    public void setPropulsorDer(Propulsor propulsorDer) {
        this.propulsorDer = propulsorDer;
    }
    
    public Botas(String colorPrimario, String colorSecundario, int nivelSalud, int generador, Propulsor propulsorIzq, Propulsor propulsorDer, int consumo){
        super(colorPrimario, colorSecundario, nivelSalud, generador,consumo);
        this.propulsorIzq = propulsorIzq;
        this.propulsorDer = propulsorDer;
    }

    @Override
    public void recargarVida() {
        propulsorDer.setVida(100);
        propulsorIzq.setVida(100);
    }

    @Override
    public String toString() {
        return super.toString() + " Botas{" + "Vida propulsor izquierdo=" + propulsorIzq.getVida() + ", vida del propulsor derecho=" + propulsorDer.getVida() + '}';
    }
    
    public void caminar(int tiempo){
        
        propulsorDer.setVida(propulsorDer.getVida()-(tiempo*this.getConsumo()));
        propulsorIzq.setVida(propulsorDer.getVida()-(tiempo*this.getConsumo()));  
    }
    
    public int correr(int tiempo){
        int cons = tiempo*((this.getConsumo())*(2));
        
        propulsorDer.setVida(propulsorDer.getVida()- cons);
        propulsorIzq.setVida(propulsorDer.getVida()- cons);
        return cons;
    }
    
      public int propulsar(int tiempo){
        int cons = tiempo*((this.getConsumo())*(3));
        propulsorDer.setVida(propulsorDer.getVida()-cons);
        propulsorIzq.setVida(propulsorDer.getVida()-cons);  
        return cons;
    }
    
    
    

}
