/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número. 

 */
package matematicapp.matematica;

public class Matematica {

    public static double numeroUno, numeroDos;

    public Matematica() {
    }

    public double getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }

    public double getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }

    /**
     * Metodo devuelve cual numero de los ingresados es mayor.
     */
    public static double devolverMayor() {

        if (numeroUno > numeroDos) {

            return numeroUno;
        } else {

            return numeroDos;
        }

    }

    /**
     * Metodo devuelve la potencia del numero mayor entre los 2
     *
     * @return dato tipo double
     */
    public static double calcularPotencia() {

        if (Math.round(numeroUno) > Math.round(numeroDos)) {

            return Math.pow(Math.round(numeroUno), Math.round(numeroDos));
        } else {

            return Math.pow(Math.round(numeroDos), Math.round(numeroUno));
        }

    }

    /**
     * Metodo devuelve la raiz dl numero menor entre los dos.
     *
     * @return dato tipo double
     */
    public static double calculaRaiz() {

        //valorAbsoluton1 = Math.abs(numeroUno);
        //valorAbsoluton2 = Math.abs(numeroDos);
        if (Math.abs(numeroUno) > Math.abs(numeroDos)) {

            return Math.sqrt(Math.abs(numeroDos));
        } else {
            return Math.sqrt(Math.abs(numeroUno));

        }

    }

}
