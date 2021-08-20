package view;
import java.util.Random;
import java.util.Scanner;

import model.InsertionSort;

public class ExecutaInsertionSort {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		InsertionSort insert = new InsertionSort();
		Random r = new Random();
		int TAM = 1000;
		int vet[] = new int[TAM];
		
		//System.out.print("Vetor Inicial Aleatório = ");
		//Cria vetor aleatório
		int vetorAleatorio[] = new int[TAM];
		for (int i = 0; i<TAM; i++) {
			vetorAleatorio[i] = r.nextInt(TAM-1);		
			//System.out.print(vetorAleatorio[i]+", ");
		}
		
		insert.setTrocas(0);
		insert.setComparacoes(0);
		insert.setTempototal(0);
		
		//InsertionSort
		vet = insert.insertionSort(vetorAleatorio);
		/*System.out.println("Vetor Final Buble Sort= ");
		for (int i = 0; i<TAM; i++) {		
			System.out.print(vet[i]+", ");
		}*/
       //Amostra dos dados Vetor Aleatório
        System.out.println("INSERTION SORT - VETOR ALEATÓRIO");
        System.out.println("Tempo de Processamento de InsertionSort: " + insert.getTempototal() + "ms");
        System.out.println("Número de Trocas: "+insert.getTrocas());
        System.out.println("Número de Comparações: "+insert.getComparacoes());
				
        insert.setTrocas(0);
        insert.setComparacoes(0);
        insert.setTempototal(0);
		
        //InsertionSort
		vet = insert.insertionSort(vet);
        //Amostra dos dados Vetor Ordenado
        System.out.println("INSERTION SORT - VETOR ORDENADO");
        System.out.println("Tempo de Processamento de InsertionSort: " + insert.getTempototal() + "ms");
        System.out.println("Número de Trocas: "+insert.getTrocas());
        System.out.println("Número de Comparações: "+insert.getComparacoes());
        
        //Cria vetor invertido
        int vetorInvertido[] = new int[TAM];
      	for (int i = 0; i<TAM; i++) {
      		vetorInvertido[i] = vet[TAM-i-1];
      		//System.out.print(vetorInvertido[i]+", ");
      	}
        
      	insert.setTrocas(0);
      	insert.setComparacoes(0);
      	insert.setTempototal(0);
 		
      	//InsertionSort
 		vet = insert.insertionSort(vetorInvertido);
        //Amostra dos dados Vetor Invertido
        System.out.println("INSERTION SORT - VETOR INVERTIDO");
        System.out.println("Tempo de Processamento de InsertionSort: " + insert.getTempototal() + "ms");
        System.out.println("Número de Trocas: "+insert.getTrocas());
        System.out.println("Número de Comparações: "+insert.getComparacoes());
        
	}

}
