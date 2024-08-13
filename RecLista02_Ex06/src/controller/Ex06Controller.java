package controller;

public class Ex06Controller {

	public Ex06Controller() {
		super();
	}
	
	public int[] trocaVetores(int[] vetor, int tamanho, int tamanhoOposto) {
		int diferenca = tamanho - tamanhoOposto;
		if (tamanho == tamanhoOposto || diferenca == 1) {
			return vetor;
		}
		else {
			int aux;
			aux = vetor[tamanho];
			vetor[tamanho] = vetor[tamanhoOposto];
			vetor[tamanhoOposto] = aux;
			return trocaVetores(vetor, tamanho-1, tamanhoOposto+1);
		}
	}
	
}
