/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera). 
Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el 
paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la acción de servir 
la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. 
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package servicio;

import entidad.Cafetera;
import java.util.Scanner;

public class CafeteraServicio {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo llena la cafetera con la capacidad maxima.
     *
     * @param m tipo Objeto Cafetera
     */
    public void llenarCafetera(Cafetera m) {

        System.out.println("Llenar cafetera");
        m.setCantidadActual(m.getCapacidadMaxima());

    }

    /**
     * Metodo Sirve taza con el dato ingresado por el usuario, e informa el
     * resto que queda en la cafetera.
     *
     * @param m tipo Objeto Cafetera
     */
    public void servirTaza(Cafetera m) {
        int tam_taza = 0;
        System.out.println("Tamaño de la taza:");
        int tam = Leer.nextInt();

        if (m.getCantidadActual() < tam) {
            System.out.println("no se llego a llenar la taza");
            tam_taza = (tam - m.getCantidadActual());
            System.out.println("la taza se llego a llenar : " + (tam_taza - tam));
            m.setCantidadActual(0);
        } else {
            m.setCantidadActual(m.getCantidadActual() - tam);
            System.out.println("taza llena");
        }
        System.out.println("La cafetera quedo con " + m.getCantidadActual());
    }

    //Método vaciarCafetera(): pone la cantidad de café actual en cero.
    /**
     * Metodo vacia la cafetera.
     *
     * @param m tipo Objeto Cafetera
     */
    public void vaciarCafetera(Cafetera m) {
        m.setCantidadActual(0);
        System.out.println("Se vacio la cafetera");

    }

    /**
     * Metodo agrega cafe a la cafetera. informando el sobrante y la cantidad
     * actual de la misma.
     *
     * @param m tipo Objeto Cafetera
     */
    public void agregarCafe(Cafetera m) {

        System.out.println("Cuanto cafe quieres agregar:");
        int agregar = Leer.nextInt();

        if ((agregar + m.getCantidadActual()) > m.getCapacidadMaxima()) {
            System.out.println("Se lleno la cafetera");
            m.setCantidadActual(m.getCapacidadMaxima());
            System.out.println("Sobro: " + ((agregar + m.getCantidadActual()) - m.getCapacidadMaxima()));
        } else {
            m.setCantidadActual(m.getCantidadActual() + agregar);
            System.out.println("La cantidad actual de la cafetera es: " + m.getCantidadActual());
        }

    }

}
