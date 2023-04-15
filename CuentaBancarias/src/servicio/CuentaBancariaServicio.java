/*
Realizar una clase llamada CuentaBancaria en el paquete Entidades con los siguientes atributos: numeroCuenta(entero),
dniCliente(entero largo), saldoActual. Agregar constructor vacío, con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual. Si la cuenta no tiene la
cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.
 */
package servicio;

import entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaBancariaServicio {

    Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo solicita al usuario datos de la cuenta.
     *
     * @return Objeto de tipo cuenta.
     */
    public CuentaBancaria crearCuenta() {

        CuentaBancaria cb = new CuentaBancaria();

        System.out.println("Ingresa el numero de cuenta:");
        cb.setNumeroCuenta(Leer.nextInt());

        System.out.println("Ingresa el DNI:");
        cb.setDniCliente(Leer.nextLong());

        System.out.println("Ingresa el saldo:");
        cb.setSaldoActual(Leer.nextDouble());

        return cb;

    }

    /**
     * Metodo solicita al usuario ingresar dinero
     *
     * @param saldo tipo OBJETO cuentaBancaria.
     */
    public void ingresar(CuentaBancaria saldo) {

        System.out.println("Ingresa dinero:");
        double dinero = Leer.nextDouble();

        saldo.setSaldoActual(dinero + saldo.getSaldoActual());

    }

    /**
     * Metodo solicita al usuario cuanto dinero desea retirar de la cuenta.
     *
     * @param saldo tipo Objeto cuentaBancaria
     */
    public void retirar(CuentaBancaria saldo) {

        System.out.println("Retirar dinero:");
        double retirar = Leer.nextDouble();
        if (saldo.getSaldoActual() < retirar) {
            System.out.println("SE RETIRO TODOS LOS FONDOS!");
            saldo.setSaldoActual(0);

        } else {
            saldo.setSaldoActual(saldo.getSaldoActual() - retirar);
        }

    }

    /**
     * Metodo de solicitud de extraccion rapida, solo podra sacar el 20% del
     * total en la cuenta.
     *
     * @param saldo tipo Objeto cuentaBancaria
     */
    public void extraccionRapida(CuentaBancaria saldo) {

        System.out.println("Se extrajo " + saldo.getSaldoActual() * 0.20);
        saldo.setSaldoActual(saldo.getSaldoActual() * 0.80);

    }

    /**
     * Metodo consulta el saldo actual luego de la extraccion o del ingreso de
     * dinero.
     *
     * @param saldo tipo Objeto cuentaBancaria
     */
    public void consultarSaldo(CuentaBancaria saldo) {

        System.out.println("Su saldo es: " + saldo.getSaldoActual());

    }

    /**
     * Metodo consulta los datos del usuario con datos actualizados.
     *
     * @param datos tipo Objeto cuentaBancaria
     */
    public void consultarDatos(CuentaBancaria datos) {

        System.out.println("DNI :" + datos.getDniCliente());
        System.out.println("NUMERO DE CUENTA :" + datos.getNumeroCuenta());
        System.out.println("SALDO :" + datos.getSaldoActual());

    }

}
