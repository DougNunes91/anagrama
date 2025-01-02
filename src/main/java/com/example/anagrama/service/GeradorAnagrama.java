package com.example.anagrama.service;

import java.util.*;

public class GeradorAnagrama {
    public List<String> gerarAnagramas(char[] letras) {
        if (letras == null || letras.length == 0) {
            throw new IllegalArgumentException("Entrada não pode ser vazia");
        }

        for (char c : letras) {
            if (!Character.isLetter(c)) {
                throw new IllegalArgumentException("Entrada deve conter apenas letras");
            }
        }

        List<String> resultado = new ArrayList<>();
        gerarPermutacoes(letras, 0, resultado);
        return resultado;
    }

    private void gerarPermutacoes(char[] letras, int inicio, List<String> resultado) {
        if (inicio == letras.length) {
            resultado.add(new String(letras));
            return;
        }

        for (int i = inicio; i < letras.length; i++) {
            trocar(letras, inicio, i);
            gerarPermutacoes(letras, inicio + 1, resultado);
            trocar(letras, inicio, i);
        }
    }

    private void trocar(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}