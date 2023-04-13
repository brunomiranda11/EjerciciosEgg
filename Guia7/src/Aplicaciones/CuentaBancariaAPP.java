
package Aplicaciones;
import Servicios.ServicioCuentaBancaria;
import Entidades.CuentaBancaria;
public class CuentaBancariaAPP {

   
    public static void main(String[] args) {
        
        ServicioCuentaBancaria servCuenta = new ServicioCuentaBancaria();
        CuentaBancaria c = servCuenta.nuevaCuenta();
        servCuenta.ingresarDinero(c,5000);
        servCuenta.retirarDinero(c, 50000);
        servCuenta.consultarSaldo(c);
        servCuenta.ingresarDinero(c,50000);
        servCuenta.extraccionRapida(c);
        servCuenta.consultarSaldo(c);
        servCuenta.consultarDatos(c);
        
        
        
        
        

    }
    
}
