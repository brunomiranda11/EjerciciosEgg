

package APP;

import Entidades.Persona;
import Excepciones.ExceptionPersona;
import servicios.ServicioPersona;


public class PersonaAPP {
        public static void main(String[] args) {
    
        
        // Crear 4 Obtejos de persona
        
        ServicioPersona n1 = new ServicioPersona();
//        Persona p1 = n1.crearPersona();
//        Persona p2 = n1.crearPersona();
//        Persona p3 = n1.crearPersona();
//        Persona p4 = n1.crearPersona();
        Persona p5 = new Persona();
        try{
        Persona p = n1.crearPersona();
        }catch(ExceptionPersona e){
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
//        
//        Persona [] Vector = new Persona[4];
//        
//        Vector [0] = p1;
//        Vector [1] = p2;
//        Vector [2] = p3;
//        Vector [3] = p4;
//        
//        for (int i = 0; i < 4; i++) {
//            Persona p = Vector[i];
//            if (n1.esMayorDeEdad(p)){
//                System.out.println(n1.getNombre(p) + " : Es Mayor de Edad"  );
//            }else{
//                System.out.println(n1.getNombre(p) + " Es Menor de Edad");
//            }
//            switch (n1.calcularIMC(p)) {
//                case 1:
//                    System.out.println(n1.getNombre(p) + " : Debajo del Peso ideal");
//                case 0:
//                    System.out.println(n1.getNombre(p) + " : Peso Ideal");
//                case -1:
//                    System.out.println(n1.getNombre(p) + " : Arriva del Peso ideal");
//            }
//        }
      
           
        
    }
        
     

}
