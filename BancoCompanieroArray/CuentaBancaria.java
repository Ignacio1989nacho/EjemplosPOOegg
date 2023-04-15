package entities;

public class CuentaBancaria {
	private String nombrePropietario;
	private Integer numeroCuenta;
	private Integer dniCliente;
	private Double saldoActual;

	public CuentaBancaria(String nombrePropietario, Integer numeroCuenta, Integer dniCliente, Double saldoActual) {
		this.nombrePropietario = nombrePropietario;
		this.numeroCuenta = numeroCuenta;
		this.dniCliente = dniCliente;
		this.saldoActual = saldoActual;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public Integer getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(Integer numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public Integer getDniCliente() {
		return dniCliente;
	}

	public void setDniCliente(Integer dniCliente) {
		this.dniCliente = dniCliente;
	}

	public Double getSaldoActual() {
		return saldoActual;
	}

	public void setSaldoActual(Double saldoActual) {
		this.saldoActual = saldoActual;
	}

	@Override
	public String toString() {
		return "CuentaBancaria [Propietario = " + nombrePropietario + ", numeroCuenta= " + numeroCuenta
				+ ", dniCliente= " + dniCliente + ", saldoActual= " + saldoActual + "]";
	}

}
