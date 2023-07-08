
package Main;

import ejExtra.Entidades.Alquiler;
import ejExtra.Entidades.Barco;
import ejExtra.Entidades.BarcoConMotor;
import ejExtra.Entidades.Velero;
import ejExtra.Entidades.Yate;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;



public class BarcosMain {

    
    public static void main(String[] args) {
        
        Velero barco2 = new Velero(2, 10, 12654, LocalDate.of(1986,10,4));
        Yate barco3 = new Yate(3, 100, 10, 1654, LocalDate.of(1986,6,4));
        BarcoConMotor barco4 = new BarcoConMotor(25, 10, 12658, LocalDate.of(1977,6,4));
        
        ArrayList<Barco> listaBarcos = new ArrayList<>();
      
        listaBarcos.add(barco2);
        listaBarcos.add(barco3);
        listaBarcos.add(barco4);
        
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
        
        System.out.println("Barcos Disponibles de Alquiler : ");
        for (Barco b : listaBarcos) {
            System.out.println(b.toString());
            double valor = b.valorModulo();
            System.out.println("El Precio es : " + valor);
            System.out.println("Desea Alquilar este Barco ? S/N :");
            String resp = sc.next();
            if (resp.equals("S")){
                Alquiler nuevoAlquiler = new Alquiler();
                nuevoAlquiler.crearAlquiler(b);
            }
        }
    }
        
}
    

