/*
 Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package dateapp;


import dateapp.date.Entidad;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;


public class DateAPP {

   public static Scanner Leer = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {
        
        
        Calendar calendario = new GregorianCalendar();
        
        System.out.println("Ingresa tu dia de nacimiento:");
        int dia = Leer.nextInt();
        System.out.println("Ingresa tu mes de nacimiento:");
        int mes  = Leer.nextInt();
        System.out.println("Ingresa tu año de nacimiento:");
        int anio = Leer.nextInt();
        
        
        
//        fechaActual.setYear(anio);
//        fechaActual.setMonth(mes);
//        fechaActual.setDate(dia);
        Date fecha = new Date();
        calendario.setTime(fecha);
        
        calendario.set(anio,mes,dia);
        
        
        System.out.println(calendario.get(Calendar.DATE)+" | "+calendario.get(Calendar.MONTH)+" | "+calendario.get(Calendar.YEAR));
        
        //System.out.println("Dia:"+fechaActual.getDate()+"|"+"Mes:"+(fechaActual.getMonth())+"|"+"Año:"+(fechaActual.getYear()));
        
        System.out.println("========");
        //System.out.println(fecha);
        
        
        
        Entidad ent = new Entidad(calendario);
        
        System.out.println ("Edad actual:"+ent.mostrarEdad(calendario));        
       
        
        
        
        
        
        
        
       
    }
    
}
