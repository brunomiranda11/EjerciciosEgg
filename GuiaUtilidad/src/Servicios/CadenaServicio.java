

package Servicios;

import Entidades.Cadena;
import java.util.Scanner;


public class CadenaServicio {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Cadena crearCadena(){
        System.out.println("Ingrese la frase");
        String frase = sc.next();
        
        return new Cadena(frase);
        
    }
    
    public void mostrarVocales(Cadena c){
        int vocales = 0;
        for(int i = 0; i < c.getLongitud() ;i++){
            if(c.getFrase().charAt(i) == 'a' || c.getFrase().charAt(i) == 'e' || c.getFrase().charAt(i) == 'i' || c.getFrase().charAt(i) == 'o' || c.getFrase().charAt(i) == 'u'){
                vocales++;
            }
        }
        System.out.println("La cantidad de vocales es de: " + vocales);
    }
    
    public void invertirFrase(Cadena c){
        String nuevaFrase = "";
        for(int i = c.getLongitud()-1; i >= 0; i--){
            nuevaFrase += c.getFrase().substring(i,i+1);
        }
        System.out.println(nuevaFrase);
    }
    
    public void vecesRepetido(Cadena c){
        System.out.println("Indique qué letra busca");
        String letra = sc.next();
       int cantLetra = 0;
        for(int i = 0; i < c.getLongitud(); i++){
            if(c.getFrase().substring(i, i+1).equalsIgnoreCase(letra)){
                cantLetra++;
            }
        }
        System.out.println("Las veces que se repite la letra: " + letra + " en la frase: " + cantLetra);
    }
    
    public void unirFrases(Cadena c){
        String fraseNueva = "";
        System.out.println("Ingrese una nueva frase para unir");
        String otraFrase = sc.next();
        fraseNueva = c.getFrase().concat(otraFrase);
        System.out.println("La frase nueva es: " + fraseNueva);
    }
    
    public void reemplazar(Cadena c){
        System.out.println("Indicar nueva letra para reemplazar las letras: a");
        String letraNueva = sc.next();
        c.setFrase(c.getFrase().replace("a", letraNueva));
        System.out.println("Frase nueva: " + c.getFrase());
        
    }
    
    public boolean contiene(Cadena c){
        System.out.println("Ingrese que letra busca");
        String letra = sc.next();
        for (int i=0; i < c.getFrase().length(); i++){
            if(c.getFrase().substring(i,i+1).equalsIgnoreCase(letra)){
                return true;
            }
        }
        return false;
    }

}
