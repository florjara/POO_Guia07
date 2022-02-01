package Ej2;

import java.util.Locale;
import java.util.Scanner;

public class Circunferencia {

    //ATRIBUTOS
    private double radio;

    //CONSTRUCTORES
    public Circunferencia() {
    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    // GETTER y SETTER
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //METODOS OPERACIONES
    // Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    public void crearCircunferencia() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese el radio: ");
        this.radio = entrada.nextDouble();
    }

    // Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio)
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

}
