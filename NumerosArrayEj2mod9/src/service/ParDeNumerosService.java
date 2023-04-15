/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos números reales con los
cuales se realizarán diferentes operaciones matemáticas. La clase debe tener un constructor 
vacío, getters y setters.  En el constructor vacío se usará el Math.random para generar los dos números.
Crear una clase ParDeNumerosService, en el paquete Servicios, que deberá además implementar los siguientes métodos:
Método mostrarValores que muestra cuáles son los dos números guardados.
Método devolverMayor para retornar cuál de los dos atributos tiene el mayor valor
Método calcularPotencia para calcular la potencia del mayor valor de la clase elevado al menor número. 
Previamente se deben redondear ambos valores.
Método calculaRaiz, para calcular la raíz cuadrada del menor de los dos valores. Antes de calcular 
la raíz cuadrada se debe obtener el valor absoluto del número.

 */
package service;

import entidad.ParDeNumeros;
import static java.lang.Math.max;

public class ParDeNumerosService {

    public void mostrarValores(ParDeNumeros parnumeros) {

        System.out.println("el primer numero es: " + parnumeros.getNum1());
        System.out.println("el segundo numero es: " + parnumeros.getNum2());

    }

    public double devolverMayor(ParDeNumeros parnumeros) {

        return Math.max(parnumeros.getNum1(), parnumeros.getNum2());

    }

    public int calcularPotencia(ParDeNumeros parnumeros) {

        double numMayor = devolverMayor(parnumeros);
        double numMenor = Math.min(parnumeros.getNum1(), parnumeros.getNum2());

        return (int) Math.pow((int) numMayor, (int) numMenor);

    }

    public int calculaRaiz(ParDeNumeros parnumeros) {

        int numMenor = (int) Math.min(parnumeros.getNum1(), parnumeros.getNum2());

        return (int) Math.sqrt(numMenor);

    }

}
