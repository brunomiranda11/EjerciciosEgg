

package ejExtra.Entidades;

import java.time.LocalDate;
import java.util.Scanner;


public class Alquiler {
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private String nombre;
    private int dni;
    private LocalDate fechaDevolucion;
    private LocalDate fechaAlquiler;
    private int posAmarre;
    private Barco barco;
    
public Alquiler(){
    
}
public Alquiler(String nombre, int dni, LocalDate fechaAlquiler, LocalDate fechaDevolucion, int posAmarre, Barco barco){
    this.nombre = nombre;
    this.dni = dni;
    this.fechaDevolucion = fechaDevolucion;
    this.fechaAlquiler = fechaAlquiler;
    this.posAmarre = posAmarre;
    this.barco = barco;
}

public void crearAlquiler(Barco b){
    System.out.println("Indique nombre del cliente");
    nombre = sc.next();
    System.out.println("Indique el dni del cliente");
    dni = sc.nextInt();
    System.out.println("Ingresando día/mes/anio para el Alquiler");
    int dia = sc.nextInt();
    int mes = sc.nextInt();
    int anio = sc.nextInt();
    fechaAlquiler = LocalDate.of(dia, mes, anio);
    System.out.println("Ingresando día/mes/anio para la devolución");
    dia = sc.nextInt();
    mes = sc.nextInt();
    anio = sc.nextInt();
    fechaDevolucion = LocalDate.of(dia, mes, anio);
    System.out.println("Ingrese la posición de amarre");
    posAmarre = sc.nextInt();
    System.out.println("Ingresando barco");
    barco = b;
}

public double calcularAlquiler(){
    int diasOcupacion = fechaDevolucion.getDayOfYear() - fechaAlquiler.getDayOfYear();
    double valorModulo = this.barco.valorModulo();
    
    double precio = valorModulo * diasOcupacion;
    
    return precio;
}

}
