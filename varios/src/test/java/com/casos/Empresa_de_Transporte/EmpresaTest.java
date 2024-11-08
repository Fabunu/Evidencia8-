package com.casos.Empresa_de_Transporte;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class EmpresaTest {
    @Test
    void testAgregarBus() {
        Empresa empresa = new Empresa("Transportes SA", "Calle Los Laureles");
        Bus bus = new Bus("QWER12", "Susuki", 2018);
        String resultado = empresa.agregarBus(bus);
        assertEquals("Bus agregado: Bus [matricula = QWER12, modelo = Susuki, año = 2018]", resultado);
        assertTrue(empresa.getBuses().contains(bus));
    }

    @Test
    void testRemoverBus() {
        Empresa empresa = new Empresa("Transportes SA", "Calle Los Laureles");
        Bus bus = new Bus("QWER12", "Susuki", 2018);
        empresa.agregarBus(bus);

        String resultado = empresa.removerBus(bus);
        assertEquals("Bus removido: Bus [matricula = QWER12, modelo = Susuki, año = 2018]", resultado);
    }

    @Test
    void testListarBuses() {
        Empresa empresa = new Empresa("Transportes SA", "Calle Los Laureles");
        Bus bus1 = new Bus("QWER12", "Susuki", 2018);
        Bus bus2 = new Bus("XYZ789", "Mercedes", 2007);

        empresa.agregarBus(bus1);
        empresa.agregarBus(bus2);

        String listado = empresa.listarBuses();
        assertTrue(listado.contains("Bus [matricula = QWER12, modelo = Susuki, año = 2018]"));
        assertFalse(listado.contains("Bus [matricula=XYZ789, modelo=Mercedes, año=2007]"));
    }

    @Test
    void testVenderBus() {
        Empresa empresa = new Empresa("Transportes SA", "Calle Los Laureles");
        Tercero tercero = new Tercero("Juanito Perez", 123456789);
        Bus bus = new Bus("QWER12", "Susuki", 2018);

        empresa.agregarBus(bus);
        String resultado = empresa.venderBus(bus, tercero);

        assertEquals("Bus vendido al tercero: Juanito Perez y removido de la empresa", resultado);
        assertFalse(empresa.listarBuses().contains(bus.getMatricula()));
    }
}