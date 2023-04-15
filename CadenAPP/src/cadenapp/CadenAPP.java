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
package cadenapp;

import cadenapp.cadena.Cadena;

import java.util.Scanner;

public class CadenAPP {

    public static Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        Cadena cadenaNueva = new Cadena();
        System.out.println("-----------============-------------");
        System.out.print("Ingresa una frase o palabra: ");
        cadenaNueva.setCadena(Leer.next());
        cadenaNueva.setLongitudCadena(cadenaNueva.getCadena().length());
        System.out.println("");
        System.out.println("-----------============-------------");
        cadenaNueva.mostrarVocales();
        cadenaNueva.invertirFrase();
        System.out.print("Ingresa la letra que quieres buscar: ");
        String letra1 = Leer.next();
        System.out.println("-----------============-------------");
        cadenaNueva.vecesRepetido(letra1);
        System.out.println("");
        System.out.println("-----------============-------------");
        System.out.print("Ingresa una nueva frase para comparar la longitud con la anterior: ");
        String frase = Leer.next();
        cadenaNueva.compararLongitud(frase);
        System.out.println("");
        System.out.println("-----------============-------------");
        System.out.print("FRASES UNIDAS: ");
        cadenaNueva.unirFrases(frase);
        System.out.println("");
        System.out.println("-----------============-------------");
        System.out.print("Ingresa un caracter o simbolo para reemplazar la letra 'A': ");
        String letra2 = Leer.next();
        cadenaNueva.reemplazar(letra2);
        System.out.println("");
        System.out.println("-----------============-------------");
        System.out.print("Ingresa una letra a buscar en la primera frase: ");
        String letra3 = Leer.next();
        cadenaNueva.contiene(letra3);

    }

}
