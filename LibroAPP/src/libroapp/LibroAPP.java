/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libroapp;

import java.util.Scanner;
import libroapp.llenadolibro.Libro;

public class LibroAPP {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        Libro libroUno = new Libro();

        Libro libroDos = new Libro();

        libroDos.datosLibroIngreso();
        
        libroDos.datosLibroImprimir();
        
        libroUno.datosLibroIngreso();
        
        libroUno.datosLibroImprimir();
    }

}
