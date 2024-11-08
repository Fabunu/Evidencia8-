package com.casos.Equipo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JugadorTest {
    private Jugador jugador;

    @BeforeEach
    void setUp() {
        jugador = new Jugador("Carlos", 10, "Delantero");
    }

    @Test
    void testGetNombre() {
        assertEquals("Carlos", jugador.getNombre(), "El nombre del jugador debe ser 'Carlos'");
    }

    @Test
    void testGetNumero() {
        assertEquals(10, jugador.getNumero(), "El numero del jugador debe ser 10");
    }

    @Test
    void testGetPosicion() {
        assertEquals("Delantero", jugador.getPosicion(), "La posicion del jugador debe ser 'Delantero'");
    }

    @Test
    void testActualizarPosicion() {
        String resultado = jugador.actualizarPosicion("Mediocampista");
        assertEquals("La posicion del jugador Carlos ha sido actualizada a Mediocampista", resultado);
        assertEquals("Mediocampista", jugador.getPosicion(), "La posicion del jugador debe ser 'Mediocampista'");
    }

    @Test
    void testActualizarPosicionInvalida() {
        String resultado = jugador.actualizarPosicion("");
        assertEquals("Error: La nueva posicion no puede ser nula o vacia", resultado, "Debe retornar un mensaje de error");
        assertEquals("Delantero", jugador.getPosicion(), "La posicion del jugador no debe cambiar si es invalida");
    }

    @Test
    void testSetEquipo() {
        Equipo equipo = new Equipo("Los Guerreros");
        jugador.setEquipo(equipo);
        assertNotNull(jugador.getEquipo(), "El equipo del jugador no debe ser nulo");
        assertEquals(equipo, jugador.getEquipo(), "El equipo del jugador debe coincidir con el equipo asignado");
    }
}