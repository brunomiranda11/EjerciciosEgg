

package Entidades;


public class CuentaBancaria {
    private int numeroDeCuenta;
    private long dni;
    double saldoActual;
    
    public CuentaBancaria(){
        
    }
    
    public CuentaBancaria(int numeroDeCuenta, long dni, double saldoActual){
        this.numeroDeCuenta = numeroDeCuenta;
        this.dni = dni;
        this.saldoActual = saldoActual;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroDeCuenta=" + numeroDeCuenta + ", dni=" + dni + ", saldoActual=" + saldoActual + '}';
    }
    

}
