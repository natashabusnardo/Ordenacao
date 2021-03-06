package model;

/**
 * Classe que implementa o algoritmo Quick Sort.
 *
 * @author Natasha Busnardo
 */

public class QuickSort {

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
	 * Quick Sort.
	 * 
	 * @param vetor que ser? organizado
	 * @return vetor ordenado
	 */
	public int[] quicksort(int vet[], int esq, int dir){
	    int pivo = esq, i,ch,j;         
	    for(i=esq+1;i<=dir;i++){        
	        j = i;             
	        this.comparacoes++;
	        if(vet[j] < vet[pivo]){     
	            ch = vet[j];               
	            while(j > pivo){           
	                vet[j] = vet[j-1];      
	                j--;                   
	                this.trocas++;
	            }
	            vet[j] = ch;               
	            pivo++;                    
	        }
	    }
	    if(pivo-1 >= esq){              
	    	return quicksort(vet,esq,pivo-1);      
	    }
	    if(pivo+1 <= dir){              
	    	return quicksort(vet,pivo+1,dir);      
	    }
	    return vet;
	 }	
}
