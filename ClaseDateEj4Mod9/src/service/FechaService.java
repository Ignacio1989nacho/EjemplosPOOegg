/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios, 
que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. Luego los pase por parámetro a 
un nuevo objeto Date. El método debe retornar el objeto Date. Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual. Para esto usaremos el constructor vacío de la clase 
Date.
Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra 
(edad del usuario).

 */
package service;

import java.util.Date;
import java.util.Scanner;

public class FechaService {

    public Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo retorna objeto de tipo date con fecha ingresada por el usuario.
     *
     * @return Date.
     */
    public Date fechaNacimiento() {

        System.out.println("Año de nacimiento:");
        int anio = Leer.nextInt();

        System.out.println("Mes de nacimiento:");
        int mes = Leer.nextInt();

        System.out.println("Dia de nacimiento:");
        int dia = Leer.nextInt();

        return new Date(anio - 1900, mes - 1, dia);

    }

    /**
     * Metodo retorna objeto tipo date, con fecha actual.
     *
     * @return Date
     */
    public Date fechaActual() {

        return new Date();

    }

    /**
     * 
     *
     * @param actual tipo DATE.
     * @param usuario tipo DAte del usuario.
     * @return retorna un int con la edad.
     */
    public int edadUsuario(Date actual, Date usuario) {
        if (actual.getMonth() < usuario.getMonth()) {
            return (actual.getYear() - usuario.getYear() - 1);
        } else {
            return (actual.getYear() - usuario.getYear());
        }

    }

}
