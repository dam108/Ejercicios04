/* lo mire por el foro */
package ejercicios04;
import java.util.Scanner;
public class Ejercicio0423 {
    public static void main(String[] args) {
        int num, resto, dividendo, cociente = 0;
        final int BASE = 16; // se puede poner cualquier base hasta 16
        String hexa = "0123456789ABCDEF";
        String numSalida = "";
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un número: ");
        num = teclado.nextInt();
        
        dividendo = num;
        
        while (dividendo >= BASE ){ // repetimos las divisiones entre la base hasta que ya no se pueda
        
            cociente = dividendo / BASE; // calculamos el cociente
            resto = dividendo % BASE; // calculamos el resto
            
            numSalida = hexa.charAt(resto) + numSalida; // calculamos a que letra hexadecimal coresponde ese resto y lo guardamos en una cadena

            dividendo = cociente ; // el cociente pasa a ser el dividendo para la siguiente division            
        }
        
        numSalida = hexa.charAt(cociente) + numSalida;
        System.out.println("tu numero en la base "+BASE+" es: "+numSalida);
        
        
    }// fin de main
}// fin de class