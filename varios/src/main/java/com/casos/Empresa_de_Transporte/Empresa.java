package com.casos.Empresa_de_Transporte;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nombre;
	private String direccion;
	private List<Bus> buses;

	
	public Empresa(String nombre, String direccion) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.buses = new ArrayList<>();
	}

	public List<Bus> getBuses() {
		return buses;
	}

	public String agregarBus(Bus bus) {
		try {
			buses.add(bus);
			return "Bus agregado: " + bus;
		} catch (Exception e) {
			return "Error al agregar el bus: " + e.getMessage();
		}
	}

	public String removerBus(Bus bus) {
		try {
			if (buses.remove(bus)) {
				return "Bus removido: " + bus;
			} else {
				return "Bus no encontrado";
			}
		} catch (Exception e) {
			return "Error al removerl el bus: " + e.getMessage();
		}
	}

	public String listarBuses() {
		try {
			StringBuilder  listado = new StringBuilder("Lista de buses en " + nombre + ":\n");
			for (Bus bus : buses) {
				listado.append(bus).append("\n");
			}
			return listado.toString();
		} catch (Exception e) {
			return "Error al listar los buses: " + e.getMessage();
		}
	}

	public String venderBus(Bus bus, Tercero tercero) {
		try {
			if (buses.contains(bus)) {
				String resultadoVenta = bus.venderATercero(tercero);
				removerBus(bus);
				return resultadoVenta + " y removido de la empresa";
			} else {
				return "El bus no pertenece a la empresa";
			}
		} catch (Exception e) {
			return "Error al vender el bus " + e.getMessage();
		}
	}
}