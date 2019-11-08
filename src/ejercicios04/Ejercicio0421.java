package ejercicios04;
import java.util.Scanner;
public class Ejercicio0421 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // leer 30 numeros 
        // cada uno de esos numeros esta entre 0 y 1000
        // guardar el 1 el 2 y el 3
        // guardar el ultimo , penultimo y el antepenultimo
        // si la suma de los 30 numeros es par mostrar 123
        // si la suma es impar mostrar los 3 ultimos
        int num, contadorNum = 1, acumulador = 0, pos1 =0, pos2 = 0, pos3 = 0, pos30 = 0, pos29 = 0, pos28 = 0;
        
        
        do{
            System.out.println("Introduce un numero: ");
            num = teclado.nextInt();
            
            if (num >=0 && num <= 1000){
                
                switch(contadorNum){
                    case 1: pos1 = num; break;
                    case 2: pos2 = num; break;
                    case 3: pos3 = num; break;
                    case 28: pos28 = num; break;
                    case 29: pos29 = num; break;
                    case 30: pos30 = num; break;
                }

                acumulador+= num;
                contadorNum++; 
            }
            else {
                
                System.out.println("Este numero no vale tiene que ser entre 0 y 1000: ");
            }
            
        }while (contadorNum <= 30);
        
        if(acumulador % 2 == 0 ){
            System.out.println("Los tres primeros numeros son: " +pos1+ ", "+pos2+ ", "+pos3+"." );
        }else System.out.println("Los tres ultimos numeros son: " +pos28+ ", "+pos29+ ", "+pos30+"." );
    }
}