
package Main;
import ejercicios1.Entidades.Animal;
import ejercicios1.Entidades.Perro;
import ejercicios1.Entidades.Caballo;
import ejercicios1.Entidades.Gato;

public class AnimalMain {

    public static void main(String[] args) {
      Animal perro1 = new Perro("Stitch","Carnivoro", 15, "Doberman");
      perro1.alimentarse();
      Animal perro2 = new Perro("Teddy","Croquetas", 10, "Chihuaha");
      perro2.alimentarse();
      Animal gato1 = new Gato("Pelusa", "Galletas", 15, "Siamés");
      gato1.alimentarse();
      Animal caballo1 = new Caballo("Spark", "Pasto", 25, "Fino");
      caballo1.alimentarse();
      
      
    }
    
}
