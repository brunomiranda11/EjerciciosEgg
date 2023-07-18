
package principal;

import entidades.Libro;
import servicios.AutorServicio;
import servicios.EditorialServicio;
import servicios.LibroServicio;

public class Principal {

    
    public static void main(String[] args) throws Exception {
        
        AutorServicio as = new AutorServicio();
        EditorialServicio es = new EditorialServicio();
        LibroServicio ls = new LibroServicio();
        try {
          //Libro l = ls.crearLibro("The Black Cat", 1843, 10000, as.crearAutor(), es.crearEditorial());
          //Libro l2 = ls.crearLibro("Harry Potter y la Piedra Filosofal", 1997, 10000, as.crearAutor(), es.crearEditorial());
          //as.darDeAlta();
          //as.buscarPorNombre();
          //ls.buscarLibroPorISBN();
          //es.darDeAlta();
          //ls.buscarLibroPorTitulo();
          
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
        
        
    }
    
}
