
package principal.servicios;
/* a) Lista el nombre de todos los productos que hay en la tabla producto.
b) Lista los nombres y los precios de todos los productos de la tabla producto.
c) Listar aquellos productos que su precio esté entre 120 y 202.
d) Buscar y listar todos los Portátiles de la tabla producto.
e) Listar el nombre y el precio del producto más barato.
f) Ingresar un producto a la base de datos.
g) Ingresar un fabricante a la base de datos
h) Editar un producto con datos a elección.*/

import java.util.ArrayList;
import java.util.Scanner;
import principal.dominio.Fabricante;
import principal.dominio.Producto;
import principal.persistencia.FabricanteDAO;
import principal.persistencia.ProductoDAO;

public class TiendaServicios {
    
    FabricanteDAO fabDAO;
    ProductoDAO prodDAO;
    private Scanner sc = new Scanner(System.in).useDelimiter("\n");
    
    public TiendaServicios(){
        this.fabDAO = new FabricanteDAO();
        this.prodDAO = new ProductoDAO();
    }
    
    public void menu() throws Exception{
        int n = 1;
        try{
        ArrayList<Producto> p = new ArrayList();
        do{
            System.out.println("======================");
        System.out.println("Bienvenido, seleccione una opción.");
        System.out.println("1. Lista del nombre de todos los productos");
        System.out.println("2. Lista de los nombres y precios de los productos");
        System.out.println("3. Lista de los productos en el rango de precio que indique");
        System.out.println("4. Lista de los portátiles");
        System.out.println("5. Nombre y precio del producto más barato");
        System.out.println("6. Ingresar un producto a la base de datos");
        System.out.println("7. Ingresar un fabricante a la base de datos");
        System.out.println("8. Editar un producto");
            System.out.println("Seleccione una opción, por favor");
        n = sc.nextInt();
        if(n == 1){
            p =  prodDAO.listaProductos();
            for (Producto producto : p) {
                System.out.println("Nombre: " + producto.getNombre());
            }
            
        }
        if(n == 2){
            for (Producto producto : p) {
                System.out.println("Nombre: " + producto.getNombre() + " Precio: " + producto.getPrecio());
            }
            
        }
        if(n == 3){
            System.out.println("Seleccione el rango del precio");
            System.out.println("Seleccione el menor precio: ");
            int menor = sc.nextInt();
            System.out.println("Seleccione el mayor precio");
            int mayor = sc.nextInt();
            
            if(menor > mayor){
                throw new Exception("El rango del precio es incorrecto");
            }
            
            p = prodDAO.listaProductosEntre(menor, mayor);
             for (Producto producto : p) {
                System.out.println("Codigo: " + producto.getCodigo() + " Nombre: " + producto.getNombre() 
                + " Precio: " + producto.getPrecio() + " Codigo de Fabricante: " + producto.getCodigo_fabricante());
            }
            
        }
        if(n == 4){
            p = prodDAO.listaPortatiles();
            for (Producto producto : p) {
                System.out.println("Codigo: " + producto.getCodigo() + " Nombre: " + producto.getNombre() 
                + " Precio: " + producto.getPrecio() + " Codigo de Fabricante: " + producto.getCodigo_fabricante());
            }
            
        }
        if(n == 5){
            Producto producto = prodDAO.buscarMenorPrecio();
           System.out.println(" Nombre: " + producto.getNombre() 
            + " Precio: " + producto.getPrecio());
            
        }
        if(n == 6){
            sc.nextLine();
            Producto producto = new Producto();
            System.out.println("Ingrese el nombre del Producto");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el precio del Producto");
            double precio = sc.nextDouble();
            System.out.println("Ingrese el codigo de fabricante");
            int cod = sc.nextInt();
            
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigo_fabricante(cod);
            prodDAO.guardarProducto(producto);
  
        }
        if(n == 7){
            Fabricante fabricante = new Fabricante();
            sc.nextLine();
            System.out.println("Indique el nombre del fabricante");
            String nombre = sc.nextLine();
            
            fabricante.setNombre(nombre);
            fabDAO.guardarFabricante(fabricante);
            
            
        }
        if(n == 8){
          Producto producto = new Producto();

            System.out.println("Ingrese el codigo del producto para EDITAR : ");
            int codigo = sc.nextInt();
            System.out.println("Ingrese el nombre del producto : ");
            String nombre = sc.next();
            System.out.println("Ingrese precio del producto : ");
            double precio = sc.nextDouble();
            System.out.println("Ingrese codigo Fabricante : ");
            int codigofabri = sc.nextInt();

            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCodigo_fabricante(codigofabri);
            producto.setCodigo(codigo);

            prodDAO.modificarProducto(producto);  
        }
        
        
        }while(n != 0);
        }catch(Exception e){
            throw e;
        }
        
        
        
        
    }

}
