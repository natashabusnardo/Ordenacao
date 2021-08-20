package test;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import control.MelhorOpcao;

public class MelhorOpcaoTest {
	MelhorOpcao op = Mockito.spy(MelhorOpcao.class);

	@Test
	public void validateTipoInvertidoPrioridadeTempo() {
		String expected = "\nO melhor tipo para o seu vetor é: Merge Sort";
		String result = op.melhorOp("invertido", "tempo");
		Assert.assertEquals(expected, result);
	}

	@Test
	public void validateTipoInvertidoPrioridadeTroca() {
		String expected = "\nO melhor tipo para o seu vetor é: Selection Sort.";
		String result = op.melhorOp("invertido", "troca");
		Assert.assertEquals(expected, result);
	}

	@Test
	public void validateTipoInvertidoPrioridadeComparacao() {
		String expected = "\nO melhor tipo para o seu vetor é: Insertion Sort";
		String result = op.melhorOp("invertido", "comparacao");
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void validateTipoOrdenadoPrioridadeTempo() {
		String expected = "\nO melhor tipo para o seu vetor é: Bubble, Insertion ou Merge";
		String result = op.melhorOp("ordenado", "tempo");
		Assert.assertEquals(expected, result);
	}

	@Test
	public void validateTipoOrdenadoPrioridadeTroca() {
		String expected = "\nO melhor tipo para o seu vetor é: Bubble Sort.";
		String result = op.melhorOp("ordenado", "troca");
		Assert.assertEquals(expected, result);
	}

	@Test
	public void validateTipoOrdenadoPrioridadeComparacao() {
		String expected = "\nO melhor tipo para o seu vetor é: Insertion Sort";
		String result = op.melhorOp("ordenado", "comparacao");
		Assert.assertEquals(expected, result);
	}
	
	@Test
	public void validateTipoAleatorioPrioridadeTempo() {
		String expected = "\nO melhor tipo para o seu vetor é: Selection ou Merge";
		String result = op.melhorOp("aleatorio", "tempo");
		Assert.assertEquals(expected, result);
	}

	@Test
	public void validateTipoAleatorioPrioridadeTroca() {
		String expected = "\nO melhor tipo para o seu vetor é: Merge Sort.";
		String result = op.melhorOp("aleatorio", "troca");
		Assert.assertEquals(expected, result);
	}

	@Test
	public void validateTipoAleatorioPrioridadeComparacao() {
		String expected = "\nO melhor tipo para o seu vetor é: Insertion Sort";
		String result = op.melhorOp("aleatorio", "comparacao");
		Assert.assertEquals(expected, result);
	}
	
	
	
}
