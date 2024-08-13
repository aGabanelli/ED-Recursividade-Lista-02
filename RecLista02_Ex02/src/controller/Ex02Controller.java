package controller;

public class Ex02Controller {

	public Ex02Controller() {
		super();
	}
	
	public int divisaoSub(int dividendo, int divisor) {
		if (dividendo < divisor) {
			return dividendo;
		}
		else {
			return divisaoSub(dividendo - divisor, divisor);
		}
	}
}
