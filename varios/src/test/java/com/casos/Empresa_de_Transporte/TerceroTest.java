package com.casos.Empresa_de_Transporte;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class TerceroTest {

    @Test
    void testAgregarBus() {
        Tercero tercero = new Tercero("Juan Perez", 123456789);
        Bus bus = new Bus("ABC123", "Volvo", 2015);

        String resultado = tercero.agregarBus(bus);
        assertEquals("Bus agregado al comprador Juan Perez: Bus [matricula = ABC123, modelo = Volvo, año = 2015]", resultado);
        assertTrue(tercero.getBuses().contains(bus));
    }

    @Test
    void testAgregarBusDuplicado() {
        Tercero tercero = new Tercero("Juan Perez", 123456789);
        Bus bus = new Bus("ABC123", "Volvo", 2015);
        tercero.agregarBus(bus);

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            tercero.agregarBus(bus);
        });
        assertEquals("Bus duplicado", exception.getMessage());
    }

    @Test
    void testGetNombre() {
        Tercero tercero = new Tercero("Juan Perez", 123456789);
        assertEquals("Juan Perez", tercero.getNombre());
    }

    @Test
    void testGetContacto() {
        Tercero tercero = new Tercero("Juan Perez", 123456789);
        assertEquals(123456789, tercero.getContacto());
    }

    @Test
    void testGetBusesListaVacia() {
        Tercero tercero = new Tercero("Juan Perez", 123456789);
        List<Bus> buses = tercero.getBuses();
        assertTrue(buses.isEmpty());
    }
}
