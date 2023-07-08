
package servicios;

import Entidades.Persona;
import java.util.Scanner;
import Excepciones.ExceptionPersona;

public class ServicioPersona{

    public ServicioPersona() {
        
    }
    
    public String getNombre(Persona n){
        return n.getNombre();
    }
    
    public boolean esMayorDeEdad(Persona n) {
        /*
          Método esMayorDeEdad(): indica si la persona es mayor de edad.
          La función devuelve un booleano.
         */
        return (n.getEdad() >= 18);
    }

    public Persona crearPersona() throws ExceptionPersona {
    
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Persona p = new Persona();
        
        try{
        System.out.println("Ingrese el Nombre :");
        String nombre = leer.nextLine();
        if(nombre.isEmpty()){
            throw new ExceptionPersona("El nombre no puede estar vacío");
        }

        System.out.println("Ingrese el Edad :");
        int edad = leer.nextInt();
        if(edad <= 0){
            throw new ExceptionPersona("La edad no puede ser menor o igual 0");
        }
        System.out.println("Ingrese el Sexo H/M/O : ");
        
        String sexo = leer.next();
        if(sexo.isEmpty() || (!sexo.equals("H") && !sexo.equals("M") && !sexo.equals("O")) )  {
            throw new ExceptionPersona("Debe indicar el sexo correctamente ");
        }
         System.out.println("Ingrese el Peso :");
        int peso = leer.nextInt();
        if(peso <= 0){
            throw new ExceptionPersona("La edad no puede ser menor o igual 0");     
        }

        System.out.println("Ingrese el Altura en Centimetros :");
        int altura = leer.nextInt();
        if(altura <= 0){
            throw new ExceptionPersona("La altura no puede ser menor o igual 0");     
        }
        
        p.setAltura(altura);
        p.setEdad(edad);
        p.setNombre(nombre);
        p.setPeso(peso);
        p.setSexo(sexo);
        }catch(ExceptionPersona e){
            throw e;
        }catch(Exception e ){
            e.printStackTrace();
            throw new ExceptionPersona("Error");
        }

        return p;

    }

    public int calcularIMC(Persona n) {
   
        int Peso = n.getPeso();
        int Altura =  n.getAltura();
        int IMC = 2;
        
        if ( Peso/(Altura*Altura) < 20 ){
            IMC = -1;  
        }
        if (Peso/(Altura*Altura) >= 20 && Peso/(Altura*Altura) <= 25){
            IMC = 0;  
        }
        if ( Peso/(Altura*Altura) > 25 ){
            IMC = 1;  
        }
        return IMC;        
    }

}
