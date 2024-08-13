package main;

import java.util.Scanner;

import controller.Ex02Controller;

public class Ex02Main {

	public static void main(String[] args) {
		
		Ex02Controller controller = new Ex02Controller();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int n = scanner.nextInt();
		
		System.out.print("Deseja dividí-lo quantas vezes? ");
		int div = scanner.nextInt();
		
		if(n == 0 || div == 0) {
			System.out.println("Não é possível fazer divisão utilizando 0");
		} else {
			int resultado = controller.divisaoSub(n, div);
			System.out.println(resultado);
		}
		
	}
	
}
