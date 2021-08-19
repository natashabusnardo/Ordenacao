package model;

/**
 * Class that implements the Bubble Sort sorting algorithm.
 *
 * @author Natasha Busnardo
 */

public class BubbleSort {
	
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
	 * Returns an int array object that has the construction of the bubble sort 
	 * algorithm.
	 * 
	 * @param int vector that will be sorted
	 * @return sorted vector Bubble Sort algorithm
	 */
	public int[] bubbleSort(int vetor[]) {
        this.tempototal = System.currentTimeMillis();
        for (int i = vetor.length; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
            	this.comparacoes++;
                if (vetor[j - 1] > vetor[j]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j - 1];
                    vetor[j - 1] = aux;
                    this.trocas++;
                }
            }
        }
        this.tempototal = System.currentTimeMillis() - this.tempototal;
        return vetor;
    }
}