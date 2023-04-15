package serviciobanco;

import bancoapp.cuentabanco.Cuenta;
import java.util.Scanner;

public class ServicioBanco {

    public Scanner Leer = new Scanner(System.in).useDelimiter("\n");

    /**
     * Metodo crea la cuenta y devuelve el objeto Cuenta.
     */
    public Cuenta crearCuenta() {
        Cuenta m = new Cuenta();
        System.out.println("Ingresa tu DNI:");
        m.setDniCliente(Leer.nextLong());
        System.out.println("Ingresa tu Numero de cuenta:");
        m.setNumeroCuenta(Leer.nextInt());
        System.out.println("Ingresar dinero:");
        m.setSaldoActual(Leer.nextDouble());

        return m;

    }

    /**
     * @param m e ingreso - Método ingresar(Cuenta,ingreso): recibe una cantidad
     * de dinero a ingresar y se le sumará al saldo actual. tomando como
     * parametros ingreso, y el objeto cuenta.
     */
    public void ingresar(Cuenta m, double ingreso) {

        m.setSaldoActual(ingreso + m.getSaldoActual());

    }

    /**
     * @param m y retirar- Método retirar(double): recibe una cantidad de dinero
     * a retirar y se le restara al saldo actual. Si la cuenta no tiene la
     * cantidad de dinero a retirar se retirará el máximo posible hasta dejar la
     * cuenta en 0. RECIBE COMO PARAMETRO EL OBJETO Y UN VALOR ingresado por el
     * usuario.
     */
    public void retirarDinero(Cuenta m, double retirar) {

        while (retirar > m.getSaldoActual()) {
            System.out.println("Su extraccion es superior a su saldo");

            System.out.println("Extrar dinero:");

            retirar = Leer.nextDouble();

        }

        m.setSaldoActual(m.getSaldoActual() - retirar);

    }

    /**
     *
     * @param m y extracion rapida - Método extraccionRapida: le permitirá sacar
     * solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
     */
    public void extraccionRapida(Cuenta m, double extraccion_rapida) {

        while (extraccion_rapida > (20 * m.getSaldoActual() / 100)) {
            System.out.println("INGRESA UN VALOR IGUAL O MENOR AL 20%");
            extraccion_rapida = Leer.nextDouble();
        }

        m.setSaldoActual(m.getSaldoActual() - extraccion_rapida);
    }
    
    /**
     * @param m metodo muestra los datos de la cuenta. 
     */

    public void consultarDatos(Cuenta m) {

        System.out.println("NUMERO DE CUENTA: " + m.getNumeroCuenta());
        System.out.println("DNI: " + m.getDniCliente());
        System.out.println("SALDO ACTUAL: " + m.getSaldoActual());

    }
}
