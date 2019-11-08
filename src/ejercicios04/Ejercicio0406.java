package ejercicios04;
import java.util.Scanner;
public class Ejercicio0406 {
    public static void main(String[] args) {
        int opcion, cantidadVentasDinero, totalVentas = 0;
        double sueldo = 0, mayorSueldo = 0;
        Scanner teclado = new Scanner(System.in);
        
        
        do {
        System.out.println("Pulsa 1 para calcular el sueldo de un vendedor: ");
        System.out.println("Pulsa 2 para salir del programa: ");
        opcion = teclado.nextInt();
        
         switch (opcion) {
             case 1:
                 System.out.println("Introduce el sueldo base: ");
                 double sueldoBase = teclado.nextDouble();
                 System.out.println("Introduce la cantidad de horas extras realizadas: ");
                 int horasExtras = teclado.nextInt();
                 System.out.println("Introduce la cantidad ventas realizadas: ");
                 int cantidadVentas = teclado.nextInt();
                 
                 horasExtras *= 100;
                 
                 if ( cantidadVentas >= 10 && cantidadVentas <= 20 ){
                     cantidadVentasDinero = 500;
                 }
                 else{
                     if ( cantidadVentas>=21 && cantidadVentas <= 30 ){
                        cantidadVentasDinero = 1000;
                    } 
                     else {
                         if ( cantidadVentas > 30 ){
                             cantidadVentasDinero = 1300;
                         }
                         else {
                             cantidadVentasDinero = 0;
                             System.out.println("No ha realizado las ventas minimas como para incrementar el sueldo.");
                         }
                     }
                 }
                 
                 sueldo = sueldoBase + horasExtras + cantidadVentasDinero;
                 totalVentas += cantidadVentas;
                 if ( sueldo >= mayorSueldo ){
                     mayorSueldo = sueldo;
                 }

                 System.out.println("El sueldo de este vendedor es: " +sueldo );
                 
 
         }

        } while(opcion != 2);
        
        System.out.println("El total de ventas es: "+totalVentas);
        System.out.println("El sueldo mas alto es: " +mayorSueldo+ "$");
    
    }
}