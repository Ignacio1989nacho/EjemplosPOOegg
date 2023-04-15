/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos capacidadMáxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la cantidad actual de café que hay en la cafetera).
Agregar constructor vacío y con parámetros así como setters y getters. Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño de la taza y simula la 
acción de servir la taza con la capacidad indicada. Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe y se añade a la cafetera la cantidad de café indicada.

 */
package javaapplication47;

import entidad.Cafetera;
import java.util.Scanner;
import servicio.CafeteraServicio;

public class JavaApplication47 {

    public static void main(String[] args) {

        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        CafeteraServicio c = new CafeteraServicio();
        Cafetera caf = new Cafetera(1000, 0);
        int op;
        boolean menu = true;
        do {
            System.out.println("1 - LLENAR CAFETERA:\n2 - SERVIR TAZA:\n3 - VACIAR CAFETERA:\n4 - AGREGAR CAFE\n5 - SALIR ");
            op = Leer.nextInt();
            switch (op) {
                case 1:
                    c.llenarCafetera(caf);
                    break;
                case 2:
                    c.servirTaza(caf);
                    break;
                case 3:
                    c.vaciarCafetera(caf);
                    break;
                case 4:
                    c.agregarCafe(caf);
                    break;
                case 5:
                    menu = false;
                    break;
                default:
                    System.out.println("OPCION INCORRECTA! ingresa una opcion valida");
                    
            }
        } while (menu);

    }

}
