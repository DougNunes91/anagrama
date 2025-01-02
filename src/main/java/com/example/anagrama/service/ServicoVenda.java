package com.example.anagrama.service;

public class ServicoVenda {
    private final ProcessadorPagamento processador;

    public ServicoVenda(ProcessadorPagamento processador) {
        this.processador = processador;
    }

    public boolean realizarVenda(double valor) {
        return processador.processar(valor);
    }
}