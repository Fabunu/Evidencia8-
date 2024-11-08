package com.casos.Empresa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DepartamentoTest {
    private Departamento departamento;
    private Empresa empresa;
    private Empleado empleado1;
    private Empleado empleado2;

    @BeforeEach
    void setUp() {
        empresa = new Empresa("TechCorp");
        departamento = new Departamento("Desarrollo", empresa);
        empleado1 = new Empleado("Pablo", "Desarrollador");
        empleado2 = new Empleado("Maria", "Analista");
    }

    @Test
    void agregarEmpleado() {
        assertEquals("Empleado agregado al departamento: Pablo", departamento.agregarEmpleado(empleado1));
        assertEquals("El empleado ya pertenece al departamento", departamento.agregarEmpleado(empleado1));
    }

    @Test
    void asignarAdministrador() {
        departamento.agregarEmpleado(empleado1);
        assertEquals("Administrador asignado: Pablo", departamento.asignarAdministrador(empleado1));
        assertEquals("El administrador debe ser un empleado del departamento", departamento.asignarAdministrador(empleado2));
    }

    @Test
    void listarEmpleados() {
        departamento.agregarEmpleado(empleado1);
        departamento.agregarEmpleado(empleado2);
        String listadoEsperado = "Empleados del departamento Desarrollo:\n" +
                                 "- Pablo, Cargo: Desarrollador\n" +
                                 "- Maria, Cargo: Analista\n";
        assertEquals(listadoEsperado, departamento.listarEmpleados());
    }
}

