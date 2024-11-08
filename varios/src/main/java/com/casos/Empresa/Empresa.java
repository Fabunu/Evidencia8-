package com.casos.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nombre;
    private List<Departamento> departamentos;
    private List<Oficina> oficinas;

    public Empresa(String nombre) {
        this.nombre = nombre;
        this.departamentos = new ArrayList<>();
        this.oficinas = new ArrayList<>();
    }

	public String getNombre() {
        return nombre;
    }

    public List<Departamento> getDepartamentos() {
        return departamentos;
    }

    public List<Oficina> getOficinas() {
        return oficinas;
    }

	public String agregarDepartamento(Departamento departamento) {
        if (departamentos.contains(departamento)) {
            return "El departamento ya existe en la empresa";
        } else {
            departamentos.add(departamento);
            return "Departamento " + departamento.getNombre() + " agregado a la empresa";
        }
    }

    public String agregarOficina(Oficina oficina) {
        if (oficinas.contains(oficina)) {
            return "La oficina ya existe en la empresa";
        } else {
            oficinas.add(oficina);
            return "Oficina en " + oficina.getUbicacion() + " agregada a la empresa";
        }
    }
}