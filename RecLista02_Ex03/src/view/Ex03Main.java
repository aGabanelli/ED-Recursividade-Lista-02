package view;

import java.util.Scanner;

import controller.Ex03Controller;

public class Ex03Main {

	public static void main(String[] args) {
		
		Ex03Controller controller = new Ex03Controller();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Quantos números deseja adicionar ao seu vetor? ");
		int tamanho = scanner.nextInt();
		 
		int[] vetor = new int[tamanho];
		
		for(int i = 0; i < tamanho ; i++) {
			System.out.print("Valor item " + i +": ");
			int n = scanner.nextInt();
			vetor[i] = n;
		}
		
		int resultado = controller.paresVetor(vetor, tamanho-1);
		
		System.out.println("Quantidade de itens pares: " + resultado);
		
	}
	
}
