/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta 

 */
package bancoapp;

import bancoapp.cuentabanco.Cuenta;

import java.util.Scanner;
import serviciobanco.ServicioBanco;

public class BancoAPP {

    public static Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

        ServicioBanco nuevoCliente = new ServicioBanco(); // instancio el objeto de la clase SERVICIOBANCO.
        
        Cuenta nCliente = nuevoCliente.crearCuenta(); // instancio el objeto de la clase CUENTA. con el metodo crearCuenta de SERVICIO BANCO.
        
        System.out.println("----------INGRESAR DINERO--------------");
        System.out.println("Cantidad de dinero a ingresar:");

        double ingreso = Leer.nextDouble();

        nuevoCliente.ingresar(nCliente,ingreso);

        //System.out.println(nCliente.getSaldoActual());
        System.out.println("------- EXTRACCION ---------");

        System.out.println("Extrar dinero:");

        double retirar = Leer.nextDouble();

        nuevoCliente.retirarDinero(nCliente,retirar);

        //System.out.println(nCliente.getSaldoActual());
        System.out.println("--------- EXTRACCION RAPIDA -----------");

        double extraccion_rapida = Leer.nextDouble();

        nuevoCliente.extraccionRapida(nCliente,extraccion_rapida);

        nuevoCliente.consultarDatos(nCliente);
        
        System.out.println(nCliente.toString());
        
        
       

    }

}
