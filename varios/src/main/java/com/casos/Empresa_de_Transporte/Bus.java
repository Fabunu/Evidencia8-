package com.casos.Empresa_de_Transporte;

public class Bus {
	private String matricula;
	private String modelo;
	private int año;
	private Empresa empresa;
	private Tercero comprador;

	public Bus(String matricula, String modelo, int año) {
		this.matricula = matricula;
		this.modelo = modelo;
		this.año = año;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public Tercero getComprador() {
		return comprador;
	}

	public void setComprador(Tercero comprador) {
		this.comprador = comprador;
	}



	public String venderATercero(Tercero tercero) {
		try {
			this.comprador = tercero;
			tercero.agregarBus(this);
			return "Bus vendido al tercero: " + tercero.getNombre();
		} catch (Exception e) {
			return "Error al vender el bus: " + e.getMessage();
		}
	}

	@Override
	public String toString() {
		 return "Bus [matricula = " + matricula + ", modelo = " + modelo + ", año = " + año + "]";
	}
}