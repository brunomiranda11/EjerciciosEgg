

package ejerciciosExtras;


public class Cuenta {
    String titular;
    double saldo;
    
    public Cuenta(String titular, double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    
    void retirarDinero(int cantidad){
        double saldoRestante = saldo - cantidad;
        if(saldoRestante < 0){
            System.out.println("Fondos insuficientes para hacer la transacción");
            saldoRestante += cantidad;
        }else{
            System.out.println("Se descontó la cantidad de: " + cantidad);
            System.out.println("El saldo restante es de: " + saldoRestante);
            saldo = saldoRestante;
        }
    }

    @Override
    public String toString() {
        return "Cuenta{" + "titular=" + titular + ", saldo=" + saldo + '}';
    }
    

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    

}
