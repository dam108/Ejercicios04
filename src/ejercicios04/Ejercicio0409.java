package ejercicios04;
import java.util.Scanner;
public class Ejercicio0409 {
    public static void main(String[] args) {
        int dia, mes , year, acumuladorDiaSemana, diasMes = 0, acumuladorDias = 0, totalDias;
        boolean bisiesto = false;
        Scanner teclado = new Scanner(System.in);
        
        // pedir fecha
        // pedir dia de la semana de el 1 de enero de ese año 
        // calcular el dia de la semana de la fecha introducida
        
        System.out.println("intoduce un dia: ");
        dia = teclado.nextInt();
        System.out.println("intoduce un mes: ");
        mes = teclado.nextInt();
        System.out.println("intoduce un año: ");
        year = teclado.nextInt();
        System.out.println("intoduce que dia de la semana era el 1 de enero de este año (utiliza numeros del 1 al 7): ");
        acumuladorDiaSemana = teclado.nextInt();
        
        //calculamos si el años es bisiesto y si es que si ponemos bandera
        if ((year % 4 == 0 && year % 100 !=0) || (year % 4 == 0 && year % 100 == 0 && year % 400 == 0)){
            bisiesto = true;
        }
        // calculamos los dias desde el 1 de enero de ese año hasta la fecha introducida
        for (int i = 1; i < mes; i++){
            switch (i){
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12: diasMes=31; break;
                case 4:
                case 6:
                case 9: 
                case 11: diasMes=30; break;
                case 2: 
                    if (bisiesto){
                        diasMes=29;
                    }
                    else {
                        diasMes=28;
                    }
                    ; break;
            }
            acumuladorDias += diasMes;
        }
        
        totalDias = acumuladorDias + dia;
        
        System.out.println(totalDias);
        // iteramos de uno en uno hasta llegar al total de los dias -1 para que no cuente el mismo dia
        for ( int i = 1; i <= totalDias - 1; i++){
            if (acumuladorDiaSemana < 7){ // si el numero es menor que 7 ( domingo)
                acumuladorDiaSemana++;    // avanza un dia de la semana
                // System.out.println(acumuladorDiaSemana);
            }
            else { // si no resetea el contador en 1
                acumuladorDiaSemana = 1;
            }
        }
        System.out.println("El dia de la semana de la fecha introducida es: "+acumuladorDiaSemana);
    }
}