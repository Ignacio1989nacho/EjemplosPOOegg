/*
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. 
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario 
y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase), deberá comparar la longitud de la frase 
que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase), deberá unir la frase contenida en la clase 
Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra), deberá reemplazar todas las letras “a” 
que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra), deberá comprobar si la frase contiene una 
letra que ingresa el usuario y devuelve verdadero si la contiene y falso si no.


 */
package servicio;

import entidad.Cadena;

public class CadenaServicio {

    /**
     * Metodo consulta si hay alguna vocal dentro de la frase. y la contabiliza.
     *
     * @param frase Objeto de tipo Cadena
     */
    public void mostrarVocales(Cadena frase) {
        int cont = 0;
        for (int i = 0; i < frase.getLongitudFrase(); i++) {
            switch (frase.getFrase().substring(i, i + 1).toLowerCase()) {

                case "a":
                case "e":
                case "i":
                case "o":
                case "u":
                    cont++;

            }

        }
        System.out.println("la cantidad de vocales son: " + cont);
    }

    /**
     * Metodo invierte la frase ingresada en la cadena.
     *
     * @param frase Objeto de tipo Cadena
     */
    public void invertirFrase(Cadena frase) {
        String a = "";
        for (int i = frase.getLongitudFrase(); i > 0; i--) {

            a += frase.getFrase().substring(i - 1, i);
        }

        System.out.println(a);
    }

    /**
     * Metodo busca la letra ingresada por el usuario, la contabiliza en la
     * frase y muestra cuantas veces se repite.
     *
     * @param letra ingresada por el usuario
     * @param frase Objeto de tipo Cadena
     */
    public void vecesRepetido(String letra, Cadena frase) {
        int cont = 0;
        for (int i = 0; i < frase.getLongitudFrase(); i++) {
            if (letra.equalsIgnoreCase(frase.getFrase().substring(i, i + 1))) {
                cont++;
            }
        }
        System.out.println("la letra se repite:" + cont + " veces");

    }

    /**
     * Metodo compara las longitudes de las frases.
     *
     * @param nuevaFrase ingresada por el usuario
     * @param frase Objeto de tipo Cadena
     * @return tipo boolean
     */
    public boolean compararLongitud(String nuevaFrase, Cadena frase) {
        return nuevaFrase.length() == frase.getLongitudFrase();
    }

    /**
     * Metodo concatena la frase nueva con la ya ingresada en el objeto CADENA.
     *
     * @param nuevaFrase ingresada por el usuario
     * @param frase Objeto de tipo Cadena
     * @return dato tipo String
     */
    public String unirFrases(String nuevaFrase, Cadena frase) {

        return frase.getFrase() + " " + nuevaFrase;

    }

    /**
     * Metodo reemplaza la letra "a" por lo ingresado por el usuario.
     *
     * @param nuevaFrase ingresada por el usuario
     * @param frase Objeto de tipo Cadena
     * @return dato de tipo String
     */
    public String reemplazar(String nuevaFrase, Cadena frase) {

        return frase.getFrase().replaceAll("a", nuevaFrase);

    }

    /**
     * Metodo recorre la cadena y busca si la letra ingresada esta en la cadena.
     *
     * @param letra ingresado por el usuario
     * @param frase Objeto de tipo Cadena
     * @return dati tipo boolean
     */
    public boolean contiene(String letra, Cadena frase) {

        return frase.getFrase().contains(letra);

    }
}
