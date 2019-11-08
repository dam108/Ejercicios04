package ejercicios04;
// import java.util.Scanner;
public class Ejercicio0403 {
    public static void main(String[] args) {
        // mostrar los numeros primos entre 2 y 1000
        // hacer los bucles con un numero minimo de iteraciones
        System.out.println(1+" Es un numero primo");
        System.out.println(2+" Es un numero primo");
        for (int i=3 ; i <= 100; i+=2){ // bucle de numeros impares desde el 3 al 1000 
            boolean primo = true; // inicializamos la variable primo como verdadera
            int contador = 2; // incializamos un contador en 2
            while( primo && contador < i){ // mientras primo sea verdadero y el contador no pase de el numero en el que estamos en cada momento
               if ( i % contador == 0){ // comprobamos si el el numero entre el contador nos da resto 0
                    primo = false; // en este caso no es un numero primo
                }
                else {
                   contador++; // en caso de que el resto no sea cero aumentamos el contador en uno 
                }
            } // el bucle while se repite hasta comprobar todos los restos de cada numero
            if (primo){
                System.out.println(i + " Es un numero primo"); // y si es primo imprimimos el numero en pantalla
            }
        }
    } // fin main
} // fin class
