/* lo mire por el foro */
package ejercicios04;
import java.util.Scanner;
public class Ejercicio0422 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dividendo, numSalida = 0, resto, cociente = 0, pos = 0;
        final int BASE = 2; //delcaramos la base para binario que es 2
        
        System.out.println("Introduce un número: ");
        int num = teclado.nextInt(); // pedimos el numero 
        
        dividendo = num;
        while (dividendo >= BASE) { // se repiten las divisiones mientras se pueda
            cociente = dividendo / BASE;
            resto = dividendo % BASE;
            numSalida += resto*Math.pow(10,pos); // situamos el resto en su posicion
            
            dividendo  =  cociente;
            pos++;
        }
        numSalida += cociente*Math.pow(10,pos); // agregamos el ultimo cociente a la numero de salida creado con restos
        
        System.out.println("Salida: "+numSalida);  
    }
}