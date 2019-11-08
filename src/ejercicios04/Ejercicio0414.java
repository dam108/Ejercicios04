package ejercicios04;
import java.util.Scanner;
public class Ejercicio0414 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int acumulador = 0;
        
        for ( int i = 1; i<=1000; i++){
            if (i % 3 == 0){
                acumulador += i;
                System.out.println("Es multiplo de 3 -->"+i); 
            }
        }
        
        if ( acumulador % 3 == 0 ){
            System.out.println("la suma de los multiplos de 3 es. "+acumulador);
            System.out.println("la suma de los multiplos de 3 desde 1 a 10000 es multiplo de 3");
        }
        else System.out.println("la suma de los multiplos de 3 desde 1 a 10000 no es multiplo de 3");
    
    }
}