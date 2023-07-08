
package ejercicios2.Entidades;


public class Lavadora extends Electrodomestico {
    private int carga;
    
    
    public Lavadora(){
        
    }
    
    public Lavadora(double precio, String color, char consumo, double peso, int carga){
        super(precio,color,consumo,peso);
        this.carga = carga;
    }

    
    public void crearLavadora(){
        super.crearElectrodomestico();
        
        System.out.println("Insertar carga de la Lavadora");
        this.carga = sc.nextInt();   
        precioFinal();
       
    }

    @Override
    public void precioFinal() {
      
      super.precioFinal();
      
      if(this.carga > 30){
          this.precio += 500;
      }
      System.out.println("El precio final es de: " + this.precio);
     
    }
    //Si tiene una carga mayor de 30 kg, aumentará el precio en $500, si la
    //carga es menor o igual, no se incrementará el precio.
    
    
    
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return super.toString() + " Lavadora{" + "carga=" + carga + '}';
    }
    
   
}
