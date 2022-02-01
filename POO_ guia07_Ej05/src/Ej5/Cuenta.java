/*  Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los
atributos: numeroCuenta (entero), el DNI del cliente (entero largo), el saldo actual. Las
operaciones asociadas a dicha clase son:
• Constructor por defecto y constructor con DNI, saldo, número de cuenta.
• Agregar los métodos getters y setters correspondientes

• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
• Método consultarDatos(): permitirá mostrar todos los datos de la cuenta*/
package Ej5;

import java.util.Locale;
import java.util.Scanner;

public class Cuenta {

    //atributos
    private int nroCuenta;
    private long dni;
    private double saldoActual;

    //constructores
    public Cuenta() {
    }

    public Cuenta(int nroCuenta, long dni, double saldoActual) {
        this.dni = dni;
        this.nroCuenta = nroCuenta;
        this.saldoActual = saldoActual;
    }

    //setter y getter
    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public long getDni() {
        return dni;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    //metodos
    public void crearCuenta() {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

        System.out.println("Ingrese número de cuenta: ");
        nroCuenta = entrada.nextInt();
        System.out.println("Ingrese número de DNI: ");
        dni = entrada.nextLong();
        System.out.println("Ingrese saldo inicial: ");
        saldoActual = entrada.nextDouble();

    }

    public void consultarSaldo() {
        System.out.printf("Su saldo actual es : %.2f\n", saldoActual);
    }
 
    public void ingresarDinero(double ingreso) { // el método recibe una cantidad de dinero a ingresar y se la sumara a saldo actual.
        saldoActual += ingreso;
        consultarSaldo();
    }

    public void retirarDinero(double retiro) { //el método recibe una cantidad de dinero a retirar y se la restará al saldo actual. 
        //Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el saldo actual en 0.
        if (saldoActual < retiro) {
            System.out.printf("Se ha retirado la totalidad de su saldo: %.2f.\nSu saldo actual es: 0.\n", saldoActual);
            saldoActual = 0;
        } else {
            saldoActual -= retiro;
            System.out.println("El retiro ha sido exitoso");
            consultarSaldo();
        }

    }

    public void extraccionRapida(double retiro) {//le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
        double veintePorciento = (0.2 * saldoActual);
        if (retiro < veintePorciento) {
            saldoActual -= retiro;
            System.out.println("El retiro ha sido exitoso");
            consultarSaldo();
        } else {
            System.out.println("El valor ingresado supera el 20% de su saldo actual.");
            System.out.printf("El máximo retiro que puede hacer es de $ %.2f\n", veintePorciento);

        }

    }

    public void consultarDatos() {
        System.out.println("Número de Cuenta: " + nroCuenta);
        System.out.println("Número de DNI: " + dni);
        consultarSaldo();
    }
}
