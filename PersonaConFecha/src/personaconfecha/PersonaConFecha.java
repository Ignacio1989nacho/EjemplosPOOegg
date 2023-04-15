/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personaconfecha;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;
import servicio.PersonaServicio;

public class PersonaConFecha {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        
        Persona p = PersonaServicio.crearPersona();
        Date fecha = PersonaServicio.fechaActual();

        System.out.println(PersonaServicio.calcularEdad(p, fecha));

//        System.out.println("=============");
//        System.out.println(p.getFechaNacimiento().toString());
//        System.out.println("=============");

        System.out.println("Ingresa otra edad:");
        int edad = Leer.nextInt();
        
        System.out.println("Es mayor?: "+PersonaServicio.menorQue(p, edad,fecha));

        PersonaServicio.mostrarPersona(p);
        //PersonaServicio.mostrarPersonaNull(p);
    }

}
