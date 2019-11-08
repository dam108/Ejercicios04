package ejercicios04;
import java.util.Scanner;
public class Ejercicio0402 {
    public static void main(String[] args) {
        // programa que lea numeros de entrada y informe si esta n ordenados de forma ascendente
        // el programa acaba cuando se introduzca cero o cuando detecte que esta desordenados
        int num1, num2;
        boolean ascendente = true;
        Scanner teclado = new Scanner(System.in);
                
        System.out.println("Intoduce numeros ordenados de manera ascendente ( cero para finalizar)");
        num1 = teclado.nextInt();
        
        while ( num1 != 0 && ascendente != false){
            System.out.println("Intoduce numeros ordenados de manera ascendente ( cero para finalizar)");
            num2 = teclado.nextInt();
            
            if (num2 > num1) {
                 System.out.println("Estan ordenados de manera ascendente");
                 num1 = num2;
            }
            else {
                if (num1 > num2){
                   System.out.println("No estan ordenados de manera ascendente");
                    ascendente = false; 
                }
                else {
                    System.out.println("los numeros son iguales");
                    ascendente = false;
                }
            }        
        }
    } 
}