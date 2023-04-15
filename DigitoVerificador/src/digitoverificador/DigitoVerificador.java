/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitoverificador;

import entidad.Nif;
import java.util.ArrayList;
import servicio.NifServicio;

/**
 *
 * @author Usuario
 */
public class DigitoVerificador {

    public static void main(String[] args) {

        ArrayList<Nif> listaGeneral = new ArrayList();

        NifServicio p = new NifServicio();
        Nif pp = new Nif();

        for (int i = 0; i < 2; i++) {

            listaGeneral.add(pp = p.crearNif());
        }

        System.out.println("==============");
        System.out.println("LISTA RECORRIDA CON OBJETO PASADO COMO ARGUMENTO.");
        p.mostrar(pp);
        System.out.println("==============");
        System.out.println("LISTA RECORRIDA CON FOR MEJORADOR EN MAIN:");

        for (Nif nifServicio : listaGeneral) {
            System.out.println(nifServicio.getDni() + "-" + nifServicio.getLetra());
        }
        System.out.println("==============");
        System.out.println("LISTA RECORRIDA CON LISTA COMO ARGUMENTO.");
        p.mostrarLista(listaGeneral);
        System.out.println("==============");
    }

}
