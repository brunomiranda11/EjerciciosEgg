/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EggPoo;


public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    Persona(){
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

   @Override
    public String toString() {
        return "Persona{" + "nombre= " + nombre + ", apellido= " + apellido + ", edad=" + edad + '}';
    }
    
    
    
    public static void main(String[] args) {
        Persona persona = new Persona("Bruno","Miranda",22);
       
        
        
    }
   
    

   
    
}
