package ejercicios04;
import java.util.Scanner;
public class Ejercicio0412 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        
        System.out.println("Intoduce un numero: ");
        x = teclado.nextInt();
        
        
        for(int i = 1; i <= x ; i++){
            if (i % 2 != 0) System.out.println(i+"º hola");
            else System.out.println(i+"º adios");
        } 
    }
}