package model;
/**
 * Class that implements the Selection Sort sorting algorithm.
 *
 * @author Natasha Busnardo
 */
public class SelectionSort {

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
	 * Returns an int array object that has the construction of the selection sort 
	 * algorithm.
	 * 
	 * @param int vector that will be sorted
	 * @return sorted vector Selection Sort algorithm
	 */
	public int[] selectionSort(int[] vetor) {
		this.tempototal = System.currentTimeMillis();
        for (int i = 0; i < vetor.length; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < vetor.length; j++) {
            	this.comparacoes++;
                if (vetor[j] < vetor[indiceMinimo]) {
                    indiceMinimo = j;
                    this.trocas++;
                }
            }
            int tmp = vetor[indiceMinimo];
            vetor[indiceMinimo] = vetor[i];
            vetor[i] = tmp;
        }
        this.tempototal = System.currentTimeMillis() - this.tempototal;
        return vetor;
    }
	
}
