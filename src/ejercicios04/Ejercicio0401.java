package ejercicios04;
import java.util.Scanner;
public class Ejercicio0401 {
    public static void main(String[] args) {
        int dni, n;
        char letraDni = 'o';
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce un DNI sin letra");
        dni = teclado.nextInt();
        
        n = dni % 23;
        
        // hacer con switch
         switch (n) {
             case 0: letraDni = 'T'; break;
             case 1: letraDni = 'R'; break;
             case 2: letraDni = 'W'; break;
             case 3: letraDni = 'A'; break;
             case 4: letraDni = 'G'; break;
             case 5: letraDni = 'M'; break;
             case 6: letraDni = 'Y'; break;
             case 7: letraDni = 'F'; break;
             case 8: letraDni = 'P'; break;
             case 9: letraDni = 'D'; break;
             case 10: letraDni = 'X'; break;
             case 11: letraDni = 'B'; break;
             case 12: letraDni = 'N'; break;
             case 13: letraDni = 'J'; break;
             case 14: letraDni = 'Z'; break;
             case 15: letraDni = 'S'; break;
             case 16: letraDni = 'Q'; break;
             case 17: letraDni = 'V'; break;
             case 18: letraDni = 'H'; break;
             case 19: letraDni = 'L'; break;
             case 20: letraDni = 'C'; break;
             case 21: letraDni = 'K'; break;
             case 22: letraDni = 'E'; break;
             
         }

         System.out.println(" Tu Dni con letra es: " + dni + letraDni + "." );

    }
    
}