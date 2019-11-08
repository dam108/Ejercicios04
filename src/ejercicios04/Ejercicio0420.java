package ejercicios04;
import java.util.Scanner;
public class Ejercicio0420 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x1, x2, y1, y2, area, lado, base, altura;
        
        System.out.println("Introduce la cordenada x1: ");
        x1= teclado.nextInt();
        System.out.println("Introduce la cordenada y1: ");
        y1= teclado.nextInt();
        System.out.println("Introduce la cordenada x2: ");
        x2= teclado.nextInt();
        System.out.println("Introduce la cordenada y2: ");
        y2= teclado.nextInt();
        
        if (x1 == y1 && x2 == y2){
            System.out.println("la figura que forman las cordenadas es un cuadrado");
            lado = x2 - x1;
            area = lado * lado;
            if ( area < 0){
                area = area * -1;
            }
            System.out.println("El area es "+ area);
        }else {
            System.out.println("la figura que forman las cordenadas es un resctangulo");
            base = x2 - x1;
            altura = y2 - y1;
            area = base * altura;
            if ( area < 0){
                area = area * -1;
            }
            System.out.println("El area es "+ area);
        }
    
    }
    
}