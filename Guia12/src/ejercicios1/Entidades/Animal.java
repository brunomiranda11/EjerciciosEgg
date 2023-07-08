

package ejercicios1.Entidades;


public abstract class Animal {
    protected String nombre;
    protected String alimento;
    protected int edad;
    protected String raza;
    
    
    public Animal() {
    
}
    
    public Animal(String nombre, String alimento, int edad, String raza){
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.raza = raza;
    }
    
    public void alimentarse(){
        System.out.println(this.nombre + " se alimenta de: " + this.alimento);
    }

}





