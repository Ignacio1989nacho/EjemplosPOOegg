/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no. 

 */
package cadenapp.cadena;

import java.util.Scanner;

public class Cadena {

    public Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    public String cadena;
    public int longitudCadena;

    public Cadena() {
    }

    ;
    
    public Cadena(String cad, int longitudCadena) {

        this.cadena = cad;
        this.longitudCadena = longitudCadena;

    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public int getLongitudCadena() {
        return longitudCadena;
    }

    public void setLongitudCadena(int longitudCadena) {
        this.longitudCadena = longitudCadena;
    }

    /**
     * Metodo cuenta las cantidades de vocales en la frase ingresada.
     */
    public void mostrarVocales() {
        int vocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.substring(i, (i + 1))) {
                case "a":
                    vocales++;
                    break;
                case "e":
                    vocales++;
                    break;
                case "i":
                    vocales++;
                    break;
                case "o":
                    vocales++;
                    break;
                case "u":
                    vocales++;
                    break;

            }

        }
        System.out.println("la cantidad de vocales que tiene la palabra son: " + vocales);
    }

    /**
     * Metodo invierte la frase ingresada y la imprime en pantalla.
     *
     */
    public void invertirFrase() {
        String fraseInvertida = "";
        for (int i = cadena.length(); i <= 0; i--) {
            fraseInvertida = fraseInvertida.concat(cadena.substring(i, (i - 1)));

        }

        System.out.println(cadena);
        System.out.println("la frase invertida es:" + fraseInvertida);
    }

    /**
     * Metodo recibe parametro, y cuenta cuantas veces esta repetido ese
     * parametro(letra) en la frase.
     *
     * @param letra1 caracter ingresado por el usuario.
     */
    public void vecesRepetido(String letra1) {
        int cont = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (letra1.equals(cadena.substring(i, (i + 1)))) {

                cont++;

            }
        }
        System.out.println("el caracter " + letra1 + " se repite: " + cont);
    }

    /**
     * Metodo compara la frase nueva, ingresada por el usuario, midiendo la
     * longitud con la frase anterior.
     *
     * @param frase ingresado por el usuario.
     */
    public void compararLongitud(String frase) {

        if (cadena.length() == frase.length()) {

            System.out.println("Las dos frases tienen la misma cantidad de digitos.");
        } else {
            System.out.println("La cantidad de digitos de las dos frases no coincide.");
        }

    }

    /**
     * Metodo concatena la frase original con la nueva frase ingresada.
     *
     * @param frase ingresada por el usuario
     */
    public void unirFrases(String frase) {

        String fraseConcatenada = cadena.concat(" " + frase);
        System.out.println(fraseConcatenada);
    }

    /**
     * Metodo reemplaza la letra "A" con el nuevo caracter ingresado por el
     * usuario.
     *
     * @param letra2 caracter ingresado por el usuario.
     */
    public void reemplazar(String letra2) {
        String frase = "";
        for (int i = 0; i < cadena.length(); i++) {
            switch (cadena.substring(i, i + 1)) {

                case "a":
                    frase += letra2;
                    break;
                default:
                    frase += cadena.substring(i, i + 1);
            }
        }
        System.out.println(frase);

    }

    /**
     * Metodo comprueba si el caracter ingresado por el usuario esta en la frase
     * original.
     *
     * @param letra3 caracter ingresado por el usuario.
     */
    public void contiene(String letra3) {
        boolean comp = false;
        for (int i = 0; i <= cadena.length(); i++) {
            if (cadena.substring(i, i + 1).equals(letra3)) {
                comp = true;
                i = cadena.length();
            }

        }
        System.out.println(comp);
    }

}
