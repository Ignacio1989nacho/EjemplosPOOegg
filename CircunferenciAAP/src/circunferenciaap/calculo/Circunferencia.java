package circunferenciaap.calculo;

//Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
import java.util.Scanner;

//tipo real. A continuación, se deben crear los siguientes métodos:
//a) Método constructor que inicialice el radio pasado como parámetro.
//b) Métodos get y set para el atributo radio de la clase Circunferencia.
//c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (area = pi ∗ radio 2).
//e) Método perimetro(): para calcular el perímetro (perimetro = 2 ∗ pi ∗ radio).
public class Circunferencia {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double radio;

    public Circunferencia(double radio1) {
        this.radio = radio1;
    }

    public Circunferencia() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public void crearCircunferencia() {

        System.out.println("Ingresa el radio:");
        radio = leer.nextDouble();

    }

//      public void crearCircunferencia(double radio1) {
//
//        System.out.println("Ingresa el radio:");
//        radio = leer.nextDouble();
//
//    }
    /**
     * Metodo calcula el area.
     */
    public void area() {

        double area = 3.14 * (radio * radio);

        System.out.println("El area es:" + area);

    }

    /**
     * Metodo calcula el perimetro.
     */
    public void perimetro() {

        double Perimetro = 2 * 3.14 * radio;

        System.out.println("El perimetro es: " + Perimetro);

    }

}
