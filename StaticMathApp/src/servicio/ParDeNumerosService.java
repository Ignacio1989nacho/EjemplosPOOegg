/*
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular
la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package servicio;

import entiddad.ParDeNumeros;

public class ParDeNumerosService {

    /**
     * Metodo crea el objeto.
     *
     * @return objeto tipo pardenumeros
     */
    public static ParDeNumeros crearPar() {

        return new ParDeNumeros();

    }

    /**
     * Metodo muestra los valores
     *
     * @param numeros Objeto tipo pardenumeros
     * @return retorna String
     */
    public static String mostrarValores(ParDeNumeros numeros) {

        return numeros.toString();

    }

    /**
     * Metodo devuelve el numero mayor entre ambos numeros doubles.
     *
     * @param numeros objeto tipo pardenumeros.
     * @return double
     */
    public static double devolverMayor(ParDeNumeros numeros) {

        if (numeros.getNumUno() > numeros.getNumDos()) {
            return numeros.getNumUno();
        }
        return numeros.getNumDos();

    }

    /**
     * Metodo calcula la potencia entre el numero mayor elevado al numero menor.
     *
     * @param numeros objeto tipo pardenumeros.
     * @return int
     */
    public static int calcularPotencia(ParDeNumeros numeros) {

        if (numeros.getNumUno() > numeros.getNumDos()) {
            return (int) Math.pow((int) numeros.getNumUno(), (int) numeros.getNumDos());
        }
        return (int) Math.pow((int) numeros.getNumDos(), (int) numeros.getNumUno());

    }

    /**
     * Metodo calcula la raiz del menor por el mayor.
     *
     * @param numeros objeto tipo pardenumeros.
     * @return double
     */
    public static double calculaRaiz(ParDeNumeros numeros) {

        if (numeros.getNumUno() > numeros.getNumDos()) {
            return Math.sqrt(Math.abs(numeros.getNumDos()));
        }
        return Math.sqrt(Math.abs(numeros.getNumUno()));

    }

}
