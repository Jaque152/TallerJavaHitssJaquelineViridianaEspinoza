//EJERCICIO 1:
//Leer 10 números enteros dede el teclado para llenar un arreglo de 10 elementos.
// Luego, mostrarlos en el siguiente orden:
// 1. El último 
// 2. El primero
// 3. El penúltimo
// 4. El segundo
// 5. El antepenúltimo
// 6. El tercero
// y así sucesivamente hasta que se muestren todos los números.

package Arreglos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int N = 10;
        int[] numeros = new int[N];

        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("===============================");
        System.out.println("Números en el orden solicitado:");

        for (int i = 0; i < numeros.length; i++) {
            if (i % 2 == 0) {
                // Imprimir el elemento en la posición inversa
                System.out.println("Número: " + numeros[numeros.length - 1 - i / 2]);
            } else {
                // Imprimir el elemento en la posición normal
                System.out.println("Número: " + numeros[i / 2]);
            }
        }

        sc.close();
    }
}
