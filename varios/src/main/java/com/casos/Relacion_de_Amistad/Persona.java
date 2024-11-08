package com.casos.Relacion_de_Amistad;

import java.util.ArrayList;
import java.util.List;

public class Persona {
    private String nombre;
    private int edad;
    private List<Persona> amigos;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.amigos = new ArrayList<>();
    }

	public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<Persona> getAmigos() {
        return amigos;
    }

	public String agregarAmigo(Persona amigo) {
        if (amigo == null) {
            return "Error: El amigo no puede ser nulo";
        }
        if (amigo.equals(this)) {
            return "Error: No puedes agregarte como amigo a ti mismo";
        }
        if (amigos.contains(amigo)) {
            return "Error: " + amigo.getNombre() + " ya es amigo de " + nombre;
        }
        amigos.add(amigo);
        amigo.getAmigos().add(this); 
        return amigo.getNombre() + " ha sido agregado como amigo de " + nombre;
    }

	public String eliminarAmigo(Persona amigo) {
        if (amigo == null) {
            return "Error: El amigo no puede ser nulo";
        }
        if (!amigos.contains(amigo)) {
            return "Error: " + amigo.getNombre() + " no esta en la lista de amigos de " + nombre;
        }
        amigos.remove(amigo);
        amigo.getAmigos().remove(this);
        return amigo.getNombre() + " ha sido eliminado de la lista de amigos de " + nombre;
    }

	public String listarAmigos() {
        if (amigos.isEmpty()) {
            return nombre + " no tiene amigos en su lista";
        }
        StringBuilder listaAmigos = new StringBuilder("Amigos de " + nombre + ": ");
        for (Persona amigo : amigos) {
            listaAmigos.append(amigo.getNombre()).append(", ");
        }
        listaAmigos.setLength(listaAmigos.length() - 2);
        return listaAmigos.toString();
    }
}