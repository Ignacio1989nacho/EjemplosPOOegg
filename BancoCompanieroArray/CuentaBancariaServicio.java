package services;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.CuentaBancaria;

public class CuentaBancariaServicio {
	private static Scanner sc = new Scanner(System.in);
	private static String nombre;
	private static Integer numeroDeCuenta;
	private static Integer dniCliente;
	private static Double saldoActual;

	public static CuentaBancaria crearCuenta() {
		do {
			try {

				System.out.println("Ingrese el nombre y apellido del propietario de la cuenta");
				nombre = sc.nextLine();

			} catch (InputMismatchException e) {
				System.out.println("Error: entrada inválida. Por favor ingrese un nombre.");
				sc.nextLine(); // Limpiar el buffer del scanner
			}

		} while (nombre == null);
		do {
			try {
				System.out.println("ingrese el numero de cuenta");
				numeroDeCuenta = sc.nextInt();

			} catch (InputMismatchException e) {
				System.out.println("Error: entrada inválida. Por favor ingrese un número entero.");
				sc.nextLine(); // Limpiar el buffer del scanner
			}

		} while (numeroDeCuenta==null);
		do {
			try {
				System.out.println("Ingrese el dni del propietario de la cuenta");
				dniCliente = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error: entrada inválida. Por favor ingrese un número entero.");
				sc.nextLine(); // Limpiar el buffer del scanner

			}

		} while (dniCliente == null);
		do {
			try {
				System.out.println("Ingrese el saldo incial");
				saldoActual = sc.nextDouble();
			} catch (InputMismatchException e) {
				System.out.println("Error: entrada inválida. Por favor ingrese un número.");
				sc.nextLine(); // Limpiar el buffer del scanner

			}

		} while (saldoActual == null);

		return new CuentaBancaria(nombre, numeroDeCuenta, dniCliente, saldoActual);
	}

	public static void deposito(CuentaBancaria cuenta) {
		System.out.println("ingrese el valor del deposito");
		cuenta.setSaldoActual(cuenta.getSaldoActual() + sc.nextDouble());
	}

	public static void retirar(CuentaBancaria cuenta) {
		double retira = 0;
		System.out.println("su saldo actual es de $" + cuenta.getSaldoActual());
		try {
			System.out.println(
					"ingrese el valor a retirar, recuerde que si su saldo no es suficiente sera retirado el maximo disponible");
			retira = sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Error: entrada inválida. Por favor ingrese un número.");
			sc.nextLine(); // Limpiar el buffer del scanner

		}

		if (!verificaSaldo(retira, cuenta.getSaldoActual(), cuenta)) {
			System.out.println("tu saldo es insuficiente para realizar el retiro, deseas retirar tu saldo de $"
					+ cuenta.getSaldoActual());
			String opcion = sc.next();
			switch (opcion) {
			case "s":
				System.out.println("tu retiro con el valor de $" + cuenta.getSaldoActual() + " fue realizado");
				cuenta.setSaldoActual(0.0);
				break;
			case "n":
				System.out.println("Gracias por utilizar nuestros servicios");
				break;
			default:
				System.out.println("opcion ingresada incorrecta");
			}
		} else {
			cuenta.setSaldoActual(cuenta.getSaldoActual() - retira);
		}
	}

	public static void saqueRapido(CuentaBancaria cuenta) {
		double saque = 0;
		try {
			System.out.println("ingrese el valor del retiro, recuerde que puede sacar hasta 20% de su saldo");
			saque = sc.nextDouble();

		} catch (InputMismatchException e) {
			System.out.println("Error: entrada inválida. Por favor ingrese un número.");
			sc.nextLine(); // Limpiar el buffer del scanner

		}
		if (cuenta.getSaldoActual() * 20 / 100 < saque) {
			System.out.println("valor excede el permitido");
		} else {
			System.out.println("retiro realizado");
			cuenta.setSaldoActual(cuenta.getSaldoActual() - saque);
			System.out.println("saldo restante es de: $" + cuenta.getSaldoActual());
		}

	}

	public static void consultaSaldo(CuentaBancaria cuenta) {
		System.out.println("tu saldo actual es de: $" + cuenta.getSaldoActual());

	}

	public static boolean verificaSaldo(double retira, double saldoActual, CuentaBancaria cuenta) {
		boolean opcion = false;
		if (retira > saldoActual) {
			opcion = false;
		} else {
			opcion = true;
		}
		return opcion;
	}

	public static void datosCuenta(CuentaBancaria cuenta) {
		System.out.println(cuenta.toString());
	}
}
