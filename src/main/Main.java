package main;

import java.util.Scanner;
import model.BubbleSort;
import model.InsertionSort;
import model.MergeSort;
import model.QuickSort;
import model.SelectionSort;
import control.MelhorOpcao;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		BubbleSort buble = new BubbleSort();
		InsertionSort insert = new InsertionSort();
		SelectionSort select = new SelectionSort();
		MergeSort merge = new MergeSort();
		QuickSort quick = new QuickSort();
		MelhorOpcao op = new MelhorOpcao();

		String tipo = "";
		String opcao = "";

		boolean selecionar = false;
		while (tipo == "" && opcao == "") {
			while (tipo == "") {
				System.out.println("Qual o tipo do vetor? Aleat�rio, Ordenado ou Invertido");
				String tipoVetor = entrada.next();

				switch (tipoVetor) {
				case "invertido":
					tipo = "invertido";
					break;
				case "aleatorio":
					tipo = "aleatorio";
					break;
				case "ordenado":
					tipo = "ordenado";
					break;
				default:
					System.out.println("Insira um valor v�lido!");

				}
				while (opcao == "") {
					System.out.println(
							"Qual a principal caracter�stica? tempo para Tempo de Processamento, troca para Menor n�mero de trocas ou comparacao para Menor n�mero de compara��es");
					String opcaoVetor = entrada.next();

					switch (opcaoVetor) {
					case "troca":
						opcao = "troca";
						break;
					case "tempo":
						opcao = "tempo";
						break;
					case "comparacao":
						opcao = "comparacao";
						break;
					default:
						System.out.println("Insira um valor v�lido!");

					}
				}
				
			}
			selecionar = true;

		}
		if(selecionar)
			System.out.println(op.melhorOp(tipo, opcao));
	}
}
