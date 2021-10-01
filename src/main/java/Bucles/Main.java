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
                String vocal;
                String consonantes;
                String caracterIntroducido;
                do {
                    System.out.print("Introduce un caracter: ");
                    caracterIntroducido = sc.nextLine();
                    if (caracterIntroducido.equals("A") || caracterIntroducido.equals("E") || caracterIntroducido.equals("I") || caracterIntroducido.equals("O") || caracterIntroducido.equals("U") || caracterIntroducido.equals("a") || caracterIntroducido.equals("e") || caracterIntroducido.equals("i") || caracterIntroducido.equals("o") || caracterIntroducido.equals("u")) {
                        System.out.println("Vocal");
                    } else {
                        System.out.println("Consonante");
                    }
                } while (!caracterIntroducido.equals(" "));
                System.out.println("parao");

                break;
            case 6:
                int primerNumero;
                int segundoNumero;
                do {
                    System.out.print("Introduce primer numero: ");
                    primerNumero = sc.nextInt();
                    System.out.print("Introduce ultimo numero: ");
                    segundoNumero = sc.nextInt();
                } while (primerNumero >= segundoNumero);
                for (int i = primerNumero; i <= segundoNumero; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i);
                    }
                }
                System.out.println("parao");

                break;
            case 7:
                System.out.print("Introduce el numero: ");
                int tablaMultiplo = sc.nextInt();
                int numeroMultiplicar = 1;
                for (int i = 1; i <= 10; i++) {
                    int resultadoMultiplo = tablaMultiplo * numeroMultiplicar;
                    System.out.println(tablaMultiplo + " * " + numeroMultiplicar + " = " + resultadoMultiplo);
                    numeroMultiplicar++;
                }

                break;
            case 8:


                /*do {
                    System.out.print("Introduce limite inferior: ");
                    primerNumero = sc.nextInt();
                    System.out.print("Introduce limite superior: ");
                    segundoNumero = sc.nextInt();
                    if (primerNumero > segundoNumero){
                        System.out.println("Introduce un limite correcto.");
                    }
                } while (primerNumero >= segundoNumero);*/
                int numerosDentroRango = 0;

                do {
                    System.out.print("Introduce limite inferior: ");
                    primerNumero = sc.nextInt();
                    System.out.print("Introduce limite superior: ");
                    segundoNumero = sc.nextInt();

                    if (primerNumero < segundoNumero) {
                        int numeroIntroducidoRango = sc.nextInt();
                        while (numeroIntroducidoRango != 0) {
                            System.out.print("Introduce un numero: ");
                            numeroIntroducidoRango = sc.nextInt();

                            if (numeroIntroducidoRango > primerNumero && numeroIntroducidoRango < segundoNumero) {
                                numerosDentroRango++;
                            }
                        }

                        System.out.println("Numeros dentro del rango: " + numerosDentroRango);
                    }

                } while (primerNumero >= segundoNumero);


                break;
            case 9:

                /*Escribe un programa que dados dos números, uno real (base) y un entero positivo
(exponente), saque por pantalla el resultado de la potencia. No se puede utilizar el operador
de potencia.
*/


                break;
            case 10:

                break;
            case 11:

                System.out.print("Introduce un numero para comprobar si es primo: ");
                int numeroPrimo = sc.nextInt();
                int div = 0;
                if (numeroPrimo == 2) {
                    System.out.println("es primo");
                } else {
                    for (int i = numeroPrimo; i > 2; i--) {
                        div = numeroPrimo % (i - 1);
                    }
                    if (div == 0) {

                        System.out.println("El numero no es primo.");
                    } else {
                        System.out.println("El numero es primo.");
                    }
                }


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
