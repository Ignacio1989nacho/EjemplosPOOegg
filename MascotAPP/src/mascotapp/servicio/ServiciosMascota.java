/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp.servicio;

import mascotapp.entidades.Mascota;
import java.util.Scanner;
public class ServiciosMascota {

    private final Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public Mascota crearMascota() {
        System.out.println("Nombre Mascota:");
        String nombre = Leer.next();
        System.out.println("Apodo Mascota:");
        String apodo = Leer.next();
        System.out.println("Tipo Mascota:");
        String tipo = Leer.next();
        
        
        return new Mascota(nombre, apodo, tipo);
        
        // return m;

    }

}
