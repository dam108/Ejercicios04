package ejercicios04;
import java.util.Scanner;
public class Ejercicio0419 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int x, y, area;
        
        System.out.println("Introduce la cordenada x: ");
        x = teclado.nextInt();        
        System.out.println("Introduce la cordenada y: ");
        y = teclado.nextInt();
        
        if ( x <0  ){
            x = x * -1;
        }
        if (y < 0){
            y = y * -1;
        }
        
        area = x * y;
        
        System.out.println("El area del rectangulo es "+area);
        
    }
    
}