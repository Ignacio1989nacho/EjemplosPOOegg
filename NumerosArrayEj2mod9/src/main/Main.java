package main;

import entidad.ParDeNumeros;
import service.ParDeNumerosService;

public class Main {
    
    public static void main(String[] args) {
        ParDeNumeros parn = new ParDeNumeros();
        
        ParDeNumerosService numService = new ParDeNumerosService();
        
        numService.mostrarValores(parn);
        System.out.println("================");
        
        System.out.println("El numero mayor es: " + numService.devolverMayor(parn));
        System.out.println("================");
        System.out.println("POTENCIA");
        
        System.out.println(numService.calcularPotencia(parn));
        System.out.println("================");
        System.out.println("RAIZ NUMERO MENOR");
        System.out.println(numService.calculaRaiz(parn));
        
    }
    
}
