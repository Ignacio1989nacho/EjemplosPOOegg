/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cancionapp;

import cancionapp.cancion.Cancion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CancionAPP {

    public static Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        Cancion cancionNueva = new Cancion();

        System.out.println("TITULO DE LA CANCION:");

        cancionNueva.setTitulo(Leer.next());

        System.out.println("AUTOR DE LA CANCION:");

        cancionNueva.setAutor(Leer.next());
        
        System.out.println("El titulo de la cancion es: "+cancionNueva.getTitulo()+" Y el autor es: "+cancionNueva.getAutor());

    }

}
