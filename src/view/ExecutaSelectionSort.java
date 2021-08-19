package view;
import java.util.Random;
import java.util.Scanner;

import model.SelectionSort;

public class ExecutaSelectionSort {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		SelectionSort select = new SelectionSort();
		Random r = new Random();
		int TAM = 10;
		int vet[] = new int[TAM];
		
		//System.out.print("Vetor Inicial Aleat�rio = ");
		//Cria vetor aleat�rio
		int vetorAleatorio[] = new int[TAM];
		for (int i = 0; i<TAM; i++) {
			vetorAleatorio[i] = r.nextInt(TAM-1);		
			//System.out.print(vetorAleatorio[i]+", ");
		}
		
		select.setTrocas(0);
		select.setComparacoes(0);
		select.setTempototal(0);
		
		//SelectionSort
		vet = select.selectionSort(vetorAleatorio);
		/*System.out.println("Vetor Final Selection Sort= ");
		for (int i = 0; i<TAM; i++) {		
			System.out.print(vet[i]+", ");
		}*/
       //Amostra dos dados Vetor Aleat�rio
        System.out.println("SELECTION SORT - VETOR ALEAT�RIO");
        System.out.println("Tempo de Processamento de SelectionSort: " + select.getTempototal() + "ms");
        System.out.println("N�mero de Trocas: "+select.getTrocas());
        System.out.println("N�mero de Compara��es: "+select.getComparacoes());
				
        select.setTrocas(0);
        select.setComparacoes(0);
        select.setTempototal(0);
		
        //SelectionSort
		vet = select.selectionSort(vet);
        //Amostra dos dados Vetor Ordenado
        System.out.println("SELECTION SORT - VETOR ORDENADO");
        System.out.println("Tempo de Processamento de SelectionSort: " + select.getTempototal() + "ms");
        System.out.println("N�mero de Trocas: "+select.getTrocas());
        System.out.println("N�mero de Compara��es: "+select.getComparacoes());
        
        //Cria vetor invertido
        int vetorInvertido[] = new int[TAM];
      	for (int i = 0; i<TAM; i++) {
      		vetorInvertido[i] = vet[TAM-i-1];
      		//System.out.print(vetorInvertido[i]+", ");
      	}
        
      	select.setTrocas(0);
      	select.setComparacoes(0);
      	select.setTempototal(0);
 		
      	//SelectionSort
 		vet = select.selectionSort(vetorInvertido);
        //Amostra dos dados Vetor Invertido
        System.out.println("SELECTION SORT - VETOR INVERTIDO");
        System.out.println("Tempo de Processamento de SelectionSort: " + select.getTempototal() + "ms");
        System.out.println("N�mero de Trocas: "+select.getTrocas());
        System.out.println("N�mero de Compara��es: "+select.getComparacoes());
	}

}
