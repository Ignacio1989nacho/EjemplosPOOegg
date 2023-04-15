/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccioneslista;

import entidad.Perro;
import java.util.ArrayList;
import java.util.Scanner;
import servicio.ServicioPerro;

public class ColeccionesLista {

    public static Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        
        //Perro p = new Perro();
        ServicioPerro agregarPerros = new ServicioPerro();
        ArrayList<Perro> listaPerros = new ArrayList();
         
        String letra = "";
        
        while (!letra.equalsIgnoreCase("N")) {
            
            listaPerros.add(agregarPerros.objPerro());
            System.out.println("Deseas seguir? Y/N");
            letra = Leer.next();
        }
        
        agregarPerros.perrosOrdenados(listaPerros);
        
        agregarPerros.recorrerListaPerros(listaPerros);

    }

}
