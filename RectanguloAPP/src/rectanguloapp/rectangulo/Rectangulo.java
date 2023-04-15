/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes. 


 */
package rectanguloapp.rectangulo;

import java.util.Scanner;

public class Rectangulo {

    private int base;
    private int altura;
    public Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * Metodo solicita al usuario ingresar base y altura
     */
    public void Crear() {
        System.out.println("Ingresa la base del rectangulo:");
        base = Leer.nextInt();
        System.out.println("Ingresa la altura del rectangulo:");
        altura = Leer.nextInt();
    }

    /**
     * Metodo calcula la superficie
     *
     * @return int
     */
    public int Superficie() {

        return base * altura;

    }

    /**
     * Metodo calcula el perimetro
     *
     * @return int
     */
    public int Perimetro() {

        return base + altura * 2;
    }

    /**
     * Metodo dibula el rectangulo con los datos ingresados por el usuario. base
     * y altura.
     */
    public void DibujoRectangulo() {

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < base; j++) {

                if (j == 0 || j == base - 1 || i == 0 || i == altura - 1) {

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }

    }

}
