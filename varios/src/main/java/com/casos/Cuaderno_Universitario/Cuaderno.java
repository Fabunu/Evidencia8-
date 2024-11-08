package com.casos.Cuaderno_Universitario;

import java.util.ArrayList;
import java.util.List;

public class Cuaderno {
	private List<Hoja> hojas;
	private String marca;
	private static final int MAX_HOJAS = 100;

	
	public Cuaderno(String marca) {
		this.marca = marca;
		this.hojas = new ArrayList<>();
        inicializarHojas();
	}

    private void inicializarHojas() {
        for (int i = 1; i <= MAX_HOJAS; i++) {
            hojas.add(new Hoja(i, ""));
        }
    }

	public String escribirEnLaHoja(int numeroHoja, String texto) {
        if (numeroHoja <= 0 || numeroHoja > hojas.size()) {
            return "Error: Número de hoja inválido.";
        }
        try {
            hojas.get(numeroHoja - 1).escribir(texto);
            return "Texto escrito en la hoja " + numeroHoja + ".";
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        }
    }

	public String arrancarHoja(int numeroHoja) {
        if (numeroHoja <= 0 || numeroHoja > hojas.size()) {
            return "Error: Número de hoja inválido.";
        }
        hojas.remove(numeroHoja - 1);
        actualizarNumerosHojas();
        return "Hoja " + numeroHoja + " arrancada del cuaderno.";
    }

	public String listarHojas() {
        if (hojas.isEmpty()) {
            return "El cuaderno está vacío.";
        } else {
            StringBuilder sb = new StringBuilder();
            for (Hoja hoja : hojas) {
                sb.append("Hoja ").append(hoja.getNumero())
                  .append(": ").append(hoja.getContenido().isEmpty() ? "Vacía" : hoja.getContenido())
                  .append("\n");
            }
            return sb.toString();
        }
    }

	private void actualizarNumerosHojas() {
        for (int i = 0; i < hojas.size(); i++) {
            hojas.get(i).setNumero(i + 1);
        }
    }

    public String getMarca() {
        return marca;
    }

    public int getCantidadHojas() {
        return hojas.size();
    }
}