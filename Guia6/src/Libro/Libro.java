

package Libro;

import java.util.Scanner;

public class Libro {
   private int isbn;
   private String titulo;
   private String autor;
   private int numPaginas;
   
public Libro(){
    
}

public Libro(int isbn, String titulo, String autor, int numPaginas){
    this.isbn = isbn;
    this.titulo = titulo;
    this.autor = autor;
    this.numPaginas = numPaginas;
}

public Libro crearLibro(){
    Scanner sc = new Scanner(System.in);
        Libro libro = new Libro();
        System.out.println("Ingresa el ISBN:");
        libro.setIsbn(sc.nextInt());
         sc.nextLine();
        System.out.println("Ingresa el título:");
        libro.setTitulo(sc.nextLine());
        System.out.println("Ingresa el autor:");
        libro.setAutor(sc.nextLine());
        System.out.println("Ingresa la cantidad de páginas:");
        libro.setNumPaginas(sc.nextInt());
        return libro;
    
}




    public int getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }
    
    


    
    

}
