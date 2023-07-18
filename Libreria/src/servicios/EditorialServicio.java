/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servicios;

import entidades.Editorial;
import java.util.Scanner;
import persistencia.EditorialDAO;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class EditorialServicio {
    private final EditorialDAO DAO;
    private Scanner sc = new Scanner(System.in);
    
    public EditorialServicio(){
        this.DAO = new EditorialDAO();
    }
    
     public Editorial crearEditorial() throws Exception{
        Editorial editorial = new Editorial();
        System.out.println("Indique el nombre de la Editorial");
        String nombre = sc.nextLine();
        editorial.setNombre(nombre);     
        try {
            DAO.guardar(editorial);
        } catch (Exception e) {
            throw e;
        }
        return editorial;
    }
     
      public void darDeAlta() throws Exception{
          String r ="";
          
        do{
         Editorial editorial = new Editorial();
        try {
        System.out.println("Indique el id del Autor");
        Integer id = sc.nextInt();
        editorial = DAO.buscarPorId(id);
        if(editorial == null){
            throw new Exception("No se encontró en la base de datos");
        }
        } catch (Exception e) {
            throw e;
        } 
          
          
        System.out.println("[SI/NO] Usted quiere dar de alta al siguiente autor: " + editorial.getNombre());
        String respuesta = sc.next();
        if(respuesta.equalsIgnoreCase("si")){
           editorial.setAlta(Boolean.TRUE);
        }else{
            editorial.setAlta(Boolean.FALSE);
        }
        try {
            DAO.editar(editorial);
        } catch (Exception e) {
            throw e;
        }  
         System.out.println("¿Quiere seguir validando editoriales?");
         r = sc.next();
    }while(r.equalsIgnoreCase("si"));
      }


    

}
