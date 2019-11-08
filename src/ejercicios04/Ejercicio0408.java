package ejercicios04;
import java.util.Scanner;
public class Ejercicio0408 {
    public static void main(String[] args) {
        int dia, mes ,year, diasMes = 0, totalDias;
        boolean bisiesto = false;
        int acumuladorDias = 0;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el dia: ");
        dia = teclado.nextInt();
        System.out.println("Introduce el mes: ");
        mes = teclado.nextInt();
        System.out.println("Introduce el año: ");
        year = teclado.nextInt();
        
        if (( year % 4 == 0 && year % 100 != 0 ) || ( year % 4 == 0 && year % 100 == 0 && year % 400 == 0)) {
            bisiesto = true;
        }
        
        for (int i = 1 ; i < mes ; i++){
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
        System.out.println("Han pasado "+totalDias+" desde el 1/1/"+year+" hasta "+dia+"/"+mes+"/"+year);
    }
}
