//EJERCICIO 1:
//Mediante el teclado pedir dos números enteros positivos o negativos 
//Multipplicar los números sin usar el operador de multiplicación(*)

package Ciclos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número entero:");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número entero:");
        int num2 = sc.nextInt();
        int resultado = 0;
        // SI SON NUMEROS NEGATIVOS 

        for (int i =0; i<num2; i++){
            if(num1 <0 && num2 <0){
                resultado += num1;
                System.out.println("Multiplicando: " + num1 + " por " + (i + 1) + " = " + resultado);
            }
            
            
        }   
        System.out.println("El resultado de la multiplicación es: " + resultado);
        sc.close();

    
        
    }
}
