package com.casos.Empresa;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nombre;
    private List<Empleado> empleados;
    private Empleado administrador;
    private Empresa empresa;

	public Departamento(String nombre, Empresa empresa) {
        this.nombre = nombre;
        this.empresa = empresa;
        this.empleados = new ArrayList<>();
    }

	public String getNombre() {
        return nombre;
    }

    public Empleado getAdministrador() {
        return administrador;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

	public String agregarEmpleado(Empleado empleado) {
        if (empleados.contains(empleado)) {
            return "El empleado ya pertenece al departamento";
        } else {
            empleados.add(empleado);
            empleado.setDepartamento(this);  
            return "Empleado agregado al departamento: " + empleado.getNombre();
        }
    }

	public String asignarAdministrador(Empleado administrador) {
        if (!empleados.contains(administrador)) {
            return "El administrador debe ser un empleado del departamento";
        }
        this.administrador = administrador;
        return "Administrador asignado: " + administrador.getNombre();
    }

	public String listarEmpleados() {
        if (empleados.isEmpty()) {
            return "No hay empleados en el departamento";
        }
        StringBuilder sb = new StringBuilder("Empleados del departamento " + nombre + ":\n");
        for (Empleado empleado : empleados) {
            sb.append("- ").append(empleado.getNombre()).append(", Cargo: ").append(empleado.getCargo()).append("\n");
        }
        return sb.toString();
    }
}