package operacionapp.operacion;

import java.util.Scanner;

public class Operacion {

    public Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int numero1;
    private int numero2;
    public int total;

    public Operacion(int n1, int n2) {
        this.numero1 = n1;
        this.numero2 = n2;
    }

    public Operacion() {
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    /**
     * Metodo solicita al usuario 2 numeros
     */
    public void crearOperacion() {

        System.out.println("Ingresa un numero:");
        numero1 = leer.nextInt();

        System.out.println("Ingresa el segundo numero:");
        numero2 = leer.nextInt();
    }

    /**
     * Metodo suma los dos numeros ingresados por el usuario
     */
    public void sumar() {

        total = numero1 + numero2;

        System.out.println("el total de la suma es:" + total);

    }

    /**
     * Metodo resta los numeros ingresados.
     */
    public void restar() {

        total = numero1 - numero2;

        System.out.println("el total de la resta es:" + total);

    }

    /**
     * Metodo multiplica los numeros. sin embargo si algun numero es 0 envia un
     * mensaje de error.
     */
    public void mult() {

        if (numero1 == 0 || numero2 == 0) {

            System.out.println("Error - " + 0);

        } else {
            total = numero1 * numero2;
            System.out.println("EL total de la multiplicacion es: " + total);
        }

    }

    /**
     * Metodo divide los numeros, sin embargo si algun numero es 0 envia un
     * mensaje de error.
     */
    public void div() {

        if (numero1 == 0 || numero2 == 0) {
            System.out.println("Error - " + 0);
        } else {
            double total = numero1 / numero2;
            System.out.println("El total de la division es:" + total);
        }

    }

}
