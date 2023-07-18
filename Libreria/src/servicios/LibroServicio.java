

package servicios;

import entidades.Autor;
import entidades.Editorial;
import entidades.Libro;
import java.util.Scanner;
import persistencia.LibroDAO;


public class LibroServicio {
    
    private final LibroDAO DAO;
    private Scanner sc = new Scanner(System.in);
    
    public LibroServicio(){
        this.DAO = new LibroDAO();
    }
    
    public Libro crearLibro(String titulo,int anio,int ejemplares, Autor autor, Editorial editorial) throws Exception{
        
        System.out.println("Creando libro");
        Libro libro = new Libro();
        
        libro.setTitulo(titulo);
        libro.setAnio(anio);
        libro.setEjemplares(ejemplares);
        libro.setAutor(autor);
        libro.setEditorial(editorial);
        
        try{
        DAO.guardar(libro);
        } catch ( Exception e){
            throw e;
        }
        System.out.println("El libro fue agregado con éxito");
        return libro;   
    }
    
    public void buscarLibroPorISBN(){
        Libro libro = new Libro();
        try {
            System.out.println("Indique el ISBN del libro que quiera buscar");
            Long isbn = sc.nextLong();
            libro = DAO.buscarPorIsbn(isbn);
            
        } catch (Exception e) {
            throw e;
        }
        System.out.println(libro.toString());
    }
    public void buscarLibroPorTitulo(){
        Libro libro = new Libro();
        try{
            System.out.println("Indique el título del libro que quiera buscar: ");
            String titulo = sc.nextLine();
            libro = DAO.buscarPorTitulo(titulo);
        }catch(Exception e){
            throw e;
        }
        System.out.println(libro.toString());
    }
    
}
