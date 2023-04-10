

package ejerciciosExtras;

import java.util.Scanner;


public class Juego {
    private int x;
    private int num;
    
    public Juego(){
        
    }
    void iniciarJuego(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Elige un número");
        x = sc.nextInt();
        sc.nextLine();
        System.out.println("Te toca adivinar el número misterioso");
        while(!adivinoNumero()){
            num = sc.nextInt();
            if(x < num){
                System.out.println("El número elegido es mayor al número misterioso");
            }else if(x > num){
                System.out.println("El número elegido es menor al número misterioso");
            }
            if(x == num){
                System.out.println("Ganaste el juego");
            }
        }
        
    }
    
    public boolean adivinoNumero(){
        return x == num;
    }
    

}
