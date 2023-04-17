

package Servicios;
import Entidades.Persona;
import java.util.Scanner;

public class ServicioPersona {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona(){
        String sexo ="";
        System.out.println("Ingrese su nombre");
        String nombre = sc.next();
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
       
        System.out.println("Ingrese su sexo (H,M,O)");
        do {
            sexo = sc.next();
        }while (!sexo.equalsIgnoreCase("H") && !sexo.equalsIgnoreCase("M") && !sexo.equalsIgnoreCase("O"));
        System.out.println("Indique su altura");
        double altura = sc.nextDouble();
        System.out.println("Indique su peso");
        double peso = sc.nextDouble();
        
        return new Persona(nombre,edad,sexo,peso,altura);
        
    }
    public void datos(Persona p){
        System.out.println("Nombre: " + p.getNombre() + ", Edad: " + p.getEdad() + ", Altura: " + p.getAltura() + " y peso: " + p.getPeso() );
    }
    
    public boolean esMayorDeEdad(Persona p){
        return p.getEdad()>=18;
    }
    public int calcularIMC(Persona p){
        double IMC = (p.getPeso())/(Math.pow(p.getAltura(),2));
        if(IMC < 20){
            return -1;
        }else if(IMC >= 20 && IMC <=25){
            return 0;
        }else{
            return 1;
        }
    }
    
    

}
