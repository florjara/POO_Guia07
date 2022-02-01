/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título,
Autor, Número de páginas, y 
un constructor con todos los atributos pasados por
parámetro y un constructor vacío.
Crear un método para cargar un libro pidiendo los
datos al usuario y luego informar mediante otro método el número de ISBN, el título,
el autor del libro y el numero de páginas.
 */
package Guia6;

import java.util.Locale;
import java.util.Scanner;

public class Libro {

    //es mejor declararlo en cada metodo para que no quede como atributo? 
    Scanner entrada = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    //ATRIBUTOS
    private int paginas; // el nombre de este atributo debia ser mas explicativo
    private int isbn;
    private String titulo;
    private String autor;

    //CONSTRUCTORES
    public Libro() {
    }

    public Libro(String titulo, String autor, int paginas, int isbn) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
        this.isbn = isbn;
    }

    // METODOS DE CONSULTA - getter
    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public int getIsbn() {
        return isbn;
    }

    //METODOS MODIFICADORES - setter
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    //METODOS - OPERACIONES
    public void cargarLibro() {
        System.out.println("Ingrese el nombre del autor: ");
        autor = entrada.next();
        System.out.println("Ingrese titulo: ");
        titulo = entrada.next();
        System.out.println("Ingrese cantidad de páginas: ");
        paginas = entrada.nextInt();
        System.out.println("Ingresar ISBN");
        isbn = entrada.nextInt();
    }

    public void mostrarLibro() {
        System.out.println("Autor: " + autor);
        System.out.println("Título: " + titulo);
        System.out.println("Páginas: " + paginas);
        System.out.println("ISBN: " + isbn);
    }
}
