package com.example.anagrama.service;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class GeradorAnagramaTest {
    private GeradorAnagrama gerador = new GeradorAnagrama();

    @Test
    void testarAnagramaBasico() {
        char[] entrada = {'a', 'b', 'c'};
        List<String> resultado = gerador.gerarAnagramas(entrada);

        assertEquals(6, resultado.size());
        assertTrue(resultado.containsAll(Arrays.asList("abc", "acb", "bac", "bca", "cab", "cba")));
    }

    @Test
    void testarUmaLetra() {
        char[] entrada = {'a'};
        List<String> resultado = gerador.gerarAnagramas(entrada);

        assertEquals(1, resultado.size());
        assertEquals("a", resultado.get(0));
    }

    @Test
    void testarEntradaVazia() {
        assertThrows(IllegalArgumentException.class, () ->
                gerador.gerarAnagramas(new char[]{}));
    }

    @Test
    void testarEntradaInvalida() {
        assertThrows(IllegalArgumentException.class, () ->
                gerador.gerarAnagramas(new char[]{'a', '1', 'b'}));
    }
}