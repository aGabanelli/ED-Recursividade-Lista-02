package main;

import java.util.Scanner;

import controller.Ex05Controller;

public class Ex05Main {

	public static void main(String[] args) {
		
		Ex05Controller controller = new Ex05Controller();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número para o MDC: ");
		int n1 = scanner.nextInt();
		
		System.out.print("Digite outro número para o MDC: ");
		int n2 = scanner.nextInt();
		
		int resultado = controller.mdc(n1, n2);
		System.out.println(resultado);
		
	}
	
}
