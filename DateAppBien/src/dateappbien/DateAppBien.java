/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dateappbien;

import fechaservice.FechaServis;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class DateAppBien {

    public static void main(String[] args) {

        Date fechaNacimiento = FechaServis.fechaNacimiento();

        Date fechaActual = FechaServis.fechaActual();

        fechaNacimiento.setHours(20);
        fechaNacimiento.setMinutes(30);
        
        System.out.println("años del usuario: " + FechaServis.edadUsuario(fechaNacimiento, fechaActual));

        System.out.println(FechaServis.fechaActual());

    }

}
