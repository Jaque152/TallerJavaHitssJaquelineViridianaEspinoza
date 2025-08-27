//Cada transacción debe tener un ID único automático, 
//el tipo de operación (depósito o retiro),
// el monto y la cuenta asociada.

package CuentasBancarias;

public class Transacciones {
    private final int idTransaccion;
    public String tipoOperacion; // "Deposito" o "Retiro"
    public double monto;
    public Cuentas cuentaAsociada;

    private static int contadorTransacciones;

    public Transacciones(String tipoOperacion, double monto, Cuentas cuentaAsociada) {
        this.idTransaccion = ++contadorTransacciones;
        this.tipoOperacion = tipoOperacion;
        this.monto = monto;
        this.cuentaAsociada = cuentaAsociada;
        
        if (tipoOperacion.equalsIgnoreCase("Deposito")) {
            cuentaAsociada.setSaldoActual(cuentaAsociada.getSaldoActual() + monto);
        } else if (tipoOperacion.equalsIgnoreCase("Retiro")) {
            if (monto <= cuentaAsociada.getSaldoActual()) {
                cuentaAsociada.setSaldoActual(cuentaAsociada.getSaldoActual() - monto);
            } else {
                System.out.println("Saldo insuficiente para el retiro en la cuenta de " + cuentaAsociada.getTitular());
            }
        } 
    }

    //Getters
    public int getIdTransaccion() {
        return idTransaccion;
    }
    public String getTipoOperacion() {
        return tipoOperacion;
    }
    public double getMonto() {
        return monto;
    }
    public Cuentas getCuentaAsociada() {
        return cuentaAsociada;
    }

    //Setters
    public void setTipoOperacion(String tipoOperacion) {
        this.tipoOperacion = tipoOperacion;
    }
    public void setMonto(double monto) {
        this.monto = monto;
    }
    public void setCuentaAsociada(Cuentas cuentaAsociada) {
        this.cuentaAsociada = cuentaAsociada;
    }

    @Override
    public String toString() {
        return "Transacciones{" +
                "idTransaccion=" + idTransaccion +
                ", tipoOperacion='" + tipoOperacion + '\'' +
                ", monto=" + monto +
                ", cuentaAsociada=" + cuentaAsociada +
                '}';
    }
}
