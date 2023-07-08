

package ejExtra.Entidades;

import java.time.LocalDate;


public class BarcoConMotor extends Barco {
    
    private double potencia;
    
   public BarcoConMotor(){
       
   }
   public BarcoConMotor(double potencia, int matricula, double eslora, LocalDate anioFabricacion){
       super(matricula, eslora, anioFabricacion);
       this.potencia = potencia;
   }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

   
    @Override
    public double valorModulo() {
       return super.valorModulo() + potencia;
     
    }

    @Override
    public String toString() {
        return super.toString() + " BarcoConMotor{" + "potencia=" + potencia + '}';
    }
   
   
    
        
    

}
