package view;

import java.util.Scanner;

import controller.Ex04Controller;

public class Ex04Main {

	public static void main(String[] args) {
		
		Ex04Controller controller = new Ex04Controller();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número para o fatorial duplo: ");
		int n = scanner.nextInt();
		
		if(n == 0) {
			System.out.println("0");
		}
		else {
			int resultado = controller.recursivaDupla(n);
			System.out.println(n + "!! = " + resultado);
		}
		
		
	}
	
}
