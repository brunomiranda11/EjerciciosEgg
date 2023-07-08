
package EjercicioIronMan.Entidades;


public class Guantes extends Armadura{
    
    private Repulsor repulsorIzq;
    private Repulsor repulsorDer;
    
    public Guantes(String colorPrimario, String colorSecundario, int nivelSalud, int generador,int consumo, Repulsor repulsorIzq, Repulsor repulsorDer){
        super(colorPrimario, colorSecundario, nivelSalud, generador, consumo);
        this.repulsorIzq = repulsorIzq;
        this.repulsorDer = repulsorDer;
    }

    public Repulsor getRepulsorIzq() {
        return repulsorIzq;
    }

    public void setRepulsorIzq(Repulsor repulsorIzq) {
        this.repulsorIzq = repulsorIzq;
    }

    public Repulsor getRepulsorDer() {
        return repulsorDer;
    }

    public void setRepulsorDer(Repulsor repulsorDer) {
        this.repulsorDer = repulsorDer;
    }

    @Override
    public void recargarVida() {
        this.repulsorDer.setVida(100);
        this.repulsorIzq.setVida(100);
    }

    @Override
    public String toString() {
        return super.toString() + " Guantes{" + "Vida del repulsor izquierdo=" + repulsorIzq.getVida() + ", vida del repulsor derecho=" + repulsorDer.getVida() + '}';
    }
    
    public int usoVolar(int tiempo){
       int cons = tiempo*((this.getConsumo())*(2));
        repulsorDer.setVida(repulsorDer.getVida()-cons);
        repulsorIzq.setVida(repulsorDer.getVida()-cons); 
        return cons;
    }
    
    public int disparo(int tiempo){
        int cons = tiempo*((this.getConsumo())*(3));
        repulsorDer.setVida(repulsorDer.getVida()-cons);
        repulsorIzq.setVida(repulsorDer.getVida()-cons);    
        return cons;
    }

  
    
    
    

}
