package control;
/**
 * Classe que informa qual a melhor op��o de acordo com as op��es do usu�rio.
 *
 * @author Natasha Busnardo
 */

public class MelhorOpcao {
	
	public String melhorOp(String tipo, String prioridade) {
		if(tipo == "invertido") {
			if(prioridade == "tempo") 
				return("\nO melhor tipo para o seu vetor �: Merge Sort");
			else if(prioridade =="troca") 
				return("\nO melhor tipo para o seu vetor �: Selection Sort.");
			else
				return("\nO melhor tipo para o seu vetor �: Insertion Sort");
		}
		else if(tipo == "ordenado") {
			if(prioridade == "tempo") 
				return("\nO melhor tipo para o seu vetor �: Bubble, Insertion ou Merge");
			else if(prioridade =="troca") 
				return("\nO melhor tipo para o seu vetor �: Bubble Sort.");
			else
				return("\nO melhor tipo para o seu vetor �: Insertion Sort");
		}
		else {
			if(prioridade == "tempo") 
				return("\nO melhor tipo para o seu vetor �: Selection ou Merge");
			else if(prioridade =="troca") 
				return("\nO melhor tipo para o seu vetor �: Merge Sort.");
			else
				return("\nO melhor tipo para o seu vetor �: Insertion Sort");
		}
	}
}
