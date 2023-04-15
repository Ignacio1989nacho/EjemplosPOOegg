/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package movil;
//marca, precio, modelo, memoriaRam, almacenamiento y codigo

import java.util.Scanner;

public class Movil {

    private String marca;
    private double precio;
    private String modelo;
    private int memoriaRam;
    private double almacenamiento;
    private int codigo;

    private static Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public Movil() {
    }

    public Movil(String marca, double precio, String modelo, int memoriaRam, double almacenamiento, int codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;

    }

    public String getMarca() {

        return marca;
    }

    public void setMarca() {

        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio() {

        this.precio = precio;
    }

    public String getModelo() {

        return modelo;
    }

    public void setModelo() {

        this.modelo = modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", almacenamiento=" + almacenamiento + ", codigo=" + codigo + '}';
    }


    
    
    /**
     * Metodo devuelve el objeto movil, ingresando los datos de sus atributos.
     *
     */
    public Movil Celular() {

        Movil Celular = new Movil();
        System.out.println("Ingresa la marca del celular:");
        marca = Leer.next();

        System.out.println("Ingresa el precio del celular:");
        precio = Leer.nextDouble();

        System.out.println("Ingresa el modelo del celular:");
        modelo = Leer.next();

        System.out.println("Ingresa la memoria ram del celular:");
        memoriaRam = Leer.nextInt();

        System.out.println("Ingresa el almacenamiento del celular:");
        almacenamiento = Leer.nextDouble();

        System.out.println("Ingresa el codigo del celular:");
        codigo = Leer.nextInt();

        return Celular;

    }
    


}
