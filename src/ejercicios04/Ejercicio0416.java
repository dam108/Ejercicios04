package ejercicios04;
import java.util.Scanner;
public class Ejercicio0416 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // pedir cantidad de entradas a la venta
        // vender entradas ( maximo 10 por persona)
        // cuando se acaben las entradas mostrar la cantidad de entradas del que mas compro
        int totalEntradas, totalVentas = 0, ventaCliente, mayorVenta = 0,entradasDisponibles;
        final int maxEntradasCliente = 10;
        
        System.out.println("introduce el numero de entradas a la venta: ");
        totalEntradas = teclado.nextInt();
        entradasDisponibles = totalEntradas;
        
        do {
            System.out.println("Quedan "+entradasDisponibles+ " entradas");
            System.out.println("¿Cuantas entradas quieres comprar?");
            ventaCliente = teclado.nextInt();
            
            if (ventaCliente <= entradasDisponibles && entradasDisponibles > 0 && ventaCliente <= maxEntradasCliente ){

                totalVentas += ventaCliente;
                if (ventaCliente > mayorVenta){
                    mayorVenta = ventaCliente;
                }
                entradasDisponibles -= ventaCliente;
                } else {
                    if (ventaCliente >= entradasDisponibles){
                       System.out.println("No puedes comprar mas entradas de las que nos quedan"); 
                    }else {System.out.println("No se pueden comprar mas de 10 entradas");}
                }
        
        }while (totalVentas < totalEntradas );
        
        System.out.println(totalVentas);
        System.out.println("Ya se han acabado las entradas , la cantidad mas grande de entradas vendidas es: "+mayorVenta);
        
        
    }
    
}