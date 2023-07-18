/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package servicios;

import entidades.Autor;
import java.util.Scanner;
import persistencia.AutorDAO;


public class AutorServicio {
    private final AutorDAO DAO;
    private Scanner sc = new Scanner(System.in);
    
    
    public AutorServicio(){
        this.DAO = new AutorDAO();
    }
    
    public Autor crearAutor() throws Exception{
        Autor autor = new Autor();
        System.out.println("Indique el nombre del Autor");
        String nombre = sc.nextLine();
        autor.setNombre(nombre);     
        try {
            DAO.guardar(autor);
        } catch (Exception e) {
            throw e;
        }
        return autor;
    }
    
    public void darDeAlta() throws Exception{
        String r ="";
        do{
         Autor autor = new Autor();
        try {
        System.out.println("Indique el id del Autor");
        Integer id = sc.nextInt();
        autor = DAO.buscarAutorPorId(id);
        if(autor == null){
            throw new Exception("No se encontró en la base de datos");
        }
        } catch (Exception e) {
            throw e;
        }
       
        System.out.println("¿Quiere dar de alta al siguiente autor?: " + autor.getNombre());
        String respuesta = sc.next();
        if(respuesta.equalsIgnoreCase("si")){
           autor.setAlta(Boolean.TRUE);
        }else{
            autor.setAlta(Boolean.FALSE);
        }
        try {
            DAO.editar(autor);
        } catch (Exception e) {
            throw e;
        }
            System.out.println("¿Quiere seguir validando altas?");
            r = sc.next();
        }while(r.equalsIgnoreCase("si"));
    }
    
    public void buscarPorNombre(){
        try{
        System.out.println("Indique el nombre del autor");
        String nombre = sc.nextLine();
        Autor a = DAO.buscarPorNombre(nombre);
        System.out.println(a.toString());
        }catch(Exception e){
            throw e;
        }
       
    }

}
