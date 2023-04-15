/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita a dos jugadores 
jugar un juego de adivinanza de números. El primer jugador elige un número y el segundo
jugador intenta adivinarlo. El segundo jugador tiene un número limitado de intentos y recibe
una pista de "más alto" o "más bajo" después de cada intento. El juego termina cuando el segundo
jugador adivina el número o se queda sin intentos. Registra el número de intentos necesarios para
adivinar el número y el número de veces que cada jugador ha ganado.

 */
package juego;

import java.util.Scanner;

public class Juego {

    private int numeroIncognito;
    private int intentos;

    public Juego() {
    }

    public Juego(int numeroIncognito, int intentos) {
        this.numeroIncognito = numeroIncognito;
        this.intentos = intentos;
    }

    public int getNumeroIncognito() {
        return numeroIncognito;
    }

    public void setNumeroIncognito(int numeroIncognito) {
        this.numeroIncognito = numeroIncognito;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    @Override
    public String toString() {
        return "Juego{" + "numeroIncognito=" + numeroIncognito + ", intentos=" + intentos + '}';
    }
/**
 * Metodo inicia el juego con un numero incognito.
 */
    public void iniciarJuego() {

        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresa el numero INCOGNITO:");
        numeroIncognito = Leer.nextInt();

        int ingreso = -1;

        do {
            if (intentos > 0) {
                if (numeroIncognito < ingreso) {
                    System.out.println("Tu numero es mayor");
                } else {
                    System.out.println("Tu numero es menor");
                }
            }
            System.out.println("Jugador 2 Intento: " + (intentos + 1));
            ingreso = Leer.nextInt();

            intentos++;

        } while (intentos < 3 && ingreso != numeroIncognito);

        if (numeroIncognito == ingreso) {
            System.out.println("Correcto el numero era " + numeroIncognito + "en " + intentos);
        } else {
            System.out.println("Fallaste!");

        }

    }

}
