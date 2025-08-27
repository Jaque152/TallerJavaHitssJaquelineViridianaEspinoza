//EJERCICIO 5: 
//Crear un programa que permita al cajero mostrar el menú de opciones
// 1. Registrar un pedido 
// 2. Mostrar el total de ventas 
// 3. Salir del sistema
// Cada pedido se registra ingresando el precio 
// El programa debe seguir mostrando el menú hasta que el cajero elija salir 
// Validar que el precio ingresado sea positivo antes de sumarlo a ventas totales

package Ciclos;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
    
    // MENU 
    Scanner sc = new Scanner(System.in);
    int opcion = 0;
    double totalVentas = 0.0; 
    do{
        System.out.println("===============================");
        System.out.println("Seleccione una opción:");
        System.out.println("1. Registrar un pedido");   
        System.out.println("2. Mostrar el total de ventas");
        System.out.println("3. Salir del sistema");
        System.out.println("===============================");
        System.out.println("Ingrese una opción: ");
        opcion = sc.nextInt();
        switch(opcion){
            case 1: 
                System.out.print("Ingrese el precio del pedido: ");
                double precio = sc.nextDouble();
                if (precio > 0) {
                    totalVentas += precio;
                    System.out.println("Pedido registrado correctamente.");
                } else {
                    System.out.println("El precio debe ser positivo. Intente nuevamente.");
                }
                break;
            case 2: 
                System.out.printf("Total de ventas: %.2f\n", totalVentas);
                break;  
            }    
    }while (opcion != 3);
        System.out.println("Saliendo del sistema...");

    sc.close();
          
    }
}
