/*
Los profesores del curso de programación de Egg necesitan llevar un registro de las notas adquiridas por sus 
10 alumnos para luego obtener una cantidad de aprobados y desaprobados. Durante el período de cursado cada alumno obtiene 4 notas,
2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final del programa los profesores necesitan 
obtener por pantalla la cantidad de aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos con promedio
mayor o igual al 7 de sus notas del curso.


 */
package javaapplication17;

import java.util.Scanner;

public class JavaApplication17 {
/**
 * En el main solicita datos al usuario para calcular aprobados y desaprobados.
 *
 */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");// \ = alt + 92

        double[] vec = new double[10];

        double promedio = 0;
        int aprobados = 0;
        int desaprobados = 0;
        for (int i = 0; i < vec.length; i++) {

           vec[i] = ((Math.random()) * 10) * 0.1 + ((Math.random()) * 10) * 0.15 + ((Math.random()) * 10) * 0.25 + ((Math.random()) * 10) * 0.5;
            System.out.print(vec[i]+" - ");
           if(vec[i]>=7){
           
           aprobados++;
           }
           else{
           
           desaprobados++;
           }
        }
        System.out.println("");
        
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Desaprobados: "+desaprobados);


    }
}