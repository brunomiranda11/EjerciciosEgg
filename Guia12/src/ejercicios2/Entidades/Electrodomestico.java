

package ejercicios2.Entidades;

import java.util.ArrayList;
import java.util.Scanner;


public abstract class Electrodomestico {
    protected Scanner sc = new Scanner(System.in).useDelimiter("\n");
    protected double precio;
    protected String color;
    protected char consumo;
    protected double peso;
    protected ArrayList<Electrodomestico> electros;
    
    
    public Electrodomestico(){
        
    }
    
     public Electrodomestico(double precio, String color, char consumo, double peso){
        this.precio = precio;
        this.color = color;
        this.consumo = consumo;
        this.peso = peso;
    }
     
     
     public void crearElectrodomestico(){
          precio = 1000;
         System.out.println("Indique color del electrodomestico");
          color = sc.next();
         System.out.println("Indique consumo electrico");
          consumo = sc.next().charAt(0);
         System.out.println("Indique peso");
          peso = sc.nextDouble();
         
         comprobarColor(color);
         comprobarConsumoEnergetico(consumo);
         
     }
     
     public void precioFinal(){
         
         if(this.consumo == 'A' || this.consumo == 'a'){
             precio += 1000;
         }
         
          if(this.consumo == 'B' || this.consumo == 'b'){
             precio += 800;
         }
          
          if(this.consumo == 'C' || this.consumo == 'c'){
             precio += 600;
         }
          
           if(this.consumo == 'D' || this.consumo == 'd'){
             precio += 500;
         }
           if(this.consumo == 'E' || this.consumo == 'e'){
             precio += 300;
         }
           
            if(this.consumo == 'F' || this.consumo == 'f'){
             precio += 100;
         }
            if(this.peso >= 1 && this.peso <20){
                precio+=100;
            }
             if(this.peso >= 20 && this.peso <50){
                precio+=500;
            }
              if(this.peso >= 50 && this.peso <80){
                precio+=800;
            }
               if(this.peso >= 80){
                precio+=1000;
            }
               
     }
     
   
   
     
     public void comprobarConsumoEnergetico(char c){
         if((c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F') ){
             this.consumo = c;
         }else{
            this.consumo = 'F' ;
         }
     }
     
     public void comprobarColor(String c){
         if(c.equalsIgnoreCase("blanco") || c.equalsIgnoreCase("negro") || c.equalsIgnoreCase("rojo") ||
             c.equalsIgnoreCase("azul") || c.equalsIgnoreCase("gris")){
             this.color = c.toLowerCase();
         }else{
             this.color = "gris";
         }
     }

     public void agregarLista(ArrayList<Electrodomestico> electros){
         
         electros.add(this);
         
        
     }
     
     public void listaYPrecio(ArrayList<Electrodomestico> electros){
         double precioFinal = 0;
         double precioLav = 0;
         double precioTel = 0;
         for(Electrodomestico e : electros ){
             precioFinal += e.precio;
             if(e instanceof Lavadora){
                 precioLav += e.precio;
             }
             
             if(e instanceof Televisor){
                 precioTel += e.precio;
             }
         }
        System.out.println("Precio Total de todos los Electrodomesticos : " + precioFinal);
        System.out.println("Precio Total de las Lavadoras : " + precioLav);
        System.out.println("Precio Total de los Televisores : " + precioTel);
     }
     
     
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumo() {
        return consumo;
    }

    public void setConsumo(char consumo) {
        this.consumo = consumo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + ", precio=" + precio + ", color=" + color + ", consumo=" + consumo + ", peso=" + peso + '}';
    }

}
