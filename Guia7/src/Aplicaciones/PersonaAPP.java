
package Aplicaciones;
import Entidades.Persona;
import Servicios.ServicioPersona;
public class PersonaAPP {

    
    public static void main(String[] args) {
        ServicioPersona sp = new ServicioPersona();
        Persona p1 = sp.crearPersona();
        Persona p2 = sp.crearPersona();
        Persona p3 = sp.crearPersona();
        Persona p4 = sp.crearPersona();
        
        Persona [] personas = {p1,p2,p3,p4};
        
        boolean[] edades = new boolean [4];
        int[] peso = new int [4];
        
        for(int i=0;i<edades.length;i++){
            edades[i] = sp.esMayorDeEdad(personas[i]);
            
        }
         for(int i=0;i<peso.length;i++){
            peso[i] = sp.calcularIMC(personas[i]);
            
        }
         for(int i =0;i<personas.length;i++){
             sp.datos(personas[i]);
         }
         for(int i =0;i<personas.length;i++){
             System.out.println(edades[i]);
         }
         for(int i =0;i<personas.length;i++){
             System.out.println(peso[i]);
         }
         
         calcularEdades(edades);
         calcIMC(peso);
        
        
        
   
    }
    
    public static void calcularEdades(boolean[] e){
        int mayores = 0;
        int menores = 0;
        for(int i =0;i<e.length;i++){
             System.out.println(e[i]);
         }
        for (int i = 0; i < e.length;i++){
            if(e[i]){
                mayores++;
            }else{
                menores++;
            }
        }
        double promedioMayores = (mayores*100)/e.length;
        double promedioMenores = (menores*100)/e.length;
        System.out.println("El promedio de mayores de edad es: " + promedioMayores);
        System.out.println("Y el promedio de menores de edad es: " + promedioMenores);
        
        
    }
    public static void calcIMC(int [] p){
        
        int debajoPeso = 0;
        int pesoIdeal = 0;
        int sobrePeso=0;
        for (int i = 0; i < p.length;i++){
           if (p[i] == -1) {
                debajoPeso++;
            }
            if (p[i] == 0) {
                pesoIdeal++;
            }
            if (p[i] == 1) {
                sobrePeso++;
            }
            
        }
        double promedioDebajoPeso = (debajoPeso/p.length)*100;
        double promedioPesoIdeal = (pesoIdeal/p.length)*100;
        double promedioSobrePeso = (sobrePeso/p.length)*100;
        System.out.println("El promedio debajo del peso ideal es: " + promedioDebajoPeso);
        System.out.println("y el promedio con peso ideal es: " + promedioPesoIdeal);
        System.out.println("El promedio con sobrepeso es: " + promedioSobrePeso);
        
    }
    
    
    
}
