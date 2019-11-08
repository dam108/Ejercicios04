package ejercicios04;
import java.util.Scanner;
public class Ejercicio0410 {
    public static void main(String[] args) {
        int dia1, mes1, year1, dia2, mes2, year2, diasMes, totalDias = 0;
        boolean bisiesto = false;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("introduce el dia de la primera fecha: ");
        dia1 = teclado.nextInt();
        System.out.println("introduce el mes de la primera fecha: ");
        mes1 = teclado.nextInt();
        System.out.println("introduce el año de la primera fecha: ");
        year1 = teclado.nextInt();
        
        System.out.println("introduce el dia de la segunda fecha: ");
        dia2 = teclado.nextInt();
        System.out.println("introduce el mes de la segunda fecha: ");
        mes2 = teclado.nextInt();
        System.out.println("introduce el año de la segunda fecha: ");
        year2 = teclado.nextInt();
        
        
        // calculo los dias que tene cada mes
        if (mes1 == 1 || mes1 == 3 || mes1 == 5 || mes1 == 7 || mes1 == 8 || mes1 == 10 || mes1 == 12 ){
            diasMes = 31;
        }
        else {
            if (mes1 == 4 || mes1 == 6 || mes1 == 9 || mes1 == 11 ){
                diasMes = 30;
            }
            else{
                if (mes1 == 2 && ( year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400 == 0 )){
                    bisiesto = true;
                    diasMes = 29;
                }
                else {
                    diasMes = 28;
                }
            }
        }
        // calculamos los dias hasta que acabe el mes 
        if (mes1 != mes2){
            totalDias = diasMes - dia1;
            // por cada mes a partir de el mes siguiente al que estamos calculamos cuantos dias tiene y lo anotamos en el acumulador
            for (int i = mes1 + 1 ; i < mes2; i++){
                switch(i){
                    case 2:
                        if (mes1 == 2 && ( year1 % 4 == 0 && year1 % 100 != 0 || year1 % 400 == 0 )){
                        diasMes = 29;
                        }
                        else {
                            diasMes = 28;
                        }; break;
                    case 3:
                    case 5: 
                    case 7:
                    case 8:
                    case 10:
                    case 12: diasMes = 31; break;
                    case 4:
                    case 6:
                    case 9:
                    case 11: diasMes = 30; break;
                    default: diasMes = 0; break;
                }
                totalDias += diasMes;
                System.out.println(totalDias);

            }
            totalDias += dia2;
        }
        else {
            totalDias = dia2 - dia1;
            System.out.println( "else" +totalDias);
        }
        
    System.out.println("Dias entre fechas: "+totalDias);
    
       
    }
}