

package persistencia;

import entidades.Autor;
import java.util.ArrayList;

public class AutorDAO extends DAO<Autor>{

    @Override
    public void eliminar(Autor autor) {
        super.eliminar(autor);
    }

    @Override
    public void editar(Autor autor) {
        super.editar(autor); 
    }

    @Override
    public void guardar(Autor autor) {
        super.guardar(autor); 
    }
    
    public Autor buscarPorNombre(String nombre){
        Autor a = new Autor();
        conectar();
        try{
        a = (Autor) em.createQuery("SELECT a FROM Autor a WHERE a.nombre = :nombre").setParameter("nombre", nombre).getSingleResult();
        desconectar();
        return a;
        }catch(Exception e){
            throw e;
        }
        
         
    }
    
    public Autor buscarAutorPorId(Integer id){
        conectar();
        Autor a = em.find(Autor.class, id);
        desconectar();
        return a;
    }



}
