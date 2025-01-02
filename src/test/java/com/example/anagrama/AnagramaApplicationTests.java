package com.example.anagrama;

import com.example.anagrama.service.*;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class AnagramaApplicationTests {

	@Test
	void testarGeracaoAnagramas() {
		GeradorAnagrama gerador = new GeradorAnagrama();
		char[] entrada = {'a', 'b', 'c'};
		List<String> anagramas = gerador.gerarAnagramas(entrada);

		assertEquals(6, anagramas.size());
		assertTrue(anagramas.contains("abc"));
		assertTrue(anagramas.contains("acb"));
		assertTrue(anagramas.contains("bac"));
		assertTrue(anagramas.contains("bca"));
		assertTrue(anagramas.contains("cab"));
		assertTrue(anagramas.contains("cba"));
	}

	@Test
	void testarProcessamentoPagamento() {
		PayFastAPI payFastAPI = new PayFastAPI();
		ProcessadorPagamento processador = new ProcessadorPagamentoPayFast(payFastAPI);
		ServicoVenda servicoVenda = new ServicoVenda(processador);

		assertTrue(servicoVenda.realizarVenda(100.0));
	}
}

