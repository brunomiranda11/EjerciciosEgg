

package principal.persistencia;

import principal.dominio.Fabricante;


public final class FabricanteDAO extends DAO{
    
      public void guardarFabricante(Fabricante fabricante) throws Exception{
        
        try {
            if(fabricante == null){
                throw new Exception("Debe indicar un producto");
            }
            
            String sql = "Insert INTO fabricante(codigo, nombre)"
                    + "VALUES( " + fabricante.getCodigo() + ", '" + fabricante.getNombre() + "')";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }
    }

}
