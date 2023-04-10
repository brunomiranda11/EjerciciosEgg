/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosExtras;


public class MainCuenta {

    
    public static void main(String[] args) {
        Cuenta c = new Cuenta("O'rei Pele",15000);
        c.retirarDinero(7000);
        System.out.println(c.toString());
        c.retirarDinero(9000);
        System.out.println(c.toString());
        
        
    }
    
}
