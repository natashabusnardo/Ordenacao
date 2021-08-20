package model;

/**
 * Classe que implementa o algoritmo Merge Sort.
 *
 * @author Natasha Busnardo
 */
public class MergeSort {

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
	 * Merge Sort.
	 * 
	 * @param vetor que será organizado
	 * @return vetor ordenado
	 */
	public int[] sort(int[] array) {
	       
        if (array.length <= 1) {
           
            return array;
        }
        int meio = array.length / 2;
        int[] dir = array.length % 2 == 0 ? new int[meio] : new int[meio + 1];
        int[] esq = new int[meio];
 
        int[] aux = new int[array.length];
 
        for (int i = 0; i < meio; i++) {
            esq[i] = array[i];
        }
 
        int auxIndex = 0;
        for (int i = meio; i < array.length; i++) {
            dir[auxIndex] = array[i];
            auxIndex++;
        }
 
        esq = sort(esq);
        dir = sort(dir);
 
        aux = mergesort(esq, dir);
 
        return aux;
    }
	
	/**
	 * Retorna um array inteiro que foi organizado de acordo com o algoritmo 
	 * Merge Sort.
	 * 
	 * @param vetor que será organizado
	 * @return vetor ordenado
	 */
 
    public int[] mergesort(int[] esq, int[] dir) {
        int[] aux = new int[esq.length + dir.length];
 
        int indexDir = 0, indexEsq = 0, indexAux = 0;
 
        while (indexEsq < esq.length || indexDir < dir.length) {
            if (indexEsq < esq.length && indexDir < dir.length) {
            	this.comparacoes++;
                if (esq[indexEsq] <= dir[indexDir]) {
                	this.trocas++;
                    aux[indexAux] = esq[indexEsq];
                    indexAux++;
                    indexEsq++;
                } else {
                	this.trocas++;
                    aux[indexAux] = dir[indexDir];
                    indexAux++;
                    indexDir++;
                }
            } else if (indexEsq < esq.length) {
            	this.trocas++;
                aux[indexAux] = esq[indexEsq];
                indexAux++;
                indexEsq++;
            } else if (indexDir < dir.length) {
            	this.trocas++;
                aux[indexAux] = dir[indexDir];
                indexAux++;
                indexDir++;
            }
        }
        return aux;
    }
	
}
