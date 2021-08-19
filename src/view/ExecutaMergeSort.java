package view;
import java.util.Random;
import java.util.Scanner;

import model.MergeSort;

public class ExecutaMergeSort {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		MergeSort merge = new MergeSort();
		Random r = new Random();
		int TAM = 10;
		int vet[] = new int[TAM];
		
		//System.out.print("Vetor Inicial Aleatório = ");
		//Cria vetor aleatório
		int vetorAleatorio[] = new int[TAM];
		for (int i = 0; i<TAM; i++) {
			vetorAleatorio[i] = r.nextInt(TAM-1);		
			//System.out.print(vetorAleatorio[i]+", ");
		}
		
		merge.setTrocas(0);
		merge.setComparacoes(0);
		merge.setTempototal(System.currentTimeMillis());
		
		//SelectionSort
		vet = merge.sort(vetorAleatorio);
		merge.setTempototal(System.currentTimeMillis()-merge.getTempototal());
		/*System.out.println("Vetor Final Buble Sort= ");
		for (int i = 0; i<TAM; i++) {		
			System.out.print(vet[i]+", ");
		}*/
       //Amostra dos dados Vetor Aleatório
        System.out.println("MERGE SORT - VETOR ALEATÓRIO");
        System.out.println("Tempo de Processamento de MergeSort: " + merge.getTempototal() + "ms");
        System.out.println("Número de Trocas: "+merge.getTrocas());
        System.out.println("Número de Comparações: "+merge.getComparacoes());
				
        merge.setTrocas(0);
        merge.setComparacoes(0);
        merge.setTempototal(System.currentTimeMillis());
		
        //SelectionSort
		vet = merge.sort(vet);
		merge.setTempototal(System.currentTimeMillis()-merge.getTempototal());
        //Amostra dos dados Vetor Ordenado
        System.out.println("MERGE SORT - VETOR ORDENADO");
        System.out.println("Tempo de Processamento de MergeSort: " + merge.getTempototal() + "ms");
        System.out.println("Número de Trocas: "+merge.getTrocas());
        System.out.println("Número de Comparações: "+merge.getComparacoes());
        
        //Cria vetor invertido
        int vetorInvertido[] = new int[TAM];
      	for (int i = 0; i<TAM; i++) {
      		vetorInvertido[i] = vet[TAM-i-1];
      		//System.out.print(vetorInvertido[i]+", ");
      	}
        
      	merge.setTrocas(0);
      	merge.setComparacoes(0);
      	merge.setTempototal(System.currentTimeMillis());
 		
      	//SelectionSort
 		vet = merge.sort(vetorInvertido);
 		merge.setTempototal(System.currentTimeMillis()-merge.getTempototal());
        //Amostra dos dados Vetor Invertido
        System.out.println("MERGE SORT - VETOR INVERTIDO");
        System.out.println("Tempo de Processamento de MergeSort: " + merge.getTempototal() + "ms");
        System.out.println("Número de Trocas: "+merge.getTrocas());
        System.out.println("Número de Comparações: "+merge.getComparacoes());
	}

}
