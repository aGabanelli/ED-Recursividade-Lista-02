package controller;

public class Ex01Controller {

	public Ex01Controller(){
		super();
	}
	
	public int recursivaSoma(int n, int mult) {
		if (mult == 0) {
			return 0;
		}
		else {
			return n + recursivaSoma(n, mult-1);
		}
	}
}
