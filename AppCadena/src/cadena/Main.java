/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena;

import entidad.Cadena;
import java.util.Scanner;
import servicio.CadenaServicio;

/**
 *
 * @author Usuario
 */
public class Main {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");

        CadenaServicio cad = new CadenaServicio();

        Cadena c = new Cadena("Casa blanca");

        cad.mostrarVocales(c);

        cad.invertirFrase(c);

        System.out.println("Ingresa la letra que deseas buscar:");
        String letra = Leer.next();
        cad.vecesRepetido(letra, c);

        System.out.println("Ingresa una frase nueva para comparar las longitudes:");
        String fraseNueva = Leer.next();

        System.out.println("Las longitudes de las frases son :" + cad.compararLongitud(fraseNueva, c));

        System.out.println(cad.unirFrases(fraseNueva, c));

        System.out.println("Ingresa un caracter nuevo para reemplazar la letra 'A':");
        String caracter = Leer.next();

        System.out.println(cad.reemplazar(caracter, c));

        System.out.println("ingresa la letra que quieres buscar:");
        String buscarLetra = Leer.next();
        
        System.out.println(cad.contiene(buscarLetra, c));

    }

}
