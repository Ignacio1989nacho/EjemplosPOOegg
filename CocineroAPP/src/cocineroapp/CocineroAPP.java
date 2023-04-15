package cocineroapp;

import entidad.Cocina;
import java.util.Scanner;

public class CocineroAPP {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        Cocina p1 = new Cocina();
        System.out.println("Ingresa la cantidad de recetas:");
        int cantSolicitaReceta = Leer.nextInt(); // Cantidad de recetas a acargar en la prueba

        for (int i = 0; i < cantSolicitaReceta; i++) {
            p1.agregarReceta();
        }

       //System.out.println(p1.getListaReceta());
       //p1.buscarReceta();
        
        
        p1.buscarPorIngrediente();

        //p1.mostrarReceta();
    }

}
