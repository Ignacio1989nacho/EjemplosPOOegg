package servicio;

import entidad.Persona;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*

Implemente la clase Persona en el paquete entidades. Una persona tiene un nombre y una fecha de nacimiento 
(Tipo Date),
constructor vacío, constructor parametrizado, get y set. Crear una clase PersonaService, 
en el paquete servicio, con los 
siguientes métodos:
Método crearPersona que pida al usuario Nombre y fecha de nacimiento de la persona a crear. 
Retornar el objeto Persona creado.
Método calcularEdad que calcule la edad del usuario utilizando el atributo de fecha de nacimiento y la fecha actual.
Método menorQue recibe como parámetro una Persona y una edad. Retorna true si la persona es menor
que la edad consultada o
false en caso contrario.
Método mostrarPersona que muestra la información de la persona deseada.

 */
public class PersonaServicio {

    private static final Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo solicita datos al usuario, fecha de nac, mes, dia.
     *
     * @return Objeto tipo Persona.
     */
    public static Persona crearPersona() {

        System.out.println("Ingresa tu nombre:");
        String nombre = Leer.next();
        System.out.println("Año de nacimiento:");
        int anio = Leer.nextInt();
        System.out.println("mes de nacimiento:");
        int mes = Leer.nextInt();
        System.out.println("dia de nacimiento:");
        int dia = Leer.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);

        return new Persona(nombre, fecha);

    }

    /**
     * Metodo devuelve la fecha actual.
     *
     * @return dato tipo DATE
     */
    public static Date fechaActual() {

        return new Date();

    }

    /**
     * Metodo calcula la edad de la persona.
     *
     * @param p Tipo objeto Persona
     * @param fecha Tipo Objeto Date
     * @return
     */
    public static int calcularEdad(Persona p, Date fecha) {

        //return (fecha.getYear() - p.getFechaNacimiento().getYear());
        if (fecha.getMonth() < p.getFechaNacimiento().getMonth()) {
            return (fecha.getYear() - p.getFechaNacimiento().getYear() - 1);

        } else if (fecha.getMonth() > p.getFechaNacimiento().getMonth()) {
            return (fecha.getYear() - p.getFechaNacimiento().getYear());
        } else if (fecha.getDay() > p.getFechaNacimiento().getDay()) {
            return (fecha.getYear() - p.getFechaNacimiento().getYear());
        } else if (fecha.getDay() < p.getFechaNacimiento().getDay()) {
            return (fecha.getYear() - p.getFechaNacimiento().getYear() - 1);
        } else if (fecha.getHours() > p.getFechaNacimiento().getHours()) {
            return (fecha.getYear() - p.getFechaNacimiento().getYear());
        }
        return (fecha.getYear() - p.getFechaNacimiento().getYear() - 1);

    }

    /**
     * Metodo calcula si es mayor de edad
     *
     * @param p objeto tipo Persona
     * @param edad int
     * @param fecha objeto tipo DATE
     * @return dato tipo boolean
     */
    public static boolean menorQue(Persona p, int edad, Date fecha) {

        return calcularEdad(p, fecha) <= edad;
    }

    /**
     * Metodo formatea el date de naciemiento, para mostrarlo en consola. de
     * forma correcta.
     *
     * @param p objeto tipo Persona
     */
    public static void mostrarPersona(Persona p) {

        // Crear un formato de fecha
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        // Formatear la fecha
        String fechaFormateada = formato.format(p.getFechaNacimiento());

        // Mostrar la fecha formateada
        System.out.println("Fecha formateada: " + fechaFormateada + "\nNombre: " + p.getNombre());

    }

    public static void mostrarPersonaNull(Persona p) {

        System.out.println("Nombre:" + p.getNombre() + "\nAño nacimiento:" + p.getFechaNacimiento().getYear() + "\nMes nacimiento:"
                + p.getFechaNacimiento().getMonth() + "\nDia de nacimiento:" + p.getFechaNacimiento().getDay());

    }

}
