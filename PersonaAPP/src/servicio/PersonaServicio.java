package servicio;

import entidad.Persona;
import java.util.Scanner;

public class PersonaServicio {

    private final Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public Persona p = new Persona();

    /**
     * Metodo ingresa los datos de la persona.
     *
     * @return Objeto de tipo Persona
     */
    public Persona crearPersona() {
        Persona p = new Persona();
        System.out.println("INGRESA TU NOMBRE: ");
        p.setNombre(Leer.next());

        System.out.println("INGRESA TU EDAD:");
        p.setEdad(Leer.nextInt());

        do {
            System.out.println("INGRESA TU SEXO H - HOMBRE");
            System.out.println("INGRESA TU SEXO M - MUJER");
            System.out.println("INGRESA TU SEXO O - OTRO");

            p.setSexo(Leer.next().charAt(0));

        } while (p.getSexo() != 'H' && p.getSexo() != 'M' && p.getSexo() != 'O');

        System.out.println("INGRESA TU PESO EN KILOGRAMOS:");

        p.setPeso(Leer.nextDouble());

        System.out.println("INGRESA TU ALTURA:");

        p.setAltura(Leer.nextDouble());

        return p;

    }

    /**
     * Metodo devuelve si el indice de masa corporal es el correcto.
     *
     * @param p de tipo Objeto Persona.
     * @return dato de tipo int
     */
    public int calcularIMC(Persona p) {

        int comp = 0;
        if (p.getPeso() / (p.getAltura() * 2) < 20) { //POCO PESO

            comp = -1;

        }
        if (p.getPeso() / (p.getAltura() * 2) > 20 && p.getPeso() / (p.getAltura() * 2) < 25) {//PESO JUSTO

            comp = 0;

        }
        if (p.getPeso() / (p.getAltura() * 2) > 25) { // SOBREPESO
            comp = 1;
        }
        return comp;
    }

    /**
     * Metodo calcula si es mayor de edad.
     *
     * @param p de tipo Objeto Persona.
     * @return dato tipo boolean
     */
    public boolean esMayorDeEdad(Persona p) {

        return p.getEdad() > 17;

    }

    /**
     * Metodo imprime los valores de edad y masa corporal.
     */
    public void imprimirValores() {
        //COMPROBACION
        System.out.println(esMayorDeEdad(p));
        System.out.println(calcularIMC(p));
    }

}
