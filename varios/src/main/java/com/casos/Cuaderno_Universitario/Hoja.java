package com.casos.Cuaderno_Universitario;

public class Hoja {
	private int numero;
	private String contenido;

    public Hoja(int numero, String contenido) {
        this.numero = numero;
        this.contenido = contenido;
    }

	public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getContenido() {
        return contenido;
    }

	public void escribir(String texto) {
        if (texto == null) {
            throw new IllegalArgumentException("El texto no puede ser nulo.");
        }
        this.contenido = texto;
    }

	public void vaciar() {
        this.contenido = "";
    }
}