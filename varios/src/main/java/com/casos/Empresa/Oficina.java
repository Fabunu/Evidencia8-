package com.casos.Empresa;

public class Oficina {
	private String ubicacion;
	private String tipo;
	private Empresa empresa;

	public Oficina(String ubicacion, String tipo, Empresa empresa) {
        this.ubicacion = ubicacion;
        this.tipo = tipo;
        this.empresa = empresa;
    }

	public String getUbicacion() {
        return ubicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

	public String actualizarTipo(String nuevoTipo) {
        this.tipo = nuevoTipo;
        return "Tipo de oficina actualizado a " + nuevoTipo;
    }
}