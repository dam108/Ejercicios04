package ejercicios04;
import java.util.Scanner;
public class Ejercicio0415 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int n1, n2, menor, mayor, acumulador = 0, contador = 0, producto=1;
        double media;
        
        System.out.println("Introduce un numero: ");
        n1 = teclado.nextInt();
        System.out.println("Introduce otro numero: ");
        n2 = teclado.nextInt();
        
        if (n1 > n2 ){
            menor = n2;
            mayor = n1;
        }
        else {
            menor = n1;
            mayor = n2;
        }
        
        
        for ( int i = menor + 1; i < mayor ; i++){
            
            // System.out.println(i);
            acumulador += i;
            producto *=i;
            contador++;    
        }
        
        media = (double) acumulador /(double) contador;
        
        
        
        System.out.println("la suma es: " +acumulador);
        
        System.out.println("la media es: "+media);
        
        System.out.println("el producto es: "+producto);

    
    }
    
}