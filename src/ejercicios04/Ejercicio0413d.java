package ejercicios04;
//import java.util.Scanner;
public class Ejercicio0413d {
    public static void main(String[] args) {
        int i ,j ;
        
        for (i = 9; i >= 1; i--){
            for (j = 9; j >= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        
    }
}