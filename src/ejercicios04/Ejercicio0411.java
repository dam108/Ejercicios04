package ejercicios04;
import java.util.Scanner;
public class Ejercicio0411 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char sexo, sexoMostrar = 'H';
        int intentos = 0, edad, elderCount = 0, youngest = 100, mujeresCount = 0,totalEdadMujeres = 0;
        double mediaEdadMujeres;
        boolean elder = false ;
        // introducir sexo ('H','M') y edad de los 30 trabajadores de una fabrica
        // edades entre 16 y 70
        // mostrar la edad y el sexo del mas joven
        // mostrar media edad de las mujeres
        // informar si hay alguno con mas de 60 años
        // 0 para salir
        
        do {
            System.out.println("Intoduce el sexo del trabajador ('H','M'): ");
            sexo = teclado.next().charAt(0);
            System.out.println("Intoduce la edad del trabajador (16 ~ 70): ");
            edad = teclado.nextInt();
            
            while (edad > 0 && edad < 16 || edad > 70){
                System.out.println("Introduce una edad correcta.");
                System.out.println("Intoduce la edad del trabajador (16 ~ 70): ");
                edad = teclado.nextInt();
            }
           /* 
           System.out.println(sexo);
           System.out.println(edad);
           System.out.println(intentos);
           */ 
           if (edad != 0){
               if (sexo == 'M' || sexo == 'm'){
                    mujeresCount++;
                    totalEdadMujeres += edad;
                }
               
               if (edad < youngest ){
                    sexoMostrar = sexo;
                    youngest = edad;
                }
               
               if (edad >= 60 ) {
                    elderCount ++; 
                    elder = true;
                }
               
           }

            intentos++;
            // System.out.println(intentos);
        } while (intentos < 30 && edad != 0 );
        
        if (elder){
           System.out.println("Trabajadores mayores de 60 años: "+elderCount ); 
        }
        
        mediaEdadMujeres = (double) totalEdadMujeres / (double) mujeresCount;
        if (mediaEdadMujeres >= 1){
            System.out.println("la edad media de las mujeres es de. "+mediaEdadMujeres ); 
        }
        if (youngest >= 1){
           System.out.println("La persona mas joven tiene sexo " +sexoMostrar+ " y " +youngest+ " años."); 
        }
        
    }
}