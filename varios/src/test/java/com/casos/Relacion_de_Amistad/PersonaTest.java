package com.casos.Relacion_de_Amistad;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest {
    private Persona persona1;
    private Persona persona2;
    private Persona persona3;

    @BeforeEach
    void setUp() {
        persona1 = new Persona("Ana", 25);
        persona2 = new Persona("Luis", 30);
        persona3 = new Persona("Maria", 28);
    }

    @Test
    void testGetNombre() {
        assertEquals("Ana", persona1.getNombre(), "El nombre de la persona debe ser 'Ana'");
    }

    @Test
    void testGetEdad() {
        assertEquals(25, persona1.getEdad(), "La edad de la persona debe ser 25");
    }

    @Test
    void testAgregarAmigo() {
        String resultado = persona1.agregarAmigo(persona2);
        assertEquals("Luis ha sido agregado como amigo de Ana", resultado, "Debe retornar un mensaje de exito");
        assertTrue(persona1.getAmigos().contains(persona2), "La lista de amigos de Ana debe contener a Luis");
        assertTrue(persona2.getAmigos().contains(persona1), "La lista de amigos de Luis debe contener a Ana");
    }

    @Test
    void testAgregarAmigoNulo() {
        String resultado = persona1.agregarAmigo(null);
        assertEquals("Error: El amigo no puede ser nulo", resultado, "Debe retornar un mensaje de error");
    }

    @Test
    void testAgregarAmigoASiMismo() {
        String resultado = persona1.agregarAmigo(persona1);
        assertEquals("Error: No puedes agregarte como amigo a ti mismo", resultado, "Debe retornar un mensaje de error");
    }

    @Test
    void testAgregarAmigoDuplicado() {
        persona1.agregarAmigo(persona2);
        String resultado = persona1.agregarAmigo(persona2);
        assertEquals("Error: Luis ya es amigo de Ana", resultado, "Debe retornar un mensaje de error");
    }

    @Test
    void testEliminarAmigo() {
        persona1.agregarAmigo(persona2);
        String resultado = persona1.eliminarAmigo(persona2);
        assertEquals("Luis ha sido eliminado de la lista de amigos de Ana", resultado, "Debe retornar un mensaje de exito");
        assertFalse(persona1.getAmigos().contains(persona2), "La lista de amigos de Ana no debe contener a Luis");
        assertFalse(persona2.getAmigos().contains(persona1), "La lista de amigos de Luis no debe contener a Ana");
    }

    @Test
    void testEliminarAmigoNoExistente() {
        persona1.agregarAmigo(persona2);
        String resultado = persona1.eliminarAmigo(persona3);
        assertEquals("Error: Maria no esta en la lista de amigos de Ana", resultado, "Debe retornar un mensaje de error");
    }

    @Test
    void testEliminarAmigoNulo() {
        String resultado = persona1.eliminarAmigo(null);
        assertEquals("Error: El amigo no puede ser nulo", resultado, "Debe retornar un mensaje de error");
    }

    @Test
    void testListarAmigos() {
        assertEquals("Ana no tiene amigos en su lista", persona1.listarAmigos(), "Debe indicar que Ana no tiene amigos");

        persona1.agregarAmigo(persona2);
        persona1.agregarAmigo(persona3);
        
        String listaEsperada = "Amigos de Ana: Luis, Maria";
        assertEquals(listaEsperada, persona1.listarAmigos(), "La lista de amigos debe coincidir con los amigos agregados");
    }
}
