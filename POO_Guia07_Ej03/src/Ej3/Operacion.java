package Ej3;

import java.util.Locale;
import java.util.Scanner;

public class Operacion {

    private int numero1;
    private int numero2;

    //Constructores
    public Operacion() {
    }

    public Operacion(int num1, int num2) {
        numero1 = num1;
        numero2 = num2;
    }

    //setter y getter
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }


    //Operaciones
    public void crearOperacion() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese numero 1: ");
        this.numero1 = entrada.nextInt();
        System.out.println("Ingrese numero 2: ");
        this.numero2 = entrada.nextInt();
    }

    public int sumar() {
        return numero1 + numero2;
    }

    public int restar() {
        return numero1 - numero2;
    }

    public int multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error en multiplicacion");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }

    public double dividir() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error en division");
            return 0;
        } else {
            return (double) numero1 / (double)numero2;
        }
    }
}
