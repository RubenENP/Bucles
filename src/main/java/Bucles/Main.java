package Bucles;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el ejercicio: ");
        int ejercicio = sc.nextInt();
        sc.nextLine();

        switch (ejercicio) {
            case 1:
                System.out.print("Introduce un numero: ");
                int factorial = sc.nextInt();
                double resultadoFactorial = factorial;

                for (int i = factorial - 1; i > 1; i--) {
                    resultadoFactorial = resultadoFactorial * i;
                }
                System.out.println("El resultado factorial es: " + resultadoFactorial);
                break;
            case 2:

                Random r = new Random();
                double numeroAleatorio = r.nextInt(99) + 1;
                int intentos = 10;
                int numeroIntroducido = 0;
                while (intentos >= 1 && (numeroIntroducido != numeroAleatorio)) {
                    System.out.print("Introduce un numero: ");
                    numeroIntroducido = sc.nextInt();
                    if (numeroIntroducido > numeroAleatorio) {
                        System.out.println("El numero introducido es mayor que el numero generado");
                    } else if (numeroIntroducido < numeroAleatorio) {
                        System.out.println("El numero introducido es menor que el numero generado");
                    } else if (numeroIntroducido == numeroAleatorio) {
                        System.out.println("Ganaste!! el numero es " + numeroIntroducido);
                    }
                    intentos--;
                }
                if (intentos <= 1) {
                    System.out.println("Te quedaste sin intentos tonto, el numero era: " + (int) numeroAleatorio);
                }

                break;
            case 3:
                /*Algoritmo que pida números hasta que se introduzca un cero. Debe imprimir la suma y la
                media de todos los números introducidos.*/

                double numeroIntroducidoMedia;
                double dividendoMedia = 0;
                int cantidadMedia = 0;
                do {
                    System.out.print("Dame un numero: ");
                    numeroIntroducidoMedia = sc.nextDouble();
                    dividendoMedia = dividendoMedia + numeroIntroducidoMedia;
                    cantidadMedia++;

                } while (numeroIntroducidoMedia != 0);

                System.out.println("La media es: " + (dividendoMedia / (cantidadMedia - 1)));

                break;
            case 4:
//Realizar un algoritmo que pida números (se pedirá por teclado la cantidad de números a
//introducir). El programa debe informar de cuantos números introducidos son mayores que 0,
//menores que 0 e iguales a 0.
                int numerosMayores0 = 0;
                int numerosMenores0 = 0;
                int numerosIguales0 = 0;
                System.out.print("Cantidad de numeros a introducir: ");
                int cantidadNumeros = sc.nextInt();

                for (int i = 0; i < cantidadNumeros; i++) {
                    System.out.print("Introduce un numero: ");
                    int numeroIntroducido0 = sc.nextInt();

                    if (numeroIntroducido0 == 0) {
                        numerosIguales0++;
                    } else if (numeroIntroducido0 > 0) {
                        numerosMayores0++;
                    } else {
                        numerosMenores0++;
                    }
                }
                System.out.println("La cantidad de numeros iguales a cero son: " + numerosIguales0);
                System.out.println("La cantidad de numeros mayores que cero son: " + numerosMayores0);
                System.out.println("La cantidad de numeros menores que cero son: " + numerosMenores0);

                break;
            case 5:
//Algoritmo que pida caracteres e imprima ‘VOCAL’ si son vocales y ‘NO VOCAL’ en caso
//contrario, el programa termina cuando se introduce un espacio.

                String vocal;
                String consonantes;
                String caracterIntroducido;

                do {
                    System.out.print("Introduce un caracter: ");
                    caracterIntroducido = sc.nextLine();

                    if (caracterIntroducido.equals("A") || caracterIntroducido.equals("E") || caracterIntroducido.equals("I") || caracterIntroducido.equals("O") || caracterIntroducido.equals("U")) {
                        System.out.println("Vocal");
                    } else {
                        System.out.println("Consonante");
                    }

                    System.out.println("ok");
                } while (!caracterIntroducido.equals(" "));

                System.out.println("parao");

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
