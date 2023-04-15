package servicio;

import java.util.ArrayList;
import java.util.Collections;

public class arregloService {

    /**
     * Metodo rellena la lista con 50 numeros aleatorios
     *
     * @param a dato de tipo ArrayList
     */
    public static void inicializarA(ArrayList a) {

        for (int i = 0; i < 50; i++) {

            a.add(Math.random() * 100);

        }

    }

    /**
     * Metodo imprime la lista con los numeros aleatorios
     *
     * @param a dato de tipo ArrayList
     */
    public static void mostrarArray(ArrayList a) {

        for (Object object : a) {
            System.out.print(object + " | ");
        }

    }

    /**
     * Metodo ordena la lista de menor a mayor.
     *
     * @param a dato de tipo ArrayList
     */
    public static void ordenarArray(ArrayList a) {

        Collections.sort(a);

    }

    /**
     * Metodo obtiene los 10 primeros numeros de la lista "a" y los ubica en la
     * "b" para luego rellenar 10 + con 0.5
     *
     * @param b dato de tipo ArrayList
     * @param a dato de tipo ArrayList
     */
    public static void inicializarB(ArrayList b, ArrayList a) {

        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                b.add(a.get(i));
            } else {
                b.add(0.5);
            }

        }

    }

}
