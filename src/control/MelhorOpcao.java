package control;
/**
 * Classe que informa qual a melhor opção de acordo com as opções do usuário.
 *
 * @author Natasha Busnardo
 */

public class MelhorOpcao {
	
	public String melhorOp(String tipo, String prioridade) {
		if(tipo == "invertido") {
			if(prioridade == "tempo") 
				return("\nO melhor tipo para o seu vetor é: Merge Sort");
			else if(prioridade =="troca") 
				return("\nO melhor tipo para o seu vetor é: Selection Sort.");
			else
				return("\nO melhor tipo para o seu vetor é: Insertion Sort");
		}
		else if(tipo == "ordenado") {
			if(prioridade == "tempo") 
				return("\nO melhor tipo para o seu vetor é: Bubble, Insertion ou Merge");
			else if(prioridade =="troca") 
				return("\nO melhor tipo para o seu vetor é: Bubble Sort.");
			else
				return("\nO melhor tipo para o seu vetor é: Insertion Sort");
		}
		else {
			if(prioridade == "tempo") 
				return("\nO melhor tipo para o seu vetor é: Selection ou Merge");
			else if(prioridade =="troca") 
				return("\nO melhor tipo para o seu vetor é: Merge Sort.");
			else
				return("\nO melhor tipo para o seu vetor é: Insertion Sort");
		}
	}
}
