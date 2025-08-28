//Ejercio 3:
//Pedir 20 notas finales de alumnos en una escala de 1 a 10 (aceptar decimales)
//Mostrar el promedio de las notas mayores o iguales a 6 
//Mostrar el promedio de las notas menores a 6
//Mostrar la cantidad de notas iguales a 1
//Mostrar el promedio total de todas las notas
//Si alguna de las notas es menor a 1 y mayor a 10.0, debe salirse del ciclo y mosrar mensaje de error 

package Ciclos;
import java.util.Scanner;

public class Ejercicio3 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cantidadNotas = 20;
        double notas = 0.0;
        double sumaMayoresIguales6 = 0.0;
        int contadorMayoresIguales6 = 0;
        double sumaMenores6 = 0.0;
        int contadorMenores6 = 0;
        int contadorIguales1 = 0;
        double sumaTotal = 0.0;

               
        for (int i=0; i<cantidadNotas; i++){

            System.out.println("Ingrese la nota final del alumno:" + (i+1));
            notas = sc.nextDouble();

            if(notas < 1.0 || notas > 10.0){
                System.out.println("Error: La nota debe estar entre 1.0 y 10.0");
                sc.close();
                return;
            }
            
            if(notas >= 6.0){
                sumaMayoresIguales6 += notas;
                contadorMayoresIguales6++;
                sumaTotal += notas;
            } else if (notas < 6.0 ){
                sumaMenores6 += notas;
                contadorMenores6++;
                sumaTotal += notas;
            }

            if (notas == 1.0){
                contadorIguales1++;
            }
        
        } 

        

        System.out.println("==================PROMEDIOS==================");
        System.out.println("El promedio de las notas mayores o iguales a 6 es: " + (sumaMayoresIguales6 / contadorMayoresIguales6));
        System.out.println("El promedio de las notas menores a 6 es: " + (sumaMenores6 / contadorMenores6));
        System.out.println("La cantidad de notas iguales a 1 es: " + contadorIguales1);
        System.out.println("El promedio total de todas las notas es: " + (sumaTotal / cantidadNotas));
        System.out.println("============================================");

        sc.close();


    }

    
}
