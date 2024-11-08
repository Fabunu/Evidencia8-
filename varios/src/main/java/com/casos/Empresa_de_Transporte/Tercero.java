package com.casos.Empresa_de_Transporte;

import java.util.ArrayList;
import java.util.List;

public class Tercero {
	private String nombre;
	private int contacto;
	private List<Bus> buses;

	public Tercero(String nombre, int contacto) {
		this.nombre = nombre;
		this.contacto = contacto;
		this.buses = new ArrayList<>();
	}

	public String getNombre() {
        return nombre;
    }

    public int getContacto() {
        return contacto;
    }

    public List<Bus> getBuses() {
        return buses;
    }

	public String agregarBus(Bus bus) {
		if (buses.contains(bus)) {
			throw new IllegalStateException("Bus duplicado");
		} else {
			buses.add(bus);
			return "Bus agregado al comprador " + nombre + ": " + bus;
		}
	}
	
@Override
    public String toString() {
        return "Tercero [nombre=" + nombre + ", contacto=" + contacto + "]";
    }
	
}