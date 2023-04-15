/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ServicioPerro {

    public Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Creaa el objeto perro
     *
     * @return retorna un objeto
     */
    public Perro objPerro() {

        System.out.println("Tipo:");
        String tipo = Leer.next();

        return new Perro(tipo);

    }

    /**
     * muestra lista de perros
     *
     * @param lista parametro lista de perros
     */
    public void perrosOrdenados(ArrayList<Perro> lista) {

        for (Perro perro : lista) {
            System.out.println(perro.getPerro());
        }

    }
//Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
//pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista.
//Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
//la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y
//se mostrará la lista ordenada.

    /**
     * Metodo recorre en la lista busca lo ingresado por el usuario y lo borra
     * de la misma.
     *
     * @param p lista con objeto perro como tipo de dato.
     */
    public void recorrerListaPerros(ArrayList<Perro> p) {

        System.out.println("Ingresa el perro que deseas buscar:");
        String nombre = Leer.next();

        String a;
        for (int i = 0; i < p.size(); i++) {
            a = p.get(i).getPerro();
            if (nombre.equalsIgnoreCase(a)) {
                p.remove(i);
                i = p.size();
            }

        }

//        Iterator<Perro> iterador = p.iterator();// ITERA.        
//        while (iterador.hasNext()) {
//
//            if (iterador.next().equals(nombre)) { // Borramos el nombre si esta.
//                iterador.remove();
//            }
//        }
        for (Perro perro : p) {
            System.out.println(perro.getPerro());
        }
    }

}
