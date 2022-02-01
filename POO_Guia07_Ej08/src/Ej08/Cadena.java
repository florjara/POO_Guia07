/*
8. Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud.



• 
• Método compararLongitud(String frase), deberá comparar la longitud de la frase
que compone la clase con otra nueva frase ingresada por el usuario.
• Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
• Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y
mostrar la frase resultante.
• Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Ej08;

public class Cadena {

    //atributos
    private String frase;
    private int longitud;

    //constructores
    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public Cadena() {
    }

    //setter y getter
    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //metodos
    public int mostrarVocales() { // deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
        int cantVocales = 0;
        for (int i = 0; i < longitud; i++) {
            char ch = frase.toUpperCase().charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                cantVocales++;
            }
        }
        return cantVocales;
    }

    public void invertirFrase() {
        String inversa = "";
        for (int i = this.longitud - 1; i >= 0; i--) { //con el for invertido recorro la cadena del final hacia el comienzo
            inversa = inversa.concat(frase.substring(i, i + 1));
        }
        System.out.println("La frase invertida es: " + inversa);
    }

    /*Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.*/
    public void vecesRepetido(String letra){
    int cantVeces=0;
        for (int i = 0; i < longitud; i++) {
        int Strig;
        /*indexOf(String str)
        Retorna el índice de la primera ocurrencia de la cadena del parámetro*/
       // int indexOf = frase.indexOf(letra);
            
        }
}
}
