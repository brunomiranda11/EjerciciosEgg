

package Servicios;
import java.util.ArrayList;
import Entidades.Alumno;
import java.util.Iterator;
import java.util.Scanner;

public class ServiciosAlumno {
    
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Alumno> alumnos = new ArrayList();
    private Iterator<Alumno> it;


public Alumno agregarAlumno(){
    ArrayList<Integer> notas = new ArrayList(3);
   
    
        System.out.println("Indique el nombre del alumno");
        String nombre = sc.next();
        int nota = 0;
        System.out.println("Indique las notas");
       for(int i = 0; i < 3; i++){
           nota = sc.nextInt();
           notas.add(nota);
       }
        
               
    return new Alumno(nombre,notas);
}




    public void crearLista(){
        String respuesta = "";
        do{
            Alumno alumno = agregarAlumno();
            agregarLista(alumno);
            System.out.println("¿Desea agregar otro alumno?");
            respuesta = sc.next();
            
        }while(respuesta.equalsIgnoreCase("s"));
        
    }
    
    public void agregarLista(Alumno a){
        alumnos.add(a);
    }
    
    public void buscarNotaFinal(){
        String respuesta = "";
        do{
            notaFinal();
            System.out.println("¿Desea buscar otro alumno?");
            respuesta = sc.next();
        }while(respuesta.equalsIgnoreCase("s"));
    }
    
    public void notaFinal(){
        it = alumnos.iterator();
        String respuesta = "";
       
        
        System.out.println("Indique el nombre del alumno para buscar su nota");
        String nombre = sc.next();
        int notaFinal = 0;
         while(it.hasNext()){
             Alumno alumno = it.next();
            if(alumno.getNombre().equalsIgnoreCase(nombre)){
                notaFinal = calcularNotas(alumno.getNotas());
                notaFinal = notaFinal/3;
                System.out.println("La nota final del alumno: " + alumno.getNombre() + " es: " + notaFinal);
            }                   
        }

    }
    public int calcularNotas(ArrayList<Integer> notas){
        int notaFinal = 0;
        for (Integer nota : notas) {
            notaFinal+= nota;
        }
        
        return notaFinal;
       
}
}

