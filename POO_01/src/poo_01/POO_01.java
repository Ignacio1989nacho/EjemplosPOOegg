/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_01;

import entidad.Persona;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author Usuario
 */
public class POO_01 {

    public static Scanner Leer = new Scanner(System.in);

    public static void main(String[] args) {

        Persona nuevaPersona = new Persona("", "", 0);

        System.out.println("Ingresa el nombre:");
        nuevaPersona.setNombre(Leer.nextLine());
        System.out.println("Ingresa el apellido:");
        nuevaPersona.setApellido(Leer.nextLine());
        System.out.println("Ingresa la edad:");
        nuevaPersona.setEdad(Leer.nextInt());

        System.out.println(nuevaPersona.getEdad()+", " + nuevaPersona.getNombre()+", " + nuevaPersona.getApellido());

    }

}
