package view;
import java.util.Random;
import java.util.Scanner;

import model.BubleSort;

public class ExecutaBubleSort {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		BubleSort buble = new BubleSort();
		Random r = new Random();
		int TAM = 100000;
		int vet[] = new int[TAM];
		
		//System.out.print("Vetor Inicial Aleatório = ");
		//Cria vetor aleatório
		int vetorAleatorio[] = new int[TAM];
		for (int i = 0; i<TAM; i++) {
			vetorAleatorio[i] = r.nextInt(TAM-1);		
			//System.out.print(vetorAleatorio[i]+", ");
		}
		buble.setTrocas(0);
		buble.setComparacoes(0);
		buble.setTempototal(0);
		//BubleSort
        vet = buble.bubbleSort(vetorAleatorio);
		/*System.out.println("Vetor Final Buble Sort= ");
		for (int i = 0; i<TAM; i++) {		
			System.out.print(vet[i]+", ");
		}*/
       //Amostra dos dados Vetor Aleatório
        System.out.println("BUBLE SORT - VETOR ALEATÓRIO");
        System.out.println("Tempo de Processamento de BubbleSort: " + buble.getTempototal() + " ms");
        System.out.println("Número de Trocas: "+buble.getTrocas());
        System.out.println("Número de Comparações: "+buble.getComparacoes());
				
        buble.setTrocas(0);
		buble.setComparacoes(0);
		buble.setTempototal(0);
		//BubleSort
        vet = buble.bubbleSort(vet);
        //Amostra dos dados Vetor Ordenado
        System.out.println("BUBLE SORT - VETOR ORDENADO");
        System.out.println("Tempo de Processamento de BubbleSort: " + buble.getTempototal() + " ms");
        System.out.println("Número de Trocas: "+buble.getTrocas());
        System.out.println("Número de Comparações: "+buble.getComparacoes());
        
        //Cria vetor invertido
        int vetorInvertido[] = new int[TAM];
      	for (int i = 0; i<TAM; i++) {
      		vetorInvertido[i] = vet[TAM-i-1];
      		//System.out.print(vetorInvertido[i]+", ");
      	}
        
      	buble.setTrocas(0);
 		buble.setComparacoes(0);
 		buble.setTempototal(0);
 		//BubleSort
        vet = buble.bubbleSort(vetorInvertido);
        //Amostra dos dados Vetor Invertido
        System.out.println("BUBLE SORT - VETOR INVERTIDO");
        System.out.println("Tempo de Processamento de BubbleSort: " + buble.getTempototal() + " ms");
        System.out.println("Número de Trocas: "+buble.getTrocas());
        System.out.println("Número de Comparações: "+buble.getComparacoes());
        
	}

}
