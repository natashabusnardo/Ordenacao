package view;
import java.util.Random;
import java.util.Scanner;

import model.QuickSort;

public class ExecutaQuickSort {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		QuickSort quick = new QuickSort();
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
		
		quick.setTrocas(0);
		quick.setComparacoes(0);
		quick.setTempototal(System.currentTimeMillis());
		
		//SelectionSort
		vet = quick.quicksort(vetorAleatorio, 0, TAM-1);
		quick.setTempototal(System.currentTimeMillis()-quick.getTempototal());
		/*System.out.println("Vetor Final Quick Sort= ");
		for (int i = 0; i<TAM; i++) {		
			System.out.print(vet[i]+", ");
		}*/
       //Amostra dos dados Vetor Aleatório
        System.out.println("QUICK SORT - VETOR ALEATÓRIO");
        System.out.println("Tempo de Processamento de QuickSort: " + quick.getTempototal() + "ms");
        System.out.println("Número de Trocas: "+quick.getTrocas());
        System.out.println("Número de Comparações: "+quick.getComparacoes());
				
        quick.setTrocas(0);
        quick.setComparacoes(0);
        quick.setTempototal(System.currentTimeMillis());
		
        //QuickSort
		vet = quick.quicksort(vet, 0, TAM-1);
		quick.setTempototal(System.currentTimeMillis()-quick.getTempototal());
        //Amostra dos dados Vetor Ordenado
        System.out.println("QUICK SORT - VETOR ORDENADO");
        System.out.println("Tempo de Processamento de QuickSort: " + quick.getTempototal() + "ms");
        System.out.println("Número de Trocas: "+quick.getTrocas());
        System.out.println("Número de Comparações: "+quick.getComparacoes());
        
        //Cria vetor invertido
        int vetorInvertido[] = new int[TAM];
      	for (int i = 0; i<TAM; i++) {
      		vetorInvertido[i] = vet[TAM-i-1];
      		//System.out.print(vetorInvertido[i]+", ");
      	}
        
      	quick.setTrocas(0);
      	quick.setComparacoes(0);
      	quick.setTempototal(System.currentTimeMillis());
 		
      	//SelectionSort
 		vet = quick.quicksort(vetorInvertido, 0, TAM-1);
 		quick.setTempototal(System.currentTimeMillis()-quick.getTempototal());
        //Amostra dos dados Vetor Invertido
        System.out.println("QUICK SORT - VETOR INVERTIDO");
        System.out.println("Tempo de Processamento de QuickSort: " + quick.getTempototal() + "ms");
        System.out.println("Número de Trocas: "+quick.getTrocas());
        System.out.println("Número de Comparações: "+quick.getComparacoes());

	}

}
