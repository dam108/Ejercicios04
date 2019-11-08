package ejercicios04;
import java.util.Scanner;
public class Ejercicio0405 {
    public static void main(String[] args) {
        // crear un menu donde en a) nos pida el radio y calcule el area de un cirulo
        // donde en b) nos pida un lado y calcule el area de un cuadrado
        // donde en c) nos pida la base y la altura y nos calcule el area de un triangulo 
        // donde d) salga del programa
        int opcion;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.println("Opcion 1 : Calcular el area de un circulo");
            System.out.println("Opcion 2 : Calcular el area de un cuadrado");
            System.out.println("Opcion 3 : Calcular el area de un triangulo");
            System.out.println("Opcion 4 : salir del programa");
            opcion = teclado.nextInt();  
            
            switch (opcion) {
                case 1:
                    System.out.println("Introduce el radio del circulo");
                    double radio = teclado.nextInt();
                    double areaCirculo = Math.PI * (radio * radio );
                    System.out.println("El area del circulo es " + areaCirculo);
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Introduce el lado del cuadrado");
                    double lado = teclado.nextInt();
                    double areaCuadrado = lado * lado ;
                    System.out.println("El area del cuadrado es " + areaCuadrado);
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Introduce la base del triangulo");
                    double base = teclado.nextInt();
                    System.out.println("Introduce la altura del triangulo");
                    double altura = teclado.nextInt();
                    double areaTriangulo = ( base * altura )/2 ;
                    System.out.println("El area del triangulo es " + areaTriangulo);
                    System.out.println("\n");
                    break;
            }
        } while (opcion !=4 );
    }
}