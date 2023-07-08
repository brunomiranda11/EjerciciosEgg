

package Entidades;
import Excepciones.ExceptionPersona;


public class Persona {
   
    
    private String nombre;
    private int edad;
    private String sexo;
    private int peso;
    private int altura;

    public Persona() {
        
    }

    public Persona(String nombre, int edad, String sexo, int peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    
    public Persona crearPersona(String nombre, int edad) throws ExceptionPersona {
        Persona persona = new Persona();
        try {
            if (nombre.isEmpty()){
                throw new ExceptionPersona("Nombre no puede estar vacio");
            }
            if (edad <= 0){
                throw new ExceptionPersona("La edad no puede ser menor o igual a 0");
            }
        } catch (ExceptionPersona e) {
           throw e;
        }catch(Exception e){
            e.printStackTrace();
            throw new ExceptionPersona("Error de Sistema");
        }
    

        persona.setNombre(nombre);
        persona.setEdad(edad);

        return persona;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
}


