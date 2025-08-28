//EJERCICIO 1:
//Mediante el teclado pedir dos números enteros positivos o negativos 
//Multipplicar los números sin usar el operador de multiplicación(*)

package Ciclos;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número entero: ");
        int num1 = sc.nextInt();
        System.out.print("Ingrese el segundo número entero: "); 
        int num2 = sc.nextInt();
        int resultado = 0;
        //Cuando un número es negativo y el otro positivo
        
        if(num2<0 && num1<0){
            num1 = -num1;
            num2 = -num2;
            for(int i =0; i<num2; i++){
                resultado += num1;
            } 
        }
        //Cuando ambos números son negativos
        else if(num2<0 || num1<0){
            resultado = -resultado;
            for(int i =0; i<num2; i++){
                resultado += num1;
            }
        }
        else for(int i =0; i<num2; i++){
                resultado += num1;
            } 
        System.out.println("El resultado de la multiplicación es: " + resultado);
        sc.close();
    }
          
}
