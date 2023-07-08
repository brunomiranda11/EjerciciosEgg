
package ExcepcionesEj;

import java.util.Random;


public class ClaseConArray {
    
    private int[] arrayEjemplo = new int[5];
    
    public ClaseConArray(){
        
    }
    
    public ClaseConArray(int[] arr){
        this.arrayEjemplo = arr;
        
    }
    
    public void llenarArrayConElementosN(int n){
        try{
            if(n > arrayEjemplo.length){
                throw new ArrayIndexOutOfBoundsException("El arreglo es más chico que el número indicado");
            }
            for(int i = 0; i < n; i++){
                this.arrayEjemplo[i] = (int)(Math.random()*10);
            }
        }catch(ArrayIndexOutOfBoundsException a){
            throw a;
        }
    }

    public int[] getArrayEjemplo() {
        return arrayEjemplo;
    }

    public void setArrayEjemplo(int[] arrayEjemplo) {
        this.arrayEjemplo = arrayEjemplo;
    }
    
    public void mostrar(){
    for(int i = 0; i < arrayEjemplo.length; i++){
        System.out.print("[" + arrayEjemplo[i] + "]");
       }
        System.out.println("");
    }

}
