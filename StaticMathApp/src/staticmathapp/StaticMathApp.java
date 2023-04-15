package staticmathapp;

import entiddad.ParDeNumeros;
import java.text.DecimalFormat;
import servicio.ParDeNumerosService;

public class StaticMathApp {

    public static void main(String[] args) {
        ParDeNumeros numeros = ParDeNumerosService.crearPar();
        // formatea la cantidad de numeros luego de la "," que deben aparecer.
        DecimalFormat formato1 = new DecimalFormat("#.000");

        System.out.println("Mostrar los numeros: " + ParDeNumerosService.mostrarValores(numeros));

        System.out.println("Devuelve el numero mayor: " + formato1.format(ParDeNumerosService.devolverMayor(numeros)));

        System.out.println("Potencia de numero mayor: " + ParDeNumerosService.calcularPotencia(numeros));
        
        System.out.println("Raiz del menor numero: "+ ParDeNumerosService.calculaRaiz(numeros));
    }

}
