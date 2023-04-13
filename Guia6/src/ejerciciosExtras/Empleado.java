/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejerciciosExtras;


public class Empleado {
    private String nombre;
    private int edad;
    private int salario;
    
    public Empleado(String nombre, int edad, int salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    public void calcularAumento(){
        double total;
        if(edad >= 30){
            total = salario+(salario*0.10);
            System.out.println("El aumento es de 10% y el total sería: " + total);
        }else if(edad<30){
             total = salario+(salario*0.05);
            System.out.println("El aumento es de 5% y el total sería: " + total);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

}
