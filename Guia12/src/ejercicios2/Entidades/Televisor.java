

package ejercicios2.Entidades;


public class Televisor extends Electrodomestico{
    private double resolucion;
    private boolean TDT;
    
    public Televisor(){
        
    }
    
    public Televisor(double precio, String color, char consumo, double peso, double resolucion, boolean TDT){
        super(precio,color,consumo, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }
    
    public void crearTelevisor(){
       super.crearElectrodomestico();
       
        boolean tieneTDT;
        
        System.out.println("Ingrese resolucion");
        this.resolucion = sc.nextDouble();
        System.out.println("¿Tiene TDT?");
        String r = sc.next();
        
        this.TDT = r.equalsIgnoreCase("si");      
        
        precioFinal();
        
    }

    @Override
    public void precioFinal() {
       
     super.precioFinal();
     
      if(this.resolucion > 40){
          this.precio += this.precio*30/100;
      }
      if(this.TDT){
          this.precio += 500;
      }
      
       System.out.println("El precio final es de: " + this.precio);
      
     
    }
    
    
  

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isTDT() {
        return TDT;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
    }

    @Override
    public String toString() {
        return super.toString() + " Televisor{" + "resolucion=" + resolucion + ", TDT=" + TDT + '}';
    }
    
    
    

}
