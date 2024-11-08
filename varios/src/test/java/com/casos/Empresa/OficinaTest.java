package com.casos.Empresa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OficinaTest {
    private Oficina oficina;
    private Empresa empresa;

    @BeforeEach
    void setUp() {
        empresa = new Empresa("TechCorp");
        oficina = new Oficina("Centro", "Administrativa", empresa);
    }

    @Test
    void actualizarTipo() {
        assertEquals("Tipo de oficina actualizado a Comercial", oficina.actualizarTipo("Comercial"));
        assertEquals("Comercial", oficina.getTipo());
    }
}
