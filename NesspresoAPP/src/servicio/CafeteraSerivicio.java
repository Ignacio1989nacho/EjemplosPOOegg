package servicio;

import java.util.Scanner;
import nesspresoapp.nesspreso.Cafetera;

public class CafeteraSerivicio {

    private Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    public Cafetera cf = new Cafetera();

    //Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
    public Cafetera llenarCafetera() {

        System.out.println("Ingresa la capidad maxima en LITROS: ");
        int cMaxima = Leer.nextInt();
        
        cf.setCapacidadMaxima(cMaxima);

        cf.setCapacidadActual(cMaxima);
        return  cf;

    }

//  Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el tamaño
//  de la taza y simula la acción de servir la taza con la capacidad indicada. 
//  Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
//  El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
    public void servirTaza(int tamTaza) {

        int cont = 1;
        while (cf.getCapacidadActual() > tamTaza) {
            cf.setCapacidadActual(cf.getCapacidadActual() - tamTaza);
            System.out.println(cont + " taza llena.");
            cont++;
        }
        if (cf.getCapacidadActual() < tamTaza) {

            int restoCafe = cf.getCapacidadActual();

            System.out.println("Se ha servido el resto que queda de cafe: " + restoCafe + " LTS en 1 taza.");

        } else {
            System.out.println("taza llena " + cont++);
            System.out.println("capacidad llena.");
        }

    }

    // Método vaciarCafetera(): pone la cantidad de café actual en cero.
    public void vaciarCafetera() {

        cf.setCapacidadActual(0);

    }

//  Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
// recibe y se añade a la cafetera la cantidad de café indicada.
    public void agregarCafe(int llenarConCafe) {

         cf.setCapacidadActual(cf.getCapacidadActual()+llenarConCafe);

    }

}
