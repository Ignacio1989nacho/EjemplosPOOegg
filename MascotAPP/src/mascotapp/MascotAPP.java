
package mascotapp;

import java.util.Scanner;
import mascotapp.entidades.Mascota;
import mascotapp.servicio.ServiciosMascota;

public class MascotAPP {


    public static void main(String[] args) {
        
       ServiciosMascota sm = new ServiciosMascota();
        
        Mascota masc = sm.crearMascota();
        
        System.out.println(masc);
        
        
    }
    
    
}
