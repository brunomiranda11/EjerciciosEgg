

package APP;
import Entidades.Alumno;
import Servicios.ServiciosAlumno;

public class AlumnoAPP {
    
    public static void main(String[] args){
        ServiciosAlumno ServAlum = new ServiciosAlumno();
        
        ServAlum.crearLista();
        
        ServAlum.buscarNotaFinal();
        
        
    }

    
    
    
}
