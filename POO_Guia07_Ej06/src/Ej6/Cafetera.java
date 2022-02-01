package Ej6;

public class Cafetera {
//    ATRIBUTOS

    private int capacidadMaxima;
    private int cantidadActual;

//    CONSTRUCTORES
    public Cafetera() {
    }

    public Cafetera(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

//    SETTER Y GETTER
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }

//    METODOS atrib.: capacidad maxima y cantidad actual
    public void llenarCafetera() {//hace que la cantidad actual sea igual a la capacidad máxima.
        cantidadActual = capacidadMaxima;
        mostrarCantActual();
    }

    public void vaciarCafetera() {//pone la cantidad de café actual en cero.
        cantidadActual = 0;
        mostrarCantActual();
    }

    public void servirTaza(int tamañoTaza) { // llena la taza o la carga con el cafe actual que haya.

        if (cantidadActual < tamañoTaza) {
            System.out.println("No hay sufiente cafe para llenar la taza.");
            System.out.printf("Se sirvieron %d ml.", cantidadActual);
            vaciarCafetera();
        } else {
            System.out.println("La taza se ha llenado.");
            cantidadActual -= tamañoTaza;
        }
        mostrarCantActual();
    }

    public void agregarCafe(int cantCafe) {//se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.
        if (cantidadActual + cantCafe < capacidadMaxima) {
            cantidadActual += cantCafe;
        } else {
            cantidadActual = capacidadMaxima;
        }
        mostrarCantActual();
    }

    public void mostrarCantActual() {
        System.out.println("La cantidad actual de la cafetera es de " + cantidadActual + "ml.");
    }
}
