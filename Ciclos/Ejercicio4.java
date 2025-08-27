//EJERCICIO 4:  
//Se require un menú para administar a los productos
//con las opciones actualizar, eliminar, crear, listar y salir
//Iterar hasta que la opción sea salir 
//Cada vez que se selecciona una opción distita a salir, al finalizar dicha operación,
//debe volver al menú para continuar con otra 

package Ciclos;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        //MENU de opciones
        System.out.println("Seleccione una opción:");
        System.out.println("1. Crear");
        System.out.println("2. Actualizar");   
        System.out.println("3. Eliminar");
        System.out.println("4. Listar");  
        System.out.println("5. Salir");

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.print("Ingrese una opción: ");
            opcion = sc.nextInt();
            switch(opcion){
                case 1 -> System.out.println("Usuario creado correctamente.");
                case 2 -> System.out.println("Usuario actualizdo correctamente.");
                case 3 -> System.out.println("Usuario eliminado correctamente.");
                case 4 -> System.out.println("Listado de usuarios.");
                
            }
            

        }while(opcion != 5);
        System.out.println("Haz salido con éxito!");
        sc.close();
    }
}
