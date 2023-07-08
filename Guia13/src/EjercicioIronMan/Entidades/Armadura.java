

package EjercicioIronMan.Entidades;


public abstract class Armadura {
    
    private String colorPrimario;
    private String colorSecundario;
    private int nivelSalud;
    private int generador;
    private int consumo;
    
    public Armadura(){
        
    }
    
    public Armadura(String colorPrimario, String colorSecundario, int nivelSalud, int generador, int consumo){
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.nivelSalud = nivelSalud;
        this.generador = generador;
        this.consumo = consumo;
    }

    public int getConsumo() {
        return consumo;
    }

    public void setConsumo(int consumo) {
        this.consumo = consumo;
    }
    
    public void recargarVida(){
        nivelSalud = 100;
    }

    @Override
    public String toString() {
        return "Armadura{" + "colorPrimario=" + colorPrimario + ", colorSecundario=" + colorSecundario + ", nivelSalud=" + nivelSalud + ", generador=" + generador + '}';
    }
    

    public String getColorPrimario() {
        return colorPrimario;
    }

    public void setColorPrimario(String colorPrimario) {
        this.colorPrimario = colorPrimario;
    }

    public String getColorSecundario() {
        return colorSecundario;
    }

    public void setColorSecundario(String colorSecundario) {
        this.colorSecundario = colorSecundario;
    }

    public int getNivelSalud() {
        return nivelSalud;
    }

    public void setNivelSalud(int nivelSalud) {
        this.nivelSalud = nivelSalud;
    }

    public int getGenerador() {
        return generador;
    }

    public void setGenerador(int generador) {
        this.generador = generador;
    }
    
    
    
    
   
    
    
    

}
