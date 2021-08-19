package view;
import java.util.Random;
import java.util.Scanner;

import model.BubleSort;
import model.InsertionSort;
import model.MergeSort;
import model.QuickSort;
import model.SelectionSort;

public class TesteDosMetodosDeOrdenacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		BubleSort buble = new BubleSort();
		InsertionSort insert = new InsertionSort();
		SelectionSort select = new SelectionSort();
		MergeSort merge = new MergeSort();
		QuickSort quick = new QuickSort();
		Random r = new Random();
		int TAM = 100000;
		int vet[] = new int[TAM];
		
		//System.out.print("Vetor Inicial Aleat�rio = ");
		//Cria vetor aleat�rio
		int vetorAleatorio[] = new int[TAM];
		for (int i = 0; i<TAM; i++) {
			vetorAleatorio[i] = r.nextInt(TAM-1);		
			//System.out.print(vetorAleatorio[i]+", ");
		}
		
		/*
         * AMOSTRAS DOS M�TODOS EM VETOR  ALEAT�RIO
         */
		
		quick.setTrocas(0);
		quick.setComparacoes(0);
		quick.setTempototal(System.currentTimeMillis());
		
		//QuickSort
		vet = quick.quicksort(vetorAleatorio, 0, TAM-1);
		quick.setTempototal(System.currentTimeMillis()-quick.getTempototal());
		/*System.out.println("Vetor Final Quick Sort= ");
		for (int i = 0; i<TAM; i++) {		
			System.out.print(vet[i]+", ");
		}*/
       //Amostra dos dados Vetor Aleat�rio
        System.out.println("QUICK SORT - VETOR ALEAT�RIO");
        System.out.println("Tempo de Processamento de QuickSort: " + quick.getTempototal() + "ms");
        System.out.println("N�mero de Trocas: "+quick.getTrocas());
        System.out.println("N�mero de Compara��es: "+quick.getComparacoes());
        		
		
		buble.setTrocas(0);
		buble.setComparacoes(0);
		buble.setTempototal(0);
		//BubleSort
        vet = buble.bubbleSort(vetorAleatorio);
		/*System.out.println("Vetor Final Buble Sort= ");
		for (int i = 0; i<TAM; i++) {		
			System.out.print(vet[i]+", ");
		}*/
       //Amostra dos dados Vetor Aleat�rio
        System.out.println("BUBLE SORT - VETOR ALEAT�RIO");
        System.out.println("Tempo de Processamento de BubbleSort: " + buble.getTempototal() + " ms");
        System.out.println("N�mero de Trocas: "+buble.getTrocas());
        System.out.println("N�mero de Compara��es: "+buble.getComparacoes());
        
        insert.setTrocas(0);
		insert.setComparacoes(0);
		insert.setTempototal(0);
		
		//InsertionSort
		vet = insert.insertionSort(vetorAleatorio);
		/*System.out.println("Vetor Final Buble Sort= ");
		for (int i = 0; i<TAM; i++) {		
			System.out.print(vet[i]+", ");
		}*/
       //Amostra dos dados Vetor Aleat�rio
        System.out.println("INSERTION SORT - VETOR ALEAT�RIO");
        System.out.println("Tempo de Processamento de InsertionSort: " + insert.getTempototal() + "ms");
        System.out.println("N�mero de Trocas: "+insert.getTrocas());
        System.out.println("N�mero de Compara��es: "+insert.getComparacoes());
		
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
        
        merge.setTrocas(0);
		merge.setComparacoes(0);
		merge.setTempototal(System.currentTimeMillis());
		
		//MergeSort
		vet = merge.sort(vetorAleatorio);
		merge.setTempototal(System.currentTimeMillis()-merge.getTempototal());
		/*System.out.println("Vetor Final Merge Sort= ");
		for (int i = 0; i<TAM; i++) {		
			System.out.print(vet[i]+", ");
		}*/
        //Amostra dos dados Vetor Aleat�rio
        System.out.println("MERGE SORT - VETOR ALEAT�RIO");
        System.out.println("Tempo de Processamento de MergeSort: " + merge.getTempototal() + "ms");
        System.out.println("N�mero de Trocas: "+merge.getTrocas());
        System.out.println("N�mero de Compara��es: "+merge.getComparacoes());
        
		
        /*
         * AMOSTRAS DOS M�TODOS EM VETORES ORDENADOS
         */
                
        quick.setTrocas(0);
        quick.setComparacoes(0);
        quick.setTempototal(System.currentTimeMillis());
        
        //QuickSort
		vet = quick.quicksort(vet, 0, TAM-1);
		quick.setTempototal(System.currentTimeMillis()-quick.getTempototal());
        //Amostra dos dados Vetor Ordenado
        System.out.println("QUICK SORT - VETOR ORDENADO");
        System.out.println("Tempo de Processamento de QuickSort: " + quick.getTempototal() + "ms");
        System.out.println("N�mero de Trocas: "+quick.getTrocas());
        System.out.println("N�mero de Compara��es: "+quick.getComparacoes());
        
        buble.setTrocas(0);
		buble.setComparacoes(0);
		buble.setTempototal(0);
		//BubleSort
        vet = buble.bubbleSort(vet);
        //Amostra dos dados Vetor Ordenado
        System.out.println("BUBLE SORT - VETOR ORDENADO");
        System.out.println("Tempo de Processamento de BubbleSort: " + buble.getTempototal() + " ms");
        System.out.println("N�mero de Trocas: "+buble.getTrocas());
        System.out.println("N�mero de Compara��es: "+buble.getComparacoes());
        
        insert.setTrocas(0);
        insert.setComparacoes(0);
        insert.setTempototal(0);
		
        //InsertionSort
		vet = insert.insertionSort(vet);
        //Amostra dos dados Vetor Ordenado
        System.out.println("INSERTION SORT - VETOR ORDENADO");
        System.out.println("Tempo de Processamento de InsertionSort: " + insert.getTempototal() + "ms");
        System.out.println("N�mero de Trocas: "+insert.getTrocas());
        System.out.println("N�mero de Compara��es: "+insert.getComparacoes());
        
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
        
        merge.setTrocas(0);
        merge.setComparacoes(0);
        merge.setTempototal(System.currentTimeMillis());
		
        //MergeSort
		vet = merge.sort(vet);
		merge.setTempototal(System.currentTimeMillis()-merge.getTempototal());
        //Amostra dos dados Vetor Ordenado
        System.out.println("MERGE SORT - VETOR ORDENADO");
        System.out.println("Tempo de Processamento de MergeSort: " + merge.getTempototal() + "ms");
        System.out.println("N�mero de Trocas: "+merge.getTrocas());
        System.out.println("N�mero de Compara��es: "+merge.getComparacoes());
        
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
        System.out.println("N�mero de Trocas: "+buble.getTrocas());
        System.out.println("N�mero de Compara��es: "+buble.getComparacoes());
        
        insert.setTrocas(0);
      	insert.setComparacoes(0);
      	insert.setTempototal(0);
 		
      	//InsertionSort
 		vet = insert.insertionSort(vetorInvertido);
        //Amostra dos dados Vetor Invertido
        System.out.println("INSERTION SORT - VETOR INVERTIDO");
        System.out.println("Tempo de Processamento de InsertionSort: " + insert.getTempototal() + "ms");
        System.out.println("N�mero de Trocas: "+insert.getTrocas());
        System.out.println("N�mero de Compara��es: "+insert.getComparacoes());
        
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
      	
        merge.setTrocas(0);
      	merge.setComparacoes(0);
      	merge.setTempototal(System.currentTimeMillis());
 		
      	//SelectionSort
 		vet = merge.sort(vetorInvertido);
 		merge.setTempototal(System.currentTimeMillis()-merge.getTempototal());
        //Amostra dos dados Vetor Invertido
        System.out.println("MERGE SORT - VETOR INVERTIDO");
        System.out.println("Tempo de Processamento de MergeSort: " + merge.getTempototal() + "ms");
        System.out.println("N�mero de Trocas: "+merge.getTrocas());
        System.out.println("N�mero de Compara��es: "+merge.getComparacoes());
        
        quick.setTrocas(0);
      	quick.setComparacoes(0);
      	quick.setTempototal(System.currentTimeMillis());
 		
      	//SelectionSort
 		vet = quick.quicksort(vetorInvertido, 0, TAM-1);
 		quick.setTempototal(System.currentTimeMillis()-quick.getTempototal());
        //Amostra dos dados Vetor Invertido
        System.out.println("QUICK SORT - VETOR INVERTIDO");
        System.out.println("Tempo de Processamento de QuickSort: " + quick.getTempototal() + "ms");
        System.out.println("N�mero de Trocas: "+quick.getTrocas());
        System.out.println("N�mero de Compara��es: "+quick.getComparacoes());
        
	}

}
