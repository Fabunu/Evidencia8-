package com.casos.Empresa_de_Transporte;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class BusTest {
    @Test
    void testgetMatricula() {
        Bus bus = new Bus("QWER12", "Susuki", 2018);
        assertEquals("QWER12", bus.getMatricula());
    }

    @Test
    void testGetModelo() {
        Bus bus = new Bus("QWER12", "Susuki", 2018);
        assertEquals("Susuki", bus.getModelo());
    }

    @Test
    void testGetAño() {
        Bus bus = new Bus("QWER12", "Susuki", 2018);
        assertEquals(2018, bus.getAño());
    }

    @Test
    void testVenderATercero() {
        Bus bus = new Bus("QWER12", "Susuki", 2018);
        Tercero tercero = new Tercero("Juanito Perez", 123456789);

        String resultado = bus.venderATercero(tercero);
        assertEquals("Bus vendido al tercero: Juanito Perez", resultado);
        assertEquals(tercero, bus.getComprador());
    }
}