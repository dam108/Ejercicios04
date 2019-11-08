package ejercicios04;
//import java.util.Scanner;
public class Ejercicio0413a {
    public static void main(String[] args) {
        //Scanner teclado = new Scanner(System.in);
        
        for (int i = 0 ; i <= 8; i++){ // itermaos desde el 0 al 8
            for (int j = 1; j<= 9; j++){ // en cada iteracion volvemos a itererar para 9 veces para repetir el numero 9 veces en cada linea
                System.out.print(i); // imprimimos cada linea
            } // salimos de la iteracion
            System.out.println();  // saltamos de linea
        }
    }
}