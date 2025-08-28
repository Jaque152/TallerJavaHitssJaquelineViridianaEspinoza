//EJERCICIO 2:
// Buscar el número menor de mínimo 10 valores enteros
//usando la clase scanner ingresar la cantidad de números a comparar 
//utilizando una sentencia for iterar el número de veces (ingresado) para pedir el número entero 
//Calcular el menor número e imprimir el valor 
//Si el menor número es menor que 10, imprimir "El número es menor que 10"
//Si no, imprimir "El número es mayor o igual que 10"

package Ciclos;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de números a comparar (mínimo 10): ");
        int cantidad = sc.nextInt();
        
        // Asegurarse de que la cantidad sea al menos 10
        if (cantidad < 10) {
            System.out.println("La cantidad debe ser al menos 10.");
            sc.close();
            return;
        }
        
        int menorNumero = Integer.MAX_VALUE; // Inicializar con el valor máximo posible
        
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Ingrese el número entero " + (i + 1) + ": ");
            int numero = sc.nextInt();
            
            // Actualizar el menor número si el número ingresado es menor
            if (numero < menorNumero) {
                menorNumero = numero;
            }
        }
        sc.close();
        System.out.println("El número menor es: " + menorNumero);
        
        // Verificar si el menor número es menor que 10 o no
        if (menorNumero < 10) {
            System.out.println("El número es menor que 10");
        } else {
            System.out.println("El número es mayor o igual que 10");
        }
        
        
    }    
}

