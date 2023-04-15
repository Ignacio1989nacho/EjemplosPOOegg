/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20
 */
package arregloapp;

import arreglosapp.arreglos.Arreglo;
import java.util.Arrays;

public class ArregloAPP {

    public static void main(String[] args) {

        Arreglo nuevoArreglo = new Arreglo();

        nuevoArreglo.a();
        System.out.println("");
        System.out.println("===================A");
        nuevoArreglo.b();
        System.out.println("");
        System.out.println("===================B");
        System.out.println("ARREGLO A los 50 numeros de menor a mayor:");
        // ordena el array de menor a mayor
        Arrays.sort(nuevoArreglo.getA());
       
       
        // recorre el array y muestra su contenido.
        for (int i = 0; i < nuevoArreglo.getA().length; i++) {
            System.out.print(nuevoArreglo.getA()[i]+" | ");           
        }
        // ordena el array de menor a mayor
        Arrays.sort(nuevoArreglo.getB());
        
        System.out.println("");
        System.out.println("===================");
        System.out.println("ARREGLO B con los 10 primeros numeros ordenados");
        // recorre el array b y muestra el contenido. luego del elemento n° 10 agrega 0.5 como elementos del array.
        for (int i = 0; i < 20; i++) {
            
            if (i > 9){
                System.out.print(" | " + 0.5);
            continue;
            }
            System.out.print(nuevoArreglo.getB()[i] + " | ");
        }      
        System.out.println("");  
        System.out.println("---");

    }
    
    
    
    

}
