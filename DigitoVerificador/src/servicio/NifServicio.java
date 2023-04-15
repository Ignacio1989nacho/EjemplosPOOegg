package servicio;

import entidad.Nif;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NifServicio {

    public Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    public List<String> listaLetra = Arrays.asList("T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E");
    //LISTA INMUTABLE
    /**
     *
     * Metodo crea el objeto NIF. con dni y asigna la letra
     *
     * @return retorna un objeto con dni y letra.
     */
    public Nif crearNif() {

        System.out.println("Ingresa tu DNI:");
        long dni = Leer.nextLong();

        String letra = "";

        for (int i = 0; i < listaLetra.size(); i++) {
            if ((dni % 23) == i) {
                letra = (String) listaLetra.get(i);
                break;
            }
        }

        return new Nif(dni, letra);

    }

    /**
     *
     * Metodo muestra el dni y la letra 
     *
     * @param p PARAMETRO OBJETO
     */
    public void mostrar(Nif p) {

        System.out.println(p.getDni() + "-" + p.getLetra());

    }

    /**
     * Muestra la lista completa. recorrida por un FOR mejorado.
     *
     * @param listaDniLetra PARAMETRO LISTA
     */
    public void mostrarLista(ArrayList<Nif> listaDniLetra) {
        for (Nif nif : listaDniLetra) {
            System.out.println(nif.getDni()+"-"+nif.getLetra());
        }

    }
}
