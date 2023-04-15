package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import entities.CuentaBancaria;
import services.CuentaBancariaServicio;

public class Program {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			CuentaBancaria cb = CuentaBancariaServicio.crearCuenta();
			int opcion =0;
			do {
				System.out.println("Bienvenido al Banco EGG");
				System.out.println("selecciones la opcion deseada");
				System.out.println("1-Deposito");
				System.out.println("2-Consultar saldo");
				System.out.println("3-Saque");
				System.out.println("4-Saque Rapido hasta 20% de tu saldo");
				System.out.println("5-Consulta datos de la cuenta");
				System.out.println("6-salir");
				try {
					opcion = sc.nextInt();
				}catch (InputMismatchException e) {
					System.out.println("caracter invalido");
				}

				switch (opcion) {
				case 1:
					CuentaBancariaServicio.deposito(cb);
					break;
				case 2:
					CuentaBancariaServicio.consultaSaldo(cb);
					break;
				case 3:
					CuentaBancariaServicio.retirar(cb);
					break;
				case 4:
					CuentaBancariaServicio.saqueRapido(cb);
					break;
				case 5:
					CuentaBancariaServicio.datosCuenta(cb);
					break;
				case 6:
					break;

				}
			} while (opcion != 6);
		}

	}
}
