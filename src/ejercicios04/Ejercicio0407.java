package ejercicios04;
import java.util.Scanner;
public class Ejercicio0407 {
    public static void main(String[] args) {
        int intentos = 0, num, suma = 0;
        
        Scanner teclado = new Scanner(System.in);
    
        do {
           System.out.println("Intoduce un numero: ");
            num = teclado.nextInt();
            suma+= num;
            System.out.println("El resultado de la suma es: "+ suma);
            intentos++;
            System.out.println("Intento numero: "+intentos); 
        } while (num < 1000 && intentos < 15);
    }
}