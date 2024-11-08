package com.casos.Cuaderno_Universitario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HojaTest {
    private Hoja hoja;

    @BeforeEach
    void setUp() {
        hoja = new Hoja(1, "");
    }

    @Test
    void testEscribir() {
        hoja.escribir("Texto de prueba");
        assertEquals("Texto de prueba", hoja.getContenido(), "El contenido de la hoja debe coincidir.");
    }

    @Test
    void testEscribirTextoNulo() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> hoja.escribir(null));
        assertEquals("El texto no puede ser nulo.", exception.getMessage(), "Debe lanzar una excepción con el mensaje adecuado.");
    }

    @Test
    void testVaciar() {
        hoja.escribir("Texto de prueba");
        hoja.vaciar();
        assertEquals("", hoja.getContenido(), "El contenido de la hoja debe estar vacío después de llamar a vaciar().");
    }

    @Test
    void testSetNumero() {
        hoja.setNumero(10);
        assertEquals(10, hoja.getNumero(), "El número de la hoja debe coincidir con el valor asignado.");
    }
}