package ejercicios04;
import java.util.Scanner;
public class Ejercicio0418 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // pedimos un numero entre el entre 1 y 100
        // si se introduce un numero menor que 1 o mayor que 100 el programa acaba
        // calcular factorial de ese numero 
        long num, factorial = 1;
        
        System.out.println("Intoduce un numero. (menor que 1 o mayor que 100 para terminar): ");
        num = teclado.nextInt();
        
        while (num >= 1 && num <= 100){
            
            // calcular fatorial
            for (int i = 1 ; i <=num; i++){
                factorial *= i; // calculamos el factorial multiplicando la iteracion por cada numero consecutivo
                System.out.println(factorial);
            }
            
            System.out.println("El factorial de "+num+" es: "+factorial);
            factorial = 1; // reseteamos la inicializacion
            //pedir otro numero 
            System.out.println("Intoduce un numero. (menor que 1 o mayor que 100 para terminar): ");
            num = teclado.nextInt();
        }
        
        
        
        
        
        
        
        
        
    }
    
}