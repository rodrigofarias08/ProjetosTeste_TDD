package testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Service.Calculadora;

public class TesteCalculadora {

	@Test
	/*
	 * Teste que valida a RF 123.34
	 */
	public void deveriaSomarDoisValoresPassados() throws Exception {
		int valorA = 1;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.soma(valorA, valorB);

		assertEquals(3, soma);
	}

	@Test
	/*
	 * Teste que valida a RF 123.34
	 */
	public void deveriaSubtrairDoisValoresPassados() throws Exception {
		int valorA = 1;
		int valorB = 2;
		Calculadora calculadora = new Calculadora();
		int soma = calculadora.subtracao(valorA, valorB);

		assertEquals(-1, soma);

	}

}
