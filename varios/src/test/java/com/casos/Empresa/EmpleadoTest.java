package com.casos.Empresa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoTest {
    private Empleado empleado;

    @BeforeEach
    void setUp() {
        empleado = new Empleado("Carlos", "Desarrollador");
    }

    @Test
    void actualizarCargo() {
        assertEquals("Cargo actualizado a Gerente para el empleado Carlos", empleado.actualizarCargo("Gerente"));
        assertEquals("Gerente", empleado.getCargo());
    }
}