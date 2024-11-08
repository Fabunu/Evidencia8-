package com.casos.Empresa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class OficinaCentralTest {
    private OficinaCentral oficinaCentral;
    private Empresa empresa;

    @BeforeEach
    void setUp() {
        empresa = new Empresa("TechCorp");
        oficinaCentral = new OficinaCentral("Centro", "Administrativa", empresa, "Director General");
    }

    @Test
    void getNombreDirector() {
        assertEquals("Director General", oficinaCentral.getNombreDirector());
    }

    @Test
    void setNombreDirector() {
        oficinaCentral.setNombreDirector("Nuevo Director");
        assertEquals("Nuevo Director", oficinaCentral.getNombreDirector());
    }
}