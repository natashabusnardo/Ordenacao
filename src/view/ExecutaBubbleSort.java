package view;
import java.util.Random;
import java.util.Scanner;

import model.BubbleSort;

public class ExecutaBubbleSort {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		BubbleSort bubble = new BubbleSort();
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
		bubble.setTrocas(0);
		bubble.setComparacoes(0);
		bubble.setTempototal(0);
		//bubbleSort
        vet = bubble.bubbleSort(vetorAleatorio);
		/*System.out.println("Vetor Final bubble Sort= ");
		for (int i = 0; i<TAM; i++) {		
			System.out.print(vet[i]+", ");
		}*/
       //Amostra dos dados Vetor Aleat�rio
        System.out.println("bubble SORT - VETOR ALEAT�RIO");
        System.out.println("Tempo de Processamento de BubbleSort: " + bubble.getTempototal() + " ms");
        System.out.println("N�mero de Trocas: "+bubble.getTrocas());
        System.out.println("N�mero de Compara��es: "+bubble.getComparacoes());
				
        bubble.setTrocas(0);
		bubble.setComparacoes(0);
		bubble.setTempototal(0);
		//bubbleSort
        vet = bubble.bubbleSort(vet);
        //Amostra dos dados Vetor Ordenado
        System.out.println("bubble SORT - VETOR ORDENADO");
        System.out.println("Tempo de Processamento de BubbleSort: " + bubble.getTempototal() + " ms");
        System.out.println("N�mero de Trocas: "+bubble.getTrocas());
        System.out.println("N�mero de Compara��es: "+bubble.getComparacoes());
        
        //Cria vetor invertido
        int vetorInvertido[] = new int[TAM];
      	for (int i = 0; i<TAM; i++) {
      		vetorInvertido[i] = vet[TAM-i-1];
      		//System.out.print(vetorInvertido[i]+", ");
      	}
        
      	bubble.setTrocas(0);
 		bubble.setComparacoes(0);
 		bubble.setTempototal(0);
 		//bubbleSort
        vet = bubble.bubbleSort(vetorInvertido);
        //Amostra dos dados Vetor Invertido
        System.out.println("bubble SORT - VETOR INVERTIDO");
        System.out.println("Tempo de Processamento de BubbleSort: " + bubble.getTempototal() + " ms");
        System.out.println("N�mero de Trocas: "+bubble.getTrocas());
        System.out.println("N�mero de Compara��es: "+bubble.getComparacoes());
        
	}

}
