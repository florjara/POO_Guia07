/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos
capacidadMaxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). Implemente, al
menos, los siguientes métodos: 
• Constructor predeterminado o vacío
• Constructor con la capacidad máxima y la cantidad actual
• Métodos getters y setters.
• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima. 
• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
• Método vaciarCafetera(): pone la cantidad de café actual en cero. 
• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/
package Ej6;

import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Cafetera cafetera = new Cafetera(500,0);

        int opcion;
        do {
            System.out.println("1.Llenar cafetera ");
            System.out.println("2.Vaciar cafetera");
            System.out.println("3.Agregar cafe ");
            System.out.println("4.Servir taza");
            System.out.println("5. Salir");
            System.out.println("Elija un opción: ");
            opcion = entrada.nextInt();
            int aux;
            switch (opcion) {                
                
                case 1:
                    cafetera.llenarCafetera();
                    break;
                case 2:
                    cafetera.vaciarCafetera();
                    break;
                case 3:
                    System.out.println("Ingrese cantidad de cafe que desea agregar:");
                    aux=entrada.nextInt();
                    cafetera.agregarCafe(aux);
                    break;
                case 4:
                    System.out.println("Ingrese tamaño de taza que desea sercir:");
                    aux=entrada.nextInt();
                    cafetera.servirTaza(aux);
                    break;
                case 5:
                    System.out.println("¡Hasta la próxima!");
                    break;
                default:
                    System.out.println("Opción inválida.");
                
            }
            
        } while (opcion != 5);
    }
    
}
