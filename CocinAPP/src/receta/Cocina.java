/*
Crea una clase "Cocina" que tenga una lista de objetos "Receta". 
Luego, crea métodos para agregar nuevas recetas a la lista, para buscar 
una receta por nombre y para obtener la lista de recetas que se pueden
preparar con los ingredientes disponibles en la cocina.
 */
package receta;

import java.util.Scanner;

public class Cocina {

    private String[] receta = new String[3];
    private String[] ingredientes = new String[3];
    private int contador = 0;

    public Cocina() {
    }

    public Cocina(String[] receta, String[] ingredientes, int contador) {
        this.receta = receta;
        this.ingredientes = ingredientes;
        this.contador = contador;
    }

    public String[] getReceta() {
        return receta;
    }

    public void setReceta(String[] receta) {
        this.receta = receta;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    @Override
    public String toString() {
        return "Cocina{" + "receta=" + receta[contador - 1] + ", ingredientes=" + ingredientes[contador - 1] + ", contador=" + contador + '}';
    }
    /**
     * Metodo rellena los vectores con datos ingresados por el usuario
     */
    public void nombreRecetas() {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Nueva receta: ");

        receta[contador] = Leer.next();

        System.out.println("Ingresa los ingredientes:");

        ingredientes[contador] = Leer.next();

        contador++;

    }

}
