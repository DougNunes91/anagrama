package com.example.anagrama.service;

public class ProcessadorPagamentoPayFast implements ProcessadorPagamento {
    private final PayFastAPI payFastAPI;

    public ProcessadorPagamentoPayFast(PayFastAPI payFastAPI) {
        this.payFastAPI = payFastAPI;
    }

    @Override
    public boolean processar(double valor) {
        return payFastAPI.realizarPagamento(valor);
    }
}