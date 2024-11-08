package com.casos.Equipo;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
    private String nombre;
    private List<Jugador> jugadores;
    private Jugador capitan;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<>();
    }

	public String getNombre() {
        return nombre;
    }

    public Jugador getCapitan() {
        return capitan;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

	public String agregarJugador(Jugador jugador) {
        if (jugador == null) {
            return "Error: El jugador no puede ser nulo";
        }
        if (jugadores.contains(jugador)) {
            return "Error: El jugador " + jugador.getNombre() + " ya esta en el equipo";
        }
        jugadores.add(jugador);
        jugador.setEquipo(this);
        return "El jugador " + jugador.getNombre() + " ha sido agregado al equipo " + nombre;
    }

	public String asignarCapitan(Jugador capitan) {
        if (capitan == null || !jugadores.contains(capitan)) {
            return "Error: El capitan debe ser un jugador del equipo";
        }
        this.capitan = capitan;
        return "El jugador " + capitan.getNombre() + " ha sido asignado como capitan del equipo " + nombre;
    }

	public String listarJugadores() {
        if (jugadores.isEmpty()) {
            return "El equipo " + nombre + " no tiene jugadores";
        }
        StringBuilder lista = new StringBuilder("Jugadores en el equipo " + nombre + ": ");
        for (Jugador jugador : jugadores) {
            lista.append(jugador.getNombre()).append(" (").append(jugador.getPosicion()).append("), ");
        }
        lista.setLength(lista.length() - 2);
        return lista.toString();
    }
}