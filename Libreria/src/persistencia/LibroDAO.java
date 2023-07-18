

package persistencia;

import entidades.Libro;


public class LibroDAO extends DAO<Libro>{

    @Override
    public void eliminar(Libro libro) {
        super.eliminar(libro);
    }

    @Override
    public void editar(Libro libro) {
        super.editar(libro);
    }

    @Override
    public void guardar(Libro libro) {
        super.guardar(libro); 
    }
    
    public Libro buscarPorIsbn(Long isbn){
        conectar();
        Libro libro = em.find(Libro.class, isbn);
        desconectar();
        return libro;
    }
    
    public Libro buscarPorTitulo(String titulo){
        Libro libro = new Libro();
        try{
        conectar();
        libro = (Libro) em.createQuery("SELECT l FROM Libro l WHERE l.titulo = :titulo").setParameter("titulo", titulo).getSingleResult();
        desconectar();
        return libro;
        
        }catch(Exception e){
            throw e;
        }
    }
    

}
