/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Operaciones;

import java.util.Scanner;


public class Operacion {
    private int numero1;
    private int numero2;
    
    public Operacion(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }
    
    public Operacion(){
        
    }
    
    public void crearOperacion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        this.numero1 = sc.nextInt();
        System.out.println("Ingrese el segundo número");
        this.numero2 = sc.nextInt();
}
    public int sumar(){
        return numero1 + numero2;
    }
    
    public int restar(){
        return numero1 - numero2;
    }
    public int multiplicar(){
        int resultado = 0;
        try{ if(numero1 < 1 || numero2 < 1){
            throw new Exception("resultado = 0");      
        }
        resultado = numero1*numero2;
            
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage() );
        }
        return resultado;
    }
    
    public double dividir(){
        double resultado = 0;
        try{
            if(numero2 == 0){
                throw new Exception("No se puede dividir por cero");
            }
            resultado=numero1/numero2;
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        return resultado;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
   
}
