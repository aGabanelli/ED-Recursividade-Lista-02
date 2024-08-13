package view;

import java.util.Scanner;

import controller.Ex01Controller;

public class Ex01Main {

	public static void main(String[] args) {
		Ex01Controller controller = new Ex01Controller();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Insira um n�mero: ");
		int n = scanner.nextInt();
		
		System.out.print("Deseja multiplic�-lo quantas vezes? ");
		int mult = scanner.nextInt();
		
		if (mult == 0 || n == 0 ) {
			System.out.println("0");
		} else {
			int resultado = controller.recursivaSoma(n, mult);
			System.out.println(resultado);
		}
		
		
		
	}
	
}
