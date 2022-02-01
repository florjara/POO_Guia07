package poo_guia07_ej4;

import java.util.Locale;
import java.util.Scanner;

public class Rectangulo {

    //atributos
    private double base;
    private double altura;

    //constructores
    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    //setter y getter
    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    //metodos
    public void crearRectangulo() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese tamaño de base: ");
        this.base = entrada.nextDouble();
        System.out.println("Ingrese tamaño de altura: ");
        this.altura = entrada.nextDouble();

    }

    public double calcularSuperficie() {
        return base * altura;
    }

    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    public void dibujarRectangulo() {
        //Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura. 
        for (int i = 0; i < (int) altura; i++) {
            for (int j = 0; j < (int) base; j++) {

                if ((i == 0 || j == 0 || i == (int) altura - 1) && !(j == (int) base - 1)) {
                    System.out.print("* ");
                } else if (j == (int) base - 1) {
                    System.out.println("*");
                } else {
                    System.out.print("  ");
                }

            }
        }
    }
}
