/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase FechaService, en paquete Servicios,
que tenga los siguientes métodos:
Método fechaNacimiento que pregunte al usuario día, mes y año de su nacimiento. 
Luego los pase por parámetro a un nuevo objeto Date. El método debe retornar el objeto Date. 
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Método fechaActual que cree un objeto fecha con el día actual.
Para esto usaremos el constructor vacío de la clase Date. Ejemplo: Date fechaActual = new  Date();
El método debe retornar el objeto Date.
Método diferencia que reciba las dos fechas por parámetro y retorna la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date

 */
package fechaservice;

import java.util.Date;
import java.util.Scanner;

public class FechaServis {

    /**
     * Metodo solicita al usuario sus datos
     *
     * @return Objeto de tipo DATE con datos del usuario.
     */
    public static Date fechaNacimiento() {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa tu año de nacimiento:");
        int anio = Leer.nextInt();
        System.out.println("Ingresa tu mes de nacimiento:");
        int mes = Leer.nextInt();
        System.out.println("Ingresa tu dia de nacimiento:");
        int dia = Leer.nextInt();

        return new Date(anio - 1900, mes - 1, dia);

    }

    /**
     * @return objeto de tipo DATE con fecha actual
     */
    public static Date fechaActual() {

        return new Date();

    }

    /**
     * Metodo calcula la edad del usuario
     * @param fechaNacimiento tipo DATE del usuario
     * @param fechaActual tipo DATE fecha actual
     * @return int
     */
    public static int edadUsuario(Date fechaNacimiento, Date fechaActual) {

        if (fechaActual.getMonth() < fechaNacimiento.getMonth()) {
            return (fechaActual.getYear() - fechaNacimiento.getYear() - 1);

        } else if (fechaActual.getMonth() > fechaNacimiento.getMonth()) {
            return (fechaActual.getYear() - fechaNacimiento.getYear());
        } else if (fechaActual.getDay() > fechaNacimiento.getDay()) {
            return (fechaActual.getYear() - fechaNacimiento.getYear());
        } else if (fechaActual.getDay() < fechaNacimiento.getDay()) {
            return (fechaActual.getYear() - fechaNacimiento.getYear() - 1);
        } else if (fechaActual.getHours() > fechaNacimiento.getHours()) {
            return (fechaActual.getYear() - fechaNacimiento.getYear());
        }
        return (fechaActual.getYear() - fechaNacimiento.getYear() - 1);

    }
}
