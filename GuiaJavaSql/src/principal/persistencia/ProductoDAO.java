

package principal.persistencia;

import java.util.ArrayList;
import principal.dominio.Producto;


public final class ProductoDAO extends DAO {
    
    
    public void guardarProducto(Producto producto) throws Exception{
        
        try {
            if(producto == null){
                throw new Exception("Debe indicar un producto");
            }
            
            String sql = "Insert INTO producto(codigo, nombre, precio, codigo_fabricante)"
                    + "VALUES( " + producto.getCodigo() + ", '" 
                    + producto.getNombre() +"' ," + producto.getPrecio() + ", "
                    + producto.getCodigo_fabricante() + ")";
            insertarModificarEliminar(sql);
        } catch (Exception e) {
            throw e;
        }finally{
            desconectarBase();
        }
    }
    
    public ArrayList<Producto> listaProductos() throws Exception{
        
        try {
            ArrayList<Producto> productos = new ArrayList();
            String sql = "SELECT * from producto";
            consultarBase(sql);
            while(resultado.next()){
                Producto p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigo_fabricante(resultado.getInt(4));
                productos.add(p);
                
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
        
    }
    
    public ArrayList<Producto> listaProductosEntre(int comienzo, int fin) throws Exception{
        try {
            ArrayList<Producto> productos = new ArrayList();
            String sql = "SELECT * FROM producto WHERE precio >= " + comienzo + " AND precio <=  " + fin + " ORDER BY precio";
            consultarBase(sql);
            while(resultado.next()){
                Producto p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigo_fabricante(resultado.getInt(4));
                productos.add(p);
            }
            desconectarBase();
            return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
    public ArrayList<Producto> listaPortatiles() throws Exception{
        try {
            ArrayList<Producto> productos = new ArrayList();
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Portátil%'";
            consultarBase(sql);
             while(resultado.next()){
                Producto p = new Producto();
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigo_fabricante(resultado.getInt(4));
                productos.add(p);
            }
             desconectarBase();
             return productos;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
    
      public Producto buscarMenorPrecio() throws Exception{
        try {
           Producto p = new Producto();
            String sql = "SELECT * FROM producto ORDER BY precio limit 1";
            consultarBase(sql);
             while(resultado.next()){
                p.setCodigo(resultado.getInt(1));
                p.setNombre(resultado.getString(2));
                p.setPrecio(resultado.getDouble(3));
                p.setCodigo_fabricante(resultado.getInt(4));    
            }
             desconectarBase();
             return p;
        } catch (Exception e) {
            desconectarBase();
            throw e;
        }
    }
      
       public void modificarProducto(Producto producto) throws Exception {
        try {
            String sql = "UPDATE producto SET nombre = '" + producto.getNombre() + "', precio = " + producto.getPrecio() 
                    + ", codigo_Fabricante = " + producto.getCodigo_fabricante() + " WHERE codigo = " + producto.getCodigo();
            conectarBase();
            sentencia = conexion.createStatement();
            insertarModificarEliminar(sql);
            System.out.println("Producto modificado");
        } catch (Exception e) {
            throw e;
        }

    }

    
    

}
