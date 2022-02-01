package Ej07;

import java.util.Locale;
import java.util.Scanner;

public class Persona {

    //ATRIBUTOS
    private String nombre;
    private int edad;
    private char sexo; //'H' hombre, 'M' mujer, 'O' otro)
    private double peso;
    private double altura; //debe ser maor a 0

    //CONSTRUCTORES, SETTER Y GETTER
    public Persona() {
    }

    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo; //el metodo se encarga de que se ingresen los datos con sus tipos correspondientes.
        this.peso = peso;
        this.altura = altura;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //METODOS
    /*el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje*/
    public void crearPersona() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese nombre: ");
        nombre = entrada.next();
        System.out.println("Ingrese edad: ");
        edad = entrada.nextInt();
        System.out.println("Ingrese peso: ");
        peso = entrada.nextDouble();
        System.out.println("Ingrese altura: ");
        altura = entrada.nextDouble();

        System.out.println("Ingrese sexo: (H/M/O) ");
        do {
            sexo = entrada.next().toUpperCase().charAt(0); //(char)System.in.read() probar despues
            if (!(sexo == 'H' || sexo == 'F' || sexo == 'O')) {
                System.out.println("El caracter ingresado es inválido.");
                System.out.println("Ingrese sexo nuevamente: ");
            }
        } while (!(sexo == 'H' || sexo == 'F' || sexo == 'O'));
    }

/*Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.*/
public int calcularImc(){
    double imc=(peso/Math.pow(altura,2));
    if (imc<20) {
        return -1;
    }else if (imc>=20 && imc <=25){
        return 0;
    }else{
        return 1;
    }
}

/*• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.*/
 
public boolean esMayorDeEdad(){
    return edad>=18;
}


}
