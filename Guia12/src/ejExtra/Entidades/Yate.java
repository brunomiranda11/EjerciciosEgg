

package ejExtra.Entidades;
import java.time.LocalDate;

public class Yate extends Barco{
    
    private int camarotes;
    private double potencia;

    public Yate(int camarotes, double potencia, int matricula, double eslora, LocalDate anioFabricacion) {
        super(matricula, eslora, anioFabricacion);
        this.camarotes = camarotes;
        this.potencia = potencia;
    }

    @Override
    public double valorModulo() {
        return super.valorModulo() + camarotes + potencia; 
    }

    public int getCamarotes() {
        return camarotes;
    }

    public void setCamarotes(int camarotes) {
        this.camarotes = camarotes;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return super.toString() + " Yate{" + "camarotes=" + camarotes + ", potencia=" + potencia + '}';
    }
    
    

}
