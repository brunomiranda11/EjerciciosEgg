

package ejerciciosExtras;

import java.util.Scanner;


public class Juego {
    private int x;
    private int num;
    private int intentos;
    public Juego(){
        
    }
    void iniciarJuego(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige un número");
        x = sc.nextInt();
        sc.nextLine();
        System.out.println("Te toca adivinar el número misterioso");
        intentos = 5;
        while(!adivinoNumero() || intentos != 0 ){
            num = sc.nextInt();
            if(x < num){
                System.out.println("El número elegido es mayor al número misterioso");
            }else if(x > num){
                System.out.println("El número elegido es menor al número misterioso");
            }
            if(x == num){
                System.out.println("Ganaste el juego");
                break;
               
               
            }
             intentos--;
                System.out.println("Cantidad de intentos: " + intentos);
                if(intentos == 0){
                    System.out.println("Perdiste el juego");
                    
                }
        }
        
    }
    
    public boolean adivinoNumero(){
        return x == num;
    }
    

}
