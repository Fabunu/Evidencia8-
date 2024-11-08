package com.casos.Empresa;

public class Empleado {
    private String nombre;
    private String cargo;
    private Departamento departamento;

    public Empleado(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

	public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

	public String actualizarCargo(String nuevoCargo) {
        this.cargo = nuevoCargo;
        return "Cargo actualizado a " + nuevoCargo + " para el empleado " + nombre;
    }
}