package model;

/**
 * Classe que implementa o algoritmo Insertion Sort.
 *
 * @author Natasha Busnardo
 */
public class InsertionSort {

	private long comparacoes;
	private long trocas;
	private long tempototal;
	
	public long getComparacoes() {
		return comparacoes;
	}
	public void setComparacoes(long comparacoes) {
		this.comparacoes = comparacoes;
	}
	public long getTrocas() {
		return trocas;
	}
	public void setTrocas(long trocas) {
		this.trocas = trocas;
	}
	public long getTempototal() {
		return tempototal;
	}
	public void setTempototal(long tempototal) {
		this.tempototal = tempototal;
	}	
	
	/**
	 * Retorna um array inteiro que foi organizado de acordo com o algoritmo 
	 * Insertion Sort.
	 * 
	 * @param vetor que será organizado
	 * @return vetor ordenado
	 */
	public int[] insertionSort(int[] vetor) {
		this.tempototal = System.currentTimeMillis();
        for (int i = 0; i < vetor.length; i++) {
            int atual = vetor[i];
            int j = i - 1;
            this.comparacoes++;
            while (j >= 0 && vetor[j] >= atual) {
                vetor[j + 1] = vetor[j];
                j--;
                this.trocas++;
            }
            vetor[j + 1] = atual;;
            this.trocas++;
        }
        this.tempototal = System.currentTimeMillis() - this.tempototal;
        return vetor;
    }	
	
}
