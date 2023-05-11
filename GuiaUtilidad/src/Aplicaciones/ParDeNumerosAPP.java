
package Aplicaciones;

import Entidades.ParDeNumeros;
import Servicios.ParDeNumerosServicio;
public class ParDeNumerosAPP {

   
    public static void main(String[] args) {
        ParDeNumerosServicio ns = new ParDeNumerosServicio();
        ParDeNumeros n = ns.crearValores();
        
        ns.calcularRaiz(n);
        ns.calcularPotencia(n);
    }
    
}
