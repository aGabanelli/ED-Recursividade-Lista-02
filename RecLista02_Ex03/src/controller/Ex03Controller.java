package controller;

public class Ex03Controller {

	public Ex03Controller() {
		super();
	}
	
	public int paresVetor(int[] vetor, int tamanho) {
		if(tamanho < 0) {
			return 0;
		}
		
		int n = vetor[tamanho];
		
		if(n%2 == 0) {
			return 1 + paresVetor(vetor, tamanho -1);
		}
		else {
			return paresVetor(vetor, tamanho-1);
		}
	}
	
}
