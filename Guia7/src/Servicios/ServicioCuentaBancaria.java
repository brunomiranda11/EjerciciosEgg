

package Servicios;
import Entidades.CuentaBancaria;
import java.util.Scanner;

public class ServicioCuentaBancaria {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
   public CuentaBancaria nuevaCuenta(){
        System.out.println("Introduzca el número de cuenta");
        int numeroDeCuenta = sc.nextInt();
        System.out.println("Introduzca su dni");
        long dni = sc.nextLong();
        System.out.println("Inserte saldo actual");
        double saldoActual = sc.nextDouble();
        
        return new CuentaBancaria(numeroDeCuenta,dni,saldoActual);
    }
    
    public void ingresarDinero(CuentaBancaria c,double cantidad){
        System.out.println("Usted ingresó la cantidad de: $" + cantidad);
        c.setSaldoActual(cantidad);
        
    }
    public void retirarDinero(CuentaBancaria c, double cantidad){
        if(cantidad > c.getSaldoActual()){ 
            System.out.println("Usted superó la cantidad de dinero disponible, se retirará la cantidad de: $" + c.getSaldoActual());
            c.setSaldoActual(0);
        }else{
            System.out.println("Se retirará la cantidad de: $" + cantidad);
            c.setSaldoActual(c.getSaldoActual()-cantidad);
            
        }
    }
    
    public void consultarSaldo(CuentaBancaria c){
        System.out.println("Su saldo actual es de: $" + c.getSaldoActual());
    }
    
    public void extraccionRapida(CuentaBancaria c){
        System.out.println("Indique la cantidad de dinero que quiere retirar");
        double cantidad = sc.nextDouble();
        if (cantidad>c.getSaldoActual()*0.20){
            System.out.println("No se puede realizar esa extracción [SUPERA EL 20%]");
        }else{
            System.out.println("Se extraerá la cantidad de: $" + cantidad);
            retirarDinero(c,cantidad);
        }
        
    }
    
    public void consultarDatos(CuentaBancaria c){
        System.out.println("Su número de cuenta: " + c.getNumeroDeCuenta() + " y su dni: " + c.getDni());
    }

}
