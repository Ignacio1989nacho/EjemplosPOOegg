package entidad;

//Crea una clase "Cocina" que tenga una lista de objetos "Receta".
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import servicio.Receta;

//Luego, crea métodos para agregar nuevas recetas a la lista, para
//buscar una receta por nombre y para obtener la lista de recetas que
//se pueden preparar con los ingredientes disponibles en la cocina
public class Cocina {

    public List<Receta> listaReceta;//traemos un objeto
    public static Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public Cocina() {
        this.listaReceta = new ArrayList();
    }

    public List<Receta> getListaReceta() {
        return listaReceta;
    }

    public void setListaReceta(List<Receta> listaReceta) {
        this.listaReceta = listaReceta;
    }

    /**
     * Metodo agrega el nombre de la receta. la cantidad de ingredientes(vector)
     * y agrega todo a la LISTA receta.
     *
     */
    public void agregarReceta() {

        System.out.println("Ingresa el nombre de la receta:");
        String nombre = Leer.next();

        System.out.println("Ingresa la cantidad de ingredientes de la receta:");
        int cant = Leer.nextInt();

        String[] cantIngrediente = new String[cant];

        for (int i = 0; i < cant; i++) {
            System.out.println("Ingresa los ingredientes:");

            String ingredienteIngresadoUsuario = Leer.next();

            cantIngrediente[i] = ingredienteIngresadoUsuario;
        }
        Receta plato1 = new Receta(nombre, cantIngrediente);

        listaReceta.add(plato1);

    }

    /**
     * Metodo muestra la receta.
     */
    public void mostrarReceta() {

        for (Receta r : listaReceta) {

            System.out.println(r.toString()); // es igual a, por estar en override: System.out.println(r);

        }

    }

    /**
     * Metodo busca la receta que ingresa el usuario, en la lista receta.
     */
    public void buscarReceta() {

        System.out.println("Ingresa el nombre de la receta:");

        String nombre = Leer.next();

        for (Receta r : listaReceta) {
            if (r.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println(r.toString()); // es igual a, por estar en override: System.out.println(r);

            }

        }
    }

    /**
     * Metodo busca el ingrediente ingresado por el usuario
     */
    public void buscarPorIngrediente() {

        System.out.println("Ingresa el ingrediente:");

        String ingrediente = Leer.next();
        String[] ingredientes;

        for (Receta r : listaReceta) {
            boolean flag = false;

            ingredientes = r.getIngredientes();
            for (int i = 0; i < ingredientes.length; i++) {

                if (ingredientes[i].equalsIgnoreCase(ingrediente)) {
                    flag = true;
                }
            }
            if (flag) {

                System.out.println(r.toString());
            }

        }
    }
}
