package main;

import java.util.Scanner;

import controller.Ex02Controller;

public class Ex02Main {

	public static void main(String[] args) {
		
		Ex02Controller controller = new Ex02Controller();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um n�mero: ");
		int n = scanner.nextInt();
		
		System.out.print("Deseja divid�-lo quantas vezes? ");
		int div = scanner.nextInt();
		
		if(n == 0 || div == 0) {
			System.out.println("N�o � poss�vel fazer divis�o utilizando 0");
		} else {
			int resultado = controller.divisaoSub(n, div);
			System.out.println(resultado);
		}
		
	}
	
}
