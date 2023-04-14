

package Entidades;


public class Cafetera {
    private int cantidadMaxima;
    private int cantidadActual;
    
    public Cafetera(){
        
    }
    public Cafetera(int cantidadMaxima, int cantidadActual){
        this.cantidadMaxima = cantidadMaxima;
        this.cantidadActual = cantidadActual;
       
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
         if(cantidadActual > cantidadMaxima){
           this.cantidadActual = cantidadMaxima;
        }else{
             this.cantidadActual = cantidadActual;
         }
    }

    @Override
    public String toString() {
        return "Cafetera{" + "cantidadMaxima=" + cantidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    

}
