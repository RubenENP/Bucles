package Bucles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el ejercicio: ");
        int ejercicio = sc.nextInt();

        switch (ejercicio){
            case 1:
                System.out.print("Introduce un numero: ");
                int factorial = sc.nextInt();
                int resultadoFactorial = 1;

                while ( factorial>=1) {
                    resultadoFactorial=factorial * (factorial-1);
                    factorial--;
                }

                System.out.println("El resultado factorial es: " +resultadoFactorial);

                break;
            case 2:

                break;
            case 3:

                break;
            case 4:

                break;
            case 5:

                break;
            case 6:

                break;
            case 7:

                break;
            case 8:

                break;
            case 9:

                break;
            case 10:

                break;
            case 11:

                break;
            case 12:

                break;
            case 13:

                break;
            case 14:

                break;
            case 15:

                break;
            case 16:

                break;
            case 17:

                break;
            case 18:

                break;
            case 19:

                break;
            case 20:

                break;
        }
    }

}
