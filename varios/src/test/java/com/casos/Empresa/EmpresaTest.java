package com.casos.Empresa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpresaTest {
    private Empresa empresa;
    private Departamento departamento;
    private Oficina oficina;

    @BeforeEach
    void setUp() {
        empresa = new Empresa("TechCorp");
        departamento = new Departamento("Desarrollo", empresa);
        oficina = new Oficina("Centro", "Administrativa", empresa);
    }

    @Test
    void agregarDepartamento() {
        assertEquals("Departamento Desarrollo agregado a la empresa", empresa.agregarDepartamento(departamento));
        assertEquals("El departamento ya existe en la empresa", empresa.agregarDepartamento(departamento));
    }

    @Test
    void agregarOficina() {
        assertEquals("Oficina en Centro agregada a la empresa", empresa.agregarOficina(oficina));
        assertEquals("La oficina ya existe en la empresa", empresa.agregarOficina(oficina));
    }
}
