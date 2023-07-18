/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia;

import entidades.Editorial;


public class EditorialDAO extends DAO<Editorial> {

    @Override
    public void eliminar(Editorial editorial) {
        super.eliminar(editorial); 
    }

    @Override
    public void editar(Editorial editorial) {
        super.editar(editorial); 
    }

    @Override
    public void guardar(Editorial editorial) {
        super.guardar(editorial);
    }
    
    public Editorial buscarPorId(Integer id){
        conectar();
        Editorial e = em.find(Editorial.class, id);
        desconectar();
        return e;
    }
    
    

}
