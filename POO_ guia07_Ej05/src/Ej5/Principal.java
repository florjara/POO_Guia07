package Ej5;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cuenta cuenta = new Cuenta();
        cuenta.crearCuenta();
        int opcion;
        do {
            System.out.println("1. Ingrese dinero");
            System.out.println("2. Retire dinero");
            System.out.println("3. Extracción rápida");
            System.out.println("4. Consultar saldo actual");
            System.out.println("5. Consultar datos");
            System.out.println("6. Salir");
            System.out.println("Elija un opción: ");
            opcion = entrada.nextInt();

            switch (opcion) { // el ambiente del switch incluye a todos loa case, no por cada uno. Las variables deben declararse 1 vez

                case 1:
                    System.out.println("Cuánto dinero desea ingresar: ");
                    double entradaDouble = entrada.nextDouble();
                    cuenta.ingresarDinero(entradaDouble);
                    break;
                case 2:
                    System.out.println("Cuánto dinero desea retirar: ");
                    entradaDouble = entrada.nextDouble();
                    cuenta.retirarDinero(entradaDouble);
                    break;
                case 3:
                    System.out.println("Cuánto dinero desea retirar: ");
                    entradaDouble = entrada.nextDouble();
                    cuenta.extraccionRapida(entradaDouble);
                    break;
                case 4:
                    cuenta.consultarSaldo();
                    break;
                case 5:
                    cuenta.consultarDatos();
                    break;
                case 6:
                    System.out.println("¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción inválida.");

            }

        } while (opcion != 6);
    }

}
