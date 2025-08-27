package test;

import CuentasBancarias.Cuentas;
import CuentasBancarias.Transacciones;

public class TestMain {
    public static void main(String[] args) {
        // Crear 2 cuentas bancarias
        Cuentas cuenta1 = new Cuentas("Ana", 5000.0);
        System.out.println(cuenta1);
        Cuentas cuenta2 = new Cuentas("Luis", 10000.0);
        System.out.println(cuenta2);

        System.out.println("------------------------TRANSACCIONES-----------------------" );
        // Crear  transacciones. 
        //El sistema debe mostrar el detalle de cada cuenta y un historial de las transacciones con IDs únicos. 
        //1. Ana deposita 2000 y retira 1000
        Transacciones transaccion1 = new Transacciones("Deposito", 2000.0, cuenta1);
        System.out.println(transaccion1);
        Transacciones transaccion2 = new Transacciones("Retiro", 1000.0, cuenta1);
        System.out.println(transaccion2);

        System.out.println("-----------------------------------------------------------" );

        //2. Luis retira 3000 y deposita 1500
        Transacciones transaccion3 = new Transacciones("Retiro", 3000.0, cuenta2);
        System.out.println(transaccion3);   
        Transacciones transaccion4 = new Transacciones("Deposito", 1500.0, cuenta2);
        System.out.println(transaccion4);

        
    }



    
}
