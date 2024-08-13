package main;

import java.util.Scanner;

import controller.Ex06Controller;

public class Ex06Main {

	public static void main(String[] args) {
		
		Ex06Controller controller = new Ex06Controller();
		Scanner scanner = new Scanner(System.in);
		
		int[] vetor10 = {1,2,3,4,5,6,7,8,9,10};
		
		int[] resultado = controller.trocaVetores(vetor10, 9, 0);
		
		int tamanho = vetor10.length;
		
		for(int i = 0; i< tamanho; i++)
		System.out.println(vetor10[i]);
		
	}
	
}
