
package Main;

import ejercicios2.Entidades.Electrodomestico;
import ejercicios2.Entidades.Lavadora;
import ejercicios2.Entidades.Televisor;
import java.util.ArrayList;

public class ElectroMain {

  
    public static void main(String[] args) {
      
       Lavadora lavadora1 = new Lavadora();
       
       lavadora1.crearLavadora();
       
       Televisor televisor1 = new Televisor();
       
       televisor1.crearTelevisor();
     
      Lavadora lav = new Lavadora(1000, "gris", 'A', 35, 45);
      Televisor tel = new Televisor(1500, "rojo", 'B',15, 52, true);
   
        
       ArrayList<Electrodomestico> electrodomesticos = new ArrayList();
       
       lavadora1.agregarLista(electrodomesticos);
       televisor1.agregarLista(electrodomesticos);
       lav.agregarLista(electrodomesticos);
       tel.agregarLista(electrodomesticos);
       
       
       for(Electrodomestico e: electrodomesticos){
           e.listaYPrecio(electrodomesticos);
           break;
       }
       
       
       
       
       
       
       
      
       
      
       
       
    
      
    }
    
}
