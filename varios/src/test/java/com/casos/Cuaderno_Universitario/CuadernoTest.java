package com.casos.Cuaderno_Universitario;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CuadernoTest {
    private Cuaderno cuaderno;

    @BeforeEach
    void setUp() {
        cuaderno = new Cuaderno("Marca Ejemplo");
    }

    @Test
    void testInicializacionCuaderno() {
        assertEquals(100, cuaderno.getCantidadHojas(), "El cuaderno debe inicializarse con 100 hojas.");
        assertEquals("Marca Ejemplo", cuaderno.getMarca(), "La marca del cuaderno debe coincidir.");
    }

    @Test
    void testEscribirEnLaHoja() {
        String resultado = cuaderno.escribirEnLaHoja(1, "Hola, mundo!");
        assertEquals("Texto escrito en la hoja 1.", resultado);
        assertEquals("Hola, mundo!", cuaderno.listarHojas().split("\n")[0].split(": ")[1]);
    }

    @Test
    void testEscribirEnHojaInvalida() {
        String resultado = cuaderno.escribirEnLaHoja(101, "Texto fuera de rango.");
        assertEquals("Error: Número de hoja inválido.", resultado);

        resultado = cuaderno.escribirEnLaHoja(-1, "Texto fuera de rango.");
        assertEquals("Error: Número de hoja inválido.", resultado);
    }

    @Test
    void testArrancarHoja() {
        assertEquals(100, cuaderno.getCantidadHojas());
        String resultado = cuaderno.arrancarHoja(1);
        assertEquals("Hoja 1 arrancada del cuaderno.", resultado);
        assertEquals(99, cuaderno.getCantidadHojas());
        assertEquals(99, cuaderno.listarHojas().split("\n").length); // Verifica que las hojas se renumeren
    }

    @Test
    void testArrancarHojaInvalida() {
        String resultado = cuaderno.arrancarHoja(101);
        assertEquals("Error: Número de hoja inválido.", resultado);

        resultado = cuaderno.arrancarHoja(-1);
        assertEquals("Error: Número de hoja inválido.", resultado);
    }

    @Test
    void testListarHojas() {
        String listadoInicial = cuaderno.listarHojas();
        assertTrue(listadoInicial.contains("Vacía"), "Las hojas deben estar vacías al inicio.");

        cuaderno.escribirEnLaHoja(1, "Primera hoja");
        String listadoConTexto = cuaderno.listarHojas();
        assertTrue(listadoConTexto.contains("Primera hoja"), "Debe mostrar el texto en la hoja 1.");
    }
}