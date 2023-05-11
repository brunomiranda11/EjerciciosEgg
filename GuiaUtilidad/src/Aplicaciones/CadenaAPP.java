
package Aplicaciones;
import Entidades.Cadena;
import Servicios.CadenaServicio;
public class CadenaAPP {

  
    public static void main(String[] args) {
        CadenaServicio cs = new CadenaServicio();
        
        Cadena c = cs.crearCadena();
        
        cs.invertirFrase(c);
        cs.vecesRepetido(c);
        cs.unirFrases(c);
        cs.reemplazar(c);
        System.out.println(cs.contiene(c));
        
    }
    
}
