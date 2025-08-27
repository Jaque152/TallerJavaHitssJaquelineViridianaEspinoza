//Cada cuenta bancaria debe tener un ID único generado automáticamente.
package CuentasBancarias;

public class Cuentas{
    private final int id;
    public String Titular;
    public double SaldoActual;

    private static int contadorCuentas;

    public Cuentas(String Titular, double SaldoActual) {
        this.id = ++contadorCuentas;
        this.Titular = Titular;
        this.SaldoActual = SaldoActual;
    }

    //Getters 
    public int getId() {
        return id;
    }
    public String getTitular() {
        return Titular;
    }
    public double getSaldoActual() {
        return SaldoActual;
    }

    //Setters
    public void setTitular(String titular) {
        Titular = titular;
    }
    public void setSaldoActual(double saldoActual) {
        SaldoActual = saldoActual;
    }

    @Override
    public String toString() {
        return "Cuentas{" +
                "id=" + id +
                ", Titular='" + Titular + 
                ", SaldoActual=" + SaldoActual +
                '}';
    }


}