package ejercicios04;
//import java.util.Scanner;
public class Ejercicio0413b {
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        int i, j;
        for (i = 1; i <= 9; i++){ 
            for (j = 1; j <= i; j++){
                System.out.print(i); 
            }
            System.out.print("\n");
        }
    }
}