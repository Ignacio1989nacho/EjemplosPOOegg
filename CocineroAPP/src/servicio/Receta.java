package servicio;

import java.util.ArrayList;
import java.util.Scanner;
//Crea una clase "Cocina" que tenga una lista de objetos "Receta".
//Luego, crea métodos para agregar nuevas recetas a la lista, para
//buscar una receta por nombre y para obtener la lista de recetas que
//se pueden preparar con los ingredientes disponibles en la cocina

public class Receta {

    // public ArrayList<String> receta;
    public String nombre;
    public String[] ingredientes;

    public Receta() {
    }

    public Receta(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        int i;
        System.out.println("El nombre es: " + nombre);
        System.out.println("Los ingredientes son: ");
        for (i = 0; i < ingredientes.length; i++) {
            System.out.println((i + 1) + "-" + ingredientes[i]);
        }

        return "";
    }

}
