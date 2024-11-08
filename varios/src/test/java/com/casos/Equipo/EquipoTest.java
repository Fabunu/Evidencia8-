package com.casos.Equipo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EquipoTest {
    private Equipo equipo;

    @BeforeEach
    void setUp() {
        equipo = new Equipo("Los Tigres");
    }

    @Test
    void testGetNombre() {
        assertEquals("Los Tigres", equipo.getNombre(), "El nombre del equipo debe ser 'Los Tigres'");
    }

    @Test
    void testAgregarJugador() {
        Jugador jugador = new Jugador("Luis", 7, "Defensa");
        String resultado = equipo.agregarJugador(jugador);
        assertEquals("El jugador Luis ha sido agregado al equipo Los Tigres", resultado, "Debe retornar un mensaje de exito");
        assertTrue(equipo.getJugadores().contains(jugador), "El equipo debe contener al jugador agregado");
    }

    @Test
    void testAgregarJugadorNulo() {
        String resultado = equipo.agregarJugador(null);
        assertEquals("Error: El jugador no puede ser nulo", resultado, "Debe retornar un mensaje de error");
    }

    @Test
    void testAgregarJugadorDuplicado() {
        Jugador jugador = new Jugador("Luis", 7, "Defensa");
        equipo.agregarJugador(jugador);
        String resultado = equipo.agregarJugador(jugador);
        assertEquals("Error: El jugador Luis ya esta en el equipo", resultado, "Debe retornar un mensaje de error");
    }

    @Test
    void testAsignarCapitan() {
        Jugador jugador = new Jugador("Maria", 10, "Portero");
        equipo.agregarJugador(jugador);
        String resultado = equipo.asignarCapitan(jugador);
        assertEquals("El jugador Maria ha sido asignado como capitan del equipo Los Tigres", resultado, "Debe retornar un mensaje de exito");
        assertEquals(jugador, equipo.getCapitan(), "El capitan del equipo debe ser el jugador asignado");
    }

    @Test
    void testAsignarCapitanInvalido() {
        Jugador jugador = new Jugador("Ana", 8, "Mediocampista");
        String resultado = equipo.asignarCapitan(jugador);
        assertEquals("Error: El capitan debe ser un jugador del equipo", resultado, "Debe retornar un mensaje de error");
        assertNull(equipo.getCapitan(), "El capitan del equipo debe ser nulo si el jugador no es del equipo");
    }

    @Test
    void testListarJugadores() {
        assertEquals("El equipo Los Tigres no tiene jugadores", equipo.listarJugadores(), "Debe indicar que el equipo no tiene jugadores");

        Jugador jugador1 = new Jugador("Luis", 7, "Defensa");
        Jugador jugador2 = new Jugador("Maria", 10, "Portero");
        equipo.agregarJugador(jugador1);
        equipo.agregarJugador(jugador2);

        String listaEsperada = "Jugadores en el equipo Los Tigres: Luis (Defensa), Maria (Portero)";
        assertEquals(listaEsperada, equipo.listarJugadores(), "La lista de jugadores debe coincidir con los jugadores agregados");
    }
}
