package com.casos.Equipo;

public class Jugador {
	private String nombre;
	private int numero;
	private String posicion;
	private Equipo equipo;

	public Jugador(String nombre, int numero, String posicion) {
        this.nombre = nombre;
        this.numero = numero;
        this.posicion = posicion;
    }

	public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

	public String actualizarPosicion(String nuevaPosicion) {
        if (nuevaPosicion == null || nuevaPosicion.isEmpty()) {
            return "Error: La nueva posicion no puede ser nula o vacia";
        }
        this.posicion = nuevaPosicion;
        return "La posicion del jugador " + nombre + " ha sido actualizada a " + nuevaPosicion;
    }
}