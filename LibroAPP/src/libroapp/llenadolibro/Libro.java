/*

 */
package libroapp.llenadolibro;

import java.util.Scanner;

public class Libro {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public int ISBN;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int numeroPaginas) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Metodo imprime en consola los datos del libro.
     */
    public void datosLibroImprimir() {

        System.out.println("El autor es: " + autor
                + "\n" + "El ISBN es: " + ISBN
                + "\n" + "El titulo es: " + titulo
                + "\n" + "la cantidad de laginas son: " + numeroPaginas);

    }

    /**
     * Metodo solicita al usuario ingresar los datos del libro.
     *
     */
    public void datosLibroIngreso() {

        System.out.println("---------------------");
        System.out.println("Ingresa numero de ISBN:");

        ISBN = leer.nextInt();

        System.out.println("---------------------");
        System.out.println("Ingresa el Titulo:");

        titulo = leer.next();

        System.out.println("---------------------");
        System.out.println("Ingresa el autor:");

        autor = leer.next();

        System.out.println("---------------------");
        System.out.println("Ingresa el numero de paginas:");

        numeroPaginas = leer.nextInt();

        System.out.println("---------------------");

    }
}
