package controller;

public class Ex04Controller {

	public Ex04Controller() {
		super();
	}
	
	public int recursivaDupla(int n) {
		if(n == 0) {
			return 1;
		}
		
		if(n%2 != 0) {
			return n * recursivaDupla(n-1);
		}
		else {
			return recursivaDupla(n-1);
		}
	}
	
}
