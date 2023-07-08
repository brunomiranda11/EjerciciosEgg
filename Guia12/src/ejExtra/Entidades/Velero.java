

package ejExtra.Entidades;

import java.time.LocalDate;

public class Velero extends Barco{
    private int mastiles;
    
    public Velero(){
        
    }
    
    public Velero(int mastiles, int matricula, double esloras, LocalDate anioFabricacion){
        super(matricula, esloras, anioFabricacion);
        this.mastiles = mastiles;
        
    }

    public int getMastiles() {
        return mastiles;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }


    @Override
    public double valorModulo() {
        return super.valorModulo() + mastiles ; 
    }

    @Override
    public String toString() {
        return super.toString() + " Velero{" + "mastiles=" + mastiles + '}';
    }
    

}
